/*

 * Tue Mar 03 14:26:42 GMT 2020
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
import org.mockito.asm.FieldVisitor;
import org.mockito.asm.FieldWriter;
import org.mockito.asm.Item;
import org.mockito.asm.Type;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AnnotationWriter_ESTest extends AnnotationWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitAnnotation("", true);
      classWriter0.toByteArray();
      Short short0 = new Short((short) (-453));
      FieldVisitor fieldVisitor0 = classWriter0.visitField(375, ".s.IFJDCS", "", "", short0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1810);
      Item item0 = classWriter0.newConstItem("j Ky-");
      Item item1 = classWriter0.newConstItem("j Ky-");
      assertSame(item1, item0);
      
      classWriter0.visitAnnotation("j Ky-", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(77, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1814);
      Item item0 = classWriter0.newLong((-1L));
      Item item1 = classWriter0.newLong((-1L));
      assertNotNull(item1);
      assertSame(item1, item0);
      
      Byte byte0 = new Byte((byte) (-32));
      Item item2 = classWriter0.newConstItem(byte0);
      assertNotSame(item2, item0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      Item item0 = classWriter0.newLong(2);
      Type type0 = Type.DOUBLE_TYPE;
      Item item1 = classWriter0.newConstItem(type0);
      assertNotSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.newInteger(1);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "EnclosingMethod";
      stringArray0[3] = ",0,e6-";
      stringArray0[4] = "EnclosingMethod";
      stringArray0[5] = "";
      stringArray0[6] = ",0,e6-";
      classWriter0.visit(1, (-1573), "EnclosingMethod", "", ",0,e6-", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(139, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(285212675);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "a-`Ai]jqc\"hgp^?\"r";
      stringArray0[1] = "a-`Ai]jqc\"hgp^?\"r";
      stringArray0[2] = "/m\"bG4KQ2k-nNm_8G";
      stringArray0[3] = "Ia";
      classWriter0.visit((-2323), (-2323), "Ia", "'D|", "a-`Ai]jqc\"hgp^?\"r", stringArray0);
      classWriter0.toByteArray();
      ByteVector byteVector0 = new ByteVector(156);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 10);
      Boolean boolean0 = Boolean.FALSE;
      annotationWriter0.visit("Code", boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitAnnotation("", false);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.getMergedType((-855), 15);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(7);
      classWriter0.newMethodItem("Synthetic", "Synthetic", "Synthetic", false);
      classWriter0.newField("Synthetic", "Synthetic", "Synthetic");
      classWriter0.visitSource((String) null, "Synthetic");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      Item item0 = classWriter0.newDouble(855.9);
      Type type0 = Type.DOUBLE_TYPE;
      Item item1 = classWriter0.newConstItem(type0);
      assertFalse(item1.equals((Object)item0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1814);
      Item item0 = classWriter0.newLong((-1L));
      Item item1 = classWriter0.newLong((-1L));
      assertSame(item1, item0);
      
      classWriter0.visitAnnotation("f.Qo>xs", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(85, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitAnnotation("[,07n!&pC8P,H", false);
      classWriter0.toByteArray();
      Boolean boolean0 = Boolean.TRUE;
      Item item0 = classWriter0.newConstItem(boolean0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitSource("", "");
      Character character0 = Character.valueOf('%');
      classWriter0.toByteArray();
      Item item0 = classWriter0.newConstItem(character0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1801);
      classWriter0.newConstItem("&zo>SBIyS_)DrG2m,t9");
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(695, 3641);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitAnnotation("", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(69, byteArray0.length);
      
      classWriter0.addType("Ll6U\"|6\b!0");
      int int0 = classWriter0.addType("");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(7);
      classWriter0.newMethodItem("Synthetc", "Synthetc", "Synthetc", true);
      classWriter0.newField("Synthetc", "Synthetc", "Synthetc");
      classWriter0.visitSource("Synthetc", (String) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1810);
      classWriter0.invalidFrames = true;
      classWriter0.newConstItem("j Ky-");
      classWriter0.newConstItem("j Ky-");
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
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(7);
      classWriter0.newFieldItem("Synthetic", "Synthetic", "Synthetic");
      int int0 = classWriter0.newField("Synthetic", "Synthetic", "Synthetic");
      assertEquals(4, int0);
      
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(92, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(285212675);
      Boolean boolean0 = new Boolean("/m\"bG4KQ2k-nNm_8G");
      classWriter0.newConstItem(boolean0);
      classWriter0.newConstItem(boolean0);
      classWriter0.visitAnnotation("", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(74, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("o", false);
      classWriter0.newFloat(1);
      classWriter0.newFloat(1);
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("n^", (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value null
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1810);
      Item item0 = classWriter0.newConstItem("j Ky-");
      Item item1 = classWriter0.newConstItem("j Ky-");
      assertSame(item1, item0);
      
      classWriter0.visitAnnotation("lU@*Pa_ucA`^Ze", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(92, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1814);
      classWriter0.newLong((-1L));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "&zo>BIyS_DrG2m,t9";
      classWriter0.visit(1, (-2323), "a-`Ai]jqc\"hgp^?\"r", "org.mockito.asm.Edge", "'$\"4YS%`MW{*b4a`", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(183, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(285212665);
      classWriter0.newLong((-1L));
      String[] stringArray0 = new String[4];
      stringArray0[0] = "a-`Ai]jqc\"hgp^?\"r";
      stringArray0[1] = "a-`Ai]jqc\"hgp^?\"r";
      stringArray0[2] = "/m\"bG4KQ2k-nNm_8G";
      stringArray0[3] = "Ia";
      classWriter0.visit((-2323), (-2323), "Ia", "'D|", "a-`Ai]jqc\"hgp^?\"r", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(141, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      Type type0 = Type.DOUBLE_TYPE;
      Item item0 = classWriter0.newConstItem(type0);
      Item item1 = classWriter0.newMethodItem("", "", "", true);
      assertNotSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitSource("", "");
      classWriter0.toByteArray();
      Item item0 = classWriter0.newDouble(855.9);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitAnnotation("", false);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newDouble(855.9);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1810);
      classWriter0.invalidFrames = true;
      classWriter0.addUninitializedType("j Ky-", 1810);
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
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitSource("", "");
      classWriter0.toByteArray();
      Item item0 = classWriter0.newLong(2);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitAnnotation("", false);
      Character character0 = Character.valueOf('%');
      classWriter0.toByteArray();
      Item item0 = classWriter0.newConstItem(character0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1814);
      classWriter0.newLong((-1L));
      classWriter0.newLong((-1L));
      classWriter0.visitAnnotation("RuntimeVisibleAnnotations", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(73, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(7);
      classWriter0.newMethodItem("Synthetic", "Synthetic", "Synthetic", false);
      classWriter0.visitAnnotation("", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(94, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitAnnotation("[,07n!&pC8P,H", true);
      classWriter0.toByteArray();
      Boolean boolean0 = Boolean.TRUE;
      Item item0 = classWriter0.newConstItem(boolean0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(162);
      int int0 = classWriter0.addType(";");
      assertEquals(1, int0);
      
      classWriter0.visitInnerClass(";", "org.mockito.asm.ClassWriter", ";", 1);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(95, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1814);
      Boolean boolean0 = Boolean.TRUE;
      classWriter0.newConstItem(boolean0);
      classWriter0.visitSource(",qc5{EQIQkqssQ", (String) null);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(68, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitAnnotation("o", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(70, byteArray0.length);
      
      Item item0 = classWriter0.newFloat(1);
      Item item1 = classWriter0.newFloat(1);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitSource("", (String) null);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.getMergedType((-855), 15);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Type type0 = Type.CHAR_TYPE;
      ClassWriter classWriter0 = new ClassWriter(7);
      classWriter0.newConstItem(type0);
      classWriter0.visitSource("Synthetc", (String) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Type type0 = Type.INT_TYPE;
      ClassWriter classWriter0 = new ClassWriter(7);
      classWriter0.newConstItem(type0);
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(74, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitSource("", (String) null);
      int int0 = classWriter0.addUninitializedType("", 65535);
      assertEquals(1, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(48, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(285212675);
      Boolean boolean0 = new Boolean("/m\"bG4KQ2k-nNm_8G");
      classWriter0.newConstItem(boolean0);
      classWriter0.newConstItem(boolean0);
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(72, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Type type0 = Type.INT_TYPE;
      ClassWriter classWriter0 = new ClassWriter(7);
      classWriter0.newConstItem(type0);
      Item item0 = classWriter0.newMethodItem("Synthetic", "Synthetic", "Synthetic", false);
      Item item1 = classWriter0.newMethodItem("Synthetic", "Synthetic", "Synthetic", false);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.invalidFrames = true;
      classWriter0.visitOuterClass("", "", "");
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
  public void test41()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1814);
      classWriter0.visitAnnotation("f.Qo>xs", false);
      classWriter0.toByteArray();
      Byte byte0 = new Byte((byte) (-32));
      Item item0 = classWriter0.newConstItem(byte0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitAnnotation("", true);
      classWriter0.toByteArray();
      Character character0 = new Character('C');
      Item item0 = classWriter0.newConstItem(character0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(7);
      classWriter0.newDouble(5);
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(76, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitOuterClass("", "", "");
      classWriter0.visitInnerClass("org.mockito.asm.ClassWriter", "org.mockito.asm.ClassWriter", "", 1);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(127, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitOuterClass("", "", "");
      classWriter0.visitInnerClass("org.mockito.asm.ClassWriter", "org.mockito.asm.ClassWriter", "", 1);
      Item item0 = classWriter0.newMethodItem("", "", "", true);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(7);
      classWriter0.newMethodItem("Synthetic", "Synthetic", "Synthetic", false);
      classWriter0.newField("Synthetic", "Synthetic", "Synthetic");
      classWriter0.visitOuterClass("XzcT/YOWu", "Synthetic", (String) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(285212675);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "EnclosingMethod", "EnclosingMethod", "EnclosingMethod", "EnclosingMethod");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(97, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(162);
      classWriter0.addUninitializedType(";", 162);
      classWriter0.addType(";");
      Byte byte0 = new Byte((byte) (-9));
      Item item0 = classWriter0.newConstItem(byte0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(285212675);
      classWriter0.visitOuterClass("ZLvGA;,<'Lbd~", (String) null, (String) null);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitOuterClass("", "", "");
      classWriter0.visitSource("", "");
      classWriter0.toByteArray();
      Item item0 = classWriter0.newMethodItem("", "", "", true);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitSource("", (String) null);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newConstItem("");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1810);
      classWriter0.invalidFrames = true;
      classWriter0.newDouble((-1307.9233649313526));
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
  public void test53()  throws Throwable  {
      Type type0 = Type.INT_TYPE;
      ClassWriter classWriter0 = new ClassWriter(7);
      classWriter0.newConstItem(type0);
      classWriter0.newFieldItem("Synthetic", "Synthetic", "Synthetic");
      int int0 = classWriter0.newField("Synthetic", "Synthetic", "Synthetic");
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1814);
      classWriter0.newMethodItem(".s.IFJDCS", ".s.IFJDCS", ".s.IFJDCS", false);
      classWriter0.visitAnnotation("RuntimeVisibleAnnotations", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(89, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitOuterClass("", "", "");
      classWriter0.visitAnnotation("", false);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newMethodItem("", "", "", true);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("", false);
      classWriter0.visitSource("", "");
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("9V9Y51O%~V", annotationVisitor0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.AnnotationWriter@29b769fe
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(7);
      Item item0 = classWriter0.newFieldItem("Synthetic", "Synthetic", "Synthetic");
      assertNotNull(item0);
      
      int int0 = classWriter0.newField("Synthetic", "Synthetic", "Synthetic");
      assertEquals(4, int0);
      
      classWriter0.visitAnnotation("", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(94, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(9);
      Item item0 = classWriter0.newFieldItem("Synthetic", "Synthetic", "Synthetic");
      assertNotNull(item0);
      
      int int0 = classWriter0.newField("Synthetic", "Synthetic", "Synthetic");
      assertEquals(4, int0);
      
      classWriter0.visitInnerClass("", "\"6.NuV", "", 4);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(98, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(7);
      classWriter0.newMethodItem("Synthetc", "Synthetc", "Synthetc", true);
      classWriter0.newField("Synthetc", "Synthetc", "Synthetc");
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("SXQ", true);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1810);
      classWriter0.invalidFrames = true;
      classWriter0.newFloat(1810);
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
  public void test61()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(285212665);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "a-`Ai]jqc\"hgp^?\"r";
      stringArray0[1] = "a-`Ai]jqc\"hgp^?\"r";
      stringArray0[2] = "/m\"bG4KQ2k-nNm_8G";
      stringArray0[3] = "Ia";
      classWriter0.visit((-2323), (-2323), "Ia", "'D|", "a-`Ai]jqc\"hgp^?\"r", stringArray0);
      classWriter0.toByteArray();
      ByteVector byteVector0 = new ByteVector(156);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 10);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        annotationWriter0.visit("a-`Ai]jqc\"hgp^?\"r", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@22d76913
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(162);
      classWriter0.addType(";");
      classWriter0.addType(";");
      Byte byte0 = new Byte((byte) (-9));
      Item item0 = classWriter0.newConstItem(byte0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitAnnotation("", true);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newFloat(1);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1814);
      classWriter0.visitAnnotation(",qc5{EQIQkqssQ", false);
      classWriter0.toByteArray();
      Short short0 = new Short((short) (-1277));
      Item item0 = classWriter0.newConstItem(short0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(162);
      int int0 = classWriter0.addType("");
      assertEquals(1, int0);
      
      int int1 = classWriter0.addType("");
      assertEquals(1, int1);
      
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(67, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1814);
      classWriter0.visitSource(",qc5{EQIQkqssQ", (String) null);
      classWriter0.toByteArray();
      Short short0 = new Short((short) (-1277));
      Item item0 = classWriter0.newConstItem(short0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Type type0 = Type.INT_TYPE;
      ClassWriter classWriter0 = new ClassWriter(7);
      classWriter0.newConstItem(type0);
      classWriter0.visitOuterClass("XzcT/YOWu", "Synthetic", (String) null);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(162);
      ByteVector byteVector0 = new ByteVector();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 2);
      Byte byte0 = new Byte((byte) (-9));
      annotationWriter0.visit(";", byte0);
      classWriter0.newConstItem(byte0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(29, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(7);
      classWriter0.newFieldItem("Synthetic", "Synthetic", "Synthetic");
      classWriter0.newField("Synthetic", "Synthetic", "Synthetic");
      classWriter0.visitSource("Synthetic", "");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitSource("", "");
      classWriter0.toByteArray();
      Type type0 = Type.DOUBLE_TYPE;
      Item item0 = classWriter0.newConstItem(type0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(162);
      int int0 = classWriter0.addType(";");
      assertEquals(1, int0);
      
      int int1 = classWriter0.addType(";");
      assertEquals(1, int1);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(24, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1810);
      classWriter0.addUninitializedType("j Ky-", 1810);
      classWriter0.visitAnnotation("j Ky-", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(74, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(24, byteArray0.length);
      
      Item item0 = classWriter0.newFloat(1);
      Item item1 = classWriter0.newFloat(1);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitAnnotation("", true);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.getMergedType((-855), 15);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitAnnotation("", true);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newMethodItem(".s.IFJDCS", "", "", true);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitInnerClass("org.mockito.asm.ClassWriter", "org.mockito.asm.ClassWriter", "", 1);
      classWriter0.toByteArray();
      Type type0 = Type.DOUBLE_TYPE;
      Item item0 = classWriter0.newConstItem(type0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.newFloat(1);
      classWriter0.newFloat(1);
      classWriter0.visitInnerClass("9=p2))v#", "?O {%+C.Tt7zj%b", "ZwGKHTreQph", 2);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(109, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitAnnotation("", false);
      classWriter0.toByteArray();
      Type type0 = Type.DOUBLE_TYPE;
      Item item0 = classWriter0.newConstItem(type0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2588));
      Class<Object> class0 = Object.class;
      Type type0 = Type.getType(class0);
      classWriter0.newConstItem(type0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(46, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitSource("", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(77, byteArray0.length);
      
      int int0 = classWriter0.newField("9V9Y51O%~V", "`E|Q#:L~h:Z", "");
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("", true);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "EnclosingMethod";
      stringArray0[3] = ",0,e6-";
      stringArray0[4] = "EnclosingMethod";
      stringArray0[5] = "";
      stringArray0[6] = ",0,e6-";
      classWriter0.visit(1, (-1573), "EnclosingMethod", "", ",0,e6-", stringArray0);
      classWriter0.toByteArray();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@7b20f88e
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(162);
      int int0 = classWriter0.addUninitializedType("", 162);
      assertEquals(1, int0);
      
      int int1 = classWriter0.addType("");
      assertEquals(2, int1);
      
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(67, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitOuterClass("", "", "");
      Type type0 = Type.DOUBLE_TYPE;
      Item item0 = classWriter0.newConstItem(type0);
      Item item1 = classWriter0.newMethodItem("", "", "", true);
      assertFalse(item1.equals((Object)item0));
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitInnerClass((String) null, (String) null, "08iVi", 2);
      ByteVector byteVector0 = new ByteVector();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 2);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("w3yY)iP{", byteVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ByteVector@7f69b63
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector();
      ClassWriter classWriter0 = new ClassWriter(9);
      classWriter0.visitInnerClass("Synthetic", "oA)E`K", (String) null, 9);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 960);
      // Undeclared exception!
      try { 
        annotationWriter0.visit((String) null, byteVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ByteVector@4cffa479
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitSource("", (String) null);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(48, byteArray0.length);
      
      classWriter0.addType("Ll6U\"|6\b!0");
      int int0 = classWriter0.addType("");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      Type type0 = Type.INT_TYPE;
      ClassWriter classWriter0 = new ClassWriter(7);
      classWriter0.newConstItem(type0);
      classWriter0.visitSource((String) null, "Synthetic");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(285212675);
      classWriter0.visitInnerClass("", "/m\"bG4KQ2k-nNm_8G", "Ab/FW;*rz.BDK:t", (-260));
      ByteVector byteVector0 = new ByteVector();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 1);
      classWriter0.visitInnerClass("Ab/FW;*rz.BDK:t", "", "", (-906));
      // Undeclared exception!
      try { 
        annotationWriter0.visit((String) null, byteVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ByteVector@27d365e5
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }
}
