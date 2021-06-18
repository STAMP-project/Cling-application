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
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector18 = byteVector10.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector20 = byteVector10.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector22 = byteVector10.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putUTF8("hi!");
        java.lang.Class<?> wildcardClass25 = byteVector22.getClass();
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
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte(0);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putByte(0);
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
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((-1));
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector20 = byteVector12.putShort(0);
        org.mockito.asm.ByteVector byteVector22 = byteVector12.putByte(1);
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
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong(0L);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector12 = byteVector0.putInt(1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putUTF8("");
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
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector24 = byteVector18.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector26 = byteVector18.putByte((int) (short) 10);
        org.mockito.asm.ByteVector byteVector28 = byteVector18.putShort(0);
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
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        byte[] byteArray7 = null;
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putByteArray(byteArray7, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putInt(0);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putShort(1);
        org.mockito.asm.ByteVector byteVector18 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector24 = byteVector18.putLong(0L);
        org.mockito.asm.ByteVector byteVector26 = byteVector18.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector29 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector37 = byteVector33.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector39 = byteVector33.putLong(0L);
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putByte(0);
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putByte(100);
        org.mockito.asm.ByteVector byteVector45 = byteVector41.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector49 = byteVector45.putShort(100);
        org.mockito.asm.ByteVector byteVector51 = byteVector45.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector52 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector54 = byteVector52.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector56 = byteVector52.putInt(0);
        org.mockito.asm.ByteVector byteVector58 = byteVector52.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector60 = byteVector52.putByte(100);
        org.mockito.asm.ByteVector byteVector62 = byteVector60.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector64 = byteVector60.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector66 = byteVector64.putByte(100);
        org.mockito.asm.ByteVector byteVector67 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector69 = byteVector67.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector71 = byteVector67.putInt(0);
        org.mockito.asm.ByteVector byteVector73 = byteVector71.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector75 = byteVector73.putLong(100L);
        byte[] byteArray79 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector82 = byteVector73.putByteArray(byteArray79, 0, 0);
        org.mockito.asm.ByteVector byteVector85 = byteVector66.putByteArray(byteArray79, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector88 = byteVector51.putByteArray(byteArray79, 1, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector91 = byteVector28.putByteArray(byteArray79, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector94 = byteVector15.putByteArray(byteArray79, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector97 = byteVector10.putByteArray(byteArray79, 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
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
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector69);
        org.junit.Assert.assertNotNull(byteVector71);
        org.junit.Assert.assertNotNull(byteVector73);
        org.junit.Assert.assertNotNull(byteVector75);
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray79), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector82);
        org.junit.Assert.assertNotNull(byteVector85);
        org.junit.Assert.assertNotNull(byteVector88);
        org.junit.Assert.assertNotNull(byteVector91);
        org.junit.Assert.assertNotNull(byteVector94);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte(1);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector8.putUTF8("");
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
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putInt(0);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putLong(100L);
        byte[] byteArray23 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector26 = byteVector17.putByteArray(byteArray23, 0, 0);
        org.mockito.asm.ByteVector byteVector29 = byteVector10.putByteArray(byteArray23, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector32 = byteVector8.putByteArray(byteArray23, 0, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putShort((int) 'a');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putShort(10);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putUTF8("");
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putUTF8("");
        org.mockito.asm.ByteVector byteVector13 = byteVector7.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector15 = byteVector7.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong(1L);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putByte((int) (byte) 0);
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
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong(0L);
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector9 = byteVector1.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putLong((long) (byte) 0);
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putInt((int) (short) 0);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector2.putByte((int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = byteVector2.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putUTF8("");
        org.mockito.asm.ByteVector byteVector18 = byteVector10.putInt(0);
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
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (short) 10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("");
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector28 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putInt(100);
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector36 = byteVector32.putUTF8("");
        org.mockito.asm.ByteVector byteVector37 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector41 = byteVector37.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector45 = byteVector41.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector47 = byteVector41.putLong(0L);
        org.mockito.asm.ByteVector byteVector49 = byteVector41.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putUTF8("");
        org.mockito.asm.ByteVector byteVector53 = byteVector49.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector55 = byteVector49.putByte(0);
        org.mockito.asm.ByteVector byteVector56 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector58 = byteVector56.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector60 = byteVector56.putInt(0);
        org.mockito.asm.ByteVector byteVector62 = byteVector60.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector64 = byteVector62.putLong(100L);
        byte[] byteArray68 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector71 = byteVector62.putByteArray(byteArray68, 0, 0);
        org.mockito.asm.ByteVector byteVector74 = byteVector55.putByteArray(byteArray68, (int) (short) 1, 0);
        org.mockito.asm.ByteVector byteVector77 = byteVector32.putByteArray(byteArray68, 1, 1);
        org.mockito.asm.ByteVector byteVector80 = byteVector24.putByteArray(byteArray68, (int) (byte) 0, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector82 = byteVector80.putInt((int) 'a');
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
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector71);
        org.junit.Assert.assertNotNull(byteVector74);
        org.junit.Assert.assertNotNull(byteVector77);
        org.junit.Assert.assertNotNull(byteVector80);
        org.junit.Assert.assertNotNull(byteVector82);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (short) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putShort(0);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt(0);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort((int) (byte) 100);
        byte[] byteArray17 = null;
        org.mockito.asm.ByteVector byteVector20 = byteVector12.putByteArray(byteArray17, 0, (int) '4');
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
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector14 = byteVector4.putShort(0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong(0L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putByte(10);
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putLong((long) (byte) 0);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putInt((int) (short) 100);
        org.mockito.asm.ByteVector byteVector17 = byteVector11.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) (short) 100);
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector26 = byteVector14.putByteArray(byteArray23, 0, 0);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putShort(10);
        org.mockito.asm.ByteVector byteVector30 = byteVector26.putInt(10);
        org.mockito.asm.ByteVector byteVector32 = byteVector26.putInt((-1));
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putInt((int) (short) 10);
        org.mockito.asm.ByteVector byteVector37 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector41 = byteVector37.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector43 = byteVector37.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector49 = byteVector47.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putByte((int) (byte) 10);
        byte[] byteArray54 = new byte[] { (byte) 10, (byte) 0 };
        org.mockito.asm.ByteVector byteVector57 = byteVector51.putByteArray(byteArray54, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector60 = byteVector34.putByteArray(byteArray54, 0, (-1));
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
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 0, 0, -1]");
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
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[10, 0]");
        org.junit.Assert.assertNotNull(byteVector57);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong(0L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putByte(10);
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putLong((long) (byte) 0);
        byte[] byteArray12 = null;
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putByteArray(byteArray12, (int) (short) 10, (int) '#');
        org.mockito.asm.ByteVector byteVector16 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putInt(0);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putUTF8("");
        org.mockito.asm.ByteVector byteVector25 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector29 = byteVector25.putInt(0);
        org.mockito.asm.ByteVector byteVector31 = byteVector25.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector33 = byteVector25.putByte(100);
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector37 = byteVector33.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putByte(100);
        org.mockito.asm.ByteVector byteVector40 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector44 = byteVector40.putInt(0);
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putLong(100L);
        byte[] byteArray52 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector55 = byteVector46.putByteArray(byteArray52, 0, 0);
        org.mockito.asm.ByteVector byteVector58 = byteVector39.putByteArray(byteArray52, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector61 = byteVector20.putByteArray(byteArray52, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector64 = byteVector15.putByteArray(byteArray52, (int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector61);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) 'a');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte(0);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putByte((int) (short) 10);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putShort((-1));
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
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) '#');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putUTF8("");
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
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putLong((long) (byte) 1);
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
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (short) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort(10);
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putInt((int) (short) 0);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putShort((int) (byte) 100);
        byte[] byteArray19 = null;
        org.mockito.asm.ByteVector byteVector22 = byteVector16.putByteArray(byteArray19, (int) (short) 10, (int) 'a');
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putShort(0);
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector13 = byteVector7.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("hi!");
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
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong(0L);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector12 = byteVector0.putLong(100L);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((-1));
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) 100);
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
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putLong((long) 0);
        org.mockito.asm.ByteVector byteVector19 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector25 = byteVector19.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector27 = byteVector19.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector28 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putInt(0);
        org.mockito.asm.ByteVector byteVector34 = byteVector30.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putLong((-1L));
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector39 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector43 = byteVector39.putInt(0);
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putLong(100L);
        byte[] byteArray51 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector54 = byteVector45.putByteArray(byteArray51, 0, 0);
        org.mockito.asm.ByteVector byteVector57 = byteVector34.putByteArray(byteArray51, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector60 = byteVector27.putByteArray(byteArray51, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector63 = byteVector18.putByteArray(byteArray51, 0, (int) '#');
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
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector60);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort(100);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector18 = byteVector10.putInt(1);
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
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putByte(10);
        java.lang.Class<?> wildcardClass14 = byteVector13.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector4.putByte((int) (short) 10);
        org.mockito.asm.ByteVector byteVector16 = byteVector4.putUTF8("");
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
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt(0);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putByte((int) (short) 10);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putInt(10);
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector20 = byteVector12.putInt(100);
        org.mockito.asm.ByteVector byteVector22 = byteVector12.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putUTF8("");
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
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (byte) -1);
        byte[] byteArray9 = null;
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putByteArray(byteArray9, (int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort(100);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) 10);
        byte[] byteArray17 = null;
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putByteArray(byteArray17, 10, (int) (byte) 0);
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
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte(0);
        byte[] byteArray13 = null;
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByteArray(byteArray13, (int) (short) 100, (int) 'a');
        java.lang.Class<?> wildcardClass17 = byteVector12.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putLong(10L);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putInt(100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (short) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector11 = byteVector5.putByte(100);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong(0L);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte(10);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) (byte) 10);
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
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort(0);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong(0L);
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
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector(100);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector9 = byteVector1.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putByte((int) '#');
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector15 = byteVector9.putShort(10);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putInt((int) (short) 10);
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putShort((int) (byte) 100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt(10);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putInt((int) (short) 0);
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
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("");
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector26 = byteVector20.putInt((int) (byte) -1);
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
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte(0);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putUTF8("");
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
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putLong((long) '4');
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
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) 'a');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong((long) 1);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong(1L);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putUTF8("");
        org.mockito.asm.ByteVector byteVector21 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector29 = byteVector25.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putInt(10);
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector35 = byteVector29.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector37 = byteVector29.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector38 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector42 = byteVector38.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector46 = byteVector42.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector48 = byteVector42.putLong(0L);
        org.mockito.asm.ByteVector byteVector50 = byteVector42.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector52 = byteVector50.putUTF8("");
        org.mockito.asm.ByteVector byteVector54 = byteVector52.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector56 = byteVector52.putLong((long) (short) 100);
        byte[] byteArray61 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector64 = byteVector52.putByteArray(byteArray61, 0, 0);
        org.mockito.asm.ByteVector byteVector67 = byteVector37.putByteArray(byteArray61, (int) (byte) 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector70 = byteVector14.putByteArray(byteArray61, (int) (short) 0, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector72 = byteVector70.putInt((int) '4');
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
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteVector67);
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(byteVector72);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(0);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector17 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector27 = byteVector21.putLong(0L);
        org.mockito.asm.ByteVector byteVector29 = byteVector21.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector35 = byteVector29.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector39 = byteVector35.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector41 = byteVector35.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector43 = byteVector35.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector44 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector48 = byteVector44.putInt(0);
        org.mockito.asm.ByteVector byteVector50 = byteVector44.putInt(1);
        org.mockito.asm.ByteVector byteVector52 = byteVector44.putUTF8("");
        org.mockito.asm.ByteVector byteVector54 = byteVector52.putLong(10L);
        org.mockito.asm.ByteVector byteVector55 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector57 = byteVector55.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector59 = byteVector57.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector61 = byteVector59.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector63 = byteVector59.putLong((-1L));
        org.mockito.asm.ByteVector byteVector65 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector66 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector68 = byteVector66.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector70 = byteVector66.putInt(0);
        org.mockito.asm.ByteVector byteVector72 = byteVector70.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector74 = byteVector72.putLong(100L);
        byte[] byteArray78 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector81 = byteVector72.putByteArray(byteArray78, 0, 0);
        org.mockito.asm.ByteVector byteVector84 = byteVector65.putByteArray(byteArray78, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector87 = byteVector63.putByteArray(byteArray78, 0, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector90 = byteVector52.putByteArray(byteArray78, 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector93 = byteVector43.putByteArray(byteArray78, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector96 = byteVector16.putByteArray(byteArray78, 100, (int) (byte) 10);
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
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(byteVector72);
        org.junit.Assert.assertNotNull(byteVector74);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray78), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector81);
        org.junit.Assert.assertNotNull(byteVector84);
        org.junit.Assert.assertNotNull(byteVector87);
        org.junit.Assert.assertNotNull(byteVector90);
        org.junit.Assert.assertNotNull(byteVector93);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong(0L);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("hi!");
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
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putByte((int) (short) 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong(0L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putUTF8("hi!");
        java.lang.Class<?> wildcardClass12 = byteVector11.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((int) (short) 100);
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
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        byte[] byteArray9 = null;
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putByteArray(byteArray9, (int) '#', 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putShort((int) (byte) -1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putLong((-1L));
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("");
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector22 = byteVector16.putLong(0L);
        org.mockito.asm.ByteVector byteVector24 = byteVector16.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector26 = byteVector16.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putInt(100);
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
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong(0L);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(100);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (byte) 100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector18 = byteVector10.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putByte(0);
        java.lang.Class<?> wildcardClass21 = byteVector18.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putByte((int) (short) 100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt((int) (byte) 10);
        java.lang.Class<?> wildcardClass17 = byteVector14.getClass();
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
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong(0L);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) '4');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong(0L);
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putLong(1L);
        org.mockito.asm.ByteVector byteVector9 = byteVector1.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector11 = byteVector1.putByte(0);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("");
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
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt(0);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt(100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector20 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector25 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector29 = byteVector25.putInt(0);
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putLong(100L);
        byte[] byteArray37 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector40 = byteVector31.putByteArray(byteArray37, 0, 0);
        org.mockito.asm.ByteVector byteVector43 = byteVector24.putByteArray(byteArray37, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector46 = byteVector18.putByteArray(byteArray37, (int) (short) 0, (int) (short) 100);
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
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector43);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putByte(100);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt(1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector17 = byteVector11.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector24 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector28 = byteVector24.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector32 = byteVector28.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector34 = byteVector28.putLong(0L);
        org.mockito.asm.ByteVector byteVector36 = byteVector28.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putUTF8("");
        org.mockito.asm.ByteVector byteVector40 = byteVector36.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector44 = byteVector40.putByte(0);
        org.mockito.asm.ByteVector byteVector45 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector49 = byteVector47.putInt(0);
        org.mockito.asm.ByteVector byteVector51 = byteVector47.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector53 = byteVector51.putLong((-1L));
        org.mockito.asm.ByteVector byteVector55 = byteVector51.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector56 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector58 = byteVector56.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector60 = byteVector56.putInt(0);
        org.mockito.asm.ByteVector byteVector62 = byteVector60.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector64 = byteVector62.putLong(100L);
        byte[] byteArray68 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector71 = byteVector62.putByteArray(byteArray68, 0, 0);
        org.mockito.asm.ByteVector byteVector74 = byteVector51.putByteArray(byteArray68, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector77 = byteVector44.putByteArray(byteArray68, 1, 0);
        org.mockito.asm.ByteVector byteVector80 = byteVector19.putByteArray(byteArray68, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector83 = byteVector6.putByteArray(byteArray68, 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector71);
        org.junit.Assert.assertNotNull(byteVector74);
        org.junit.Assert.assertNotNull(byteVector77);
        org.junit.Assert.assertNotNull(byteVector80);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) ' ');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        byte[] byteArray15 = null;
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putByteArray(byteArray15, (int) (short) 1, 10);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) ' ');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt(0);
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector11 = byteVector5.putByte(100);
        org.mockito.asm.ByteVector byteVector13 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector5.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector17 = byteVector5.putInt((int) (byte) 1);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '4');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte(0);
        java.lang.Class<?> wildcardClass4 = byteVector1.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector15 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector25 = byteVector19.putLong(0L);
        org.mockito.asm.ByteVector byteVector27 = byteVector19.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("");
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putUTF8("");
        org.mockito.asm.ByteVector byteVector39 = byteVector35.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector43 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putInt(100);
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector49 = byteVector47.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector51 = byteVector47.putUTF8("");
        org.mockito.asm.ByteVector byteVector52 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector54 = byteVector52.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector56 = byteVector52.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector58 = byteVector56.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector60 = byteVector56.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector62 = byteVector56.putLong(0L);
        org.mockito.asm.ByteVector byteVector64 = byteVector56.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector66 = byteVector64.putUTF8("");
        org.mockito.asm.ByteVector byteVector68 = byteVector64.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector70 = byteVector64.putByte(0);
        org.mockito.asm.ByteVector byteVector71 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector73 = byteVector71.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector75 = byteVector71.putInt(0);
        org.mockito.asm.ByteVector byteVector77 = byteVector75.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector79 = byteVector77.putLong(100L);
        byte[] byteArray83 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector86 = byteVector77.putByteArray(byteArray83, 0, 0);
        org.mockito.asm.ByteVector byteVector89 = byteVector70.putByteArray(byteArray83, (int) (short) 1, 0);
        org.mockito.asm.ByteVector byteVector92 = byteVector47.putByteArray(byteArray83, 1, 1);
        org.mockito.asm.ByteVector byteVector95 = byteVector39.putByteArray(byteArray83, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector98 = byteVector14.putByteArray(byteArray83, (int) (short) 0, (-1));
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
        org.junit.Assert.assertNotNull(byteVector17);
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
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(byteVector73);
        org.junit.Assert.assertNotNull(byteVector75);
        org.junit.Assert.assertNotNull(byteVector77);
        org.junit.Assert.assertNotNull(byteVector79);
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray83), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector86);
        org.junit.Assert.assertNotNull(byteVector89);
        org.junit.Assert.assertNotNull(byteVector92);
        org.junit.Assert.assertNotNull(byteVector95);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong(0L);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putShort(100);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector2 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong(100L);
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector17 = byteVector8.putByteArray(byteArray14, 0, 0);
        org.mockito.asm.ByteVector byteVector20 = byteVector1.putByteArray(byteArray14, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putInt((int) (short) 10);
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putShort(0);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt(1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putByte((int) '#');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putLong((long) (short) 1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putInt((int) (byte) 10);
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
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putShort(0);
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putInt((int) (short) -1);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector20 = byteVector12.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putLong((long) (short) 0);
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
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putByte(100);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte(100);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort(1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putByte(100);
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector23 = byteVector17.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector24 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector28 = byteVector24.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector32 = byteVector28.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector34 = byteVector28.putLong(0L);
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putByte(0);
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putByte(100);
        org.mockito.asm.ByteVector byteVector40 = byteVector36.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector44 = byteVector40.putShort(100);
        org.mockito.asm.ByteVector byteVector46 = byteVector40.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector47 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector49 = byteVector47.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector51 = byteVector47.putInt(0);
        org.mockito.asm.ByteVector byteVector53 = byteVector47.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector55 = byteVector47.putByte(100);
        org.mockito.asm.ByteVector byteVector57 = byteVector55.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector59 = byteVector55.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector61 = byteVector59.putByte(100);
        org.mockito.asm.ByteVector byteVector62 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector64 = byteVector62.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector66 = byteVector62.putInt(0);
        org.mockito.asm.ByteVector byteVector68 = byteVector66.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector70 = byteVector68.putLong(100L);
        byte[] byteArray74 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector77 = byteVector68.putByteArray(byteArray74, 0, 0);
        org.mockito.asm.ByteVector byteVector80 = byteVector61.putByteArray(byteArray74, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector83 = byteVector46.putByteArray(byteArray74, 1, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector86 = byteVector17.putByteArray(byteArray74, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector89 = byteVector12.putByteArray(byteArray74, (int) ' ', (-1));
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
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector77);
        org.junit.Assert.assertNotNull(byteVector80);
        org.junit.Assert.assertNotNull(byteVector83);
        org.junit.Assert.assertNotNull(byteVector86);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putInt(1);
        org.mockito.asm.ByteVector byteVector14 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putByte(100);
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector23 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putInt(0);
        org.mockito.asm.ByteVector byteVector29 = byteVector25.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putLong((-1L));
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector34 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putInt(0);
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putLong(100L);
        byte[] byteArray46 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector49 = byteVector40.putByteArray(byteArray46, 0, 0);
        org.mockito.asm.ByteVector byteVector52 = byteVector29.putByteArray(byteArray46, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector55 = byteVector20.putByteArray(byteArray46, (int) (byte) 1, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector58 = byteVector9.putByteArray(byteArray46, (int) (short) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass59 = byteVector58.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("");
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putInt(0);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putShort(1);
        org.mockito.asm.ByteVector byteVector18 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector24 = byteVector18.putLong(0L);
        org.mockito.asm.ByteVector byteVector26 = byteVector18.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector29 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector37 = byteVector33.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector39 = byteVector33.putLong(0L);
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putByte(0);
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putByte(100);
        org.mockito.asm.ByteVector byteVector45 = byteVector41.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector49 = byteVector45.putShort(100);
        org.mockito.asm.ByteVector byteVector51 = byteVector45.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector52 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector54 = byteVector52.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector56 = byteVector52.putInt(0);
        org.mockito.asm.ByteVector byteVector58 = byteVector52.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector60 = byteVector52.putByte(100);
        org.mockito.asm.ByteVector byteVector62 = byteVector60.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector64 = byteVector60.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector66 = byteVector64.putByte(100);
        org.mockito.asm.ByteVector byteVector67 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector69 = byteVector67.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector71 = byteVector67.putInt(0);
        org.mockito.asm.ByteVector byteVector73 = byteVector71.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector75 = byteVector73.putLong(100L);
        byte[] byteArray79 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector82 = byteVector73.putByteArray(byteArray79, 0, 0);
        org.mockito.asm.ByteVector byteVector85 = byteVector66.putByteArray(byteArray79, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector88 = byteVector51.putByteArray(byteArray79, 1, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector91 = byteVector28.putByteArray(byteArray79, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector94 = byteVector15.putByteArray(byteArray79, 0, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector97 = byteVector8.putByteArray(byteArray79, (int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
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
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector69);
        org.junit.Assert.assertNotNull(byteVector71);
        org.junit.Assert.assertNotNull(byteVector73);
        org.junit.Assert.assertNotNull(byteVector75);
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray79), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector82);
        org.junit.Assert.assertNotNull(byteVector85);
        org.junit.Assert.assertNotNull(byteVector88);
        org.junit.Assert.assertNotNull(byteVector91);
        org.junit.Assert.assertNotNull(byteVector94);
        org.junit.Assert.assertNotNull(byteVector97);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt(1);
        org.mockito.asm.ByteVector byteVector15 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putInt(0);
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putUTF8("");
        org.mockito.asm.ByteVector byteVector24 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector28 = byteVector24.putInt(0);
        org.mockito.asm.ByteVector byteVector30 = byteVector24.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector32 = byteVector24.putByte(100);
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector36 = byteVector32.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putByte(100);
        org.mockito.asm.ByteVector byteVector39 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector43 = byteVector39.putInt(0);
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putLong(100L);
        byte[] byteArray51 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector54 = byteVector45.putByteArray(byteArray51, 0, 0);
        org.mockito.asm.ByteVector byteVector57 = byteVector38.putByteArray(byteArray51, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector60 = byteVector19.putByteArray(byteArray51, (int) (short) 0, 0);
        org.mockito.asm.ByteVector byteVector63 = byteVector14.putByteArray(byteArray51, 0, 0);
        org.mockito.asm.ByteVector byteVector65 = byteVector14.putLong((long) 1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteVector65);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putByte((int) (short) 100);
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
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putByte(100);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putInt(1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector14 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector15 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putInt(0);
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putLong(100L);
        byte[] byteArray27 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector30 = byteVector21.putByteArray(byteArray27, 0, 0);
        org.mockito.asm.ByteVector byteVector33 = byteVector14.putByteArray(byteArray27, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector36 = byteVector10.putByteArray(byteArray27, (int) (short) 0, 0);
        org.mockito.asm.ByteVector byteVector38 = byteVector10.putUTF8("");
        java.lang.Class<?> wildcardClass39 = byteVector38.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt(0);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector10 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putLong(0L);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putByte(0);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putLong(1L);
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector28 = byteVector24.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector30 = byteVector24.putUTF8("");
        org.mockito.asm.ByteVector byteVector31 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector39 = byteVector35.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putInt(10);
        org.mockito.asm.ByteVector byteVector43 = byteVector39.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector45 = byteVector39.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector47 = byteVector39.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector48 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector50 = byteVector48.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector52 = byteVector48.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector54 = byteVector52.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector56 = byteVector52.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector58 = byteVector52.putLong(0L);
        org.mockito.asm.ByteVector byteVector60 = byteVector52.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector62 = byteVector60.putUTF8("");
        org.mockito.asm.ByteVector byteVector64 = byteVector62.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector66 = byteVector62.putLong((long) (short) 100);
        byte[] byteArray71 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector74 = byteVector62.putByteArray(byteArray71, 0, 0);
        org.mockito.asm.ByteVector byteVector77 = byteVector47.putByteArray(byteArray71, (int) (byte) 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector80 = byteVector24.putByteArray(byteArray71, (int) (short) 0, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector83 = byteVector7.putByteArray(byteArray71, 0, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector85 = byteVector7.putLong(0L);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
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
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray71), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector74);
        org.junit.Assert.assertNotNull(byteVector77);
        org.junit.Assert.assertNotNull(byteVector80);
        org.junit.Assert.assertNotNull(byteVector83);
        org.junit.Assert.assertNotNull(byteVector85);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector3.putUTF8("");
        java.lang.Class<?> wildcardClass10 = byteVector9.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putUTF8("");
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
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector16 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector17 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector29 = byteVector25.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector33 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putInt(100);
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector41 = byteVector37.putUTF8("");
        org.mockito.asm.ByteVector byteVector42 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector46 = byteVector42.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector50 = byteVector46.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector52 = byteVector46.putLong(0L);
        org.mockito.asm.ByteVector byteVector54 = byteVector46.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector56 = byteVector54.putUTF8("");
        org.mockito.asm.ByteVector byteVector58 = byteVector54.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector60 = byteVector54.putByte(0);
        org.mockito.asm.ByteVector byteVector61 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector63 = byteVector61.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector65 = byteVector61.putInt(0);
        org.mockito.asm.ByteVector byteVector67 = byteVector65.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector69 = byteVector67.putLong(100L);
        byte[] byteArray73 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector76 = byteVector67.putByteArray(byteArray73, 0, 0);
        org.mockito.asm.ByteVector byteVector79 = byteVector60.putByteArray(byteArray73, (int) (short) 1, 0);
        org.mockito.asm.ByteVector byteVector82 = byteVector37.putByteArray(byteArray73, 1, 1);
        org.mockito.asm.ByteVector byteVector85 = byteVector29.putByteArray(byteArray73, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector88 = byteVector16.putByteArray(byteArray73, 10, (int) (byte) -1);
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
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteVector67);
        org.junit.Assert.assertNotNull(byteVector69);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray73), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector76);
        org.junit.Assert.assertNotNull(byteVector79);
        org.junit.Assert.assertNotNull(byteVector82);
        org.junit.Assert.assertNotNull(byteVector85);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putLong(1L);
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
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector4.putUTF8("");
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
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) 'a');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt((int) (byte) 10);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) (short) 1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putInt(0);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putLong(100L);
        byte[] byteArray23 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector26 = byteVector17.putByteArray(byteArray23, 0, 0);
        org.mockito.asm.ByteVector byteVector29 = byteVector6.putByteArray(byteArray23, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector31 = byteVector6.putInt((-1));
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putInt((int) '4');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong((-1L));
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putByte((int) '#');
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putByte((int) ' ');
        byte[] byteArray10 = null;
        org.mockito.asm.ByteVector byteVector13 = byteVector7.putByteArray(byteArray10, (int) (byte) 100, (int) (byte) 100);
        org.mockito.asm.ByteVector byteVector15 = byteVector7.putShort(0);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putShort((-1));
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) (short) 100);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((-1));
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((-1));
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) ' ');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putLong(10L);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort(100);
        byte[] byteArray17 = null;
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putByteArray(byteArray17, (int) (short) 0, (int) (byte) 1);
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
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putLong(10L);
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putInt((-1));
        org.mockito.asm.ByteVector byteVector11 = byteVector5.putInt((int) (byte) 100);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((-1));
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("");
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("");
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putInt((int) 'a');
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
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt(1);
        org.mockito.asm.ByteVector byteVector15 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putInt(0);
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putUTF8("");
        org.mockito.asm.ByteVector byteVector24 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector28 = byteVector24.putInt(0);
        org.mockito.asm.ByteVector byteVector30 = byteVector24.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector32 = byteVector24.putByte(100);
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector36 = byteVector32.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putByte(100);
        org.mockito.asm.ByteVector byteVector39 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector43 = byteVector39.putInt(0);
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putLong(100L);
        byte[] byteArray51 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector54 = byteVector45.putByteArray(byteArray51, 0, 0);
        org.mockito.asm.ByteVector byteVector57 = byteVector38.putByteArray(byteArray51, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector60 = byteVector19.putByteArray(byteArray51, (int) (short) 0, 0);
        org.mockito.asm.ByteVector byteVector63 = byteVector14.putByteArray(byteArray51, 0, 0);
        org.mockito.asm.ByteVector byteVector65 = byteVector14.putInt((int) ' ');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteVector65);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector17 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putInt(10);
        org.mockito.asm.ByteVector byteVector29 = byteVector25.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector31 = byteVector25.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector33 = byteVector25.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector34 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector42 = byteVector38.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector44 = byteVector38.putLong(0L);
        org.mockito.asm.ByteVector byteVector46 = byteVector38.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putUTF8("");
        org.mockito.asm.ByteVector byteVector50 = byteVector48.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector52 = byteVector48.putLong((long) (short) 100);
        byte[] byteArray57 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector60 = byteVector48.putByteArray(byteArray57, 0, 0);
        org.mockito.asm.ByteVector byteVector63 = byteVector33.putByteArray(byteArray57, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector66 = byteVector12.putByteArray(byteArray57, (int) (short) -1, 100);
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
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector63);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putByte((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putByte((int) (byte) 0);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector13 = byteVector7.putLong((long) 0);
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putLong((long) (byte) 100);
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putLong((long) 100);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong(10L);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) (short) 100);
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
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector(100);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt((int) '4');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((-1));
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putInt(0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putLong((long) (short) 10);
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
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt(0);
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putByte((int) '#');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putShort(10);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putUTF8("");
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putUTF8("");
        org.mockito.asm.ByteVector byteVector13 = byteVector7.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putInt((int) ' ');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putByte((int) (byte) -1);
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
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (byte) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) (short) -1);
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
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt((-1));
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector20 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putInt(100);
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putUTF8("");
        org.mockito.asm.ByteVector byteVector25 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putInt(0);
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putUTF8("");
        org.mockito.asm.ByteVector byteVector34 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putInt(0);
        org.mockito.asm.ByteVector byteVector40 = byteVector34.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector42 = byteVector34.putByte(100);
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector46 = byteVector42.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putByte(100);
        org.mockito.asm.ByteVector byteVector49 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector53 = byteVector49.putInt(0);
        org.mockito.asm.ByteVector byteVector55 = byteVector53.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector57 = byteVector55.putLong(100L);
        byte[] byteArray61 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector64 = byteVector55.putByteArray(byteArray61, 0, 0);
        org.mockito.asm.ByteVector byteVector67 = byteVector48.putByteArray(byteArray61, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector70 = byteVector29.putByteArray(byteArray61, (int) (short) 0, 0);
        org.mockito.asm.ByteVector byteVector73 = byteVector24.putByteArray(byteArray61, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector76 = byteVector18.putByteArray(byteArray61, (int) (byte) 100, (int) (byte) 10);
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
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
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
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteVector67);
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(byteVector73);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putShort((int) (byte) -1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) 'a');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((-1));
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector20 = byteVector12.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putLong((long) 1);
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
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((-1));
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putLong(0L);
        org.mockito.asm.ByteVector byteVector20 = byteVector12.putByte(10);
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
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong(10L);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putUTF8("");
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
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putShort(0);
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putShort((int) '#');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong(0L);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putByte(1);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putByte((int) (byte) -1);
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
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        byte[] byteArray9 = null;
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putByteArray(byteArray9, (int) (short) -1, (int) '4');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt(100);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putShort((int) 'a');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putShort(1);
        org.mockito.asm.ByteVector byteVector13 = byteVector7.putShort(100);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("hi!");
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
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putByte((-1));
        org.mockito.asm.ByteVector byteVector14 = byteVector4.putLong((long) (short) 10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte(1);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putShort(0);
        org.mockito.asm.ByteVector byteVector16 = byteVector8.putUTF8("");
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
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putLong((long) '4');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putShort((int) (byte) 100);
        byte[] byteArray19 = null;
        org.mockito.asm.ByteVector byteVector22 = byteVector16.putByteArray(byteArray19, (int) (short) 10, (int) 'a');
        org.mockito.asm.ByteVector byteVector24 = byteVector16.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector26 = byteVector16.putShort((-1));
        org.mockito.asm.ByteVector byteVector27 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector33 = byteVector27.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector39 = byteVector35.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector40 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector44 = byteVector40.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector48 = byteVector44.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector50 = byteVector44.putLong(0L);
        org.mockito.asm.ByteVector byteVector52 = byteVector44.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector54 = byteVector52.putUTF8("");
        org.mockito.asm.ByteVector byteVector56 = byteVector52.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector58 = byteVector56.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector60 = byteVector56.putByte(0);
        org.mockito.asm.ByteVector byteVector61 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector63 = byteVector61.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector65 = byteVector63.putInt(0);
        org.mockito.asm.ByteVector byteVector67 = byteVector63.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector69 = byteVector67.putLong((-1L));
        org.mockito.asm.ByteVector byteVector71 = byteVector67.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector72 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector74 = byteVector72.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector76 = byteVector72.putInt(0);
        org.mockito.asm.ByteVector byteVector78 = byteVector76.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector80 = byteVector78.putLong(100L);
        byte[] byteArray84 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector87 = byteVector78.putByteArray(byteArray84, 0, 0);
        org.mockito.asm.ByteVector byteVector90 = byteVector67.putByteArray(byteArray84, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector93 = byteVector60.putByteArray(byteArray84, 1, 0);
        org.mockito.asm.ByteVector byteVector96 = byteVector35.putByteArray(byteArray84, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector99 = byteVector16.putByteArray(byteArray84, (int) (short) 100, (int) (byte) 1);
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
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
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
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteVector67);
        org.junit.Assert.assertNotNull(byteVector69);
        org.junit.Assert.assertNotNull(byteVector71);
        org.junit.Assert.assertNotNull(byteVector74);
        org.junit.Assert.assertNotNull(byteVector76);
        org.junit.Assert.assertNotNull(byteVector78);
        org.junit.Assert.assertNotNull(byteVector80);
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray84), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector87);
        org.junit.Assert.assertNotNull(byteVector90);
        org.junit.Assert.assertNotNull(byteVector93);
        org.junit.Assert.assertNotNull(byteVector96);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector14 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector15 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putInt(0);
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putLong(100L);
        byte[] byteArray27 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector30 = byteVector21.putByteArray(byteArray27, 0, 0);
        org.mockito.asm.ByteVector byteVector33 = byteVector14.putByteArray(byteArray27, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector36 = byteVector10.putByteArray(byteArray27, (int) (short) 0, 0);
        org.mockito.asm.ByteVector byteVector38 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector40 = byteVector10.putUTF8("");
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector44 = byteVector40.putByte(0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort(0);
        java.lang.Class<?> wildcardClass13 = byteVector10.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort(1);
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
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putShort(100);
        java.lang.Class<?> wildcardClass11 = byteVector10.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (byte) 100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putLong((long) 0);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector2.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector2.putShort((int) (byte) -1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) (short) 10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putShort(0);
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putShort((-1));
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putShort(1);
        org.mockito.asm.ByteVector byteVector16 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector26 = byteVector20.putLong(0L);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putByte(0);
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putByte(100);
        org.mockito.asm.ByteVector byteVector32 = byteVector28.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector36 = byteVector32.putShort(100);
        org.mockito.asm.ByteVector byteVector38 = byteVector32.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector39 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector43 = byteVector39.putInt(0);
        org.mockito.asm.ByteVector byteVector45 = byteVector39.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector47 = byteVector39.putByte(100);
        org.mockito.asm.ByteVector byteVector49 = byteVector47.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector51 = byteVector47.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector53 = byteVector51.putByte(100);
        org.mockito.asm.ByteVector byteVector54 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector56 = byteVector54.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector58 = byteVector54.putInt(0);
        org.mockito.asm.ByteVector byteVector60 = byteVector58.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector62 = byteVector60.putLong(100L);
        byte[] byteArray66 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector69 = byteVector60.putByteArray(byteArray66, 0, 0);
        org.mockito.asm.ByteVector byteVector72 = byteVector53.putByteArray(byteArray66, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector75 = byteVector38.putByteArray(byteArray66, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector78 = byteVector15.putByteArray(byteArray66, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
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
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector69);
        org.junit.Assert.assertNotNull(byteVector72);
        org.junit.Assert.assertNotNull(byteVector75);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (short) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putShort(0);
        java.lang.Class<?> wildcardClass4 = byteVector3.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putLong(1L);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putInt(0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putShort((-1));
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
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (byte) 100);
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 10, (byte) -1 };
        org.mockito.asm.ByteVector byteVector19 = byteVector10.putByteArray(byteArray16, (int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 10, -1]");
        org.junit.Assert.assertNotNull(byteVector19);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putInt(0);
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putLong((-1L));
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector20 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putInt(0);
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putLong(100L);
        byte[] byteArray32 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector35 = byteVector26.putByteArray(byteArray32, 0, 0);
        org.mockito.asm.ByteVector byteVector38 = byteVector15.putByteArray(byteArray32, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector41 = byteVector8.putByteArray(byteArray32, 1, 1);
        java.lang.Class<?> wildcardClass42 = byteVector8.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putByte(10);
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector19 = byteVector13.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector25 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putInt(100);
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putUTF8("");
        org.mockito.asm.ByteVector byteVector34 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector42 = byteVector38.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector44 = byteVector38.putLong(0L);
        org.mockito.asm.ByteVector byteVector46 = byteVector38.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putUTF8("");
        org.mockito.asm.ByteVector byteVector50 = byteVector46.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector52 = byteVector46.putByte(0);
        org.mockito.asm.ByteVector byteVector53 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector55 = byteVector53.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector57 = byteVector53.putInt(0);
        org.mockito.asm.ByteVector byteVector59 = byteVector57.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector61 = byteVector59.putLong(100L);
        byte[] byteArray65 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector68 = byteVector59.putByteArray(byteArray65, 0, 0);
        org.mockito.asm.ByteVector byteVector71 = byteVector52.putByteArray(byteArray65, (int) (short) 1, 0);
        org.mockito.asm.ByteVector byteVector74 = byteVector29.putByteArray(byteArray65, 1, 1);
        org.mockito.asm.ByteVector byteVector77 = byteVector23.putByteArray(byteArray65, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector80 = byteVector4.putByteArray(byteArray65, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector71);
        org.junit.Assert.assertNotNull(byteVector74);
        org.junit.Assert.assertNotNull(byteVector77);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putShort((-1));
        org.mockito.asm.ByteVector byteVector16 = byteVector8.putLong((long) (byte) 0);
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
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("");
        java.lang.Class<?> wildcardClass9 = byteVector6.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putUTF8("hi!");
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
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putLong((-1L));
        org.mockito.asm.ByteVector byteVector9 = byteVector3.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putInt(0);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putLong(100L);
        byte[] byteArray23 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector26 = byteVector17.putByteArray(byteArray23, 0, 0);
        org.mockito.asm.ByteVector byteVector29 = byteVector10.putByteArray(byteArray23, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector32 = byteVector8.putByteArray(byteArray23, 0, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong(10L);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) '#');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putLong(100L);
        java.lang.Class<?> wildcardClass17 = byteVector10.getClass();
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
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("");
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector28 = byteVector24.putUTF8("");
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putUTF8("hi!");
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
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt(0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((-1));
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) (byte) 100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((-1));
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((-1L));
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) '#');
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
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("");
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("");
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
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) ' ');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt(0);
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector11 = byteVector5.putByte(100);
        org.mockito.asm.ByteVector byteVector13 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putLong((long) 10);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putLong(0L);
        org.mockito.asm.ByteVector byteVector22 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putUTF8("");
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector28 = byteVector22.putByte(0);
        org.mockito.asm.ByteVector byteVector29 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putInt(0);
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putLong(100L);
        byte[] byteArray41 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector44 = byteVector35.putByteArray(byteArray41, 0, 0);
        org.mockito.asm.ByteVector byteVector47 = byteVector28.putByteArray(byteArray41, (int) (short) 1, 0);
        org.mockito.asm.ByteVector byteVector50 = byteVector5.putByteArray(byteArray41, 1, 1);
        org.mockito.asm.ByteVector byteVector52 = byteVector5.putByte((int) (short) 0);
        java.lang.Class<?> wildcardClass53 = byteVector5.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
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
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong(0L);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector18 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector19 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putInt(0);
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putLong(100L);
        byte[] byteArray31 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector34 = byteVector25.putByteArray(byteArray31, 0, 0);
        org.mockito.asm.ByteVector byteVector37 = byteVector18.putByteArray(byteArray31, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector40 = byteVector16.putByteArray(byteArray31, (-1), 1);
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
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector37);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (short) 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        byte[] byteArray9 = null;
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putByteArray(byteArray9, (int) '#', 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) (short) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putShort((int) (short) 100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte(0);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector21 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector29 = byteVector25.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putLong(0L);
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector34 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putInt(0);
        org.mockito.asm.ByteVector byteVector40 = byteVector36.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putLong((-1L));
        org.mockito.asm.ByteVector byteVector44 = byteVector40.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector45 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector49 = byteVector45.putInt(0);
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector53 = byteVector51.putLong(100L);
        byte[] byteArray57 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector60 = byteVector51.putByteArray(byteArray57, 0, 0);
        org.mockito.asm.ByteVector byteVector63 = byteVector40.putByteArray(byteArray57, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector66 = byteVector33.putByteArray(byteArray57, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector69 = byteVector20.putByteArray(byteArray57, (int) (byte) 10, (int) (short) 10);
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
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteVector66);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putByte((int) (short) 10);
        byte[] byteArray10 = null;
        org.mockito.asm.ByteVector byteVector13 = byteVector7.putByteArray(byteArray10, 1, 100);
        org.mockito.asm.ByteVector byteVector15 = byteVector7.putInt((int) ' ');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putShort((int) (byte) 1);
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
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (byte) 1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((-1));
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector16 = byteVector8.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putLong(0L);
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
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putByte(0);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putInt((int) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putShort((int) 'a');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector16 = byteVector8.putInt((int) (short) -1);
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
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((-1));
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putByte((int) (short) -1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong(0L);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putByte(1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort(1);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putInt((int) (short) 10);
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putUTF8("");
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
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector9 = byteVector3.putByte(10);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector9 = byteVector1.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putInt(100);
        org.mockito.asm.ByteVector byteVector15 = byteVector9.putShort(10);
        org.mockito.asm.ByteVector byteVector17 = byteVector9.putInt(10);
        org.mockito.asm.ByteVector byteVector19 = byteVector9.putByte((int) (short) -1);
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
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong(0L);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector12 = byteVector0.putLong(100L);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((-1));
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putUTF8("");
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
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong(1L);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector14.putInt(1);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putUTF8("hi!");
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
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort(10);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte(10);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putInt((-1));
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
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort(0);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByte(10);
        org.mockito.asm.ByteVector byteVector18 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putUTF8("");
        org.mockito.asm.ByteVector byteVector23 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putLong((-1L));
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putInt(10);
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector37 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector38 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector42 = byteVector38.putInt(0);
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putLong(100L);
        byte[] byteArray50 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector53 = byteVector44.putByteArray(byteArray50, 0, 0);
        org.mockito.asm.ByteVector byteVector56 = byteVector37.putByteArray(byteArray50, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector59 = byteVector33.putByteArray(byteArray50, (int) (short) 0, 0);
        org.mockito.asm.ByteVector byteVector62 = byteVector18.putByteArray(byteArray50, (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector65 = byteVector12.putByteArray(byteArray50, (int) (byte) 1, (int) (short) 10);
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
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector62);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putByte(100);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((-1));
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putShort((int) (byte) 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putLong(1L);
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("");
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
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector18 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector23 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putInt(0);
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putLong(100L);
        byte[] byteArray35 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector38 = byteVector29.putByteArray(byteArray35, 0, 0);
        org.mockito.asm.ByteVector byteVector41 = byteVector22.putByteArray(byteArray35, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector44 = byteVector14.putByteArray(byteArray35, (int) ' ', (int) (short) 0);
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
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector41);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector2 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong(100L);
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector17 = byteVector8.putByteArray(byteArray14, 0, 0);
        org.mockito.asm.ByteVector byteVector20 = byteVector1.putByteArray(byteArray14, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector22 = byteVector1.putLong((long) (byte) 100);
        org.mockito.asm.ByteVector byteVector24 = byteVector1.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putInt((-1));
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putInt(0);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("hi!");
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
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte(0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) 'a');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putLong(100L);
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("");
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putLong((-1L));
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putLong((-1L));
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector22 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector30 = byteVector26.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector32 = byteVector26.putLong(0L);
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putByte(0);
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putLong(1L);
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector40 = byteVector36.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector42 = byteVector36.putUTF8("");
        org.mockito.asm.ByteVector byteVector43 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector49 = byteVector47.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector51 = byteVector47.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector53 = byteVector51.putInt(10);
        org.mockito.asm.ByteVector byteVector55 = byteVector51.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector57 = byteVector51.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector59 = byteVector51.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector60 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector62 = byteVector60.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector64 = byteVector60.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector66 = byteVector64.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector68 = byteVector64.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector70 = byteVector64.putLong(0L);
        org.mockito.asm.ByteVector byteVector72 = byteVector64.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector74 = byteVector72.putUTF8("");
        org.mockito.asm.ByteVector byteVector76 = byteVector74.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector78 = byteVector74.putLong((long) (short) 100);
        byte[] byteArray83 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector86 = byteVector74.putByteArray(byteArray83, 0, 0);
        org.mockito.asm.ByteVector byteVector89 = byteVector59.putByteArray(byteArray83, (int) (byte) 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector92 = byteVector36.putByteArray(byteArray83, (int) (short) 0, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector95 = byteVector21.putByteArray(byteArray83, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector98 = byteVector7.putByteArray(byteArray83, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
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
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(byteVector72);
        org.junit.Assert.assertNotNull(byteVector74);
        org.junit.Assert.assertNotNull(byteVector76);
        org.junit.Assert.assertNotNull(byteVector78);
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray83), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector86);
        org.junit.Assert.assertNotNull(byteVector89);
        org.junit.Assert.assertNotNull(byteVector92);
        org.junit.Assert.assertNotNull(byteVector95);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong(0L);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector0.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) (byte) 10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt((-1));
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putShort((int) 'a');
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
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putInt(10);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        java.lang.Class<?> wildcardClass14 = byteVector11.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putShort((int) (byte) 100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putShort(10);
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putByte((int) '4');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        java.lang.Class<?> wildcardClass9 = byteVector4.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector19 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector29 = byteVector23.putLong(0L);
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putByte(100);
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector37 = byteVector33.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector38 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector42 = byteVector38.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector46 = byteVector42.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector48 = byteVector42.putLong(0L);
        org.mockito.asm.ByteVector byteVector50 = byteVector42.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector52 = byteVector50.putUTF8("");
        org.mockito.asm.ByteVector byteVector54 = byteVector50.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector56 = byteVector50.putByte(0);
        org.mockito.asm.ByteVector byteVector57 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector59 = byteVector57.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector61 = byteVector57.putInt(0);
        org.mockito.asm.ByteVector byteVector63 = byteVector61.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector65 = byteVector63.putLong(100L);
        byte[] byteArray69 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector72 = byteVector63.putByteArray(byteArray69, 0, 0);
        org.mockito.asm.ByteVector byteVector75 = byteVector56.putByteArray(byteArray69, (int) (short) 1, 0);
        org.mockito.asm.ByteVector byteVector78 = byteVector37.putByteArray(byteArray69, (int) (byte) 0, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector81 = byteVector14.putByteArray(byteArray69, 1, 0);
        org.mockito.asm.ByteVector byteVector83 = byteVector14.putUTF8("");
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
        org.junit.Assert.assertNotNull(byteVector35);
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
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector72);
        org.junit.Assert.assertNotNull(byteVector75);
        org.junit.Assert.assertNotNull(byteVector78);
        org.junit.Assert.assertNotNull(byteVector81);
        org.junit.Assert.assertNotNull(byteVector83);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector9 = byteVector3.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector10 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt(0);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort(1);
        org.mockito.asm.ByteVector byteVector17 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector23 = byteVector17.putLong(0L);
        org.mockito.asm.ByteVector byteVector25 = byteVector17.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector28 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector32 = byteVector28.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector36 = byteVector32.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector38 = byteVector32.putLong(0L);
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putByte(0);
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putByte(100);
        org.mockito.asm.ByteVector byteVector44 = byteVector40.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector48 = byteVector44.putShort(100);
        org.mockito.asm.ByteVector byteVector50 = byteVector44.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector51 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector53 = byteVector51.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector55 = byteVector51.putInt(0);
        org.mockito.asm.ByteVector byteVector57 = byteVector51.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector59 = byteVector51.putByte(100);
        org.mockito.asm.ByteVector byteVector61 = byteVector59.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector63 = byteVector59.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector65 = byteVector63.putByte(100);
        org.mockito.asm.ByteVector byteVector66 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector68 = byteVector66.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector70 = byteVector66.putInt(0);
        org.mockito.asm.ByteVector byteVector72 = byteVector70.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector74 = byteVector72.putLong(100L);
        byte[] byteArray78 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector81 = byteVector72.putByteArray(byteArray78, 0, 0);
        org.mockito.asm.ByteVector byteVector84 = byteVector65.putByteArray(byteArray78, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector87 = byteVector50.putByteArray(byteArray78, 1, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector90 = byteVector27.putByteArray(byteArray78, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector93 = byteVector14.putByteArray(byteArray78, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector96 = byteVector9.putByteArray(byteArray78, (int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector12);
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
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(byteVector72);
        org.junit.Assert.assertNotNull(byteVector74);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray78), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector81);
        org.junit.Assert.assertNotNull(byteVector84);
        org.junit.Assert.assertNotNull(byteVector87);
        org.junit.Assert.assertNotNull(byteVector90);
        org.junit.Assert.assertNotNull(byteVector93);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putUTF8("");
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("");
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
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(0);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putShort(100);
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
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort(0);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort(0);
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putLong((long) (byte) 0);
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
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort(100);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt(1);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort((int) (short) 1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putShort((int) '4');
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
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((-1));
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt(1);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector6.putInt((-1));
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
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putInt(1);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putLong(0L);
        org.mockito.asm.ByteVector byteVector21 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector27 = byteVector21.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putByte((int) (byte) 10);
        byte[] byteArray38 = new byte[] { (byte) 10, (byte) 0 };
        org.mockito.asm.ByteVector byteVector41 = byteVector35.putByteArray(byteArray38, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector44 = byteVector20.putByteArray(byteArray38, (int) ' ', (int) (byte) 1);
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
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[10, 0]");
        org.junit.Assert.assertNotNull(byteVector41);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putLong((long) 0);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector2.putInt((int) (byte) 1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt(0);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putByte((int) (short) 10);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putInt(10);
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector15 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector17 = byteVector9.putShort((-1));
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putUTF8("");
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putLong((long) 'a');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putInt(1);
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) (short) 100);
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector26 = byteVector14.putByteArray(byteArray23, 0, 0);
        org.mockito.asm.ByteVector byteVector28 = byteVector14.putInt((int) (short) 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((-1));
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector16 = byteVector8.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putLong(0L);
        org.mockito.asm.ByteVector byteVector26 = byteVector20.putLong((long) (short) 0);
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
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt((int) (short) -1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putLong((long) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector17 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putLong(0L);
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector30 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putInt(0);
        org.mockito.asm.ByteVector byteVector36 = byteVector32.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putLong((-1L));
        org.mockito.asm.ByteVector byteVector40 = byteVector36.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector41 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector45 = byteVector41.putInt(0);
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector49 = byteVector47.putLong(100L);
        byte[] byteArray53 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector56 = byteVector47.putByteArray(byteArray53, 0, 0);
        org.mockito.asm.ByteVector byteVector59 = byteVector36.putByteArray(byteArray53, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector62 = byteVector29.putByteArray(byteArray53, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector65 = byteVector16.putByteArray(byteArray53, (int) '4', (int) (short) 0);
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
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector62);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector15 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector25 = byteVector19.putLong(0L);
        org.mockito.asm.ByteVector byteVector27 = byteVector19.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("");
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putLong((long) (short) 100);
        byte[] byteArray38 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector41 = byteVector29.putByteArray(byteArray38, 0, 0);
        org.mockito.asm.ByteVector byteVector44 = byteVector10.putByteArray(byteArray38, 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass45 = byteVector10.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putByte(10);
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector11 = byteVector5.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong(10L);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("");
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putLong(100L);
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
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector20 = byteVector12.putInt(100);
        org.mockito.asm.ByteVector byteVector22 = byteVector12.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector24 = byteVector12.putByte((int) (byte) 10);
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
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) ' ');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt(0);
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector11 = byteVector5.putByte(100);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putInt((int) (short) 10);
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putByte(10);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putLong((long) 1);
        org.mockito.asm.ByteVector byteVector11 = byteVector5.putInt((int) (byte) -1);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putUTF8("");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong((long) 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt(0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort(0);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((long) 10);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector2.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector2.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector14 = byteVector2.putByte(10);
        org.mockito.asm.ByteVector byteVector16 = byteVector2.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector18 = byteVector2.putUTF8("hi!");
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
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putByte(0);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) '#');
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
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("");
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putInt((int) (byte) 10);
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
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putInt((int) (short) 10);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putShort(1);
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
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putInt(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong(0L);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector0.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort(1);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((int) (short) 1);
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
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putInt(10);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putLong(100L);
        org.mockito.asm.ByteVector byteVector26 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector27 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putInt(0);
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putLong(100L);
        byte[] byteArray39 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector42 = byteVector33.putByteArray(byteArray39, 0, 0);
        org.mockito.asm.ByteVector byteVector45 = byteVector26.putByteArray(byteArray39, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector48 = byteVector24.putByteArray(byteArray39, (int) (short) 0, (int) '4');
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
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector45);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putInt(0);
        java.lang.Class<?> wildcardClass9 = byteVector8.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putByte(1);
        org.mockito.asm.ByteVector byteVector13 = byteVector7.putLong((long) '#');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong(0L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putByte(1);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector12 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt(0);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putByte(0);
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector28 = byteVector24.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector29 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector37 = byteVector33.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putLong(0L);
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector42 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putInt(0);
        org.mockito.asm.ByteVector byteVector48 = byteVector44.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector50 = byteVector48.putLong((-1L));
        org.mockito.asm.ByteVector byteVector52 = byteVector48.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector53 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector55 = byteVector53.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector57 = byteVector53.putInt(0);
        org.mockito.asm.ByteVector byteVector59 = byteVector57.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector61 = byteVector59.putLong(100L);
        byte[] byteArray65 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector68 = byteVector59.putByteArray(byteArray65, 0, 0);
        org.mockito.asm.ByteVector byteVector71 = byteVector48.putByteArray(byteArray65, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector74 = byteVector41.putByteArray(byteArray65, (int) (byte) 0, 0);
        org.mockito.asm.ByteVector byteVector77 = byteVector24.putByteArray(byteArray65, 0, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector80 = byteVector11.putByteArray(byteArray65, (int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
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
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector71);
        org.junit.Assert.assertNotNull(byteVector74);
        org.junit.Assert.assertNotNull(byteVector77);
        org.junit.Assert.assertNotNull(byteVector80);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        byte[] byteArray9 = null;
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putByteArray(byteArray9, (int) '#', 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector19 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector29 = byteVector23.putLong(0L);
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putByte(100);
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector37 = byteVector33.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector38 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector42 = byteVector38.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector46 = byteVector42.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector48 = byteVector42.putLong(0L);
        org.mockito.asm.ByteVector byteVector50 = byteVector42.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector52 = byteVector50.putUTF8("");
        org.mockito.asm.ByteVector byteVector54 = byteVector50.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector56 = byteVector50.putByte(0);
        org.mockito.asm.ByteVector byteVector57 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector59 = byteVector57.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector61 = byteVector57.putInt(0);
        org.mockito.asm.ByteVector byteVector63 = byteVector61.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector65 = byteVector63.putLong(100L);
        byte[] byteArray69 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector72 = byteVector63.putByteArray(byteArray69, 0, 0);
        org.mockito.asm.ByteVector byteVector75 = byteVector56.putByteArray(byteArray69, (int) (short) 1, 0);
        org.mockito.asm.ByteVector byteVector78 = byteVector37.putByteArray(byteArray69, (int) (byte) 0, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector81 = byteVector18.putByteArray(byteArray69, 1, (int) (short) 1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
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
        org.junit.Assert.assertNotNull(byteVector35);
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
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector72);
        org.junit.Assert.assertNotNull(byteVector75);
        org.junit.Assert.assertNotNull(byteVector78);
        org.junit.Assert.assertNotNull(byteVector81);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (short) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector7 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector13 = byteVector7.putUTF8("");
        org.mockito.asm.ByteVector byteVector15 = byteVector7.putUTF8("");
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector18 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putInt(0);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putUTF8("");
        org.mockito.asm.ByteVector byteVector27 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putInt(0);
        org.mockito.asm.ByteVector byteVector33 = byteVector27.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector35 = byteVector27.putByte(100);
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector39 = byteVector35.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putByte(100);
        org.mockito.asm.ByteVector byteVector42 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector46 = byteVector42.putInt(0);
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector50 = byteVector48.putLong(100L);
        byte[] byteArray54 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector57 = byteVector48.putByteArray(byteArray54, 0, 0);
        org.mockito.asm.ByteVector byteVector60 = byteVector41.putByteArray(byteArray54, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector63 = byteVector22.putByteArray(byteArray54, (int) (short) 0, 0);
        org.mockito.asm.ByteVector byteVector66 = byteVector17.putByteArray(byteArray54, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector69 = byteVector5.putByteArray(byteArray54, (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
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
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteVector66);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) (short) 10);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putByte(100);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putShort((int) ' ');
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
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector15 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putByte(100);
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector24 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putInt(0);
        org.mockito.asm.ByteVector byteVector30 = byteVector26.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putLong((-1L));
        org.mockito.asm.ByteVector byteVector34 = byteVector30.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector35 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector39 = byteVector35.putInt(0);
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putLong(100L);
        byte[] byteArray47 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector50 = byteVector41.putByteArray(byteArray47, 0, 0);
        org.mockito.asm.ByteVector byteVector53 = byteVector30.putByteArray(byteArray47, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector56 = byteVector21.putByteArray(byteArray47, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector59 = byteVector12.putByteArray(byteArray47, (int) 'a', 1);
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
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector56);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putShort(10);
        byte[] byteArray15 = null;
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putByteArray(byteArray15, (int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector18);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong(10L);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putUTF8("hi!");
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
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt(0);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putByte((int) (short) 10);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putInt(10);
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putInt(10);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("hi!");
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
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong((long) (byte) 10);
        java.lang.Class<?> wildcardClass6 = byteVector5.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((-1));
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector20 = byteVector12.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putUTF8("");
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putShort((-1));
        org.mockito.asm.ByteVector byteVector30 = byteVector26.putByte((int) (byte) 1);
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
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector18 = byteVector10.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector20 = byteVector10.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector22 = byteVector10.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putByte((-1));
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putLong((-1L));
        org.mockito.asm.ByteVector byteVector28 = byteVector22.putInt((int) (short) 100);
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
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector17 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putInt(0);
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putUTF8("");
        org.mockito.asm.ByteVector byteVector26 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector30 = byteVector26.putInt(0);
        org.mockito.asm.ByteVector byteVector32 = byteVector26.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector34 = byteVector26.putByte(100);
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putByte(100);
        org.mockito.asm.ByteVector byteVector41 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector45 = byteVector41.putInt(0);
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector49 = byteVector47.putLong(100L);
        byte[] byteArray53 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector56 = byteVector47.putByteArray(byteArray53, 0, 0);
        org.mockito.asm.ByteVector byteVector59 = byteVector40.putByteArray(byteArray53, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector62 = byteVector21.putByteArray(byteArray53, (int) (short) 0, 0);
        org.mockito.asm.ByteVector byteVector65 = byteVector16.putByteArray(byteArray53, (int) (byte) 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector68 = byteVector10.putByteArray(byteArray53, 0, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector70 = byteVector68.putUTF8("");
        java.lang.Class<?> wildcardClass71 = byteVector68.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
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
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort(1);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector18 = byteVector10.putLong(10L);
        org.mockito.asm.ByteVector byteVector20 = byteVector10.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector22 = byteVector10.putUTF8("hi!");
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
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putShort(100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putUTF8("");
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort((int) (byte) 10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putUTF8("");
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putInt((int) (short) 100);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putInt(1);
        org.mockito.asm.ByteVector byteVector21 = byteVector15.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putLong(1L);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector4 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putLong(0L);
        org.mockito.asm.ByteVector byteVector16 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("");
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector22 = byteVector16.putByte(0);
        org.mockito.asm.ByteVector byteVector23 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putInt(0);
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putLong(100L);
        byte[] byteArray35 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector38 = byteVector29.putByteArray(byteArray35, 0, 0);
        org.mockito.asm.ByteVector byteVector41 = byteVector22.putByteArray(byteArray35, (int) (short) 1, 0);
        org.mockito.asm.ByteVector byteVector44 = byteVector1.putByteArray(byteArray35, 0, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putShort(1);
        org.junit.Assert.assertNotNull(byteVector3);
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
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putShort((int) 'a');
        byte[] byteArray5 = null;
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByteArray(byteArray5, (int) (short) -1, (int) '4');
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong((-1L));
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort((int) (short) 10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((-1));
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putLong((long) (short) 10);
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
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong(100L);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putShort((-1));
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
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putLong((long) (byte) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putUTF8("");
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
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putLong((long) 1);
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putInt(0);
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        byte[] byteArray9 = null;
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putByteArray(byteArray9, (int) '#', 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector6.putInt(1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putInt((int) (short) 10);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putByte((-1));
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
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((-1));
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putByte(10);
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
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) ' ');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putInt(1);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putByte((int) (byte) 10);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong(0L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putByte(10);
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putLong((long) (byte) 0);
        byte[] byteArray12 = null;
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putByteArray(byteArray12, (int) (short) 10, (int) '#');
        org.mockito.asm.ByteVector byteVector16 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector26 = byteVector20.putLong(0L);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putByte(0);
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putByte(100);
        org.mockito.asm.ByteVector byteVector32 = byteVector28.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector36 = byteVector32.putShort(100);
        org.mockito.asm.ByteVector byteVector38 = byteVector32.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector39 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector43 = byteVector39.putInt(0);
        org.mockito.asm.ByteVector byteVector45 = byteVector39.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector47 = byteVector39.putByte(100);
        org.mockito.asm.ByteVector byteVector49 = byteVector47.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector51 = byteVector47.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector53 = byteVector51.putByte(100);
        org.mockito.asm.ByteVector byteVector54 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector56 = byteVector54.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector58 = byteVector54.putInt(0);
        org.mockito.asm.ByteVector byteVector60 = byteVector58.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector62 = byteVector60.putLong(100L);
        byte[] byteArray66 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector69 = byteVector60.putByteArray(byteArray66, 0, 0);
        org.mockito.asm.ByteVector byteVector72 = byteVector53.putByteArray(byteArray66, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector75 = byteVector38.putByteArray(byteArray66, 1, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector78 = byteVector11.putByteArray(byteArray66, 0, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector80 = byteVector78.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector82 = byteVector78.putUTF8("");
        org.mockito.asm.ByteVector byteVector84 = byteVector78.putShort((int) (byte) 10);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector15);
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
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector69);
        org.junit.Assert.assertNotNull(byteVector72);
        org.junit.Assert.assertNotNull(byteVector75);
        org.junit.Assert.assertNotNull(byteVector78);
        org.junit.Assert.assertNotNull(byteVector80);
        org.junit.Assert.assertNotNull(byteVector82);
        org.junit.Assert.assertNotNull(byteVector84);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putUTF8("");
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putByte((int) (short) -1);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong(1L);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong(0L);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector13 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putInt(0);
        org.mockito.asm.ByteVector byteVector19 = byteVector13.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector21 = byteVector13.putByte(100);
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putByte(100);
        org.mockito.asm.ByteVector byteVector28 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector32 = byteVector28.putInt(0);
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putLong(100L);
        byte[] byteArray40 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector43 = byteVector34.putByteArray(byteArray40, 0, 0);
        org.mockito.asm.ByteVector byteVector46 = byteVector27.putByteArray(byteArray40, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector49 = byteVector10.putByteArray(byteArray40, (int) (byte) 100, (int) '#');
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
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector46);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector24 = byteVector18.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector26 = byteVector18.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector28 = byteVector18.putUTF8("hi!");
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
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putByte((int) (short) 1);
        java.lang.Class<?> wildcardClass21 = byteVector20.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (short) 100);
        java.lang.Class<?> wildcardClass11 = byteVector10.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("");
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putUTF8("");
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putUTF8("hi!");
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
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) (byte) 100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort(1);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt(10);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort(10);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((int) (byte) -1);
        java.lang.Class<?> wildcardClass17 = byteVector12.getClass();
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
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((int) (short) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("");
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
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("");
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
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort(10);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("");
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putLong((long) 0);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putInt(100);
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
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt((int) '#');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((int) (short) 10);
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
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putInt(1);
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putInt(100);
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
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putByte((int) (short) 10);
        byte[] byteArray10 = null;
        org.mockito.asm.ByteVector byteVector13 = byteVector7.putByteArray(byteArray10, 1, 100);
        org.mockito.asm.ByteVector byteVector15 = byteVector7.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putByte(100);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putInt(0);
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putLong((-1L));
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector20 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putInt(0);
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putLong(100L);
        byte[] byteArray32 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector35 = byteVector26.putByteArray(byteArray32, 0, 0);
        org.mockito.asm.ByteVector byteVector38 = byteVector15.putByteArray(byteArray32, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector41 = byteVector6.putByteArray(byteArray32, (int) (byte) 1, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector43 = byteVector6.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector45 = byteVector6.putShort(100);
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putLong(0L);
        org.mockito.asm.ByteVector byteVector49 = byteVector45.putByte((int) (byte) 10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putLong(10L);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) 1);
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
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putByte((int) (short) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putInt(0);
        java.lang.Class<?> wildcardClass13 = byteVector4.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector16 = byteVector8.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putInt((int) (short) 100);
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putShort(1);
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
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("hi!");
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
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) ' ');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt(0);
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putLong((long) (byte) 100);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putByte((int) (short) 100);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt(0);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putShort(0);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putInt((int) '4');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putByte(0);
        org.mockito.asm.ByteVector byteVector16 = byteVector8.putShort((int) ' ');
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
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putByte(0);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putLong(100L);
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
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong((long) (byte) 10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) '4');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort(100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putByte(10);
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putByte((-1));
        org.mockito.asm.ByteVector byteVector15 = byteVector9.putShort(1);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((-1));
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putLong((long) '#');
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
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt(0);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort(100);
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
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putUTF8("");
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector14 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector24 = byteVector18.putLong(0L);
        org.mockito.asm.ByteVector byteVector26 = byteVector18.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector30 = byteVector26.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector32 = byteVector26.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector36 = byteVector32.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector38 = byteVector32.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector40 = byteVector32.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector41 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector45 = byteVector41.putInt(0);
        org.mockito.asm.ByteVector byteVector47 = byteVector41.putInt(1);
        org.mockito.asm.ByteVector byteVector49 = byteVector41.putUTF8("");
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putLong(10L);
        org.mockito.asm.ByteVector byteVector52 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector54 = byteVector52.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector56 = byteVector54.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector58 = byteVector56.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector60 = byteVector56.putLong((-1L));
        org.mockito.asm.ByteVector byteVector62 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector63 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector65 = byteVector63.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector67 = byteVector63.putInt(0);
        org.mockito.asm.ByteVector byteVector69 = byteVector67.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector71 = byteVector69.putLong(100L);
        byte[] byteArray75 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector78 = byteVector69.putByteArray(byteArray75, 0, 0);
        org.mockito.asm.ByteVector byteVector81 = byteVector62.putByteArray(byteArray75, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector84 = byteVector60.putByteArray(byteArray75, 0, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector87 = byteVector49.putByteArray(byteArray75, 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector90 = byteVector40.putByteArray(byteArray75, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector93 = byteVector9.putByteArray(byteArray75, (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
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
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteVector67);
        org.junit.Assert.assertNotNull(byteVector69);
        org.junit.Assert.assertNotNull(byteVector71);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector78);
        org.junit.Assert.assertNotNull(byteVector81);
        org.junit.Assert.assertNotNull(byteVector84);
        org.junit.Assert.assertNotNull(byteVector87);
        org.junit.Assert.assertNotNull(byteVector90);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) (short) 100);
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector26 = byteVector14.putByteArray(byteArray23, 0, 0);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putShort(10);
        org.mockito.asm.ByteVector byteVector30 = byteVector26.putInt(10);
        org.mockito.asm.ByteVector byteVector32 = byteVector26.putInt((-1));
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putLong((long) 'a');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putByte(1);
        org.mockito.asm.ByteVector byteVector12 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector22 = byteVector16.putLong(0L);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putByte(100);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector30 = byteVector26.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector31 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector35 = byteVector31.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector39 = byteVector35.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector41 = byteVector35.putLong(0L);
        org.mockito.asm.ByteVector byteVector43 = byteVector35.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putUTF8("");
        org.mockito.asm.ByteVector byteVector47 = byteVector43.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector49 = byteVector43.putByte(0);
        org.mockito.asm.ByteVector byteVector50 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector52 = byteVector50.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector54 = byteVector50.putInt(0);
        org.mockito.asm.ByteVector byteVector56 = byteVector54.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector58 = byteVector56.putLong(100L);
        byte[] byteArray62 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector65 = byteVector56.putByteArray(byteArray62, 0, 0);
        org.mockito.asm.ByteVector byteVector68 = byteVector49.putByteArray(byteArray62, (int) (short) 1, 0);
        org.mockito.asm.ByteVector byteVector71 = byteVector30.putByteArray(byteArray62, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector74 = byteVector11.putByteArray(byteArray62, (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
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
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector71);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong(10L);
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
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putInt(0);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putLong(100L);
        byte[] byteArray23 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector26 = byteVector17.putByteArray(byteArray23, 0, 0);
        org.mockito.asm.ByteVector byteVector29 = byteVector6.putByteArray(byteArray23, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector31 = byteVector6.putInt((-1));
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putLong(1L);
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putUTF8("");
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector39 = byteVector35.putInt((int) (byte) 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putShort(0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putByte((int) 'a');
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
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putLong((long) 1);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putLong((long) (short) -1);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt(1);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong(10L);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putShort((int) (byte) -1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putInt(1);
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putInt(0);
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
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putByte(0);
        org.mockito.asm.ByteVector byteVector19 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putInt(0);
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putLong(100L);
        byte[] byteArray31 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector34 = byteVector25.putByteArray(byteArray31, 0, 0);
        org.mockito.asm.ByteVector byteVector37 = byteVector18.putByteArray(byteArray31, (int) (short) 1, 0);
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putInt((int) (byte) 1);
        java.lang.Class<?> wildcardClass40 = byteVector39.getClass();
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
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putByte(100);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector12 = byteVector0.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt((int) (short) 0);
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
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((-1));
        org.mockito.asm.ByteVector byteVector13 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putByte(100);
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector21 = byteVector15.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector22 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector30 = byteVector26.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector32 = byteVector26.putLong(0L);
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putByte(0);
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putByte(100);
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector42 = byteVector38.putShort(100);
        org.mockito.asm.ByteVector byteVector44 = byteVector38.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector45 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector49 = byteVector45.putInt(0);
        org.mockito.asm.ByteVector byteVector51 = byteVector45.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector53 = byteVector45.putByte(100);
        org.mockito.asm.ByteVector byteVector55 = byteVector53.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector57 = byteVector53.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector59 = byteVector57.putByte(100);
        org.mockito.asm.ByteVector byteVector60 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector62 = byteVector60.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector64 = byteVector60.putInt(0);
        org.mockito.asm.ByteVector byteVector66 = byteVector64.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector68 = byteVector66.putLong(100L);
        byte[] byteArray72 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector75 = byteVector66.putByteArray(byteArray72, 0, 0);
        org.mockito.asm.ByteVector byteVector78 = byteVector59.putByteArray(byteArray72, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector81 = byteVector44.putByteArray(byteArray72, 1, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector84 = byteVector15.putByteArray(byteArray72, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector87 = byteVector12.putByteArray(byteArray72, (int) (byte) -1, (int) (short) 100);
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
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
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
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector75);
        org.junit.Assert.assertNotNull(byteVector78);
        org.junit.Assert.assertNotNull(byteVector81);
        org.junit.Assert.assertNotNull(byteVector84);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) (byte) 1);
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
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByte(0);
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
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((-1));
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (byte) 10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector2.putShort(0);
        org.mockito.asm.ByteVector byteVector12 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector13 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putInt(0);
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putLong(100L);
        byte[] byteArray25 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector28 = byteVector19.putByteArray(byteArray25, 0, 0);
        org.mockito.asm.ByteVector byteVector31 = byteVector12.putByteArray(byteArray25, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector34 = byteVector10.putByteArray(byteArray25, (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector31);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector13 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putInt(0);
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putLong((-1L));
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector24 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector28 = byteVector24.putInt(0);
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putLong(100L);
        byte[] byteArray36 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector39 = byteVector30.putByteArray(byteArray36, 0, 0);
        org.mockito.asm.ByteVector byteVector42 = byteVector19.putByteArray(byteArray36, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector45 = byteVector10.putByteArray(byteArray36, (int) (byte) -1, (-1));
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
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector42);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong(10L);
        java.lang.Class<?> wildcardClass13 = byteVector10.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector14 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector15 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putInt(0);
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putLong(100L);
        byte[] byteArray27 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector30 = byteVector21.putByteArray(byteArray27, 0, 0);
        org.mockito.asm.ByteVector byteVector33 = byteVector14.putByteArray(byteArray27, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector36 = byteVector10.putByteArray(byteArray27, (int) (short) 0, 0);
        org.mockito.asm.ByteVector byteVector38 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector40 = byteVector10.putLong(1L);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putInt((-1));
        org.mockito.asm.ByteVector byteVector9 = byteVector1.putLong((long) (byte) 0);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putByte((int) ' ');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (short) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putLong((long) '#');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("");
        java.lang.Class<?> wildcardClass9 = byteVector0.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putShort((int) '4');
        java.lang.Class<?> wildcardClass15 = byteVector6.getClass();
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
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putInt(0);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putLong(100L);
        byte[] byteArray23 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector26 = byteVector17.putByteArray(byteArray23, 0, 0);
        org.mockito.asm.ByteVector byteVector29 = byteVector6.putByteArray(byteArray23, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector31 = byteVector6.putInt((-1));
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putLong(1L);
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putLong(10L);
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putLong((long) 1);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("");
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
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putByte((int) '#');
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putShort(100);
        byte[] byteArray10 = null;
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putByteArray(byteArray10, (-1), 10);
        org.mockito.asm.ByteVector byteVector15 = byteVector9.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector17 = byteVector9.putUTF8("");
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putByte(0);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        byte[] byteArray9 = null;
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putByteArray(byteArray9, (int) '#', 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) (short) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector19 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector29 = byteVector23.putLong(0L);
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putByte(0);
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector34 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector42 = byteVector38.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector44 = byteVector38.putLong(0L);
        org.mockito.asm.ByteVector byteVector46 = byteVector38.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putUTF8("");
        org.mockito.asm.ByteVector byteVector50 = byteVector48.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector52 = byteVector48.putLong((long) (short) 100);
        byte[] byteArray57 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector60 = byteVector48.putByteArray(byteArray57, 0, 0);
        org.mockito.asm.ByteVector byteVector63 = byteVector29.putByteArray(byteArray57, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector66 = byteVector18.putByteArray(byteArray57, (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
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
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector63);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putLong(10L);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort(100);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putShort(0);
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
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putByte((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector13 = byteVector7.putInt((-1));
        org.mockito.asm.ByteVector byteVector14 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putInt(10);
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector32 = byteVector28.putUTF8("");
        org.mockito.asm.ByteVector byteVector34 = byteVector28.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector36 = byteVector28.putInt((int) (short) 10);
        org.mockito.asm.ByteVector byteVector37 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putInt(0);
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector45 = byteVector41.putUTF8("");
        org.mockito.asm.ByteVector byteVector46 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector50 = byteVector46.putInt(0);
        org.mockito.asm.ByteVector byteVector52 = byteVector46.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector54 = byteVector46.putByte(100);
        org.mockito.asm.ByteVector byteVector56 = byteVector54.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector58 = byteVector54.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector60 = byteVector58.putByte(100);
        org.mockito.asm.ByteVector byteVector61 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector63 = byteVector61.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector65 = byteVector61.putInt(0);
        org.mockito.asm.ByteVector byteVector67 = byteVector65.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector69 = byteVector67.putLong(100L);
        byte[] byteArray73 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector76 = byteVector67.putByteArray(byteArray73, 0, 0);
        org.mockito.asm.ByteVector byteVector79 = byteVector60.putByteArray(byteArray73, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector82 = byteVector41.putByteArray(byteArray73, (int) (short) 0, 0);
        org.mockito.asm.ByteVector byteVector85 = byteVector36.putByteArray(byteArray73, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector88 = byteVector7.putByteArray(byteArray73, (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
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
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteVector67);
        org.junit.Assert.assertNotNull(byteVector69);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray73), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector76);
        org.junit.Assert.assertNotNull(byteVector79);
        org.junit.Assert.assertNotNull(byteVector82);
        org.junit.Assert.assertNotNull(byteVector85);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector14 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector20 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector23 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector33 = byteVector27.putLong(0L);
        org.mockito.asm.ByteVector byteVector35 = byteVector27.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putUTF8("");
        org.mockito.asm.ByteVector byteVector39 = byteVector35.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector41 = byteVector35.putByte(0);
        org.mockito.asm.ByteVector byteVector42 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector46 = byteVector42.putInt(0);
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector50 = byteVector48.putLong(100L);
        byte[] byteArray54 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector57 = byteVector48.putByteArray(byteArray54, 0, 0);
        org.mockito.asm.ByteVector byteVector60 = byteVector41.putByteArray(byteArray54, (int) (short) 1, 0);
        org.mockito.asm.ByteVector byteVector63 = byteVector20.putByteArray(byteArray54, 0, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector66 = byteVector18.putByteArray(byteArray54, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector69 = byteVector12.putByteArray(byteArray54, (int) (byte) 1, (int) (byte) 100);
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
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector22);
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
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteVector66);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte(100);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putLong(100L);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putByte((-1));
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector17 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector27 = byteVector21.putLong(0L);
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putByte(100);
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector35 = byteVector31.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector36 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector40 = byteVector36.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector44 = byteVector40.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector46 = byteVector40.putLong(0L);
        org.mockito.asm.ByteVector byteVector48 = byteVector40.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector50 = byteVector48.putUTF8("");
        org.mockito.asm.ByteVector byteVector52 = byteVector48.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector54 = byteVector48.putByte(0);
        org.mockito.asm.ByteVector byteVector55 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector57 = byteVector55.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector59 = byteVector55.putInt(0);
        org.mockito.asm.ByteVector byteVector61 = byteVector59.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector63 = byteVector61.putLong(100L);
        byte[] byteArray67 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector70 = byteVector61.putByteArray(byteArray67, 0, 0);
        org.mockito.asm.ByteVector byteVector73 = byteVector54.putByteArray(byteArray67, (int) (short) 1, 0);
        org.mockito.asm.ByteVector byteVector76 = byteVector35.putByteArray(byteArray67, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector79 = byteVector10.putByteArray(byteArray67, 0, (-1));
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
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(byteVector73);
        org.junit.Assert.assertNotNull(byteVector76);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong(0L);
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector9 = byteVector1.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putShort(1);
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector15 = byteVector9.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong(100L);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putLong((long) 'a');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong(0L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector8 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector24 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putInt(100);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector32 = byteVector28.putUTF8("");
        org.mockito.asm.ByteVector byteVector33 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector37 = byteVector33.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector41 = byteVector37.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector43 = byteVector37.putLong(0L);
        org.mockito.asm.ByteVector byteVector45 = byteVector37.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putUTF8("");
        org.mockito.asm.ByteVector byteVector49 = byteVector45.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector51 = byteVector45.putByte(0);
        org.mockito.asm.ByteVector byteVector52 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector54 = byteVector52.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector56 = byteVector52.putInt(0);
        org.mockito.asm.ByteVector byteVector58 = byteVector56.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector60 = byteVector58.putLong(100L);
        byte[] byteArray64 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector67 = byteVector58.putByteArray(byteArray64, 0, 0);
        org.mockito.asm.ByteVector byteVector70 = byteVector51.putByteArray(byteArray64, (int) (short) 1, 0);
        org.mockito.asm.ByteVector byteVector73 = byteVector28.putByteArray(byteArray64, 1, 1);
        org.mockito.asm.ByteVector byteVector76 = byteVector20.putByteArray(byteArray64, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector79 = byteVector7.putByteArray(byteArray64, (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
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
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector67);
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(byteVector73);
        org.junit.Assert.assertNotNull(byteVector76);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong(0L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putByte(1);
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putLong((long) 100);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putByte((-1));
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putInt((int) (byte) -1);
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
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((-1));
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putShort((int) '#');
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
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((-1));
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong(10L);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putLong(1L);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putByte((int) (byte) 100);
        java.lang.Class<?> wildcardClass21 = byteVector20.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong(1L);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putUTF8("");
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putByte((int) '#');
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putInt(1);
        org.mockito.asm.ByteVector byteVector26 = byteVector20.putShort((int) (short) 1);
        java.lang.Class<?> wildcardClass27 = byteVector26.getClass();
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
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putUTF8("");
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector22 = byteVector14.putInt((int) (short) 10);
        org.mockito.asm.ByteVector byteVector23 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector29 = byteVector23.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector31 = byteVector23.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector32 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putInt(0);
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putLong((-1L));
        org.mockito.asm.ByteVector byteVector42 = byteVector38.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector43 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector47 = byteVector43.putInt(0);
        org.mockito.asm.ByteVector byteVector49 = byteVector47.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putLong(100L);
        byte[] byteArray55 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector58 = byteVector49.putByteArray(byteArray55, 0, 0);
        org.mockito.asm.ByteVector byteVector61 = byteVector38.putByteArray(byteArray55, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector64 = byteVector31.putByteArray(byteArray55, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector67 = byteVector22.putByteArray(byteArray55, (int) (short) 1, (int) (byte) 100);
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
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteVector64);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector2.putShort(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) 'a');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort(10);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) (byte) 10);
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
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putByte(100);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putInt(0);
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putLong((-1L));
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector20 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putInt(0);
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putLong(100L);
        byte[] byteArray32 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector35 = byteVector26.putByteArray(byteArray32, 0, 0);
        org.mockito.asm.ByteVector byteVector38 = byteVector15.putByteArray(byteArray32, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector41 = byteVector6.putByteArray(byteArray32, (int) (byte) 1, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector45 = byteVector41.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putLong((long) (byte) -1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("");
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putInt((-1));
        java.lang.Class<?> wildcardClass23 = byteVector22.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putByte(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) (byte) -1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putLong((long) 1);
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putInt(0);
        org.mockito.asm.ByteVector byteVector15 = byteVector9.putUTF8("");
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putInt((int) ' ');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector22 = byteVector14.putShort((int) (byte) 100);
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
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putByte((int) (short) 1);
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
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putShort(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(10);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt((int) (byte) 0);
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
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong(0L);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putByte(1);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector18 = byteVector10.putUTF8("hi!");
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
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (short) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt((int) 'a');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("");
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
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort(10);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt(0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putLong((long) 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putByte(100);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector2.putInt((int) (short) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong(0L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((long) '#');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putUTF8("");
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putByte(100);
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector20 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putInt(0);
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putLong((-1L));
        org.mockito.asm.ByteVector byteVector30 = byteVector26.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector31 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector35 = byteVector31.putInt(0);
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putLong(100L);
        byte[] byteArray43 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector46 = byteVector37.putByteArray(byteArray43, 0, 0);
        org.mockito.asm.ByteVector byteVector49 = byteVector26.putByteArray(byteArray43, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector52 = byteVector17.putByteArray(byteArray43, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector55 = byteVector10.putByteArray(byteArray43, 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector52);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putByte(0);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putByte((int) (byte) 1);
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
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putUTF8("");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putLong((long) (-1));
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
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong(1L);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector22 = byteVector14.putInt(1);
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
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putInt(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong((long) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) 'a');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong(0L);
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector9 = byteVector1.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putLong((long) (byte) 0);
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector16 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector26 = byteVector20.putLong(0L);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putByte(0);
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putLong(1L);
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector34 = byteVector30.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector36 = byteVector30.putUTF8("");
        org.mockito.asm.ByteVector byteVector37 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector45 = byteVector41.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putInt(10);
        org.mockito.asm.ByteVector byteVector49 = byteVector45.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector51 = byteVector45.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector53 = byteVector45.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector54 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector56 = byteVector54.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector58 = byteVector54.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector60 = byteVector58.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector62 = byteVector58.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector64 = byteVector58.putLong(0L);
        org.mockito.asm.ByteVector byteVector66 = byteVector58.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector68 = byteVector66.putUTF8("");
        org.mockito.asm.ByteVector byteVector70 = byteVector68.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector72 = byteVector68.putLong((long) (short) 100);
        byte[] byteArray77 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector80 = byteVector68.putByteArray(byteArray77, 0, 0);
        org.mockito.asm.ByteVector byteVector83 = byteVector53.putByteArray(byteArray77, (int) (byte) 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector86 = byteVector30.putByteArray(byteArray77, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector89 = byteVector15.putByteArray(byteArray77, (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
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
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(byteVector72);
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray77), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector80);
        org.junit.Assert.assertNotNull(byteVector83);
        org.junit.Assert.assertNotNull(byteVector86);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putShort(100);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((-1));
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort((int) '4');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt(0);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) (-1));
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
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putByte(0);
        org.mockito.asm.ByteVector byteVector21 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putInt(0);
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putLong((-1L));
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector32 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector36 = byteVector32.putInt(0);
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putLong(100L);
        byte[] byteArray44 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector47 = byteVector38.putByteArray(byteArray44, 0, 0);
        org.mockito.asm.ByteVector byteVector50 = byteVector27.putByteArray(byteArray44, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector53 = byteVector20.putByteArray(byteArray44, 1, 0);
        org.mockito.asm.ByteVector byteVector55 = byteVector53.putUTF8("hi!");
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
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector55);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putUTF8("");
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector15 = byteVector9.putUTF8("");
        org.mockito.asm.ByteVector byteVector17 = byteVector9.putShort((int) (byte) -1);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putInt((int) '#');
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
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putLong((-1L));
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((-1L));
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putInt(0);
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putLong((long) (byte) 10);
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
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong(0L);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector16 = byteVector8.putShort(100);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("hi!");
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
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector13 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putInt(0);
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putShort(1);
        org.mockito.asm.ByteVector byteVector20 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector26 = byteVector20.putLong(0L);
        org.mockito.asm.ByteVector byteVector28 = byteVector20.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector31 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector35 = byteVector31.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector39 = byteVector35.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector41 = byteVector35.putLong(0L);
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putByte(0);
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putByte(100);
        org.mockito.asm.ByteVector byteVector47 = byteVector43.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector49 = byteVector47.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector51 = byteVector47.putShort(100);
        org.mockito.asm.ByteVector byteVector53 = byteVector47.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector54 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector56 = byteVector54.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector58 = byteVector54.putInt(0);
        org.mockito.asm.ByteVector byteVector60 = byteVector54.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector62 = byteVector54.putByte(100);
        org.mockito.asm.ByteVector byteVector64 = byteVector62.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector66 = byteVector62.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector68 = byteVector66.putByte(100);
        org.mockito.asm.ByteVector byteVector69 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector71 = byteVector69.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector73 = byteVector69.putInt(0);
        org.mockito.asm.ByteVector byteVector75 = byteVector73.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector77 = byteVector75.putLong(100L);
        byte[] byteArray81 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector84 = byteVector75.putByteArray(byteArray81, 0, 0);
        org.mockito.asm.ByteVector byteVector87 = byteVector68.putByteArray(byteArray81, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector90 = byteVector53.putByteArray(byteArray81, 1, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector93 = byteVector30.putByteArray(byteArray81, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector96 = byteVector17.putByteArray(byteArray81, 0, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector99 = byteVector12.putByteArray(byteArray81, (int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
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
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector71);
        org.junit.Assert.assertNotNull(byteVector73);
        org.junit.Assert.assertNotNull(byteVector75);
        org.junit.Assert.assertNotNull(byteVector77);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray81), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector84);
        org.junit.Assert.assertNotNull(byteVector87);
        org.junit.Assert.assertNotNull(byteVector90);
        org.junit.Assert.assertNotNull(byteVector93);
        org.junit.Assert.assertNotNull(byteVector96);
        org.junit.Assert.assertNotNull(byteVector99);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector9 = byteVector1.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putInt((int) '4');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) 'a');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) (byte) 0);
        org.junit.Assert.assertNotNull(byteVector3);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector20 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector22 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector27 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putInt(0);
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putLong(100L);
        byte[] byteArray39 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector42 = byteVector33.putByteArray(byteArray39, 0, 0);
        org.mockito.asm.ByteVector byteVector45 = byteVector26.putByteArray(byteArray39, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector48 = byteVector20.putByteArray(byteArray39, (int) ' ', (int) '#');
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
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector45);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((int) ' ');
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
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((-1));
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putLong(0L);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putInt((int) (byte) 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putLong((-1L));
        java.lang.Class<?> wildcardClass8 = byteVector3.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong((long) (byte) -1);
        java.lang.Class<?> wildcardClass6 = byteVector5.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (short) 100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putByte((int) (short) 100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("");
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putShort(10);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putLong((long) '#');
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
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((-1));
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putShort((int) (byte) -1);
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
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("");
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putUTF8("");
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putShort((int) (byte) 1);
        java.lang.Class<?> wildcardClass27 = byteVector26.getClass();
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
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong(1L);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort(1);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong(0L);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putByte((int) (byte) 100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        java.lang.Class<?> wildcardClass9 = byteVector6.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putLong((long) 1);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("");
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putShort(1);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putInt((int) (byte) 0);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((-1));
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((-1));
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putLong((long) 100);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("");
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
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte(1);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putShort((int) 'a');
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
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putByte((int) (short) 100);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) ' ');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putInt(1);
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putUTF8("");
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putUTF8("");
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector22 = byteVector14.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putUTF8("");
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putByte((-1));
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
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putLong(0L);
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector28 = byteVector22.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector30 = byteVector22.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector32 = byteVector22.putLong((long) (short) 1);
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
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt(10);
        java.lang.Class<?> wildcardClass8 = byteVector7.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) '#');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putInt((int) (byte) 1);
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
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("");
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putLong((-1L));
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
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putLong(0L);
        org.mockito.asm.ByteVector byteVector22 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putUTF8("");
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector28 = byteVector22.putByte(0);
        org.mockito.asm.ByteVector byteVector29 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putInt(0);
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putLong(100L);
        byte[] byteArray41 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector44 = byteVector35.putByteArray(byteArray41, 0, 0);
        org.mockito.asm.ByteVector byteVector47 = byteVector28.putByteArray(byteArray41, (int) (short) 1, 0);
        org.mockito.asm.ByteVector byteVector50 = byteVector5.putByteArray(byteArray41, 1, 1);
        org.mockito.asm.ByteVector byteVector52 = byteVector5.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector54 = byteVector5.putInt((-1));
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
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
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putLong((long) 1);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putByte((int) (byte) -1);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putLong(1L);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (byte) 1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector6 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort(100);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("");
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector22 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putUTF8("");
        org.mockito.asm.ByteVector byteVector27 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector35 = byteVector31.putLong((-1L));
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putInt(10);
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector41 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector42 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector46 = byteVector42.putInt(0);
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector50 = byteVector48.putLong(100L);
        byte[] byteArray54 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector57 = byteVector48.putByteArray(byteArray54, 0, 0);
        org.mockito.asm.ByteVector byteVector60 = byteVector41.putByteArray(byteArray54, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector63 = byteVector37.putByteArray(byteArray54, (int) (short) 0, 0);
        org.mockito.asm.ByteVector byteVector66 = byteVector22.putByteArray(byteArray54, (int) (short) 1, 1);
        org.mockito.asm.ByteVector byteVector69 = byteVector16.putByteArray(byteArray54, (int) (short) 0, 1);
        org.mockito.asm.ByteVector byteVector72 = byteVector1.putByteArray(byteArray54, 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector69);
        org.junit.Assert.assertNotNull(byteVector72);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putUTF8("");
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("");
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putByte((int) ' ');
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
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putLong((-1L));
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("");
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putUTF8("");
        java.lang.Class<?> wildcardClass21 = byteVector20.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort(1);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector18 = byteVector10.putLong(10L);
        org.mockito.asm.ByteVector byteVector20 = byteVector10.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putByte((int) (byte) 100);
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
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong(0L);
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putInt(0);
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putUTF8("");
        org.mockito.asm.ByteVector byteVector13 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putLong(0L);
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putByte(10);
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putLong((long) (byte) 0);
        byte[] byteArray24 = null;
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putByteArray(byteArray24, (int) (short) 10, (int) '#');
        org.mockito.asm.ByteVector byteVector28 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector32 = byteVector28.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector36 = byteVector32.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector38 = byteVector32.putLong(0L);
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putByte(0);
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putByte(100);
        org.mockito.asm.ByteVector byteVector44 = byteVector40.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector48 = byteVector44.putShort(100);
        org.mockito.asm.ByteVector byteVector50 = byteVector44.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector51 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector53 = byteVector51.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector55 = byteVector51.putInt(0);
        org.mockito.asm.ByteVector byteVector57 = byteVector51.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector59 = byteVector51.putByte(100);
        org.mockito.asm.ByteVector byteVector61 = byteVector59.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector63 = byteVector59.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector65 = byteVector63.putByte(100);
        org.mockito.asm.ByteVector byteVector66 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector68 = byteVector66.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector70 = byteVector66.putInt(0);
        org.mockito.asm.ByteVector byteVector72 = byteVector70.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector74 = byteVector72.putLong(100L);
        byte[] byteArray78 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector81 = byteVector72.putByteArray(byteArray78, 0, 0);
        org.mockito.asm.ByteVector byteVector84 = byteVector65.putByteArray(byteArray78, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector87 = byteVector50.putByteArray(byteArray78, 1, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector90 = byteVector23.putByteArray(byteArray78, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector93 = byteVector7.putByteArray(byteArray78, (int) (byte) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector30);
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
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(byteVector72);
        org.junit.Assert.assertNotNull(byteVector74);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray78), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector81);
        org.junit.Assert.assertNotNull(byteVector84);
        org.junit.Assert.assertNotNull(byteVector87);
        org.junit.Assert.assertNotNull(byteVector90);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt((-1));
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putLong((long) (byte) 0);
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
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort(100);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(10);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) (byte) -1);
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
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putLong(0L);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putByte(10);
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putLong((long) (byte) 0);
        byte[] byteArray23 = null;
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putByteArray(byteArray23, (int) (short) 10, (int) '#');
        org.mockito.asm.ByteVector byteVector27 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector35 = byteVector31.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector37 = byteVector31.putLong(0L);
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putByte(0);
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putByte(100);
        org.mockito.asm.ByteVector byteVector43 = byteVector39.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector47 = byteVector43.putShort(100);
        org.mockito.asm.ByteVector byteVector49 = byteVector43.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector50 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector52 = byteVector50.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector54 = byteVector50.putInt(0);
        org.mockito.asm.ByteVector byteVector56 = byteVector50.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector58 = byteVector50.putByte(100);
        org.mockito.asm.ByteVector byteVector60 = byteVector58.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector62 = byteVector58.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector64 = byteVector62.putByte(100);
        org.mockito.asm.ByteVector byteVector65 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector67 = byteVector65.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector69 = byteVector65.putInt(0);
        org.mockito.asm.ByteVector byteVector71 = byteVector69.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector73 = byteVector71.putLong(100L);
        byte[] byteArray77 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector80 = byteVector71.putByteArray(byteArray77, 0, 0);
        org.mockito.asm.ByteVector byteVector83 = byteVector64.putByteArray(byteArray77, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector86 = byteVector49.putByteArray(byteArray77, 1, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector89 = byteVector22.putByteArray(byteArray77, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector92 = byteVector8.putByteArray(byteArray77, (int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector29);
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
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteVector67);
        org.junit.Assert.assertNotNull(byteVector69);
        org.junit.Assert.assertNotNull(byteVector71);
        org.junit.Assert.assertNotNull(byteVector73);
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray77), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector80);
        org.junit.Assert.assertNotNull(byteVector83);
        org.junit.Assert.assertNotNull(byteVector86);
        org.junit.Assert.assertNotNull(byteVector89);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putInt((int) (byte) -1);
        byte[] byteArray13 = null;
        org.mockito.asm.ByteVector byteVector16 = byteVector6.putByteArray(byteArray13, (int) (byte) -1, 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector16);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector18 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putLong(100L);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putLong(1L);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector30 = byteVector26.putInt(1);
        org.mockito.asm.ByteVector byteVector31 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putByte(100);
        org.mockito.asm.ByteVector byteVector37 = byteVector33.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector40 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putInt(0);
        org.mockito.asm.ByteVector byteVector46 = byteVector42.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putLong((-1L));
        org.mockito.asm.ByteVector byteVector50 = byteVector46.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector51 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector53 = byteVector51.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector55 = byteVector51.putInt(0);
        org.mockito.asm.ByteVector byteVector57 = byteVector55.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector59 = byteVector57.putLong(100L);
        byte[] byteArray63 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector66 = byteVector57.putByteArray(byteArray63, 0, 0);
        org.mockito.asm.ByteVector byteVector69 = byteVector46.putByteArray(byteArray63, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector72 = byteVector37.putByteArray(byteArray63, (int) (byte) 1, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector75 = byteVector26.putByteArray(byteArray63, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector78 = byteVector14.putByteArray(byteArray63, (int) '4', (int) '#');
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
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector69);
        org.junit.Assert.assertNotNull(byteVector72);
        org.junit.Assert.assertNotNull(byteVector75);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (short) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putInt(1);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector19 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector29 = byteVector23.putLong(0L);
        org.mockito.asm.ByteVector byteVector31 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putUTF8("");
        org.mockito.asm.ByteVector byteVector35 = byteVector31.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector37 = byteVector31.putByte(0);
        org.mockito.asm.ByteVector byteVector38 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector42 = byteVector38.putInt(0);
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putLong(100L);
        byte[] byteArray50 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector53 = byteVector44.putByteArray(byteArray50, 0, 0);
        org.mockito.asm.ByteVector byteVector56 = byteVector37.putByteArray(byteArray50, (int) (short) 1, 0);
        org.mockito.asm.ByteVector byteVector59 = byteVector18.putByteArray(byteArray50, (int) (byte) 0, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector61 = byteVector59.putShort((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector61);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong(0L);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong(10L);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort((int) (byte) 0);
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
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort(10);
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector27 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putInt(100);
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector35 = byteVector31.putUTF8("");
        org.mockito.asm.ByteVector byteVector36 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector40 = byteVector36.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector44 = byteVector40.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector46 = byteVector40.putLong(0L);
        org.mockito.asm.ByteVector byteVector48 = byteVector40.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector50 = byteVector48.putUTF8("");
        org.mockito.asm.ByteVector byteVector52 = byteVector48.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector54 = byteVector48.putByte(0);
        org.mockito.asm.ByteVector byteVector55 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector57 = byteVector55.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector59 = byteVector55.putInt(0);
        org.mockito.asm.ByteVector byteVector61 = byteVector59.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector63 = byteVector61.putLong(100L);
        byte[] byteArray67 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector70 = byteVector61.putByteArray(byteArray67, 0, 0);
        org.mockito.asm.ByteVector byteVector73 = byteVector54.putByteArray(byteArray67, (int) (short) 1, 0);
        org.mockito.asm.ByteVector byteVector76 = byteVector31.putByteArray(byteArray67, 1, 1);
        org.mockito.asm.ByteVector byteVector79 = byteVector23.putByteArray(byteArray67, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector82 = byteVector10.putByteArray(byteArray67, (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(byteVector73);
        org.junit.Assert.assertNotNull(byteVector76);
        org.junit.Assert.assertNotNull(byteVector79);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector13 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector23 = byteVector17.putLong(0L);
        org.mockito.asm.ByteVector byteVector25 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putUTF8("");
        org.mockito.asm.ByteVector byteVector29 = byteVector25.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putByte(0);
        org.mockito.asm.ByteVector byteVector34 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putInt(0);
        org.mockito.asm.ByteVector byteVector40 = byteVector36.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putLong((-1L));
        org.mockito.asm.ByteVector byteVector44 = byteVector40.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector45 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector49 = byteVector45.putInt(0);
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector53 = byteVector51.putLong(100L);
        byte[] byteArray57 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector60 = byteVector51.putByteArray(byteArray57, 0, 0);
        org.mockito.asm.ByteVector byteVector63 = byteVector40.putByteArray(byteArray57, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector66 = byteVector33.putByteArray(byteArray57, 1, 0);
        org.mockito.asm.ByteVector byteVector69 = byteVector8.putByteArray(byteArray57, 1, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector71 = byteVector8.putByte((int) '#');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
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
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector69);
        org.junit.Assert.assertNotNull(byteVector71);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putByte((int) (short) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong(0L);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) (short) 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort(1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector16 = byteVector6.putUTF8("hi!");
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
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putLong((long) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putByte(0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong(10L);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putInt((int) (byte) 10);
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
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("");
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putLong((long) ' ');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((-1));
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putInt((int) '#');
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
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((int) (byte) 1);
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
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort((int) 'a');
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
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByte((int) (short) 10);
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
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putByte((int) 'a');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong(0L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("");
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("");
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putByte(0);
        java.lang.Class<?> wildcardClass14 = byteVector9.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("");
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
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putInt((int) (byte) 100);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt((int) (short) 10);
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector11 = byteVector5.putInt((-1));
        org.mockito.asm.ByteVector byteVector13 = byteVector5.putInt((-1));
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putByte(0);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putByte(0);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putShort(1);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt((-1));
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector18 = byteVector10.putUTF8("");
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putLong((long) (byte) 10);
        java.lang.Class<?> wildcardClass21 = byteVector20.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector4.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector16 = byteVector4.putInt(0);
        org.mockito.asm.ByteVector byteVector18 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putInt(10);
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
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector9 = byteVector3.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector11 = byteVector3.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putShort(0);
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putByte((int) (byte) 10);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("");
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector22 = byteVector16.putLong(10L);
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
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector20 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector26 = byteVector20.putUTF8("");
        org.mockito.asm.ByteVector byteVector28 = byteVector20.putUTF8("");
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector31 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putInt(0);
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector39 = byteVector35.putUTF8("");
        org.mockito.asm.ByteVector byteVector40 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector44 = byteVector40.putInt(0);
        org.mockito.asm.ByteVector byteVector46 = byteVector40.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector48 = byteVector40.putByte(100);
        org.mockito.asm.ByteVector byteVector50 = byteVector48.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector52 = byteVector48.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector54 = byteVector52.putByte(100);
        org.mockito.asm.ByteVector byteVector55 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector57 = byteVector55.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector59 = byteVector55.putInt(0);
        org.mockito.asm.ByteVector byteVector61 = byteVector59.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector63 = byteVector61.putLong(100L);
        byte[] byteArray67 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector70 = byteVector61.putByteArray(byteArray67, 0, 0);
        org.mockito.asm.ByteVector byteVector73 = byteVector54.putByteArray(byteArray67, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector76 = byteVector35.putByteArray(byteArray67, (int) (short) 0, 0);
        org.mockito.asm.ByteVector byteVector79 = byteVector30.putByteArray(byteArray67, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector82 = byteVector10.putByteArray(byteArray67, (int) (short) 100, 100);
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
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(byteVector73);
        org.junit.Assert.assertNotNull(byteVector76);
        org.junit.Assert.assertNotNull(byteVector79);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong(100L);
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
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putInt(0);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putLong(100L);
        byte[] byteArray23 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector26 = byteVector17.putByteArray(byteArray23, 0, 0);
        org.mockito.asm.ByteVector byteVector29 = byteVector6.putByteArray(byteArray23, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector31 = byteVector6.putInt((-1));
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putLong(1L);
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putUTF8("");
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector38 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector42 = byteVector38.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector44 = byteVector38.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector50 = byteVector48.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector52 = byteVector50.putByte((int) (byte) 10);
        byte[] byteArray55 = new byte[] { (byte) 10, (byte) 0 };
        org.mockito.asm.ByteVector byteVector58 = byteVector52.putByteArray(byteArray55, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector61 = byteVector35.putByteArray(byteArray55, 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector26);
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
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[10, 0]");
        org.junit.Assert.assertNotNull(byteVector58);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putShort((int) (byte) 100);
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
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(0);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putLong(0L);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putByte((int) (short) 100);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putUTF8("");
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putByte(100);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putUTF8("");
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
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("");
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong(10L);
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
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt((int) '4');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt((int) (short) 10);
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putLong(10L);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putByte(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putInt((int) (short) 100);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putUTF8("");
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putLong(0L);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putUTF8("");
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector22 = byteVector14.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putUTF8("");
        org.mockito.asm.ByteVector byteVector28 = byteVector22.putUTF8("");
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
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector19 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putByte(100);
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector28 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putInt(0);
        org.mockito.asm.ByteVector byteVector34 = byteVector30.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putLong((-1L));
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector39 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector43 = byteVector39.putInt(0);
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putLong(100L);
        byte[] byteArray51 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector54 = byteVector45.putByteArray(byteArray51, 0, 0);
        org.mockito.asm.ByteVector byteVector57 = byteVector34.putByteArray(byteArray51, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector60 = byteVector25.putByteArray(byteArray51, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector63 = byteVector18.putByteArray(byteArray51, 100, (int) '#');
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
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector60);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putUTF8("");
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putInt((-1));
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putLong((long) (short) 0);
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
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putLong((long) (byte) 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((-1L));
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByte((int) (byte) 1);
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
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putShort(100);
        org.mockito.asm.ByteVector byteVector22 = byteVector16.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putByte((int) (byte) 100);
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
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte(100);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putByte(0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((-1));
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) (byte) -1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort(0);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((-1));
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
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putLong((long) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putByte(10);
        org.mockito.asm.ByteVector byteVector19 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector29 = byteVector23.putLong(0L);
        org.mockito.asm.ByteVector byteVector31 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putUTF8("");
        org.mockito.asm.ByteVector byteVector35 = byteVector31.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector39 = byteVector35.putByte(0);
        org.mockito.asm.ByteVector byteVector40 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putInt(0);
        org.mockito.asm.ByteVector byteVector46 = byteVector42.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putLong((-1L));
        org.mockito.asm.ByteVector byteVector50 = byteVector46.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector51 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector53 = byteVector51.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector55 = byteVector51.putInt(0);
        org.mockito.asm.ByteVector byteVector57 = byteVector55.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector59 = byteVector57.putLong(100L);
        byte[] byteArray63 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector66 = byteVector57.putByteArray(byteArray63, 0, 0);
        org.mockito.asm.ByteVector byteVector69 = byteVector46.putByteArray(byteArray63, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector72 = byteVector39.putByteArray(byteArray63, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector75 = byteVector16.putByteArray(byteArray63, (int) '4', 100);
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
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector69);
        org.junit.Assert.assertNotNull(byteVector72);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("");
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
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector18 = byteVector10.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector20 = byteVector10.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector22 = byteVector10.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector24 = byteVector10.putByte(100);
        org.mockito.asm.ByteVector byteVector25 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putInt(10);
        org.mockito.asm.ByteVector byteVector37 = byteVector33.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector43 = byteVector39.putUTF8("");
        org.mockito.asm.ByteVector byteVector45 = byteVector39.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector47 = byteVector39.putInt((int) (short) 10);
        org.mockito.asm.ByteVector byteVector48 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector50 = byteVector48.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector52 = byteVector50.putInt(0);
        org.mockito.asm.ByteVector byteVector54 = byteVector52.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector56 = byteVector52.putUTF8("");
        org.mockito.asm.ByteVector byteVector57 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector59 = byteVector57.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector61 = byteVector57.putInt(0);
        org.mockito.asm.ByteVector byteVector63 = byteVector57.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector65 = byteVector57.putByte(100);
        org.mockito.asm.ByteVector byteVector67 = byteVector65.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector69 = byteVector65.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector71 = byteVector69.putByte(100);
        org.mockito.asm.ByteVector byteVector72 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector74 = byteVector72.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector76 = byteVector72.putInt(0);
        org.mockito.asm.ByteVector byteVector78 = byteVector76.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector80 = byteVector78.putLong(100L);
        byte[] byteArray84 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector87 = byteVector78.putByteArray(byteArray84, 0, 0);
        org.mockito.asm.ByteVector byteVector90 = byteVector71.putByteArray(byteArray84, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector93 = byteVector52.putByteArray(byteArray84, (int) (short) 0, 0);
        org.mockito.asm.ByteVector byteVector96 = byteVector47.putByteArray(byteArray84, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector99 = byteVector24.putByteArray(byteArray84, (int) (short) 10, (int) (byte) 10);
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
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteVector67);
        org.junit.Assert.assertNotNull(byteVector69);
        org.junit.Assert.assertNotNull(byteVector71);
        org.junit.Assert.assertNotNull(byteVector74);
        org.junit.Assert.assertNotNull(byteVector76);
        org.junit.Assert.assertNotNull(byteVector78);
        org.junit.Assert.assertNotNull(byteVector80);
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray84), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector87);
        org.junit.Assert.assertNotNull(byteVector90);
        org.junit.Assert.assertNotNull(byteVector93);
        org.junit.Assert.assertNotNull(byteVector96);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector17 = byteVector11.putLong(0L);
        org.mockito.asm.ByteVector byteVector19 = byteVector11.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector22 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector30 = byteVector26.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector32 = byteVector26.putLong(0L);
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putByte(0);
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putByte(100);
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector42 = byteVector38.putShort(100);
        org.mockito.asm.ByteVector byteVector44 = byteVector38.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector45 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector49 = byteVector45.putInt(0);
        org.mockito.asm.ByteVector byteVector51 = byteVector45.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector53 = byteVector45.putByte(100);
        org.mockito.asm.ByteVector byteVector55 = byteVector53.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector57 = byteVector53.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector59 = byteVector57.putByte(100);
        org.mockito.asm.ByteVector byteVector60 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector62 = byteVector60.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector64 = byteVector60.putInt(0);
        org.mockito.asm.ByteVector byteVector66 = byteVector64.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector68 = byteVector66.putLong(100L);
        byte[] byteArray72 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector75 = byteVector66.putByteArray(byteArray72, 0, 0);
        org.mockito.asm.ByteVector byteVector78 = byteVector59.putByteArray(byteArray72, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector81 = byteVector44.putByteArray(byteArray72, 1, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector84 = byteVector21.putByteArray(byteArray72, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector87 = byteVector6.putByteArray(byteArray72, 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector75);
        org.junit.Assert.assertNotNull(byteVector78);
        org.junit.Assert.assertNotNull(byteVector81);
        org.junit.Assert.assertNotNull(byteVector84);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putByte((int) '#');
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putShort(100);
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putByte((int) (byte) 10);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putByte(0);
        org.mockito.asm.ByteVector byteVector15 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putLong((-1L));
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putInt(10);
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector31 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector34 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector42 = byteVector38.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector44 = byteVector38.putLong(0L);
        org.mockito.asm.ByteVector byteVector46 = byteVector38.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putUTF8("");
        org.mockito.asm.ByteVector byteVector50 = byteVector46.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector52 = byteVector46.putByte(0);
        org.mockito.asm.ByteVector byteVector53 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector55 = byteVector53.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector57 = byteVector53.putInt(0);
        org.mockito.asm.ByteVector byteVector59 = byteVector57.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector61 = byteVector59.putLong(100L);
        byte[] byteArray65 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector68 = byteVector59.putByteArray(byteArray65, 0, 0);
        org.mockito.asm.ByteVector byteVector71 = byteVector52.putByteArray(byteArray65, (int) (short) 1, 0);
        org.mockito.asm.ByteVector byteVector74 = byteVector31.putByteArray(byteArray65, 0, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector77 = byteVector29.putByteArray(byteArray65, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector80 = byteVector6.putByteArray(byteArray65, 10, (int) '4');
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
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector33);
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
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector71);
        org.junit.Assert.assertNotNull(byteVector74);
        org.junit.Assert.assertNotNull(byteVector77);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte(0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector18 = byteVector10.putInt((int) (byte) 100);
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
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putByte(100);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt(1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putInt(10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) (short) 10);
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
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putByte((int) (byte) 1);
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
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putInt(1);
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putLong((long) (short) 100);
        java.lang.Class<?> wildcardClass11 = byteVector0.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putInt(0);
        org.mockito.asm.ByteVector byteVector24 = byteVector18.putUTF8("hi!");
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
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("hi!");
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
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        byte[] byteArray9 = null;
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putByteArray(byteArray9, (int) '#', 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putShort((-1));
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(0);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("");
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
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong(0L);
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector9 = byteVector1.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putLong((long) (byte) 0);
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector17 = byteVector11.putByte((int) (short) 10);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("hi!");
        java.lang.Class<?> wildcardClass9 = byteVector8.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putByte(100);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putLong(0L);
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putShort(0);
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
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putByte((int) 'a');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt(0);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putShort((int) (byte) 1);
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
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong(1L);
        org.mockito.asm.ByteVector byteVector13 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("");
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector25 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putLong(100L);
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putLong(1L);
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector37 = byteVector33.putInt(1);
        org.mockito.asm.ByteVector byteVector38 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putByte(100);
        org.mockito.asm.ByteVector byteVector44 = byteVector40.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector47 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector49 = byteVector47.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putInt(0);
        org.mockito.asm.ByteVector byteVector53 = byteVector49.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector55 = byteVector53.putLong((-1L));
        org.mockito.asm.ByteVector byteVector57 = byteVector53.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector58 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector60 = byteVector58.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector62 = byteVector58.putInt(0);
        org.mockito.asm.ByteVector byteVector64 = byteVector62.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector66 = byteVector64.putLong(100L);
        byte[] byteArray70 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector73 = byteVector64.putByteArray(byteArray70, 0, 0);
        org.mockito.asm.ByteVector byteVector76 = byteVector53.putByteArray(byteArray70, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector79 = byteVector44.putByteArray(byteArray70, (int) (byte) 1, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector82 = byteVector33.putByteArray(byteArray70, (int) (short) 0, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector85 = byteVector23.putByteArray(byteArray70, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector88 = byteVector12.putByteArray(byteArray70, (int) ' ', (int) '4');
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
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
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
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray70), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector73);
        org.junit.Assert.assertNotNull(byteVector76);
        org.junit.Assert.assertNotNull(byteVector79);
        org.junit.Assert.assertNotNull(byteVector82);
        org.junit.Assert.assertNotNull(byteVector85);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((-1));
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("");
        org.mockito.asm.ByteVector byteVector23 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("");
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector35 = byteVector29.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector36 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector44 = byteVector40.putLong((-1L));
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putInt(10);
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector50 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector51 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector53 = byteVector51.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector55 = byteVector51.putInt(0);
        org.mockito.asm.ByteVector byteVector57 = byteVector55.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector59 = byteVector57.putLong(100L);
        byte[] byteArray63 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector66 = byteVector57.putByteArray(byteArray63, 0, 0);
        org.mockito.asm.ByteVector byteVector69 = byteVector50.putByteArray(byteArray63, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector72 = byteVector46.putByteArray(byteArray63, (int) (short) 0, 0);
        org.mockito.asm.ByteVector byteVector75 = byteVector29.putByteArray(byteArray63, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector78 = byteVector22.putByteArray(byteArray63, (int) (short) 0, (-1));
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
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector69);
        org.junit.Assert.assertNotNull(byteVector72);
        org.junit.Assert.assertNotNull(byteVector75);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putLong((long) ' ');
        java.lang.Class<?> wildcardClass9 = byteVector8.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putUTF8("hi!");
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
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putLong((long) (byte) 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putLong((long) (byte) 100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }
}

