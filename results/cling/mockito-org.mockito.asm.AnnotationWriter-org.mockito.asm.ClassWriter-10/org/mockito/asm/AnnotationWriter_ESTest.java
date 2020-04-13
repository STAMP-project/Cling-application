/*

 * Tue Mar 03 14:26:53 GMT 2020
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
import org.mockito.asm.FieldWriter;
import org.mockito.asm.Item;
import org.mockito.asm.Type;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AnnotationWriter_ESTest extends AnnotationWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(67);
      int int0 = classWriter0.newField("java/lang/String", "java/lang/String", "java/lang/String");
      assertEquals(4, int0);
      
      classWriter0.visitAnnotation("O>3", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(102, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-15));
      Short short0 = new Short((short)24);
      int int0 = classWriter0.newConst(short0);
      assertEquals(1, int0);
      
      classWriter0.visitAnnotation("s", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(73, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1408);
      classWriter0.newConst("Y}^+<z+FI]]AQ");
      int int0 = classWriter0.newConst("Y}^+<z+FI]]AQ");
      assertEquals(2, int0);
      
      classWriter0.visitAnnotation("$*wc9[UZ%go", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(100, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(162);
      classWriter0.newMethod("'o</=#PP)eu", "'o</=#PP)eu", "'o</=#PP)eu", false);
      int int0 = classWriter0.newMethod("'o</=#PPeu", "'o</=#PP)eu", "'o</=#PP)eu", false);
      assertEquals(7, int0);
      
      int int1 = classWriter0.newConst("'o</=#PPeu");
      assertEquals(8, int1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(23);
      Byte byte0 = new Byte((byte)59);
      int int0 = classWriter0.newConst(byte0);
      assertEquals(1, int0);
      
      classWriter0.visitSource("", "JBBe)u><b");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(91, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-6));
      ByteVector byteVector0 = new ByteVector();
      classWriter0.newLong((byte)83);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 1);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        annotationWriter0.visit("Signature", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@7b5cf48e
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(166);
      classWriter0.newMethod("'o</=#PP)eu", "'o</=#PP)eu", "'o</=#PP)eu", false);
      int int0 = classWriter0.newMethod("'o</=#PP)eu", "'o</=#PP)eu", "'o</=#PP)eu", false);
      assertEquals(4, int0);
      
      classWriter0.visitSource("oi1206oUl", "'o</=#PP)eu");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(124, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-913));
      classWriter0.addType("a]O>");
      int int0 = classWriter0.addType("a]O>");
      assertEquals(1, int0);
      
      classWriter0.visitAnnotation("a]O>", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(73, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.visitAnnotation("JBBe)u><b", false);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(2032, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(162);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("", true);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("", (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value null
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(162);
      classWriter0.newMethod("'o</=#PP)eu", "'o</=#PP)eu", "'o</=#PP)eu", false);
      classWriter0.newMethod("'o</=#PPeu", "'o</=#PP)eu", "'o</=#PP)eu", false);
      classWriter0.visitInnerClass((String) null, "", "InnerClasses", 162);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(67);
      int int0 = classWriter0.newMethod("MX2WE(W@G~KFJj59Z", "MX2WE(W@G~KFJj59Z", "MX2WE(W@G~KFJj59Z", true);
      assertEquals(4, int0);
      
      classWriter0.visitSource("MX2WE(W@G~KFJj59Z", (String) null);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(79, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(163);
      ByteVector byteVector0 = new ByteVector();
      classWriter0.newDouble(0.0);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 1);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("I9C-^uDQS/=%S\"", byteVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ByteVector@6851ef6e
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(67);
      classWriter0.newLong(67);
      classWriter0.visitAnnotation("MX2WE(W@G~KFJj59Z", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(96, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(162);
      Boolean boolean0 = Boolean.valueOf(true);
      classWriter0.newConstItem(boolean0);
      classWriter0.visitAnnotation("", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(74, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-913));
      classWriter0.visitSource("org.mockito.asm.Type", "org.mockito.asm.Type");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(117, byteArray0.length);
      
      Character character0 = new Character(';');
      int int0 = classWriter0.newConst(character0);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1408);
      classWriter0.newConst("Y}^+<z+FI]]AQ");
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(31, 91);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-6));
      Item item0 = classWriter0.newFloat((-6));
      Item item1 = classWriter0.newFloat((-6));
      assertSame(item1, item0);
      
      classWriter0.visitSource("7s;F", (String) null);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(57, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1408);
      classWriter0.visitInnerClass("|SFG6oBmS|;_mFsz", (String) null, (String) null, (-3452));
      Type type0 = Type.LONG_TYPE;
      classWriter0.newConst(type0);
      classWriter0.visitInnerClass("Label offset position has not been resolved yet", "SFaoBmS|;4msz", "Label offset position has not been resolved yet", 8);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(5);
      classWriter0.visitAnnotation("JBBe)u><b", false);
      int int0 = classWriter0.addType("JBBe)u><b");
      assertEquals(1, int0);
      
      int int1 = classWriter0.addUninitializedType("JBBe)u><b", (-784));
      assertEquals(2, int1);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(78, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(67);
      classWriter0.newMethod("MX2WE(W@G~KFJj59Z", "MX2WE(W@G~KFJj59Z", "MX2WE(W@G~KFJj59Z", true);
      classWriter0.newMethod("MX2WE(W@G~KFJj59Z", "MX2WE(W@G~KFJj59Z", "MX2WE(W@G~KFJj59Z", false);
      classWriter0.visitSource("MX2WE(W@G~KFJj59Z", (String) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(5);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("JBBe)u><b", false);
      Boolean boolean0 = Boolean.valueOf("JBBe)u><b");
      annotationVisitor0.visit("JBBe)u><b", boolean0);
      int int0 = classWriter0.newConst(boolean0);
      assertEquals(2, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(88, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-6));
      classWriter0.newFloat((-6));
      ByteVector byteVector0 = new ByteVector();
      classWriter0.newFloat((-6));
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 1);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("", annotationWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.AnnotationWriter@6f3efa
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1408);
      Type type0 = Type.LONG_TYPE;
      classWriter0.newConst(type0);
      classWriter0.visitInnerClass((String) null, "SFaoBmS|;4msz", (String) null, 8);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1408);
      classWriter0.newConst("Y}^+<z+FI]]AQ");
      int int0 = classWriter0.newConst("Y}^+<z+FI]]AQ");
      assertEquals(2, int0);
      
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(86, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1408);
      ByteVector byteVector0 = new ByteVector();
      Short short0 = new Short((short)4167);
      classWriter0.newConst(short0);
      classWriter0.visitSource("Y}^+<z+FI]]AQ", "Y}^+<z+FI]]AQ");
      classWriter0.toByteArray();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 1);
      annotationWriter0.visit("Y}^+<z+FI]]AQ", short0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(5);
      classWriter0.visitSource("GIfH}^.c", "Label offset position has not been resolved yet");
      classWriter0.toByteArray();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "JBBe)u><b";
      stringArray0[1] = "GIfH}^.c";
      stringArray0[2] = "H}lo9[>(.5";
      classWriter0.visit(220, 1, "H}lo9[>(.5", "JBBe)u><b", "T,_wJyRqS|", stringArray0);
      assertEquals(3, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1408);
      Type type0 = Type.FLOAT_TYPE;
      classWriter0.newConst(type0);
      classWriter0.visitSource((String) null, "Label offset position has not been resolved yet");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-936));
      classWriter0.newMethod("|>l:3tFEmwG64", "|>l:3tFEmwG64", "|>l:3tFEmwG64", true);
      ByteVector byteVector0 = classWriter0.pool;
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 90);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        annotationWriter0.visit("|>l:3tFEmwG64", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@1ff3409f
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(166);
      classWriter0.newMethod("'o</=#PP)eu", "'o</=#PP)eu", "'o</=#PP)eu", false);
      classWriter0.newMethod("'o</=#PP)eu", "'o</=#PP)eu", "'o</=#PP)eu", false);
      classWriter0.visitOuterClass("", "'o</=#PP)eu", "'o</=#PP)eu");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(162);
      classWriter0.newMethod("'o</=#PP)eu", "'o</=#PP)eu", "'o</=#PP)eu", false);
      int int0 = classWriter0.newMethod("'o</=#PPeu", "'o</=#PP)eu", "'o</=#PP)eu", false);
      assertEquals(7, int0);
      
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "'o</=#PPeu";
      stringArray0[2] = "";
      classWriter0.visit((byte)13, 2643, "", "", "'o</=#PP)eu", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(104, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(67);
      classWriter0.newDouble(2);
      classWriter0.visitSource("MX2WE(W@G~KFJj59Z", (String) null);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(75, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(67);
      classWriter0.newDouble(2);
      classWriter0.visitAnnotation("MX2WE(W@G~KFJj59Z", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(96, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(67);
      classWriter0.newLong(67);
      classWriter0.visitSource("MX2WE(W@G~KFJj59Z", (String) null);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(75, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(5);
      classWriter0.visitAnnotation("JBBe)u><b", false);
      Character character0 = Character.valueOf('#');
      int int0 = classWriter0.newConst(character0);
      assertEquals(2, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(83, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-6));
      classWriter0.newFloat((-6));
      classWriter0.newFloat((-6));
      classWriter0.visitSource((String) null, "x_ht6`r*mRc&[denP");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(75, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-913));
      classWriter0.visitAnnotation("arLO>", true);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newLong(2);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(5);
      classWriter0.visitAnnotation("JBBe)u><b", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(76, byteArray0.length);
      
      Boolean boolean0 = new Boolean("");
      int int0 = classWriter0.newConst(boolean0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1408);
      classWriter0.visitInnerClass((String) null, "$*wc9[UZ%go", "Label offset position has not been resolved yet", 2);
      classWriter0.toByteArray();
      int int0 = classWriter0.addType("Y}^+<z+FI]]AQ");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3799);
      classWriter0.invalidFrames = true;
      Byte byte0 = new Byte((byte)91);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 3799, "O>3", "`E,vuR", "", byte0);
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
  public void test40()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(162);
      Boolean boolean0 = Boolean.valueOf(true);
      int int0 = classWriter0.newConst(boolean0);
      assertEquals(1, int0);
      
      classWriter0.visitSource("", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(82, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(5);
      Boolean boolean0 = Boolean.FALSE;
      int int0 = classWriter0.newConst(boolean0);
      assertEquals(1, int0);
      
      classWriter0.visitSource("SourceFile", "SourceFile");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(89, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(192);
      classWriter0.invalidFrames = true;
      classWriter0.visitInnerClass("O>3", "O>3", "java/lang/String", 2);
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
  public void test43()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(162);
      classWriter0.newFloat(162);
      classWriter0.newFloat(162);
      classWriter0.visitAnnotation("&[UCKRQZG]|wY@;B>~", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(92, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3799);
      classWriter0.visitSource("<init>", "");
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(3799, 26);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(162);
      Type type0 = Type.CHAR_TYPE;
      classWriter0.newConst(type0);
      classWriter0.visitSource("", (String) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(166);
      classWriter0.newMethod("'o</=#PP)eu", "'o</=#PP)eu", "'o</=#PP)eu", false);
      classWriter0.newMethod("'o</=#PP)eu", "'o</=#PP)eu", "'o</=#PP)eu", false);
      int int0 = classWriter0.newConst("'o</=#PP)eu");
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(192);
      classWriter0.invalidFrames = true;
      classWriter0.newField("java/lang/String", "java/lang/String", "java/lang/String");
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
  public void test48()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(23);
      Type type0 = Type.getReturnType("|SFG6oBmS|;_mFsz");
      int int0 = classWriter0.newConst(type0);
      assertEquals(2, int0);
      
      classWriter0.visitSource("", "JBBe)u><b");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(102, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(5);
      classWriter0.visitAnnotation("JBBe)u><b", true);
      classWriter0.toByteArray();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "JBBe)u><b";
      stringArray0[1] = "GIfH}^.c";
      stringArray0[2] = "H}lo9[>(.5";
      classWriter0.visit(220, 1, "H}lo9[>(.5", "JBBe)u><b", "T,_wJyRqS|", stringArray0);
      assertEquals(3, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(5);
      classWriter0.visitAnnotation("JBBe)u><b", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(78, byteArray0.length);
      
      Byte byte0 = new Byte((byte) (-17));
      int int0 = classWriter0.newConst(byte0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(162);
      classWriter0.newMethod("'o</=#PP)eu", "'o</=#PP)eu", "'o</=#PP)eu", false);
      int int0 = classWriter0.newMethod("'o</=#PP)eu", "'o</=#PP)eu", "'o</=#PP)eu", false);
      assertEquals(4, int0);
      
      classWriter0.visitAnnotation("'o</=#PP)eu", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(93, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-6));
      classWriter0.newFloat((-6));
      classWriter0.newFloat((-6));
      classWriter0.visitInnerClass((String) null, (String) null, (String) null, (-6));
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(60, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(5);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("JBBe)u><b", true);
      Character character0 = Character.valueOf('#');
      classWriter0.newConst(character0);
      classWriter0.toByteArray();
      annotationVisitor0.visit(">ns.U744", character0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(5);
      classWriter0.visitAnnotation("JBBe)u><b", true);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newDouble(5);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(67);
      int int0 = classWriter0.newField("java/lang/String", "java/lang/String", "java/lang/String");
      assertEquals(4, int0);
      
      classWriter0.visitInnerClass("O>3", "O>3", "java/lang/String", 2);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(96, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(162);
      classWriter0.newMethod("'o</=#PP)eu", "'o</=#PP)eu", "'o</=#PP)eu", false);
      classWriter0.newMethod("'o</=#PPeu", "'o</=#PP)eu", "'o</=#PP)eu", false);
      classWriter0.visitInnerClass("'o</=#PPeu", "", "", (-2154));
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(5);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("JBBe)u><b", true);
      classWriter0.addType("JBBe)u><b");
      classWriter0.addUninitializedType("JBBe)u><b", 1);
      // Undeclared exception!
      try { 
        annotationVisitor0.visit(";`", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ClassWriter@7abc6374
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.visitOuterClass("", (String) null, "");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(166);
      int int0 = classWriter0.newMethod("'o</=#PP)eu", "'o</=#PP)eu", "'o</=#PP)eu", false);
      assertEquals(4, int0);
      
      int int1 = classWriter0.newMethod("'o</=#PPeu", "'o</=#PP)eu", "'o</=#PP)eu", false);
      assertEquals(7, int1);
      
      classWriter0.visitSource("", "5q.w52xRZUPA#^##kLr");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(144, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector();
      ClassWriter classWriter0 = new ClassWriter((-913));
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 267386880);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "org.mockito.asm.Type";
      classWriter0.visit(2454, (-913), "P<0F'.,Wzrt=f", "-}g-FP90gxyL*-", "", stringArray0);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        annotationWriter0.visit("?P$}kDyr_/", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ClassWriter@2c228ee
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-913));
      classWriter0.visitSource("org.mockito.asm.Type", "org.mockito.asm.Type");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(117, byteArray0.length);
      
      classWriter0.newConst(" M6v+Em4[2,}n)");
      int int0 = classWriter0.newConst(" M6v+Em4[2,}n)");
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(5);
      Boolean boolean0 = Boolean.valueOf("JBBe)u><b");
      classWriter0.newConst(boolean0);
      Item item0 = classWriter0.newFieldItem("JBBe)u><b", "JBBe)u><b", "JBBe)u><b");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(166);
      int int0 = classWriter0.newMethod("'o</=#PP)eu", "'o</=#PP)eu", "'o</=#PP)eu", true);
      assertEquals(4, int0);
      
      classWriter0.visitAnnotation("'o</=#PP)eu", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(91, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(23);
      ByteVector byteVector0 = new ByteVector();
      classWriter0.visitSource("", "JBBe)u><b");
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, (ByteVector) null, 23);
      classWriter0.toByteArray();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        annotationWriter0.visit("|SFG6oBmS|;_mFsz", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@3c123c49
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(5);
      classWriter0.visitAnnotation("JBBe)u><b", false);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newFieldItem("JBBe)u><b", "JBBe)u><b", "JBBe)u><b");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(67);
      classWriter0.newMethod("MX2WE(W@G~KFJj59Z", "MX2WE(W@G~KFJj59Z", "MX2WE(W@G~KFJj59Z", true);
      classWriter0.visitAnnotation("MX2WE(W@G~KFJj59Z", true);
      int int0 = classWriter0.newMethod("MX2WE(W@G~KFJj59Z", "MX2WE(W@G~KFJj59Z", "MX2WE(W@G~KFJj59Z", false);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(67);
      classWriter0.newMethod("MX2WE(W@G~KFJj59Z", "MX2WE(W@G~KFJj59Z", "MX2WE(W@G~KFJj59Z", true);
      int int0 = classWriter0.newMethod("MX2WE(W@G~KFJj59Z", "MX2WE(W@G~KFJj59Z", "MX2WE(W@G~KFJj59Z", false);
      assertEquals(5, int0);
      
      classWriter0.visitAnnotation("MX2WE(W@G~KFJj59Z", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(105, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(5);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "JBBe)W><b";
      classWriter0.visit(5, (-1838), "Nt'v@e\f+rwOb", "Synthetic", "Synthetic", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(119, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(5);
      ByteVector byteVector0 = classWriter0.pool;
      classWriter0.addType("JBBe)u><b");
      classWriter0.addType("JBBe)u><b");
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 17);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("fN", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ClassWriter@192e3043
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(162);
      classWriter0.newFloat(162);
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(72, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(162);
      Type type0 = Type.CHAR_TYPE;
      int int0 = classWriter0.newConst(type0);
      assertEquals(2, int0);
      
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(74, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(14);
      classWriter0.visitAnnotation("JBBe)u><b", false);
      Short short0 = new Short((short)658);
      int int0 = classWriter0.newConst(short0);
      assertEquals(2, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(83, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-913));
      classWriter0.addType("a]O>");
      int int0 = classWriter0.addType("a]O>");
      assertEquals(1, int0);
      
      classWriter0.visitAnnotation("JBBe)u><b", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(76, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(166);
      classWriter0.visitOuterClass("", "'o</=#PP)eu", "'o</=#PP)eu");
      Type type0 = Type.BYTE_TYPE;
      int int0 = classWriter0.newConst(type0);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(5);
      Type type0 = Type.getType("Deprecated");
      classWriter0.newConstItem(type0);
      classWriter0.visitSource("JBBe)u><b", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(93, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(5);
      classWriter0.visitSource("char", "1G");
      int int0 = classWriter0.addType("JBBe)u><b");
      assertEquals(1, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(83, byteArray0.length);
      
      int int1 = classWriter0.addType("JBBe)u><b");
      assertEquals(1, int1);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(5);
      classWriter0.visitAnnotation("JBBe)u><b", true);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(1, 1);
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
      ClassWriter classWriter0 = new ClassWriter(162);
      classWriter0.newMethod("'o</=#PP)eu", "'o</=#PP)eu", "'o</=#PP)eu", false);
      int int0 = classWriter0.newMethod("'o</=#PP)eu", "'o</=#PP)eu", "'o</=#PP)eu", false);
      assertEquals(4, int0);
      
      classWriter0.visitAnnotation("'o</=#PP)eu", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(91, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(5);
      classWriter0.visitAnnotation("JBBe)u><b", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(76, byteArray0.length);
      
      Byte byte0 = new Byte((byte) (-120));
      int int0 = classWriter0.newConst(byte0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(162);
      Boolean boolean0 = Boolean.valueOf(true);
      classWriter0.newConstItem(boolean0);
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(72, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-6));
      classWriter0.newFloat((-6));
      classWriter0.newFloat((-6));
      classWriter0.visitInnerClass((String) null, (String) null, (String) null, (-6));
      classWriter0.visitInnerClass((String) null, "o6W<51g", "o6W<51g", (byte)83);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-6));
      classWriter0.newFloat((-6));
      classWriter0.newFloat((-6));
      classWriter0.visitInnerClass("", "", "", (-6));
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(162);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("", false);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("", (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value null
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(23);
      Type type0 = Type.getReturnType("|SFG6oBmS|;_mFsz");
      int int0 = classWriter0.newConst(type0);
      assertEquals(2, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(40, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(5);
      classWriter0.newFieldItem("JBBe)u><b", "JBBe)u><b", "JBBe)u><b");
      classWriter0.visitSource("JBBe)u><b", "J+9f2MmBCx2%qzb[r");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(116, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(162);
      int int0 = classWriter0.newConst("'o</=#PPeu");
      assertEquals(2, int0);
      
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "'o</=#PPeu";
      stringArray0[2] = "";
      classWriter0.visit((byte)13, 2643, "", "", "'o</=#PP)eu", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(92, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(162);
      classWriter0.visitInnerClass("'o</=#PP)eu", "S2is+|q:4=B&R[|/6Q", "S2is+|q:4=B&R[|/6Q", 162);
      classWriter0.newMethod("'o</=#PP)eu", "'o</=#PP)eu", "'o</=#PP)eu", false);
      int int0 = classWriter0.newMethod("'o</=#PP)eu", "'o</=#PP)eu", "'o</=#PP)eu", false);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(162);
      Type type0 = Type.CHAR_TYPE;
      int int0 = classWriter0.newConst(type0);
      assertEquals(2, int0);
      
      classWriter0.visitAnnotation("", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(76, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(5);
      classWriter0.visitAnnotation("JBBe)u><b", true);
      classWriter0.addType("JBBe)u><b");
      int int0 = classWriter0.addUninitializedType("JBBe)u><b", 1);
      assertEquals(2, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(76, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(23);
      classWriter0.visitInnerClass("Label offset position has not been resolved yet", "JBBe)u><b", "JBBe)u><b", 25165824);
      Type type0 = Type.FLOAT_TYPE;
      int int0 = classWriter0.newConst(type0);
      assertEquals(6, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(130, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(5);
      classWriter0.addType("JBBe)u><b");
      int int0 = classWriter0.addUninitializedType("JBBe)u><b", 1);
      assertEquals(2, int0);
      
      classWriter0.visitSource("GIfH}^.c", "Label offset position has not been resolved yet");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(133, byteArray0.length);
  }
}
