/*

 * Tue Mar 03 14:26:19 GMT 2020
 */

package org.mockito.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mockito.asm.AnnotationVisitor;
import org.mockito.asm.AnnotationWriter;
import org.mockito.asm.ByteVector;
import org.mockito.asm.ClassWriter;
import org.mockito.asm.FieldVisitor;
import org.mockito.asm.Item;
import org.mockito.asm.Type;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AnnotationWriter_ESTest extends AnnotationWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2500);
      classWriter0.visitAnnotation("", true);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newFieldItem("org.mockito.asm.Type", "tX4]", "");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2574);
      classWriter0.visitAnnotation("V", true);
      classWriter0.toByteArray();
      Short short0 = new Short((short)16);
      FieldVisitor fieldVisitor0 = classWriter0.visitField((-190), "nEUHcHTS", "SourceDebugExtension", "4<F&", short0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.visitField(1, "", "", "", "");
      classWriter0.visitField(1, "", "", "", "");
      classWriter0.visitAnnotation("", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(148, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(870);
      classWriter0.newMethodItem("int", "int", "int", true);
      ByteVector byteVector0 = classWriter0.pool;
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 1);
      classWriter0.newMethodItem("", "int", "int", true);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        annotationWriter0.visit("<)i{Y", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@7b1cc1f5
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2583);
      classWriter0.visitSource("", "");
      classWriter0.toByteArray();
      Byte byte0 = new Byte((byte)25);
      FieldVisitor fieldVisitor0 = classWriter0.visitField(2583, "", "", ">=O0v~,vq", byte0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.newLong((byte)11);
      ByteVector byteVector0 = new ByteVector();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 1);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("M'`G_N;4x+", byteVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ByteVector@5e90afcb
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2583);
      classWriter0.invalidFrames = true;
      classWriter0.visitAnnotation("", true);
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
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("", false);
      classWriter0.visitInnerClass("RuntimeVisibleAnnotations", "", "A1T)NPD<\"KFml'F^", 12);
      classWriter0.visitInnerClass("f#cL0n3B?", "f#cL0n3B?", "t||6CCE8gQBRfT", 1);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("Depreatd", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@3a733969
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(870);
      classWriter0.newDouble(870);
      classWriter0.newDouble(870);
      classWriter0.visitInnerClass("int", (String) null, "5+0nXX5IU'", 2);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.visitAnnotation("", false);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(49, 49);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      ByteVector byteVector0 = new ByteVector(1);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 1);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("KpiTq<Ds38z6s6/8o", true);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        annotationWriter0.visit("e%<1", annotationVisitor0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.AnnotationWriter@5fc2f053
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(870);
      classWriter0.newMethodItem("int", "int", "int", true);
      classWriter0.visitSource("", "\"[C;X");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(101, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2583);
      classWriter0.visitSource("ConstantValue", "");
      classWriter0.toByteArray();
      Item item0 = classWriter0.newMethodItem("E{hNw@mPf;|nLk2Is", "ConstantValue", "ConstantValue", false);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(870);
      classWriter0.newDouble(870);
      classWriter0.newDouble(870);
      classWriter0.visitSource("short", (String) null);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(870);
      classWriter0.newDouble(870);
      ByteVector byteVector0 = classWriter0.pool;
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 1);
      classWriter0.newDouble(870);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        annotationWriter0.visit("5+0nXX5IU'", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@93d64ad
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2583);
      classWriter0.visitAnnotation("", false);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newLong(2583);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(870);
      Character character0 = Character.valueOf('$');
      classWriter0.visitField((-4484), "int", "\"[C;X", "int", character0);
      classWriter0.visitSource("", "\"[C;X");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(172, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.visitField(1, "", "", "", "");
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(49, 49);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(870);
      classWriter0.visitSource("", "\"[C;X");
      classWriter0.toByteArray();
      Item item0 = classWriter0.newFloat((-4484));
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      int int0 = classWriter0.addType("Q8LgUW!W2E-znu|C%q");
      assertEquals(1, int0);
      
      int int1 = classWriter0.addUninitializedType("Q8LgUW!W2E-znu|C%q", 6);
      assertEquals(2, int1);
      
      classWriter0.visitAnnotation("Q8LgUW!W2E-znu|C%q", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(87, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2500);
      classWriter0.visitAnnotation("", false);
      classWriter0.toByteArray();
      classWriter0.visitInnerClass("Gc!ox", "Gc!ox", "1lyo6'nw", 2500);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2583);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("", false);
      Boolean boolean0 = Boolean.valueOf(false);
      annotationVisitor0.visit("", boolean0);
      classWriter0.visitField((-11), "RuntimeInvisibleAnnotations", "", "RuntimeInvisibleAnnotations", boolean0);
      ClassWriter classWriter1 = new ClassWriter((-1728));
      byte[] byteArray0 = classWriter1.toByteArray();
      assertEquals(24, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.getCommonSuperClass("org.mockito.asm.MethodWriter", "org.mockito.asm.MethodWriter");
      classWriter0.visitAnnotation("int", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(70, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitSource("", "");
      classWriter0.toByteArray();
      classWriter0.visitInnerClass("RuntimeInvisibleAnnotations", "RuntimeInvisibleAnnotations", "", 1);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(38);
      Class<Integer> class0 = Integer.class;
      Type type0 = Type.getType(class0);
      classWriter0.visitField(2060, "", "[]", (String) null, type0);
      classWriter0.visitAnnotation("=qL", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(133, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      ByteVector byteVector0 = classWriter0.pool;
      classWriter0.newMethodItem("I", "I", "I", false);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 2);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("@HoZH_>/y[", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ClassWriter@76449268
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(894);
      classWriter0.newDouble(894);
      classWriter0.newDouble(894);
      classWriter0.visitSource("XQ/D)OdyI'", "XQ/D)OdyI'");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(106, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.newLong((byte)11);
      classWriter0.visitSource("B!6me*)i", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(94, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      Character character0 = Character.valueOf('K');
      classWriter0.visitField(6, ">:{zi", "nEUHcHTS", "Deprecated", character0);
      classWriter0.visitAnnotation("Deprecated", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(156, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2583);
      classWriter0.visitAnnotation("t", true);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newLong((byte)4);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2583);
      classWriter0.visitAnnotation("", false);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newMethodItem("E{hNw@mPf;|nLk2Is", "ConstantValue", "ConstantValue", false);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2583);
      classWriter0.visitAnnotation("", true);
      classWriter0.toByteArray();
      Boolean boolean0 = Boolean.valueOf(true);
      FieldVisitor fieldVisitor0 = classWriter0.visitField(2583, "", "InnerClasses", "InnerClasses", boolean0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(31);
      classWriter0.newDouble(31);
      classWriter0.newDouble(31);
      classWriter0.visitOuterClass("", (String) null, (String) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2583);
      classWriter0.visitAnnotation("", true);
      classWriter0.toByteArray();
      Boolean boolean0 = Boolean.valueOf("");
      FieldVisitor fieldVisitor0 = classWriter0.visitField(2583, "", "InnerClasses", "InnerClasses", boolean0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.newFloat(0.0F);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("6*g}w1sL,WZd", true);
      classWriter0.newFloat(0.0F);
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("vcBhYph!p+z=;0;X7", annotationVisitor0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.AnnotationWriter@6394a7e8
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      Boolean boolean0 = Boolean.valueOf("InnerClasses");
      classWriter0.visitField(1, "9", "", "InnerClasses", boolean0);
      classWriter0.visitSource("]<x", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(159, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitAnnotation("Deprecated", false);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newFloat((-306.0F));
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(870);
      classWriter0.newDouble(870);
      classWriter0.newDouble(870);
      classWriter0.visitOuterClass("-0BpwAz1=[@z6}OA", "-0BpwAz1=[@z6}OA", "");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(870);
      classWriter0.newDouble(870);
      classWriter0.newDouble(870);
      classWriter0.visitOuterClass("", "", (String) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2583);
      classWriter0.visitSource("", "");
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(1, 2796);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      Type type0 = Type.SHORT_TYPE;
      classWriter0.visitField(2, "", "", "nEUHcHTS", type0);
      classWriter0.visitSource("", (String) null);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2583);
      classWriter0.visitField(2583, "", "", "value ", "");
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(131, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2500);
      classWriter0.visitAnnotation("", true);
      classWriter0.toByteArray();
      classWriter0.visitInnerClass("Gc!ox", "Gc!ox", "1lyo6'nw", 2500);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2562);
      Byte byte0 = new Byte((byte) (-22));
      classWriter0.visitField(2, "", "eC9u3SIz^?yZQJ+", "q-+iU&<`OM$vUc", byte0);
      classWriter0.visitAnnotation("JE*j)-zazV3}Cd", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(178, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(870);
      classWriter0.newDouble(870);
      classWriter0.newDouble(870);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation(",92y", true);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(870);
      classWriter0.newDouble(870);
      classWriter0.newDouble(870);
      classWriter0.visitAnnotation("int", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(81, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(870);
      classWriter0.newMethodItem("int", "int", "int", true);
      classWriter0.visitAnnotation("int", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(85, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      Type type0 = Type.SHORT_TYPE;
      classWriter0.visitField(2, "p#EkvJ.cxe;", "p#EkvJ.cxe;", "nEUHcHTS", type0);
      classWriter0.visitInnerClass("org.mockito.asm.Label", (String) null, "p98rjH", 38);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2583);
      classWriter0.visitAnnotation("", true);
      classWriter0.toByteArray();
      Character character0 = Character.valueOf('y');
      FieldVisitor fieldVisitor0 = classWriter0.visitField(1088, "", "SourceDebugExtension", "SourceDebugExtension", character0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(870);
      classWriter0.newDouble(870);
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(76, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.addType("h>");
      classWriter0.addUninitializedType("h>", 21);
      Type type0 = Type.DOUBLE_TYPE;
      FieldVisitor fieldVisitor0 = classWriter0.visitField(1, "h>", "", "h>", type0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2583);
      classWriter0.toByteArray();
      Boolean boolean0 = Boolean.valueOf(true);
      FieldVisitor fieldVisitor0 = classWriter0.visitField(2583, "", "InnerClasses", "InnerClasses", boolean0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.getCommonSuperClass("org.mockito.asm.MethodWriter", "org.mockito.asm.MethodWriter");
      classWriter0.visitSource("", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(77, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.visitField(1, "", "", "", "");
      classWriter0.visitSource("", "CDYPsvN}*Ny|t^cv");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(149, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2500);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("", true);
      classWriter0.newFieldItem("org.mockito.asm.Type", "tX4]", "");
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@de52102
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(218);
      classWriter0.newMethodItem("", "", "", false);
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(80, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(870);
      ByteVector byteVector0 = classWriter0.pool;
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 1);
      annotationWriter0.next = annotationWriter0;
      classWriter0.visitSource("", "\"[C;X");
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        annotationWriter0.next.visit("\"[C;X", byteVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ByteVector@3fe1c381
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2583);
      classWriter0.visitAnnotation("", false);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newFieldItem("e|+yW#", "I", "");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.newFloat(1);
      classWriter0.visitAnnotation("KpiTq<Ds38z6s6/8o", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(89, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1707);
      classWriter0.visitAnnotation("-", false);
      Short short0 = new Short((short)11);
      classWriter0.visitField(1707, "-", "-", "-", short0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(127, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitSource("", "");
      classWriter0.toByteArray();
      Short short0 = new Short((short) (-1064));
      FieldVisitor fieldVisitor0 = classWriter0.visitField((-638), ";51aXf3TN&", "'9MA3Z~M", "Class not found", short0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitOuterClass("f>^BS^6yc&", "f>^BS^6yc&", "f>^BS^6yc&");
      Type type0 = Type.getType("Deprecated");
      FieldVisitor fieldVisitor0 = classWriter0.visitField(549, "Signature", "`hA7pXQ)u[B", "`hA7pXQ)u[B", type0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2583);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("", false);
      Boolean boolean0 = Boolean.valueOf(false);
      annotationVisitor0.visit("", boolean0);
      classWriter0.visitField((-11), "RuntimeInvisibleAnnotations", "", "RuntimeInvisibleAnnotations", boolean0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(168, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      Type type0 = Type.SHORT_TYPE;
      classWriter0.visitField(2, "", "", "nEUHcHTS", type0);
      classWriter0.visitSource("", "CDYPsvN}*Ny|t^cv");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(165, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2583);
      classWriter0.visitAnnotation("", true);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(1, 2796);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(870);
      classWriter0.newMethodItem("int", "int", "int", true);
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(86, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2583);
      classWriter0.visitAnnotation("", true);
      classWriter0.toByteArray();
      Byte byte0 = new Byte((byte)25);
      FieldVisitor fieldVisitor0 = classWriter0.visitField(2583, "", "", ">=O0v~,vq", byte0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      Type type0 = Type.DOUBLE_TYPE;
      classWriter0.visitField(1, "h>", "", "h>", type0);
      classWriter0.visitAnnotation("KpiTq<Ds38z6s6/8o", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(151, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2604);
      classWriter0.visitInnerClass("RuntimeVisibleParameterAnnotations", "0:4m8'Ux<`F", "RuntimeVisibleParameterAnnotations", 2604);
      classWriter0.toByteArray();
      ByteVector byteVector0 = classWriter0.pool;
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 3);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("LineNumberTable", byteVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ByteVector@459c8400
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      Item item0 = classWriter0.newFloat(0.0F);
      classWriter0.visitInnerClass("Qe (5;Io(~303)?D", "Qe (5;Io(~303)?D", "[^b]:", 2);
      Item item1 = classWriter0.newFloat(0.0F);
      assertSame(item1, item0);
      assertNotNull(item1);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("", false);
      classWriter0.toByteArray();
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", sequenceInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.io.SequenceInputStream@134cd870
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2583);
      classWriter0.visitAnnotation("", false);
      classWriter0.toByteArray();
      Type type0 = Type.SHORT_TYPE;
      FieldVisitor fieldVisitor0 = classWriter0.visitField((-510), "T`A0}U1og>", "", "", type0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(38);
      Class<Integer> class0 = Integer.class;
      Type type0 = Type.getType(class0);
      classWriter0.visitField(2060, "", "[]", (String) null, type0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(87, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitSource("", "");
      int int0 = classWriter0.newField("", "", "SourceDebugExtension");
      assertEquals(5, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(90, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "HKM{Xq!4#dw=X";
      stringArray0[1] = "HKM{Xq!4#dw=X";
      stringArray0[2] = "Y).O@km#DDl";
      stringArray0[3] = "";
      stringArray0[4] = "Y).O@km#DDl";
      stringArray0[5] = "HKM{Xq!4#dw=X";
      classWriter0.visit(2, 9, "Y).O@km#DDl", "Y).O@km#DDl", "HKM{Xq!4#dw=X", stringArray0);
      Boolean boolean0 = Boolean.valueOf("InnerClasses");
      classWriter0.visitField(1, "9", "", "InnerClasses", boolean0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(162, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.addType("h>");
      int int0 = classWriter0.addUninitializedType("h>", 21);
      assertEquals(2, int0);
      
      classWriter0.visitAnnotation("KpiTq<Ds38z6s6/8o", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(84, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(870);
      ByteVector byteVector0 = classWriter0.pool;
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 1);
      classWriter0.visitOuterClass("", "", (String) null);
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
  public void test77()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(Integer.MAX_VALUE);
      classWriter0.visitOuterClass("org.mockito.asm.ClassWriter", (String) null, "value ");
      ByteVector byteVector0 = classWriter0.pool;
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 1);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        annotationWriter0.visit("}_.", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@317f5911
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2583);
      classWriter0.newDouble(1466.129050932667);
      classWriter0.newDouble(1466.129050932667);
      classWriter0.visitInnerClass("", "", (String) null, 18);
      classWriter0.visitInnerClass("", "", "r?", 0);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.getCommonSuperClass("org.mockito.asm.MethodWriter", "org.mockito.asm.MethodWriter");
      FieldVisitor fieldVisitor0 = classWriter0.visitField(1, "p#EkvJ.cxe;", "p#EkvJ.cxe;", "p#EkvJ.cxe;", "p#EkvJ.cxe;");
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.visitField(1, "", "", "", "");
      classWriter0.visitField(1, "", "", "", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(106, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2583);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("", true);
      classWriter0.visitInnerClass((String) null, "Exceptions", "A6T5^", 10);
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("[]", sequenceInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.io.SequenceInputStream@4ab01b69
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2500);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("", true);
      Object object0 = new Object();
      classWriter0.visitInnerClass("", "}dmon5,5{hlG", (String) null, (-3013));
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@6a91f2eb
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitSource("", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(77, byteArray0.length);
      
      int int0 = classWriter0.addType("");
      assertEquals(1, int0);
      
      int int1 = classWriter0.addUninitializedType("", 7);
      assertEquals(2, int1);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      Type type0 = Type.DOUBLE_TYPE;
      classWriter0.visitField(1, "h>", "", "h>", type0);
      classWriter0.visitSource((String) null, "QXz5QM*nx<");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }
}
