/*

 * Tue Mar 03 14:28:46 GMT 2020
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
import org.mockito.asm.Attribute;
import org.mockito.asm.ByteVector;
import org.mockito.asm.ClassReader;
import org.mockito.asm.ClassVisitor;
import org.mockito.asm.ClassWriter;
import org.mockito.asm.FieldVisitor;
import org.mockito.asm.Item;
import org.mockito.asm.Type;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AnnotationWriter_ESTest extends AnnotationWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(739);
      classWriter0.newFloat(739);
      classWriter0.newFloat(739);
      classWriter0.visitInnerClass("", (String) null, ";HovP*N5@X", 1);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Attribute attribute0 = new Attribute("");
      ClassWriter classWriter0 = new ClassWriter((-2610));
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("bKS[Qff", true);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("", attribute0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.Attribute@f8abe34
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2558);
      classWriter0.newMethodItem("", "", "=I~nCqS3A#R-m1~^", true);
      classWriter0.visitSource("", "/UWMO>:g^txW&");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(124, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-17));
      classWriter0.newDouble((-2766.8438));
      classWriter0.newDouble((-2766.8438));
      ByteVector byteVector0 = classWriter0.pool;
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, (-2375));
      // Undeclared exception!
      try { 
        annotationWriter0.visit("\"6u.7", byteVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ByteVector@32fb1588
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2610));
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("bKS[Qff", false);
      classWriter0.toByteArray();
      Boolean boolean0 = new Boolean("bKS[Qff");
      annotationVisitor0.visit("bKS[Qff", boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(8);
      Character character0 = Character.valueOf('=');
      classWriter0.newConstItem(character0);
      classWriter0.visitSource("s\"JK", "s\"JK");
      classWriter0.newConstItem(character0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(90, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(8);
      classWriter0.visitSource(",GD~Iw^r=dJ/B:$", "Um");
      Item item0 = classWriter0.newDouble((-2766.8438));
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(103, byteArray0.length);
      
      Item item1 = classWriter0.newDouble((-2766.8438));
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(10);
      classWriter0.visitInnerClass("", "", "int", 10);
      Item item0 = classWriter0.newFloat(10);
      Item item1 = classWriter0.newFloat(10);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(18);
      classWriter0.visitSource("", "+!Y^G7,?W5HdRA");
      classWriter0.toByteArray();
      Item item0 = classWriter0.newLong(9);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(8);
      classWriter0.visitSource("", "V8r*p){9wI");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(87, byteArray0.length);
      
      Item item0 = classWriter0.newFloat(0.0F);
      Item item1 = classWriter0.newFloat(0.0F);
      assertSame(item1, item0);
      assertNotNull(item1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-58));
      Item item0 = classWriter0.newFloat(0.0F);
      classWriter0.visitOuterClass("", "", "");
      Item item1 = classWriter0.newFloat(0.0F);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(8);
      Item item0 = classWriter0.newFloat(0.0F);
      classWriter0.visitOuterClass("rn#MNt.zuW!2ktf$", "", (String) null);
      Item item1 = classWriter0.newFloat(0.0F);
      assertSame(item1, item0);
      assertNotNull(item1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-20));
      classWriter0.newDouble((-2766.843754398057));
      classWriter0.newDouble((-2766.843754398057));
      classWriter0.visitInnerClass("LocalVariableTable", "LocalVariableTable", (String) null, (-20));
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(10);
      classWriter0.newFloat(10);
      classWriter0.newFloat(10);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("int", true);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(8);
      classWriter0.newFloat(0.0F);
      classWriter0.newFloat(0.0F);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("bKS[Qff", false);
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ClassWriter@200a1be0
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitSource("IJvo 2_{P' `zLUQ$DO", "|1M7F");
      Boolean boolean0 = Boolean.TRUE;
      classWriter0.newConstItem(boolean0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(106, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(18);
      classWriter0.visitSource("", "+!Y^G7,?W5HdRA");
      classWriter0.toByteArray();
      Boolean boolean0 = Boolean.valueOf("float");
      Item item0 = classWriter0.newConstItem(boolean0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-20));
      classWriter0.newDouble((-2766.8438));
      classWriter0.newDouble((-2766.8438));
      classWriter0.visitOuterClass("+X^iv3", "+X^iv3", "+X^iv3");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-17));
      classWriter0.newDouble((-2766.8438));
      classWriter0.newDouble((-2766.8438));
      classWriter0.visitOuterClass("[G}@XW >)nG|O~`}Ja^", "", (String) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(18);
      classWriter0.visitSource("F", "+4!Y^G7,?W5HdRA");
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(730, 10);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(10);
      classWriter0.visitSource((String) null, (String) null);
      Type type0 = Type.getReturnType("Dl");
      Item item0 = classWriter0.newConstItem(type0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(192);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(24, byteArray0.length);
      
      int int0 = classWriter0.addUninitializedType("Hv", (-3322));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-17));
      classWriter0.newDouble((-2766.8438));
      classWriter0.newDouble((-2766.8438));
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("qv)]UXrv", false);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2610));
      Type type0 = Type.VOID_TYPE;
      classWriter0.newConstItem(type0);
      classWriter0.visitInnerClass("", "org.mockito.asm.Edge", "IJvo 2_{P' `zLUQ$DO", 70);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Character character0 = new Character('g');
      ClassWriter classWriter0 = new ClassWriter((-2610));
      classWriter0.visitAnnotation("qv)]UXrv", true);
      classWriter0.newConstItem(character0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(80, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2610));
      classWriter0.visitAnnotation("bKS[Qff", true);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newDouble((-2610));
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-20));
      Class<Byte> class0 = Byte.class;
      Type type0 = Type.getType(class0);
      classWriter0.newConstItem(type0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(44, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      Boolean boolean0 = Boolean.TRUE;
      classWriter0.newConstItem(boolean0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(29, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(8);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newLong(0L);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(64);
      classWriter0.visitSource("", "");
      classWriter0.newConstItem("");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(80, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((byte)0);
      Item item0 = classWriter0.newConstItem("");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(30, byteArray0.length);
      
      Item item1 = classWriter0.newConstItem("");
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(8);
      classWriter0.visitSource("", "V8r*p){9wI");
      byte[] byteArray0 = classWriter0.toByteArray();
      ClassReader classReader0 = new ClassReader(byteArray0);
      ByteVector byteVector0 = classWriter0.pool;
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 49);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("", classReader0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ClassReader@7b31b8d4
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(51);
      classWriter0.invalidFrames = true;
      classWriter0.newFloat(564.2F);
      // Undeclared exception!
      try { 
        classWriter0.toByteArray();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2610));
      classWriter0.visitAnnotation("bKS[Qff", true);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newFloat(3447);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2558);
      Short short0 = new Short((short) (-232));
      classWriter0.visitSource("", "/UWMO>:g^txW&");
      classWriter0.newConstItem(short0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(95, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(192);
      classWriter0.toByteArray();
      Short short0 = new Short((short)338);
      Item item0 = classWriter0.newConstItem(short0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(8);
      Character character0 = Character.valueOf('=');
      classWriter0.newConstItem(character0);
      classWriter0.newConstItem(character0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(29, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(10);
      classWriter0.toByteArray();
      classWriter0.visitInnerClass("E#[5m[)\"ex^p", "E#[5m[)\"ex^p", "S", 10);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(8);
      classWriter0.visitInnerClass("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "QAq+y", (String) null, 8);
      Item item0 = classWriter0.newFloat(1.0F);
      classWriter0.visitInnerClass("y2yI$GpSV$7!-GSJ4p", "VFr~A0%H", (String) null, 8);
      Item item1 = classWriter0.newFloat(1.0F);
      assertNotNull(item1);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(8);
      int int0 = classWriter0.addType("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII");
      assertEquals(1, int0);
      
      classWriter0.visitSource("SourceFile", (String) null);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(45, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(8);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(24, byteArray0.length);
      
      Item item0 = classWriter0.newFloat(0.0F);
      Item item1 = classWriter0.newFloat(0.0F);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2610));
      classWriter0.visitAnnotation("bKS[Qff", true);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.getMergedType((-1992), 16777221);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(8);
      classWriter0.visitSource((String) null, "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII");
      Item item0 = classWriter0.newFloat(1.0F);
      Item item1 = classWriter0.newFloat(1.0F);
      assertNotNull(item1);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(42);
      Byte byte0 = new Byte((byte) (-125));
      classWriter0.newConstItem(byte0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(29, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(10);
      classWriter0.visitInnerClass((String) null, (String) null, (String) null, 10);
      Type type0 = Type.VOID_TYPE;
      classWriter0.newConstItem(type0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(62, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(51);
      Type type0 = Type.BOOLEAN_TYPE;
      classWriter0.newConstItem(type0);
      classWriter0.invalidFrames = true;
      // Undeclared exception!
      try { 
        classWriter0.toByteArray();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(8);
      classWriter0.newFloat(0.0F);
      classWriter0.newFloat(0.0F);
      classWriter0.visitInnerClass((String) null, "", (String) null, 2);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-20));
      Item item0 = classWriter0.newDouble((-2766.8438));
      Item item1 = classWriter0.newDouble((-2766.8438));
      assertSame(item1, item0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(33, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Class");
      ClassWriter classWriter0 = new ClassWriter(200);
      // Undeclared exception!
      classReader0.accept((ClassVisitor) classWriter0, 4096);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(18);
      classWriter0.toByteArray();
      Boolean boolean0 = Boolean.valueOf("float");
      Item item0 = classWriter0.newConstItem(boolean0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Attribute attribute0 = new Attribute("");
      ClassWriter classWriter0 = new ClassWriter((-2610));
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("bKS[Qff", false);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("", attribute0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.Attribute@6bc8205c
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2610));
      classWriter0.visitAnnotation("bKS[Qff", false);
      Type type0 = Type.VOID_TYPE;
      classWriter0.newConstItem(type0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(83, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(18);
      classWriter0.newFieldItem("", "", "");
      classWriter0.visitSource("", "+!Y^G7,?W5HdRA");
      classWriter0.toByteArray();
      classWriter0.visitOuterClass("WA$5=l?P", "", "");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(18);
      classWriter0.toByteArray();
      classWriter0.newFieldItem("", "", "");
      classWriter0.visitOuterClass("WA$5=l?P", "", "");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2610));
      classWriter0.visitAnnotation("bKS[Qff", true);
      Type type0 = Type.VOID_TYPE;
      classWriter0.newConstItem(type0);
      classWriter0.toByteArray();
      FieldVisitor fieldVisitor0 = classWriter0.visitField((-3040), "", "AkKc<$iV]n2|/SwC", "Exceptions", type0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2610));
      classWriter0.visitAnnotation("bKS[Qff", true);
      classWriter0.toByteArray();
      int int0 = classWriter0.addType("bKS[Qff");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(18);
      Type type0 = Type.VOID_TYPE;
      classWriter0.newConstItem(type0);
      classWriter0.visitOuterClass("WA$5=l?P", "", "");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(10);
      classWriter0.visitOuterClass("B(tHfe+", (String) null, "$ 6");
      Item item0 = classWriter0.newConstItem("$ 6");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-17));
      classWriter0.newDouble((-2766.8438));
      classWriter0.newDouble((-2766.8438));
      classWriter0.visitInnerClass("", "", "", 1);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(10);
      classWriter0.visitSource("", "+!Y^G7,?W5HdRA");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(91, byteArray0.length);
      
      int int0 = classWriter0.addUninitializedType("", 7);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(10);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(24, byteArray0.length);
      
      int int0 = classWriter0.newMethod("boolean", "", "", false);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2558);
      classWriter0.newMethodItem("", "", "=I~nCqS3A#R-m1~^", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(61, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(18);
      classWriter0.visitSource("", "+!Y^G7,?W5HdRA");
      Type type0 = Type.VOID_TYPE;
      Item item0 = classWriter0.newConstItem(type0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(98, byteArray0.length);
      
      Item item1 = classWriter0.newConstItem(type0);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Class");
      ClassWriter classWriter0 = new ClassWriter(2);
      // Undeclared exception!
      classReader0.accept((ClassVisitor) classWriter0, 2);
  }
}
