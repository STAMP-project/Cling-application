/*

 * Tue Mar 03 14:25:23 GMT 2020
 */

package org.mockito.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.asm.AnnotationVisitor;
import org.mockito.asm.AnnotationWriter;
import org.mockito.asm.ByteVector;
import org.mockito.asm.ClassWriter;
import org.mockito.asm.Item;
import org.mockito.asm.Type;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AnnotationWriter_ESTest extends AnnotationWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-237));
      classWriter0.newDouble((-237));
      classWriter0.newDouble((-237));
      classWriter0.visitSource((String) null, "Y");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2227));
      classWriter0.visitAnnotation("=%^.QB", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(73, byteArray0.length);
      
      Short short0 = new Short((short)12);
      int int0 = classWriter0.newConst(short0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2227));
      classWriter0.visitField(854, "", "qv?E#UdaAo1", "", "");
      classWriter0.visitAnnotation("", false);
      int int0 = classWriter0.newConst("");
      assertEquals(3, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(138, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2227));
      Item item0 = classWriter0.newFloat((-2227));
      classWriter0.newField("SackMap", "SackMap", "java/lang/Throwable");
      classWriter0.newMethod("SackMap", "SackMap", "java/lang/Throwable", false);
      // Undeclared exception!
      try { 
        classWriter0.newConstItem(item0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.Item@36306ee6
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1072);
      classWriter0.visitSource("O8N:%`Z", "mql0");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(88, byteArray0.length);
      
      Byte byte0 = new Byte((byte) (-1));
      int int0 = classWriter0.newConst(byte0);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2227));
      classWriter0.newDouble((-2227));
      classWriter0.newDouble((-2227));
      classWriter0.visitInnerClass((String) null, (String) null, (String) null, 5396);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2227));
      classWriter0.newLong((-6183L));
      ByteVector byteVector0 = classWriter0.pool;
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 1);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        annotationWriter0.visit("OJ%\"7&k:;:M;3jSy,2", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@514e8c7f
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2208));
      classWriter0.invalidFrames = true;
      classWriter0.visitSource("", "");
      // Undeclared exception!
      try { 
        classWriter0.toByteArray();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 51966
         //
         verifyException("org.mockito.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1095);
      int int0 = classWriter0.addType("tac,kMap");
      assertEquals(1, int0);
      
      classWriter0.visitAnnotation("ZK_z:(oi<$", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(80, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2246));
      Type type0 = Type.DOUBLE_TYPE;
      int int0 = classWriter0.newConst(type0);
      assertEquals(2, int0);
      
      classWriter0.visitAnnotation("4\"~#(UP!tfE[\"", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(89, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2227));
      classWriter0.newFloat((-2227));
      classWriter0.newFloat((-2227));
      String[] stringArray0 = new String[2];
      stringArray0[0] = "OJ%\"7&k:;:M;3jSy,2";
      stringArray0[1] = "";
      classWriter0.visit((-2227), (-2227), "s", "-]P?D", "s", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(117, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2227));
      classWriter0.visitAnnotation("=%^.QB", false);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(2, 90);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2227));
      classWriter0.visitSource("", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(77, byteArray0.length);
      
      int int0 = classWriter0.newMethod("-]vpstE_%K'aM$l^N-", "~p)O", "", true);
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2227));
      classWriter0.visitSource("qv?E#UdaAo1", "qv?E#UdaAo1");
      classWriter0.toByteArray();
      Item item0 = classWriter0.newMethodItem("", "LocalVariableTable", "", false);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2227));
      classWriter0.newDouble((-2227));
      classWriter0.newDouble((-2227));
      classWriter0.visitSource("c7k$#T", "c7k$#T");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2227));
      classWriter0.newLong(1200L);
      classWriter0.visitAnnotation("", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(78, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-237));
      classWriter0.newDouble((-237));
      classWriter0.newDouble((-237));
      Type type0 = Type.DOUBLE_TYPE;
      int int0 = classWriter0.newConst(type0);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1072);
      Boolean boolean0 = Boolean.valueOf(true);
      int int0 = classWriter0.newConst(boolean0);
      assertEquals(1, int0);
      
      classWriter0.visitAnnotation("e", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(75, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2221));
      Type type0 = Type.DOUBLE_TYPE;
      classWriter0.visitField((-2221), "~?ye", "~?ye", "SourceFile", type0);
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(98, 98);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2167));
      classWriter0.visitSource("", "");
      classWriter0.toByteArray();
      Item item0 = classWriter0.newFloat(1.0F);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2246));
      Type type0 = Type.CHAR_TYPE;
      classWriter0.newConst(type0);
      classWriter0.visitInnerClass("aMTeFX1B14Lh|$`}", ".kR4Q", (String) null, 10);
      classWriter0.visitInnerClass(".kR4Q", "-syFsP9", "%6", (-1867));
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(64);
      classWriter0.addUninitializedType("Deprecated", 1);
      int int0 = classWriter0.addUninitializedType("v=&CFSczJid~|VJ,au", 1);
      assertEquals(2, int0);
      
      classWriter0.visitAnnotation("v=&CFSczJid~|VJ,au", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(87, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2227));
      classWriter0.visitInnerClass("qv?E#UdaAo1", "qv?E#UdaAo1", "", (-1436));
      classWriter0.visitAnnotation("", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(117, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2227));
      classWriter0.visitAnnotation("a=%^.QB", false);
      classWriter0.toByteArray();
      Boolean boolean0 = Boolean.FALSE;
      Item item0 = classWriter0.newConstItem(boolean0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2227));
      classWriter0.newField("SackMap", "SackMap", "java/lang/Throwable");
      classWriter0.newMethod("", "SackMap", "java/lang/Throwable", false);
      classWriter0.visitSource("+j-.PdL=kT^", "J%dBaA~$C?xw`]o");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2227));
      classWriter0.newFieldItem("", "", "");
      classWriter0.newField("", "", "");
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("", true);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2227));
      classWriter0.newFloat((-2227));
      classWriter0.newFloat((-2227));
      ByteVector byteVector0 = classWriter0.pool;
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 1);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        annotationWriter0.visit("OJ%\"7&k:;:M;3jSy,2", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@d5d9d1e
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(64);
      Type type0 = Type.LONG_TYPE;
      classWriter0.visitField(64, ":D4G20?0^L*%p", "Deprecated", "chErF+J", type0);
      classWriter0.visitInnerClass((String) null, "iLu/DK,Zx8|w4bV>g", "Deprecated", 6);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2227));
      classWriter0.newConstItem("");
      classWriter0.visitAnnotation("", true);
      int int0 = classWriter0.newConst("");
      assertEquals(2, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(70, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2227));
      classWriter0.newLong((-6183L));
      String[] stringArray0 = new String[2];
      stringArray0[0] = "OJ%\"7&k:;:M;3jSy,2";
      stringArray0[1] = "";
      classWriter0.visit((-2227), (-2227), "s", "-]P?D", "s", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(121, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2227));
      classWriter0.visitInnerClass("qv?E#UdaAo1", "qv?E#UdaAo1", "", (-1436));
      classWriter0.visitSource("", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(125, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2227));
      classWriter0.visitAnnotation("=%^.QB", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(73, byteArray0.length);
      
      Class<Object> class0 = Object.class;
      Type type0 = Type.getType(class0);
      int int0 = classWriter0.newConst(type0);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2227));
      classWriter0.visitSource("qv?E#UdaAo1", "qv?E#UdaAo1");
      classWriter0.toByteArray();
      Item item0 = classWriter0.newDouble(3419.5861);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2227));
      classWriter0.newFloat((-2227));
      classWriter0.newFloat((-2227));
      classWriter0.visitInnerClass("F&P17`mu~H8[w!0,4t", " P,iw", (String) null, 255);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2227));
      classWriter0.newDouble((-2227));
      classWriter0.newDouble((-2227));
      classWriter0.visitAnnotation("", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(78, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1072);
      classWriter0.visitSource("O8N:%`Z", "mql0");
      classWriter0.toByteArray();
      Item item0 = classWriter0.newLong(0L);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.visitAnnotation("Signature", false);
      Character character0 = new Character('X');
      classWriter0.newConst(character0);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newConstItem(character0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.newLong(64);
      classWriter0.visitAnnotation("=%^.QB", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(82, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2227));
      int int0 = classWriter0.newMethod("", "", "-", false);
      assertEquals(5, int0);
      
      classWriter0.visitAnnotation("", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(86, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2227));
      classWriter0.newFloat((-2227));
      classWriter0.newFloat((-2227));
      classWriter0.visitOuterClass("-]P?D", "-]P?D", "-]P?D");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2227));
      classWriter0.newFloat((-2227));
      classWriter0.newFloat((-2227));
      classWriter0.visitOuterClass("-]P?D", "-]P?D", (String) null);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-237));
      classWriter0.newDouble((-237));
      classWriter0.newDouble((-237));
      classWriter0.visitInnerClass("u", "u", (String) null, 2);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2227));
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(67, byteArray0.length);
      
      Boolean boolean0 = new Boolean(false);
      int int0 = classWriter0.newConst(boolean0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-237));
      classWriter0.visitOuterClass("u", (String) null, (String) null);
      Item item0 = classWriter0.newDouble((-237));
      Item item1 = classWriter0.newDouble((-237));
      assertNotNull(item1);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2227));
      classWriter0.visitInnerClass("qv?E#UdaAo1", "qv?E#UdaAo1", "", (-1436));
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(75, byteArray0.length);
      
      int int0 = classWriter0.addType("");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1072);
      classWriter0.visitSource("O8N:%`Z", "mql0");
      Boolean boolean0 = Boolean.valueOf(true);
      int int0 = classWriter0.newConst(boolean0);
      assertEquals(2, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(93, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2227));
      classWriter0.visitSource("mql0", "mql0");
      Boolean boolean0 = Boolean.valueOf(false);
      int int0 = classWriter0.newConst(boolean0);
      assertEquals(2, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(90, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2227));
      classWriter0.newFloat((-2227));
      classWriter0.newFloat((-2227));
      classWriter0.visitAnnotation("-]P?D", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(79, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-237));
      classWriter0.visitOuterClass("u", "u", "u");
      Item item0 = classWriter0.newDouble((-237));
      Item item1 = classWriter0.newDouble((-237));
      assertNotNull(item1);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2246));
      Type type0 = Type.CHAR_TYPE;
      classWriter0.newConst(type0);
      classWriter0.visitSource("", "jOe'oO/99We[");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      Type type0 = Type.CHAR_TYPE;
      int int0 = classWriter0.newConst(type0);
      assertEquals(2, int0);
      
      classWriter0.visitAnnotation("W!=kR$ihP", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(83, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2227));
      classWriter0.visitSource("qv?E#UdaAo1", "qv?E#UdaAo1");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(99, byteArray0.length);
      
      int int0 = classWriter0.addUninitializedType("", (-2227));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2227));
      Boolean boolean0 = Boolean.FALSE;
      classWriter0.newConstItem(boolean0);
      int int0 = classWriter0.newMethod("fv'OBp/eWD+;<!A<(", "fv'OBp/eWD+;<!A<(", "a=%^.QB", true);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(64);
      classWriter0.visitSource("Deprecated", (String) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1095);
      classWriter0.newFieldItem("tac,kMap", "", "tac,kMap");
      int int0 = classWriter0.newMethod("tac,kMap", "tac,kMap", "tac,kMap", true);
      assertEquals(7, int0);
      
      classWriter0.visitAnnotation("e", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(105, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.visitAnnotation("Signature", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(78, byteArray0.length);
      
      Byte byte0 = Byte.valueOf((byte)21);
      int int0 = classWriter0.newConst(byte0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(64);
      Type type0 = Type.LONG_TYPE;
      classWriter0.visitField(64, "chErF+J", "Deprecated", "chErF+J", type0);
      classWriter0.visitInnerClass("chErF+J", "chErF+J", "\"]Bn&bpHQYK[]", 31);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(156, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      Character character0 = new Character('X');
      int int0 = classWriter0.newConst(character0);
      assertEquals(1, int0);
      
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(72, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1095);
      classWriter0.newField("", "tac,kMap", "tac,kMap");
      classWriter0.newMethod("tac,kMap", "tac,kMap", "tac,kMap", true);
      classWriter0.visitInnerClass("", "", "UU", 577);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2227));
      classWriter0.newField("SackMap", "SackMap", "java/lang/Throwable");
      classWriter0.newMethod("SackMap", "SackMap", "java/lang/Throwable", false);
      classWriter0.visitOuterClass("J{iy=qzW-2zdIRM<", "TIh|BOrO\"rfT", "SackMap");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(64);
      classWriter0.addUninitializedType("Deprecated", 1);
      ByteVector byteVector0 = classWriter0.pool;
      Object object0 = new Object();
      classWriter0.addUninitializedType("v=&CFSczJid~|VJ,au", 1);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 1);
      // Undeclared exception!
      try { 
        annotationWriter0.visit(")p'_l+ZnFeCvgq", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@772c2d00
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(64);
      Type type0 = Type.LONG_TYPE;
      classWriter0.visitField(64, "chErF+J", "Deprecated", "chErF+J", type0);
      String[] stringArray0 = new String[0];
      classWriter0.visit((-10), 20, "Deprecated", "chErF+J", "Deprecated", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(117, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2227));
      classWriter0.visitSource("", "");
      classWriter0.visitField(854, "", "qv?E#UdaAo1", "", "");
      int int0 = classWriter0.newConst("");
      assertEquals(3, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(146, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2227));
      classWriter0.newConstItem("");
      classWriter0.newFieldItem("", "", "");
      int int0 = classWriter0.newField("", "", "");
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2227));
      classWriter0.visitAnnotation("=%^.QB", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(73, byteArray0.length);
      
      int int0 = classWriter0.newMethod("=%^.QB", "=%^.QB", "Deprecated", false);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1095);
      classWriter0.newField("", "tac,kMap", "tac,kMap");
      int int0 = classWriter0.newMethod("tac,kMap", "tac,kMap", "tac,kMap", true);
      assertEquals(7, int0);
      
      classWriter0.visitAnnotation("ZK_z:(oi<$", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(115, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1095);
      classWriter0.newField("", "tac,kMap", "tac,kMap");
      int int0 = classWriter0.newMethod("tac,kMap", "tac,kMap", "tac,kMap", true);
      assertEquals(7, int0);
      
      classWriter0.visitAnnotation("e", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(103, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-237));
      String[] stringArray0 = new String[4];
      stringArray0[0] = "rfP[My";
      stringArray0[1] = "rfP[My";
      stringArray0[2] = "%Vd}\"!8CX:E";
      stringArray0[3] = "%Vd}\"!8CX:E";
      classWriter0.visit(16, (-237), "rfP[My", "%Vd}\"!8CX:E", (String) null, stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(118, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2227));
      Item item0 = classWriter0.newFloat((-2227));
      classWriter0.addType("");
      classWriter0.addType("");
      // Undeclared exception!
      try { 
        classWriter0.newConstItem(item0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.Item@4a951a88
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2227));
      classWriter0.newFloat((-2227));
      classWriter0.newFloat((-2227));
      classWriter0.visitAnnotation("-]P?D", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(77, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1072);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("O8N:%`Z", true);
      classWriter0.toByteArray();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("mql0", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@7ed7843c
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2227));
      classWriter0.visitAnnotation("", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(69, byteArray0.length);
      
      Short short0 = new Short((short)24);
      int int0 = classWriter0.newConst(short0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1095);
      int int0 = classWriter0.addType("tac,kMap");
      assertEquals(1, int0);
      
      classWriter0.visitAnnotation("e", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(68, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-237));
      classWriter0.visitOuterClass("u", "u", "u");
      Type type0 = Type.DOUBLE_TYPE;
      int int0 = classWriter0.newConst(type0);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2221));
      Type type0 = Type.DOUBLE_TYPE;
      classWriter0.visitField((-2221), "~?ye", "~?ye", "SourceFile", type0);
      classWriter0.visitOuterClass("SourceFile", "SourceFile", (String) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1072);
      ByteVector byteVector0 = new ByteVector(1);
      classWriter0.toByteArray();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 2);
      Boolean boolean0 = Boolean.valueOf(true);
      classWriter0.newConst(boolean0);
      annotationWriter0.visit("^$K'", boolean0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2227));
      ByteVector byteVector0 = classWriter0.pool;
      classWriter0.visitSource("", "");
      classWriter0.toByteArray();
      Item item0 = classWriter0.newFieldItem("qv?E#UdaAo1", "qv?E#UdaAo1", "");
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 220);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("O%~]ou0+VZ@D", item0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.Item@7385cb25
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2227));
      classWriter0.visitAnnotation("=%^.QB", true);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.getMergedType((-1564), (-1564));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2227));
      classWriter0.newFloat((-2227));
      classWriter0.newFloat((-2227));
      classWriter0.visitSource(")5/9UY&Clo~2627w*y", "/GK");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2227));
      classWriter0.newDouble((-2227));
      classWriter0.newDouble((-2227));
      classWriter0.visitAnnotation("<0", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(78, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1072);
      classWriter0.visitAnnotation("O8N:%`Z", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(74, byteArray0.length);
      
      Byte byte0 = new Byte((byte) (-1));
      int int0 = classWriter0.newConst(byte0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1072);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("O8N:%`Z", true);
      Boolean boolean0 = Boolean.valueOf(true);
      classWriter0.newConst(boolean0);
      classWriter0.toByteArray();
      annotationVisitor0.visit("^$K'", boolean0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2227));
      ByteVector byteVector0 = classWriter0.pool;
      classWriter0.visitInnerClass("qv?E#UdaAo1", "qv?E#UdaAo1", "", (-1436));
      classWriter0.toByteArray();
      Item item0 = classWriter0.newFieldItem("qv?E#UdaAo1", "qv?E#UdaAo1", "");
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 220);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("O%~]ou0+VZ@D", item0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.Item@71df7a44
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2227));
      classWriter0.newFloat((-2227));
      classWriter0.newFloat((-2227));
      classWriter0.visitInnerClass("RuntimeVisibleAnnotations", "-]P?D", "-]P?D", 57);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2230));
      classWriter0.visitAnnotation("", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(69, byteArray0.length);
      
      Class<String> class0 = String.class;
      Type type0 = Type.getType(class0);
      int int0 = classWriter0.newConst(type0);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2227));
      ByteVector byteVector0 = classWriter0.pool;
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, (-1717));
      Item item0 = classWriter0.newDouble((-2227));
      classWriter0.visitAnnotation("a=%^.QB", false);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        annotationWriter0.visit("EnclosingMethod", item0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.Item@5f9d3473
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1095);
      Item item0 = classWriter0.newFieldItem("tac,kMap", "tac,kMap", "tac,kMap");
      assertNotNull(item0);
      
      int int0 = classWriter0.newField("tac,kMap", "tac,kMap", "tac,kMap");
      assertEquals(4, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(48, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2227));
      ByteVector byteVector0 = classWriter0.pool;
      String[] stringArray0 = new String[2];
      stringArray0[0] = "OJ%\"7&k:;:M;3jSy,2";
      stringArray0[1] = "";
      classWriter0.visit((-2227), (-2227), "s", "-]P?D", "s", stringArray0);
      classWriter0.toByteArray();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 1);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        annotationWriter0.visit("OJ%\"7&k:;:M;3jSy,2", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@5b1800a8
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(64);
      classWriter0.addUninitializedType("Deprecated", 1111);
      int int0 = classWriter0.addUninitializedType("v=&CFSczJid~|VJ,au", 1);
      assertEquals(2, int0);
      
      classWriter0.visitAnnotation(")V", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(69, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-237));
      classWriter0.visitOuterClass("u", (String) null, (String) null);
      Type type0 = Type.DOUBLE_TYPE;
      int int0 = classWriter0.newConst(type0);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-237));
      classWriter0.newDouble((-237));
      classWriter0.newDouble((-237));
      classWriter0.visitInnerClass("u", (String) null, "u", 107);
      classWriter0.visitInnerClass("&jXh*P+~~", "wqWl:$Q6|x0oP``s4", "&jXh*P+~~", (-237));
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2246));
      Type type0 = Type.CHAR_TYPE;
      classWriter0.newConst(type0);
      classWriter0.visitInnerClass("Label offset position has not been resolved yet", (String) null, (String) null, 3);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2227));
      classWriter0.visitSource("", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(77, byteArray0.length);
      
      int int0 = classWriter0.addType("");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test93()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-237));
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("Ru>timeInvisibleAnnotations", true);
      classWriter0.visitSource((String) null, "Y");
      // Undeclared exception!
      try { 
        classWriter0.newConst(((AnnotationWriter) annotationVisitor0).next);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value null
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }
}
