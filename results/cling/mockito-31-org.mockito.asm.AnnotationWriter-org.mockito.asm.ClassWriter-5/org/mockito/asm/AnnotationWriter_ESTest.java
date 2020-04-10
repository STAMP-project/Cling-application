/*

 * Tue Mar 03 14:25:37 GMT 2020
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
import org.mockito.asm.ClassAdapter;
import org.mockito.asm.ClassReader;
import org.mockito.asm.ClassVisitor;
import org.mockito.asm.ClassWriter;
import org.mockito.asm.Item;
import org.mockito.asm.Type;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AnnotationWriter_ESTest extends AnnotationWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-67));
      Short short0 = new Short((short) (-2745));
      int int0 = classWriter0.newConst(short0);
      assertEquals(1, int0);
      
      classWriter0.visitAnnotation("LwjN-%h8<7", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(82, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(41);
      classWriter0.addUninitializedType("A9DtqfRWZ'", 41);
      classWriter0.addUninitializedType("A9DtqfRWZ'", 41);
      classWriter0.visitInnerClass((String) null, "wC", (String) null, 166);
      classWriter0.visitInnerClass("StackMapTable", "StackMapTable", "StackMapTable", 1);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-67));
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("LwjN-%h8<7", true);
      classWriter0.newLong(1);
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("LwjN-%h8<7", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ClassWriter@4f5c434
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-77));
      classWriter0.invalidFrames = true;
      classWriter0.visitAnnotation("LwjN-%hB8<7", true);
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
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-67));
      classWriter0.visitAnnotation("LwjN-%h8<7", false);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.getMergedType((-67), 512);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-77));
      classWriter0.visitSource("|q_T@]?:s?)JA", "|q_T@]?:s?)JA");
      classWriter0.toByteArray();
      Item item0 = classWriter0.newMethodItem("0yD(l3u3 rl`i0}N:P", "void", "$%KpZOk+t34aD2", true);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-67));
      classWriter0.visitSource("sDGq(_?W%", "sDGq(_?W%");
      classWriter0.toByteArray();
      Item item0 = classWriter0.newMethodItem("$Rcwfi", "[]", "BQ$=\";dh`S&", false);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(41);
      classWriter0.newConstItem("A9DAtqfRWZ'");
      classWriter0.visitAnnotation("A9DAtqfRWZ'", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(83, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3839);
      classWriter0.newDouble(1.0);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("wC", true);
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("wL3", annotationVisitor0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.AnnotationWriter@ae22ef0
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-67));
      classWriter0.newLong((-2823L));
      classWriter0.visitAnnotation("BUXjd'2#oT0VDv>^IW=", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(97, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-67));
      classWriter0.visitAnnotation("LwjN-%h8<7", false);
      classWriter0.toByteArray();
      Boolean boolean0 = Boolean.valueOf("LwjN-%h8<7");
      Item item0 = classWriter0.newConstItem(boolean0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(41);
      classWriter0.newConstItem("A9DAtqfRWZ'");
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(1, 41);
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
      ClassWriter classWriter0 = new ClassWriter((-154));
      classWriter0.visitAnnotation("", false);
      classWriter0.visitOuterClass("", "<<<?", "");
      int int0 = classWriter0.newField("", "", "");
      assertEquals(6, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(122, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-67));
      Boolean boolean0 = Boolean.TRUE;
      classWriter0.newConstItem(boolean0);
      classWriter0.visitAnnotation("BUXjd'2#oT0VDv>^IW=", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(93, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-67));
      classWriter0.visitOuterClass("", "", "");
      classWriter0.newField("", "", "");
      classWriter0.visitSource("gcTr~z?\".3@N", "");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-67));
      classWriter0.visitOuterClass("LwjN-%h8<7", ":", "LwjN-%h8<7");
      classWriter0.newField(".Hr!Q{3HgeU!2", ":", "LwjN-%h8<7");
      classWriter0.visitSource("t\"X=C5.(Uy<Q)63v", (String) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3810);
      Short short0 = new Short((short)255);
      classWriter0.newConstItem(short0);
      classWriter0.newInteger((short)255);
      classWriter0.visitAnnotation("", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(74, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-166));
      classWriter0.newFloat((byte) (-1));
      ByteVector byteVector0 = new ByteVector();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 1);
      classWriter0.newFloat((byte) (-1));
      // Undeclared exception!
      try { 
        annotationWriter0.visit("^N`qYcL%fX", byteVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ByteVector@9ae2d1a
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(19);
      classWriter0.addUninitializedType("A9DAtqfRWZ'", 19);
      classWriter0.addUninitializedType("A9DAtqfRWZ'", 19);
      classWriter0.visitSource((String) null, "A9DAtqfRWZ'");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-67));
      classWriter0.newConstItem("SourceDebugExtension");
      int int0 = classWriter0.newConst("SourceDebugExtension");
      assertEquals(2, int0);
      
      classWriter0.visitAnnotation("Synthetic", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(102, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-67));
      classWriter0.visitSource("", "");
      classWriter0.toByteArray();
      classWriter0.visitInnerClass("", "", "", 0);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(41);
      classWriter0.newMethodItem("A9DAtqfRWZ'", "A9DAtqfRWZ'", "A9DAtqfRWZ'", false);
      Class<String> class0 = String.class;
      Type type0 = Type.getType(class0);
      int int0 = classWriter0.newConst(type0);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-67));
      classWriter0.visitSource("java/lang/Object", "LwjN-%h8<7");
      classWriter0.toByteArray();
      Item item0 = classWriter0.newDouble(0.0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-67));
      classWriter0.visitAnnotation("LwjN-%h8<7", false);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newDouble(0.0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-67));
      classWriter0.newLong((-2823L));
      classWriter0.visitSource("double", "_y");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(94, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Character character0 = new Character(':');
      ClassWriter classWriter0 = new ClassWriter(':');
      int int0 = classWriter0.newConst(character0);
      assertEquals(1, int0);
      
      classWriter0.visitAnnotation("AnnotationDefault", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(91, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-67));
      classWriter0.visitAnnotation("LwjN-%h8<7", true);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newLong(1);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-154));
      classWriter0.visitAnnotation("", false);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newMethodItem("0DJDzbOpG w9xGDaa![", "", "", true);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-67));
      classWriter0.newFloat((short)5053);
      classWriter0.newFloat((short)5053);
      classWriter0.visitOuterClass("Exceptions", "Exceptions", "");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-154));
      classWriter0.newFloat((byte) (-1));
      classWriter0.newFloat((byte) (-1));
      classWriter0.visitOuterClass("", "Signature", (String) null);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-67));
      Boolean boolean0 = Boolean.TRUE;
      classWriter0.newConstItem(boolean0);
      classWriter0.visitAnnotation("LjN-h8<'7", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(81, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-67));
      classWriter0.visitInnerClass("Deprecated", "LwjN-%h8<7", "LwjN-%h8<7", 24);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(87, byteArray0.length);
      
      int int0 = classWriter0.addType("c5h0T%");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-67));
      Boolean boolean0 = Boolean.valueOf("qD|fYtCzx%m<");
      classWriter0.visitField((-67), ".class", "qD|fYtCzx%m<", "Code", boolean0);
      classWriter0.visitAnnotation("()T{;oz}ZoR", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(203, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-67));
      classWriter0.visitSource("java/lang/Object", "LwjN-%h8<7");
      Boolean boolean0 = Boolean.valueOf("LwjN-%h8<7");
      classWriter0.newConstItem(boolean0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(108, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-154));
      classWriter0.visitAnnotation("", false);
      classWriter0.newFloat((byte) (-1));
      classWriter0.newFloat((byte) (-1));
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(74, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-67));
      classWriter0.visitSource("sDGq(_?W%", "sDGq(_?W%");
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.getMergedType((-609), 384);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-80));
      Type type0 = Type.INT_TYPE;
      classWriter0.newConstItem(type0);
      classWriter0.visitSource((String) null, (String) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-67));
      classWriter0.visitAnnotation("LwjN-%h8<7", true);
      classWriter0.toByteArray();
      Type type0 = Type.INT_TYPE;
      Item item0 = classWriter0.newConstItem(type0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-67));
      ByteVector byteVector0 = classWriter0.pool;
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, (-67));
      classWriter0.toByteArray();
      Character character0 = new Character('Z');
      annotationWriter0.visit("LwjN-7h7<7", character0);
      annotationWriter0.visit("LwjN-7h7<7", character0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-77));
      Item item0 = classWriter0.newConstItem("LwjN-%h8<7");
      assertNotNull(item0);
      
      Item item1 = classWriter0.newMethodItem("0yD(l3u3 rl`i0}N:P", "void", "$%KpZOk+t34aD2", true);
      assertNotNull(item1);
      assertNotSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(19);
      int int0 = classWriter0.addUninitializedType("A9DAtqfRWZ'", 19);
      assertEquals(1, int0);
      
      int int1 = classWriter0.addUninitializedType("A9DAtqfRWZ'", 19);
      assertEquals(1, int1);
      
      classWriter0.visitSource("A9DAtqfRWZ'", "|q_T@]?:s?)JA");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(101, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(41);
      classWriter0.addUninitializedType("A9DAtqfRWZ'", 41);
      int int0 = classWriter0.addUninitializedType("A9DAtqfRWZ'", 41);
      assertEquals(1, int0);
      
      classWriter0.visitAnnotation("A9DAtqfRWZ'", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(78, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-67));
      classWriter0.visitInnerClass("Deprecated", "LwjN-%h8<7", "LwjN-%h8<7", 24);
      classWriter0.visitAnnotation("()T{;oz}ZoR", true);
      classWriter0.toByteArray();
      classWriter0.visitOuterClass("Deprecated", "", "LwjN-%h8<7");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-67));
      Byte byte0 = new Byte((byte)54);
      int int0 = classWriter0.newConst(byte0);
      assertEquals(1, int0);
      
      classWriter0.visitAnnotation("", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(74, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(41);
      classWriter0.addUninitializedType("A9DtqfRWZ'", 41);
      int int0 = classWriter0.addUninitializedType("A9DtqfRWZ'", 41);
      assertEquals(1, int0);
      
      classWriter0.visitInnerClass((String) null, "wC", (String) null, 166);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(63, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-67));
      classWriter0.newMethodItem("Signature", "xSzE:mg}VpZWjC", "xSzE:mg}VpZWjC", false);
      classWriter0.visitAnnotation("RuntimeInvisibleParameterAnnotations", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(147, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3839);
      classWriter0.visitInnerClass("wC", "wC", "wC", 101);
      Type type0 = Type.INT_TYPE;
      int int0 = classWriter0.newConst(type0);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-67));
      Character character0 = new Character('y');
      int int0 = classWriter0.newConst(character0);
      assertEquals(1, int0);
      
      classWriter0.visitAnnotation("LwjN-%h8<7", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(82, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3839);
      classWriter0.newDouble(1.0);
      classWriter0.visitAnnotation("wC", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(78, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-67));
      classWriter0.visitInnerClass("LwjN-%h8<7", "LwjN-%h8<7", "LwjN-%h8<7", 47);
      classWriter0.visitOuterClass("LwjN-%h8<7", "", "LwjN-%h8<7");
      int int0 = classWriter0.newField(".Hr!Q{3HgeU!2", "", "LwjN-%h8<7");
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-67));
      ByteVector byteVector0 = classWriter0.pool;
      Boolean boolean0 = Boolean.valueOf("qD|fYtCzx%m<");
      classWriter0.visitField((-67), ".class", "qD|fYtCzx%m<", "Code", boolean0);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 1);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        annotationWriter0.visit("Deprecated", (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value null
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-67));
      classWriter0.addType("LwjN-%h8<7");
      int int0 = classWriter0.newConst("LwjN-%h8<7");
      int int1 = classWriter0.addType("org.mockito.asm.MethodWriter");
      assertTrue(int1 == int0);
      assertEquals(2, int1);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(41);
      classWriter0.addUninitializedType("A9DAtqfRWZ'", 41);
      classWriter0.addUninitializedType("A9DAtqfRWZ'", 41);
      classWriter0.visitOuterClass("A9DAtqfRWZ'", (String) null, "");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-154));
      classWriter0.newField("", "", "");
      Type type0 = Type.CHAR_TYPE;
      classWriter0.newConstItem(type0);
      classWriter0.visitOuterClass("<<<?", "", "");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-166));
      classWriter0.visitAnnotation("LwjN-%h8<7", true);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newMethodItem("xSzE:mg}VpZWjC", "k", "64nX?/lWDrg2[O#", true);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector();
      ClassWriter classWriter0 = new ClassWriter(19);
      Item item0 = classWriter0.newFloat((-418.46368F));
      classWriter0.visitSource("A9DAtqfRWZ'", "|q_T@]?:s?)JA");
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 19);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        annotationWriter0.visit((String) null, item0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.Item@7c67340a
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-154));
      classWriter0.visitAnnotation("", false);
      classWriter0.newField("", "", "");
      classWriter0.toByteArray();
      classWriter0.visitOuterClass("<<<?", "", "");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-67));
      classWriter0.visitAnnotation("LwjN-%h8<7", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(77, byteArray0.length);
      
      classWriter0.visitOuterClass("LwjN-%h8<7", "", "LwjN-%h8<7");
      int int0 = classWriter0.newField(".Hr!Q{3HgeU!2", "", "LwjN-%h8<7");
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-166));
      ByteVector byteVector0 = new ByteVector();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 1);
      classWriter0.visitInnerClass("wC", (String) null, (String) null, 13);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("^N`qYcL%fX", byteVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ByteVector@54d67f48
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(41);
      classWriter0.addUninitializedType("A9DtqfRWZ'", 41);
      classWriter0.addUninitializedType("A9DtqfRWZ'", 41);
      classWriter0.visitOuterClass("A9DtqfRWZ'", "A9DtqfRWZ'", "A9DtqfRWZ'");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-67));
      int int0 = classWriter0.addType("LwjN-%h8<7");
      assertEquals(1, int0);
      
      int int1 = classWriter0.newConst("LwjN-%h8<7");
      assertEquals(2, int1);
      
      int int2 = classWriter0.addType("LwjN-%h8<7");
      assertEquals(1, int2);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-166));
      classWriter0.newFloat((byte) (-1));
      classWriter0.newFloat((byte) (-1));
      classWriter0.visitAnnotation("LwjN-%h8<7", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(82, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-67));
      int int0 = classWriter0.addType("LwjN-%h8<7");
      assertEquals(1, int0);
      
      int int1 = classWriter0.addType("LwjN-%h8<7");
      assertEquals(1, int1);
      
      classWriter0.visitAnnotation("xCz`[,Qew", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(76, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-67));
      classWriter0.visitSource("sDGq(_?W%", "sDGq(_?W%");
      classWriter0.toByteArray();
      Short short0 = new Short((short)4115);
      Item item0 = classWriter0.newConstItem(short0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-67));
      classWriter0.visitOuterClass("P}M9)#Q", "P}M9)#Q", (String) null);
      Type type0 = Type.DOUBLE_TYPE;
      Item item0 = classWriter0.newConstItem(type0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-67));
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("LwjN-7h7<7", true);
      classWriter0.toByteArray();
      Character character0 = new Character('Z');
      annotationVisitor0.visit("LwjN-7h7<7", character0);
      annotationVisitor0.visit("LwjN-7h7<7", character0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-80));
      Type type0 = Type.INT_TYPE;
      classWriter0.newConstItem(type0);
      classWriter0.visitSource("Signature", "java/lang/Object");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(109, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-53));
      classWriter0.visitSource("sDGq(_?W%", "sDGq(_?W%");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(95, byteArray0.length);
      
      int int0 = classWriter0.addType("sDGq(_?W%");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-67));
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(24, byteArray0.length);
      
      classWriter0.addType("LwjN-%h8<7");
      int int0 = classWriter0.addType("LwjN-%h8<7");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(41);
      classWriter0.addUninitializedType("A9DAtqfRWZ'", 41);
      int int0 = classWriter0.addUninitializedType("A9DAtqfRWZ'", 41);
      assertEquals(1, int0);
      
      classWriter0.visitAnnotation("A9DAtqfRWZ'", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(80, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-67));
      classWriter0.visitAnnotation("LjN-h8<'7", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(78, byteArray0.length);
      
      classWriter0.addUninitializedType("LjN-h8<'7", (-67));
      int int0 = classWriter0.addType("OW(");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-67));
      classWriter0.visitAnnotation("LwjN-%h8<7", true);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(1, 251658240);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-67));
      classWriter0.visitAnnotation("LwjN-%h8<7", true);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newMethodItem("Signature", "xSzE:mg}VpZWjC", "xSzE:mg}VpZWjC", false);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-154));
      classWriter0.newFloat((byte) (-1));
      classWriter0.newFloat((byte) (-1));
      classWriter0.visitSource("", "0DJDzbOpG w9xGDaa![");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-166));
      Item item0 = classWriter0.newFloat((byte) (-1));
      classWriter0.visitSource((String) null, (String) null);
      Item item1 = classWriter0.newFloat((byte) (-1));
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-67));
      classWriter0.visitAnnotation("LwjN-%h8<7", true);
      classWriter0.toByteArray();
      Byte byte0 = new Byte((byte) (-57));
      Item item0 = classWriter0.newConstItem(byte0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-67));
      ByteVector byteVector0 = classWriter0.pool;
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 1);
      classWriter0.visitAnnotation("()T{;oz}ZoR", true);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        annotationWriter0.visit("()T{;oz}ZoR", byteVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ByteVector@8515564
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-67));
      ByteVector byteVector0 = classWriter0.pool;
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 1);
      classWriter0.visitInnerClass("Deprecated", "LwjN-%h8<7", "LwjN-%h8<7", 24);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        annotationWriter0.visit("()T{;oz}ZoR", byteVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ByteVector@43d6df03
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-166));
      classWriter0.newFloat((byte) (-1));
      classWriter0.newFloat((byte) (-1));
      classWriter0.visitInnerClass((String) null, "wC", "wC", (byte) (-1));
      classWriter0.visitInnerClass("wC", (String) null, (String) null, 13);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-154));
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("", false);
      classWriter0.toByteArray();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("org.mockito.asm.ClassWriter", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@4c8112f4
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(41);
      Class<String> class0 = String.class;
      Type type0 = Type.getType(class0);
      int int0 = classWriter0.newConst(type0);
      assertEquals(2, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(46, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-67));
      classWriter0.visitSource("sDGq(_?W%", "sDGq(_?W%");
      classWriter0.toByteArray();
      Item item0 = classWriter0.newFieldItem("SourceDebugExtension", "SourceDebugExtension", "SourceDebugExtension");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-154));
      classWriter0.visitAnnotation("", false);
      Type type0 = Type.CHAR_TYPE;
      classWriter0.newConstItem(type0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(76, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-67));
      classWriter0.visitAnnotation("LwjN-%h8<7", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(77, byteArray0.length);
      
      classWriter0.addType("LwjN-%h8<7");
      int int0 = classWriter0.addType("org.mockito.asm.MethodWriter");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-67));
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("LwjN-%h8<7", true);
      classWriter0.visitOuterClass("LwjN-%h8<7", (String) null, (String) null);
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("LwjN-%h8<7", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ClassWriter@2eaa1038
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-67));
      classWriter0.newConstItem("SourceDebugExtension");
      int int0 = classWriter0.newConst("SourceDebugExtension");
      assertEquals(2, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(50, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(19);
      classWriter0.addUninitializedType("", 19);
      classWriter0.visitSource("", "|q_T@]?:s?)JA");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(90, byteArray0.length);
      
      int int0 = classWriter0.addUninitializedType("|q_T@]?:s?)JA", 3);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(19);
      classWriter0.addUninitializedType("A9DAtqfRWZ'", 19);
      classWriter0.addUninitializedType("A9DAtqfRWZ'", 19);
      Item item0 = classWriter0.newConstItem("A9DAtqfRWZ'");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(19);
      classWriter0.newConstItem("A9DAtqfRWZ'");
      classWriter0.visitSource("A9DAtqfRWZ'", "|q_T@]?:s?)JA");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(104, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.mockito.asm.ClassReader");
      ClassWriter classWriter0 = new ClassWriter(1721);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      classReader0.accept((ClassVisitor) classAdapter0, 1723);
      assertEquals(1, ClassReader.SKIP_CODE);
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector();
      ClassWriter classWriter0 = new ClassWriter(41);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 2);
      classWriter0.visitInnerClass((String) null, "wC", (String) null, 166);
      classWriter0.visitInnerClass("StackMapTable", "StackMapTable", "StackMapTable", 1);
      // Undeclared exception!
      try { 
        annotationWriter0.visit((String) null, (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value null
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }
}
