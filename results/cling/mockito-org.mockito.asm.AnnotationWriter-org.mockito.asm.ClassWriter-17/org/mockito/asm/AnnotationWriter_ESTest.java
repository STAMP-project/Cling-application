/*

 * Tue Mar 03 14:28:49 GMT 2020
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
      ClassWriter classWriter0 = new ClassWriter((-1971));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1971), "u@px;5KuZe9", "u@px;5KuZe9", "u@px;5KuZe9", "u@px;5KuZe9");
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 1, "u@px;5KuZe9", "u@px;5KuZe9", "u@px;5KuZe9", "u@px;5KuZe9");
      classWriter0.visitAnnotation("Exceptions", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(209, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-202));
      classWriter0.newMethodItem("Z", "|", "Z", true);
      classWriter0.newFieldItem("Z", "|", "Z");
      Boolean boolean0 = Boolean.valueOf(false);
      int int0 = classWriter0.newConst(boolean0);
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(40);
      classWriter0.visitSource("oi", "Sourceile");
      classWriter0.toByteArray();
      Byte byte0 = new Byte((byte) (-85));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 10, "Sourceile", "oi", "oi", byte0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-202));
      classWriter0.newFloat(1);
      classWriter0.newFloat(1);
      classWriter0.visitSource("%j3m", (String) null);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-974));
      ByteVector byteVector0 = classWriter0.pool;
      classWriter0.newLong((-2030));
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 1);
      classWriter0.newLong((-2030));
      // Undeclared exception!
      try { 
        annotationWriter0.visit("*@eZ9Pn{?pexh/:>1", annotationWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.AnnotationWriter@dde8afb
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-202));
      classWriter0.newFloat(1);
      classWriter0.visit(2, (-518), "pnD^i?|zr>vS", "&P0\"mSHfqRABK@O#", "e1|:g", (String[]) null);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(134, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2030));
      classWriter0.newFloat(0.0F);
      classWriter0.visit((-2030), (-2030), "[]", "[]", "", (String[]) null);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(82, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-862));
      int int0 = classWriter0.addType("7indFhJ0u@tRC'AqZ[");
      assertEquals(1, int0);
      
      int int1 = classWriter0.addType("7indFhJ0u@tRC'AqZ[");
      assertEquals(1, int1);
      
      classWriter0.visitAnnotation("Q4u,\"TV^8b9", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(80, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-974));
      classWriter0.invalidFrames = true;
      classWriter0.addType("");
      classWriter0.addUninitializedType("", (-2030));
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
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6);
      classWriter0.newInteger(2);
      classWriter0.visit(2, (-713), "O/", "", "a),Xa", (String[]) null);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(108, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-200));
      classWriter0.newFloat(1);
      classWriter0.newFloat(1);
      classWriter0.visit(4, (byte)73, "J,(I9$(NZX", ")V", "TE&3dWHNH", (String[]) null);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(85, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2035));
      classWriter0.visitAnnotation("A*d.!", false);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.getMergedType((-2035), 2131);
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
      ClassWriter classWriter0 = new ClassWriter((-202));
      classWriter0.newMethodItem("Z", "|", "Z", true);
      classWriter0.newFieldItem("Z", "|", "Z");
      classWriter0.visitInnerClass((String) null, "Deu:8WlV", "", 29);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-202));
      classWriter0.visitSource("", (String) null);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newMethodItem("b<|''5Q9g]q0ssK\"9S", "", "", false);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2035));
      ByteVector byteVector0 = classWriter0.pool;
      Item item0 = classWriter0.newLong((-2035));
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 1);
      classWriter0.newDouble((-1L));
      // Undeclared exception!
      try { 
        annotationWriter0.visit("2tWCs[y6", item0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.Item@70198dac
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-974));
      classWriter0.newLong((-2030));
      classWriter0.newLong((-2030));
      classWriter0.visitAnnotation("", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(78, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(285212675);
      Boolean boolean0 = Boolean.TRUE;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 10, "YkLjZg", "doub#e", "YkLjZg", boolean0);
      classWriter0.visitAnnotation("Kv5K@cF", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(152, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-202));
      classWriter0.visitSource(")V", "&P0\"mSHfqRABK@O#");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(95, byteArray0.length);
      
      Character character0 = new Character('=');
      int int0 = classWriter0.newConst(character0);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(102);
      Type type0 = Type.SHORT_TYPE;
      classWriter0.newConst(type0);
      // Undeclared exception!
      try { 
        classWriter0.getMergedType((byte)98, 19);
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
      ClassWriter classWriter0 = new ClassWriter(285212675);
      Type type0 = Type.INT_TYPE;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 7, "YkLjR[", "YkLjR[", "YkLjR[", type0);
      classWriter0.visitInnerClass("MRDP*2?h(qfVg", "StackMap", "StackMap", (-3046));
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(156, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16);
      classWriter0.addType("oi");
      int int0 = classWriter0.addUninitializedType("oi", 16);
      assertEquals(2, int0);
      
      classWriter0.visitAnnotation("Q4u,\"TV^8b9", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(80, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-202));
      classWriter0.visitAnnotation("", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(69, byteArray0.length);
      
      Boolean boolean0 = Boolean.valueOf(false);
      int int0 = classWriter0.newConst(boolean0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-202));
      classWriter0.newMethodItem("Z", "|", "Z", true);
      classWriter0.newFieldItem("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "|", "Z");
      classWriter0.visitSource("", "");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-202));
      classWriter0.newMethodItem("X", "|", "", true);
      classWriter0.newFieldItem("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "|", "");
      classWriter0.visitSource("%j3m", (String) null);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(285212675);
      ByteVector byteVector0 = new ByteVector();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 285212675);
      Short short0 = new Short((short) (-554));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "voiad", "voiad", "voiad", short0);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("voiad", false);
      classWriter0.toByteArray();
      annotationWriter0.visit("EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE", short0);
      assertFalse(annotationWriter0.equals((Object)annotationVisitor0));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-202));
      classWriter0.newFloat(1);
      classWriter0.newFloat(1);
      Boolean boolean0 = Boolean.valueOf(true);
      int int0 = classWriter0.newConst(boolean0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1971));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1971), "u@px;5KuZe9", "u@px;5KuZe9", "u@px;5KuZe9", "u@px;5KuZe9");
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 1, "u@px;5KuZe9", "u@px;5KuZe9", "u@px;5KuZe9", "u@px;5KuZe9");
      classWriter0.visitAnnotation("EnclosingMethod", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(212, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(128);
      classWriter0.getCommonSuperClass("java/lang/Object", "java/lang/Object");
      classWriter0.visitAnnotation("AnnotationDefault", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(84, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16);
      classWriter0.newLong(16);
      classWriter0.visit(2, (-713), "O/", "", "a),Xa", (String[]) null);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(112, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2035));
      classWriter0.newLong((-2035));
      classWriter0.visit((-2035), (-2035), "QwZCcu[%s@SRO)zL8ma", "O/", "QwZCcu[%s@SRO)zL8ma", (String[]) null);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(102, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(285212675);
      classWriter0.newMethodItem("", "SourceDebugExtension", "", false);
      Byte byte0 = new Byte((byte)73);
      int int0 = classWriter0.newConst(byte0);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-202));
      classWriter0.newMethodItem("", "|", "", true);
      classWriter0.newFieldItem("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "|", "");
      classWriter0.visit(1, 4, "", "", "|", (String[]) null);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(298, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(40);
      classWriter0.newDouble(0.75);
      classWriter0.visitAnnotation("oi", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(80, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2035));
      classWriter0.newLong((-2035));
      classWriter0.visitSource("<jesSu<~MI,)N", "gYxF+3msR&[@F5O7");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(115, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-193));
      classWriter0.newLong((-193));
      classWriter0.invalidFrames = false;
      classWriter0.newLong((-193));
      classWriter0.invalidFrames = true;
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
  public void test35()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-974));
      classWriter0.newLong((-2030));
      classWriter0.newLong((-2030));
      classWriter0.visitAnnotation("tmw'@Mq|V.aK9`", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(90, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-202));
      classWriter0.visitAnnotation("[]", false);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newMethodItem("b<|''5Q9g]q0ssK\"9S", "", "", false);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-202));
      classWriter0.visitOuterClass("Label offset position has not been resolved yet", "Label offset position has not been resolved yet", "Label offset position has not been resolved yet");
      Item item0 = classWriter0.newFloat(1);
      Item item1 = classWriter0.newFloat(1);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-202));
      classWriter0.visitAnnotation("|", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(68, byteArray0.length);
      
      Boolean boolean0 = Boolean.valueOf(false);
      int int0 = classWriter0.newConst(boolean0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(40);
      int int0 = classWriter0.addType("void");
      assertEquals(1, int0);
      
      classWriter0.visitInnerClass("void", "", "", 40);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(71, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-202));
      Boolean boolean0 = Boolean.valueOf(true);
      int int0 = classWriter0.newConst(boolean0);
      assertEquals(1, int0);
      
      classWriter0.visitAnnotation(")V", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(74, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-200));
      classWriter0.newFloat(1);
      classWriter0.newFloat(1);
      classWriter0.visitAnnotation("TE&3dWHNH", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(83, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-974));
      ByteVector byteVector0 = classWriter0.pool;
      classWriter0.visitOuterClass("", (String) null, "}RO=P");
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, (-2038));
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

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(102);
      Type type0 = Type.SHORT_TYPE;
      int int0 = classWriter0.newConst(type0);
      assertEquals(2, int0);
      
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(74, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(285212675);
      ByteVector byteVector0 = new ByteVector();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 285212675);
      Short short0 = new Short((short) (-554));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "voiad", "voiad", "voiad", short0);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("voiad", true);
      classWriter0.toByteArray();
      annotationWriter0.visit("EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE", short0);
      assertFalse(annotationWriter0.equals((Object)annotationVisitor0));
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-202));
      classWriter0.newMethodItem("Z", "|", "Z", true);
      classWriter0.newFieldItem("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "|", "Z");
      classWriter0.invalidFrames = true;
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
  public void test46()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-202));
      classWriter0.visitAnnotation(")V", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(69, byteArray0.length);
      
      Character character0 = new Character('=');
      int int0 = classWriter0.newConst(character0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2035));
      classWriter0.visitAnnotation("O{op6n\"vqkW%i", true);
      classWriter0.newDouble((-1L));
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(89, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-202));
      Item item0 = classWriter0.newMethodItem("", "boolean", "", true);
      classWriter0.visitInnerClass("uCTWglA", "boolean", (String) null, 256);
      Item item1 = classWriter0.newFieldItem("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "boolean", "");
      assertNotSame(item1, item0);
      assertNotNull(item1);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-202));
      classWriter0.newMethodItem("9GPEVJ?^~PO(", "|", "9GPEVJ?^~PO(", true);
      classWriter0.newFieldItem("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "|", "9GPEVJ?^~PO(");
      classWriter0.visitInnerClass("void", (String) null, "' )!%hN(", (-1454));
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-202));
      classWriter0.newMethodItem("X", "|", "", true);
      classWriter0.newFieldItem("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "|", "");
      classWriter0.visitOuterClass("", "", "|");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16);
      classWriter0.addType("oi");
      classWriter0.addUninitializedType("oi", 16);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("Q4u,\"TV^8b9", false);
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("oi", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ClassWriter@50542423
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(102);
      Type type0 = Type.SHORT_TYPE;
      int int0 = classWriter0.newConst(type0);
      assertEquals(2, int0);
      
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      stringArray0[1] = "java/lang/Object";
      stringArray0[2] = "";
      stringArray0[3] = "_t moW*p2JQfK";
      stringArray0[4] = "java/lang/Object";
      stringArray0[5] = "java/lang/Object";
      classWriter0.visit((-2522), 0, "", "java/lang/Object", "", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(110, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(285212675);
      classWriter0.newFieldItem("voiad", "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE", "double");
      classWriter0.visit(285212675, (short) (-554), "", "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE", "QwZCcu[%s@SRO)zL8ma", (String[]) null);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(347, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3900));
      classWriter0.newFieldItem("org.mockito.asm.ClassReader", "=ZScM{;4 ", "org.mockito.asm.ClassReader");
      classWriter0.visit((-3900), (-3900), "O/", "org.mockito.asm.ClassReader", "org.mockito.asm.ClassReader", (String[]) null);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(127, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2035));
      ByteVector byteVector0 = classWriter0.pool;
      Short short0 = new Short((short) (-590));
      Item item0 = classWriter0.newConstItem(short0);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 1);
      classWriter0.visit((-2035), (-2035), "QwZCcu[%s@SRO)zL8ma", "O/", "QwZCcu[%s@SRO)zL8ma", (String[]) null);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        annotationWriter0.visit("2tWCs[y6", item0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.Item@62f5d84d
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(102);
      classWriter0.toByteArray();
      String string0 = classWriter0.getCommonSuperClass("java/lang/Object", "java/lang/Object");
      assertEquals("java/lang/Object", string0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-178));
      classWriter0.visitSource(")V", "&P0\"mHfqRABK@O#");
      classWriter0.toByteArray();
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1527), "", "YkLjR[", "*| s*eKPg{w)qIz\"]K8", ")f%+U}7HN7");
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3900));
      classWriter0.newMethodItem("org.mockito.asm.ClassReader", "org.mockito.asm.ClassReader", "=ZScM{;4 ", false);
      classWriter0.visitAnnotation("3j@7A4vwN0M9", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(135, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-202));
      ByteVector byteVector0 = classWriter0.pool;
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, (byte)73);
      classWriter0.visitSource(")V", "&P0\"mSHfqRABK@O#");
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        annotationWriter0.visit("Z,d+B4ip`uUT3X77?ra", byteVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ByteVector@33d4f13c
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-202));
      classWriter0.newMethodItem("Z", "|", "Z", true);
      classWriter0.newFieldItem("Z", "|", "Z");
      classWriter0.visitAnnotation("", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(95, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-202));
      classWriter0.newMethodItem("Z", "|", "Z", true);
      classWriter0.newFieldItem("Z", "|", "Z");
      classWriter0.visitAnnotation("|", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(90, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-202));
      ByteVector byteVector0 = new ByteVector();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 1);
      classWriter0.visitInnerClass("void", (String) null, "' )!%hN(", (-1454));
      // Undeclared exception!
      try { 
        annotationWriter0.visit("EnclosingMethod", (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value null
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-862));
      ByteVector byteVector0 = classWriter0.pool;
      classWriter0.addType("7indFhJ0u@tRC'AqZ[");
      classWriter0.addType("7indFhJ0u@tRC'AqZ[");
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 2);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("a6", (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value null
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-202));
      classWriter0.newFloat(1);
      classWriter0.newFloat(1);
      classWriter0.visitAnnotation(")V", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(74, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(40);
      classWriter0.visitSource("oi", "Sourceile");
      classWriter0.toByteArray();
      Short short0 = new Short((short)48);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "v-eU$3.k+z`K64fC]hn", "\n=^5bjjy4_1", "v-eU$3.k+z`K64fC]hn", short0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2034));
      classWriter0.visitOuterClass("", "wt\"(", "");
      Type type0 = Type.INT_TYPE;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "^/o", "", "L8X=+$/ 4c=%", type0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(285212675);
      classWriter0.visitOuterClass("", ".s.IFJDCS", (String) null);
      Type type0 = Type.DOUBLE_TYPE;
      int int0 = classWriter0.newConst(type0);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(285212675);
      classWriter0.visitInnerClass("voiad", "double", (String) null, 172);
      Short short0 = new Short((short) (-554));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "voiad", "voiad", "voiad", short0);
      classWriter0.visitInnerClass("j+P3g0o", "j+P3g0o", "j+P3g0o", (short) (-554));
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(40);
      classWriter0.visitSource("oi", "SourceFile");
      classWriter0.toByteArray();
      Type type0 = Type.BYTE_TYPE;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-796), "Q4u,\"TV^8b9", "Q4u,\"TV^8b9", "Q4u,\"TV^8b9", type0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-862));
      int int0 = classWriter0.addType("7indFhJ0u@tRC'AqZ[");
      int int1 = classWriter0.addType("7indFhJ0u@tRC'AqZ[");
      assertTrue(int1 == int0);
      assertEquals(1, int1);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(24, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2035));
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.getMergedType((-2035), 2131);
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
      ClassWriter classWriter0 = new ClassWriter((-202));
      Item item0 = classWriter0.newFloat(1);
      Item item1 = classWriter0.newFloat(1);
      assertSame(item1, item0);
      
      classWriter0.visitSource(")V", "&P0\"mSHfqRABK@O#");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(100, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(40);
      classWriter0.visitAnnotation("Deprecated", true);
      classWriter0.toByteArray();
      Byte byte0 = new Byte((byte) (-85));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 10, "Sourceile", "oi", "oi", byte0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(40);
      Item item0 = classWriter0.newFieldItem("void", "void", "void");
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("", false);
      classWriter0.visitAnnotation("Deprecated", true);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("*f+_1__wjM", item0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.Item@76a60d02
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(40);
      Item item0 = classWriter0.newFieldItem("void", "void", "void");
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("", false);
      classWriter0.visitInnerClass("void", "", "", 40);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("*f+_1__wjM", item0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.Item@2ee786ac
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-202));
      classWriter0.newFloat(1);
      classWriter0.newFloat(1);
      classWriter0.visitInnerClass((String) null, "D8WlV", "", 29);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-202));
      classWriter0.newFloat(1);
      classWriter0.newFloat(1);
      classWriter0.visitInnerClass("", "", "", 1143);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-202));
      Type type0 = Type.CHAR_TYPE;
      int int0 = classWriter0.newConst(type0);
      assertEquals(2, int0);
      
      classWriter0.visitAnnotation("u@px;5KuZe9", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(87, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-202));
      classWriter0.visitSource("", (String) null);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newFieldItem(")V", "", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6);
      ByteVector byteVector0 = classWriter0.pool;
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 6);
      classWriter0.visit(2, (-713), "O/", "", "a),Xa", (String[]) null);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        annotationWriter0.visit((String) null, byteVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ByteVector@51fd2c4e
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16);
      int int0 = classWriter0.addType("oi");
      assertEquals(1, int0);
      
      classWriter0.addUninitializedType("oi", 16);
      classWriter0.visitAnnotation("Q4u,\"TV^8b9", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(78, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(102);
      Type type0 = Type.SHORT_TYPE;
      classWriter0.newConst(type0);
      String string0 = classWriter0.getCommonSuperClass("java/lang/Object", "java/lang/Object");
      assertEquals("java/lang/Object", string0);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-202));
      ByteVector byteVector0 = new ByteVector(2);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 2);
      classWriter0.visitInnerClass((String) null, "Deu:8WlV", "", 29);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("", (Object) null);
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
      ClassWriter classWriter0 = new ClassWriter((-202));
      classWriter0.visitInnerClass(" 4)}+!t%", "", (String) null, (-202));
      ByteVector byteVector0 = classWriter0.pool;
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, (-1896));
      // Undeclared exception!
      try { 
        annotationWriter0.visit("", (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value null
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(40);
      classWriter0.visitSource("oi", "SourceFile");
      int int0 = classWriter0.addType("oi");
      assertEquals(1, int0);
      
      int int1 = classWriter0.addUninitializedType("oi", (-389));
      assertEquals(2, int1);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(89, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-202));
      Boolean boolean0 = Boolean.valueOf(true);
      int int0 = classWriter0.newConst(boolean0);
      assertEquals(1, int0);
      
      classWriter0.visitSource(")V", "&P0\"mSHfqRABK@O#");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(100, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2048));
      ByteVector byteVector0 = classWriter0.pool;
      classWriter0.visitSource((String) null, (String) null);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 1);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("", byteVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ByteVector@756db0af
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }
}
