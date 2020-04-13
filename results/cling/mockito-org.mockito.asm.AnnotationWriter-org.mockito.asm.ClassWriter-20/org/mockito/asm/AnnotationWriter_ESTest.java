/*

 * Tue Mar 03 14:30:11 GMT 2020
 */

package org.mockito.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
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
      ClassWriter classWriter0 = new ClassWriter((-1026));
      classWriter0.newDouble(0.0);
      classWriter0.newDouble(0.0);
      classWriter0.visitSource((String) null, "");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1026));
      Short short0 = new Short((short)15);
      int int0 = classWriter0.newConst(short0);
      assertEquals(1, int0);
      
      classWriter0.visitAnnotation("A`8V(E/:Z!Q~h!:\"z", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(89, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-70));
      int int0 = classWriter0.newConst("<zz, F");
      assertEquals(2, int0);
      
      classWriter0.visitField(1585, "<zz, F", "<zz, F", (String) null, "<zz, F");
      classWriter0.visitAnnotation("<zz, F", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(110, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
      Byte byte0 = new Byte((byte) (-21));
      classWriter0.visitField((-1026), "y\":qlWl^x%9sN`h8k+", "!", "]l", byte0);
      classWriter0.visitSource("", "]l");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(203, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1034));
      classWriter0.newLong(1755L);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        classWriter0.visitField(2591, "g)C,:f54J{'[k\"sdZ", "-%", "", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@1f08f4a1
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(37);
      classWriter0.visitAnnotation("iRF.@fe?,", false);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(37, 37);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2462));
      classWriter0.newMethodItem("", "", "", true);
      classWriter0.visitSource("", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(90, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2462));
      classWriter0.newMethodItem("", "", "", false);
      classWriter0.visitSource("", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(90, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2462));
      classWriter0.newMethodItem("", "", "", true);
      classWriter0.newNameType("", "");
      classWriter0.visitSource((String) null, "");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(37);
      classWriter0.visitAnnotation("iRF.@fe?,", false);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newLong((-2331L));
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1026));
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, (ByteVector) null, (ByteVector) null, 1);
      Item[] itemArray0 = new Item[6];
      classWriter0.newDouble(0.0);
      classWriter0.newDouble(0.0);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("", itemArray0[0]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value null
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-20));
      classWriter0.newConstItem("SourceDebugExtension");
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(2, 8);
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
      ClassWriter classWriter0 = new ClassWriter((-1026));
      classWriter0.newFloat((-1026));
      classWriter0.visitSource("", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(82, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2471));
      classWriter0.addType(">Wv>dQSZ3[//}YZ</");
      classWriter0.visitAnnotation("4#=T:SI|G", false);
      int int0 = classWriter0.addType("4#=T:SI|G");
      assertEquals(2, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(78, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1026));
      classWriter0.visitAnnotation("+@rW.KHygg", false);
      classWriter0.toByteArray();
      classWriter0.visitInnerClass("+@rW.KHygg", "+@rW.KHygg", "+@rW.KHygg", 5);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2462));
      Boolean boolean0 = Boolean.valueOf("");
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1), "", "", "", boolean0);
      classWriter0.visitAnnotation("", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(163, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("y\":qlWl^x%9sN`h8k+", true);
      AnnotationVisitor annotationVisitor1 = classWriter0.visitAnnotation("f", false);
      classWriter0.toByteArray();
      Character character0 = Character.valueOf('M');
      annotationVisitor0.visit("yMmTin:a@", character0);
      annotationVisitor0.visit("yMmTin:a@", character0);
      assertNotSame(annotationVisitor0, annotationVisitor1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-70));
      int int0 = classWriter0.newConst("<zz, F");
      assertEquals(2, int0);
      
      classWriter0.visitField(1585, "<zz, F", "<zz, F", (String) null, "<zz, F");
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(111, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2455));
      Short short0 = new Short((short)3090);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2069, "q,-S$KiL=wPdHYl", "q,-S$KiL=wPdHYl", "q,-S$KiL=wPdHYl", short0);
      int int0 = classWriter0.newConst(short0);
      assertEquals(2, int0);
      
      classWriter0.visitSource("{khIFE2\"3q", "oXADY>/q1J%w.(C");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(177, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2462));
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      classWriter0.visit(182, 182, "", "0*_We1~)u8HI,nTfOl", "", stringArray0);
      classWriter0.visitSource("", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(133, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6);
      classWriter0.newConstItem("");
      int int0 = classWriter0.newMethod("-", "-", "", false);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2462));
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      classWriter0.visit((-2), (-2), "", "0*_We1~)u8HI,nTfOl", "", stringArray0);
      classWriter0.newNameType("", "");
      classWriter0.toByteArray();
      Item item0 = classWriter0.newFieldItem("", "", "");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1034));
      classWriter0.newDouble(1);
      classWriter0.newDouble(1);
      classWriter0.visitSource("bT(cNWj", "oXADY>/q1J%w.(C");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(108, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1026));
      classWriter0.visitAnnotation("+@rW.KHygg", false);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newDouble(2);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1026));
      classWriter0.newLong((-1026));
      classWriter0.visitSource("", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(86, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1026));
      classWriter0.visitAnnotation("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", false);
      Character character0 = new Character('F');
      classWriter0.newConstItem(character0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(294, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1026));
      classWriter0.visitAnnotation("", true);
      classWriter0.newLong((-1026));
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(76, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6);
      int int0 = classWriter0.newMethod("w[Gq2cvmwL9!b.", "w[Gq2cvmwL9!b.", "w[Gq2cvmwL9!b.", false);
      assertEquals(4, int0);
      
      classWriter0.visitAnnotation("-", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(100, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2462));
      Boolean boolean0 = Boolean.valueOf("");
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 26, "", "", "", boolean0);
      classWriter0.visitAnnotation("org.mockito.asm.ClassWriter", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(154, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2462));
      classWriter0.visitOuterClass("l4VmrY/Lpre]=;v\"", (String) null, "");
      Item item0 = classWriter0.newDouble(0.0);
      Item item1 = classWriter0.newDouble(0.0);
      assertNotNull(item1);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4));
      classWriter0.visitInnerClass("SourceDebugExtension", "SourceDebugExtension", "void", 1);
      int int0 = classWriter0.addType("SourceDebugExtension");
      assertEquals(1, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(88, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      ClassWriter classWriter0 = new ClassWriter((-1026));
      classWriter0.visitField((-312), "", "", "", boolean0);
      classWriter0.visitAnnotation("double", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(170, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      ClassWriter classWriter0 = new ClassWriter((-1026));
      classWriter0.visitField((-312), "", "", "", boolean0);
      classWriter0.visitSource("LN!Wf$GC6}I", "#s==c{;WYim[O6a(|<1");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(204, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1026));
      classWriter0.newFloat((-1026));
      classWriter0.visitAnnotation("+@rW.KHygg", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(84, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(37);
      classWriter0.visitSource("EnclosingMethod", "oXADY>/q1J%w.()");
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(1, 70);
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
      ClassWriter classWriter0 = new ClassWriter((-2462));
      Type type0 = Type.CHAR_TYPE;
      classWriter0.newConst(type0);
      classWriter0.visitSource("d:]zF5yHRb%r/|", (String) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2462));
      Type type0 = Type.CHAR_TYPE;
      int int0 = classWriter0.newConst(type0);
      assertEquals(2, int0);
      
      classWriter0.visitAnnotation("5<},BQH8KShz", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(86, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1027));
      int int0 = classWriter0.addUninitializedType("bT(cNWj", (-1027));
      assertEquals(1, int0);
      
      classWriter0.visitSource("bT(cNWj", "oC]H");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(88, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1026));
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("", true);
      Character character0 = new Character('F');
      Item item0 = classWriter0.newConstItem(character0);
      assertNotNull(item0);
      
      annotationVisitor0.visit("w", character0);
      ClassWriter classWriter1 = new ClassWriter(555);
      byte[] byteArray0 = classWriter1.toByteArray();
      assertEquals(24, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2462));
      Boolean boolean0 = Boolean.valueOf("");
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 26, "", "", "", boolean0);
      classWriter0.newNameType("", "");
      classWriter0.toByteArray();
      Item item0 = classWriter0.newFieldItem("", "", "");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-20));
      classWriter0.newMethodItem(")IavI6q59p_W6", "#p%,K[?J1aTme", "[]", true);
      Short short0 = new Short((short)802);
      FieldVisitor fieldVisitor0 = classWriter0.visitField(2, "org.mockito.asm.ClassWriter", "SourcDebugExtension", "org.mockito.asm.ClassWriter", short0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(37);
      classWriter0.visitAnnotation("iRF.@f?/", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(75, byteArray0.length);
      
      int int0 = classWriter0.addUninitializedType("1 &_GUXw;;d", 115);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1026));
      classWriter0.visitAnnotation("", true);
      classWriter0.visitOuterClass("", "", "");
      classWriter0.toByteArray();
      Item item0 = classWriter0.newFieldItem("", "", "Q30toABd");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(30);
      classWriter0.visitAnnotation("iRF.@fe?,", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(78, byteArray0.length);
      
      Byte byte0 = new Byte((byte)70);
      int int0 = classWriter0.newConst(byte0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1034));
      classWriter0.newDouble(1);
      classWriter0.newDouble(1);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("Wp", true);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1026));
      classWriter0.newDouble(0.0);
      classWriter0.newDouble(0.0);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("", false);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2462));
      classWriter0.newMethodItem("", "", "", true);
      classWriter0.visitAnnotation("#s==c{;WYim[O6a(|<1", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(104, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(20);
      classWriter0.visitInnerClass("", "", "x\"Q", 25);
      Type type0 = Type.SHORT_TYPE;
      Item item0 = classWriter0.newConstItem(type0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1807));
      classWriter0.visitAnnotation("y\":qlWl^x%9sN`h8k+", true);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newDouble((-1807));
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-20));
      classWriter0.visitInnerClass("SourcDebugExtension", "SourcDebugExtension", "void", 1);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newMethodItem(")IavI6q59p_W6", "#p%,K[?J1aTme", "[]", true);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1026));
      Item item0 = classWriter0.newMethodItem("d:]zF5yHRb%r/|", "d:]zF5yHRb%r/|", "", true);
      classWriter0.visitOuterClass("", "", "");
      Item item1 = classWriter0.newFieldItem("", "d:]zF5yHRb%r/|", "");
      assertNotSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1026));
      Item[] itemArray0 = new Item[1];
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", true);
      classWriter0.typeTable = itemArray0;
      classWriter0.addType("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII");
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", annotationVisitor0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.AnnotationWriter@68e2e736
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2462));
      classWriter0.visitSource("", "");
      classWriter0.newNameType("", "");
      classWriter0.toByteArray();
      Item item0 = classWriter0.newFieldItem("", "", "");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2462));
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      classWriter0.visit(182, 182, "", "0*_We1~)u8HI,nTfOl", "", stringArray0);
      Type type0 = Type.CHAR_TYPE;
      int int0 = classWriter0.newConst(type0);
      assertEquals(5, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(90, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-70));
      Item item0 = classWriter0.newFloat(2);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("<zz, F", true);
      classWriter0.visitOuterClass("RuntimeVisibleAnnotations", "", (String) null);
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("", item0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.Item@4c8cc710
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2420));
      int int0 = classWriter0.newConst("");
      assertEquals(2, int0);
      
      classWriter0.visitSource("*", "*");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(87, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2462));
      classWriter0.newMethodItem("", "", "", false);
      classWriter0.visitAnnotation("#s==c{;WYim[O6a(|<1", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(102, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(37);
      classWriter0.visitAnnotation("iRF.@fe?,", false);
      classWriter0.newNameType("iRF.@fe?,", "iRF.@fe?,");
      classWriter0.toByteArray();
      Item item0 = classWriter0.newFieldItem("", "iRF.@fe?,", "iRF.@fe?,");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2462));
      classWriter0.visitSource("", "");
      classWriter0.toByteArray();
      ByteVector byteVector0 = new ByteVector(285212676);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, (-3661));
      // Undeclared exception!
      try { 
        annotationWriter0.visit("", byteVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ByteVector@50aaf2cc
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2462));
      classWriter0.visitAnnotation("5<},BQH8KShz", true);
      classWriter0.newNameType("", "");
      classWriter0.toByteArray();
      Item item0 = classWriter0.newFieldItem("EnclosingMethod", "", "");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2462));
      Boolean boolean0 = Boolean.valueOf("");
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 26, "", "", "", boolean0);
      Type type0 = Type.CHAR_TYPE;
      int int0 = classWriter0.newConst(type0);
      assertEquals(4, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(91, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1026));
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", true);
      classWriter0.addType("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII");
      classWriter0.addType("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII");
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", annotationVisitor0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.AnnotationWriter@7b65738
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1026));
      classWriter0.newFloat((-1026));
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(72, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1026));
      classWriter0.visitAnnotation("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", true);
      classWriter0.addType("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII");
      int int0 = classWriter0.addType("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII");
      assertEquals(1, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(287, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1026));
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("", true);
      Character character0 = new Character('F');
      Item item0 = classWriter0.newConstItem(character0);
      assertNotNull(item0);
      
      annotationVisitor0.visit("w", character0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(82, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2462));
      Type type0 = Type.CHAR_TYPE;
      int int0 = classWriter0.newConst(type0);
      assertEquals(2, int0);
      
      classWriter0.visitSource("", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(84, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1026));
      int int0 = classWriter0.addType("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII");
      assertEquals(1, int0);
      
      int int1 = classWriter0.addType("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII");
      assertEquals(1, int1);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(24, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(37);
      classWriter0.visitAnnotation("iRF.@f?/", true);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(1, 70);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1026));
      Item[] itemArray0 = new Item[1];
      classWriter0.typeTable = itemArray0;
      int int0 = classWriter0.addType("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII");
      assertEquals(1, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(24, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1026));
      classWriter0.visitAnnotation("", true);
      classWriter0.newMethodItem("d:]zF5yHRb%r/|", "d:]zF5yHRb%r/|", "", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(97, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2462));
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      classWriter0.visit((-2), (-2), "", "0*_We1~)u8HI,nTfOl", "", stringArray0);
      classWriter0.toByteArray();
      ByteVector byteVector0 = new ByteVector(285212676);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, (-3661));
      // Undeclared exception!
      try { 
        annotationWriter0.visit("", byteVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ByteVector@58e3afff
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1026));
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", true);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ClassWriter@1b0112b3
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-20));
      classWriter0.visitInnerClass("SourceDebugExtension", "SourceDebugExtension", "void", 1);
      ByteVector byteVector0 = classWriter0.pool;
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 1);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        annotationWriter0.visit("JFaSL7)WodbckCP&'5", byteVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ByteVector@4a6ad0c7
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1034));
      Item item0 = classWriter0.newDouble(1);
      Item item1 = classWriter0.newDouble(1);
      assertSame(item1, item0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(33, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1026));
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("+@rW.KHygg", false);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        annotationVisitor0.visit(",r!G6?~dr=t+6p$I", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ClassWriter@28cc9e29
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2462));
      Type type0 = Type.CHAR_TYPE;
      classWriter0.visitAnnotation("", false);
      int int0 = classWriter0.newConst(type0);
      assertEquals(3, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(76, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2462));
      Boolean boolean0 = Boolean.valueOf("");
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 26, "", "", "", boolean0);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      classWriter0.visit((-2), (-2), "", "0*_We1~)u8HI,nTfOl", "", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(147, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2462));
      classWriter0.addType("");
      int int0 = classWriter0.addType("org.mockito.asm.ClassWriter");
      assertEquals(2, int0);
      
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(67, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2462));
      classWriter0.visitOuterClass("", "SourceFile", "cr6IWG#&T+L");
      byte[] byteArray0 = classWriter0.toByteArray();
      ByteVector byteVector0 = new ByteVector();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 857);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 16777220, 16777220);
      // Undeclared exception!
      try { 
        annotationWriter0.visit((String) null, byteArrayInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.io.ByteArrayInputStream@78bf7f95
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2462));
      classWriter0.visitOuterClass("l4VmrY/Lpre]=;v\"", (String) null, "");
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("#s==c{;WYim[O6a(|<1", false);
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
  public void test80()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(24117248);
      classWriter0.visitInnerClass((String) null, (String) null, (String) null, (-1483));
      ByteVector byteVector0 = new ByteVector();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 2360);
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      FileInputStream fileInputStream0 = new FileInputStream(fileDescriptor0);
      // Undeclared exception!
      try { 
        annotationWriter0.visit((String) null, fileInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.io.FileInputStream@5913e43
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2471));
      classWriter0.addType(">Wv>dQSZ3[//}YZ</");
      int int0 = classWriter0.addType("4#=T:SI|G");
      assertEquals(2, int0);
      
      classWriter0.visitSource("n", "\"^wIDN,q/f'-tuo");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(93, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1026));
      classWriter0.addUninitializedType("", (-1026));
      ByteVector byteVector0 = new ByteVector();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 1);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("", byteVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ByteVector@223c2da5
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2462));
      Boolean boolean0 = Boolean.valueOf("");
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 26, "", "", "", boolean0);
      classWriter0.visitSource("", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(134, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2462));
      Type type0 = Type.CHAR_TYPE;
      classWriter0.newConst(type0);
      classWriter0.visitSource((String) null, "");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-20));
      classWriter0.visitInnerClass("SourcDebugExtension", "SourcDebugExtension", "void", 1);
      ByteVector byteVector0 = classWriter0.pool;
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 1);
      classWriter0.visitInnerClass("JFaSL7)WodbckCP&'5", "S [,c[nTLevX<~@{&.", "SourcDebugExtension", (-619));
      // Undeclared exception!
      try { 
        annotationWriter0.visit("kP>8\t'(d{[", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ClassWriter@799ed2b3
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }
}
