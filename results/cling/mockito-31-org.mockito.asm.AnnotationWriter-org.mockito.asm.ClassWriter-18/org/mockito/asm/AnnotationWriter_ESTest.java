/*

 * Tue Mar 03 14:28:38 GMT 2020
 */

package org.mockito.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
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
      ClassWriter classWriter0 = new ClassWriter((-1456));
      classWriter0.visitAnnotation("value ", true);
      int int0 = classWriter0.newField("8OB7ao(QJ)b!9\"#w3g", "8OB7ao(QJ)b!9\"#w3g", "8OB7ao(QJ)b!9\"#w3g");
      assertEquals(5, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(107, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1456));
      Item item0 = classWriter0.newMethodItem("Signature", "Signature", "Signature", true);
      classWriter0.newNameType("Signature", "Signature");
      ByteVector byteVector0 = new ByteVector(0);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 3);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("xFBW ==pp$", item0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.Item@79b9ee7c
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-737));
      Byte byte0 = new Byte((byte)4);
      classWriter0.newConstItem(byte0);
      classWriter0.visitSource("", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(82, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3895));
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("5", false);
      classWriter0.newLong(6183);
      classWriter0.newLong(6183);
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("5", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ClassWriter@b793876
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3895));
      int int0 = classWriter0.addType("Signature");
      assertEquals(1, int0);
      
      classWriter0.visitAnnotation("5", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(70, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-408));
      classWriter0.invalidFrames = true;
      classWriter0.addUninitializedType("|%F9=qQWC", 1);
      classWriter0.addUninitializedType("Synthti", 1);
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
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3895));
      classWriter0.visitAnnotation("5", false);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(132, 6183);
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
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.newNameType(",tf", ",tf");
      classWriter0.visitOuterClass(",tf", ",tf", ",tf");
      classWriter0.visitInnerClass((String) null, "", "B", 8);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-389));
      classWriter0.visitSource("Synthetic", "Synthetic");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(95, byteArray0.length);
      
      int int0 = classWriter0.newMethod("Synthetic", "", "Synthetic", false);
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3212));
      classWriter0.visitField(67, "xFIBW ==pp$", "xFIBW ==pp$", "Deprecate\"", "Deprecate\"");
      classWriter0.visitAnnotation("xFIBW ==pp$", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(148, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3895));
      classWriter0.visitAnnotation("5", false);
      classWriter0.newLong(6183);
      classWriter0.newLong(6183);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(79, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      ByteVector byteVector0 = new ByteVector();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 2);
      Item item0 = classWriter0.newDouble(2);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("", item0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.Item@57bdeb88
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      Character character0 = new Character('o');
      classWriter0.visitField(2, ",f", "Deprecated", ",f", character0);
      classWriter0.visitSource("Qp7\"hY-o", "!8R(k!eA~a");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(170, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1456));
      classWriter0.newConstItem("}Signature");
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(1, (-1456));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3211));
      Type type0 = Type.DOUBLE_TYPE;
      classWriter0.visitInnerClass((String) null, "xFBW ==pp$", "", 40);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(74, byteArray0.length);
      
      int int0 = classWriter0.newConst(type0);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1456));
      classWriter0.newFloat((-1456));
      classWriter0.visitSource("RuntimeVisibleAnnotations", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(107, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.newNameType(",tf", ",tf");
      classWriter0.visitOuterClass(",tf", ",tf", ",tf");
      classWriter0.visitSource((String) null, (String) null);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3846));
      classWriter0.newFloat((-2397.42F));
      Class<Character> class0 = Character.class;
      Type type0 = Type.getType(class0);
      FieldVisitor fieldVisitor0 = classWriter0.visitField((-3846), "Synthetic", "Synthetic", "Synthetic", type0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      ByteVector byteVector0 = new ByteVector(2);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 1);
      Boolean boolean0 = Boolean.valueOf(false);
      classWriter0.visitField(2, ",f", ",f", ",f", boolean0);
      classWriter0.visitSource("Qp7\"hY-o", ",f");
      classWriter0.toByteArray();
      annotationWriter0.visit("xy", boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1456));
      classWriter0.visitInnerClass("Ob+95]Z%y", "Ob+95]Z%y", (String) null, (-3042));
      classWriter0.visitSource("", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(123, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1456));
      classWriter0.newMethodItem(")Tt# Yf( x8iCmv1", ")Tt# Yf( x8iCmv1", ")Tt# Yf( x8iCmv1", false);
      int int0 = classWriter0.newConst(")Tt# Yf( x8iCmv1");
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-408));
      classWriter0.visitSource("Synthti", "Synthti");
      classWriter0.toByteArray();
      Item item0 = classWriter0.newDouble(0.0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3895));
      classWriter0.newLong(6183);
      classWriter0.newLong(6183);
      classWriter0.visitSource("f4Cnw:hT-", "f4Cnw:hT-");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(104, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-693));
      classWriter0.visitAnnotation("5", false);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.newMethodItem("5", "org.mockito.asm.Type", (String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3212));
      classWriter0.visitInnerClass((String) null, "xFBW ==pp$", "", 40);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(74, byteArray0.length);
      
      int int0 = classWriter0.addType("=(W(g$7ZN$Mc${av");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      Byte byte0 = new Byte((byte)13);
      classWriter0.invalidFrames = true;
      classWriter0.visitField((-3895), "Deprecated", "Deprecated", "", byte0);
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
      Boolean boolean0 = Boolean.valueOf(true);
      classWriter0.visitField(2, ",f", ",f", ",f", boolean0);
      classWriter0.visitSource("Qp7\"hY-o", ",f");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(149, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-408));
      classWriter0.visitSource("Synthti", "Synthti");
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(3, 8);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3846));
      Type type0 = Type.getReturnType("Synthetic");
      classWriter0.visitField((-3846), "Synthetic", "Synthetic", "Synthetic", type0);
      classWriter0.visitSource((String) null, (String) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1456));
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(67, byteArray0.length);
      
      Boolean boolean0 = Boolean.FALSE;
      Item item0 = classWriter0.newConstItem(boolean0);
      Item item1 = classWriter0.newConstItem(boolean0);
      assertNotNull(item1);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1456));
      classWriter0.visitAnnotation("value ", true);
      classWriter0.toByteArray();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[1] = "";
      // Undeclared exception!
      try { 
        classWriter0.visitMethod((-722), "", "oiRDzIsOakQ7", "SourceFile", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3895));
      classWriter0.visitAnnotation("5", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(70, byteArray0.length);
      
      Byte byte0 = new Byte((byte)3);
      int int0 = classWriter0.newConst(byte0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1456));
      classWriter0.visitAnnotation("", false);
      classWriter0.newMethodItem("", "", "", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(82, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3895));
      Type type0 = Type.DOUBLE_TYPE;
      classWriter0.newConstItem(type0);
      classWriter0.visitInnerClass("", "[)2", "aD0}dz}", 39);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1456));
      classWriter0.newMethodItem("Signature", "Signature", "Signature", true);
      classWriter0.newNameType("Signature", "Signature");
      classWriter0.visitInnerClass("Ob+95]Z%y", "Ob+95]Z%y", (String) null, (-3042));
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3212));
      classWriter0.newNameType("", "");
      classWriter0.visitOuterClass("", "", (String) null);
      Item item0 = classWriter0.newMethodItem("Signature", "", "", true);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1456));
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 10, (-276));
      // Undeclared exception!
      try { 
        classWriter0.newConstItem(byteArrayInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.io.ByteArrayInputStream@638f34
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-408));
      classWriter0.addUninitializedType("|%F9=qQWC", 1);
      classWriter0.addUninitializedType("Synthti", 1);
      ByteVector byteVector0 = new ByteVector();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 2);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("|%F9=qQWC", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ClassWriter@73c34bc7
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      Boolean boolean0 = Boolean.valueOf(true);
      classWriter0.visitField(2, ",f", ",f", ",f", boolean0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(86, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1456));
      classWriter0.newMethodItem("Signature", "Signature", "Signature", true);
      int int0 = classWriter0.newNameType("Signature", "Signature");
      assertEquals(3, int0);
      
      classWriter0.visitSource("", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(102, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1456));
      classWriter0.visitField((-1456), "8OB7ao(QJ)b!9\"#w3g", "", "value ", "value ");
      classWriter0.visitSource("RuntimeVisibleAnnotations", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(227, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-408));
      classWriter0.newFieldItem("Synthti", "Synthti", "|%F9=qQWC");
      ByteVector byteVector0 = new ByteVector();
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 2);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("|%F9=qQWC", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ClassWriter@7a375965
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-408));
      classWriter0.toByteArray();
      Item item0 = classWriter0.newDouble(0.0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3211));
      Type type0 = Type.DOUBLE_TYPE;
      classWriter0.visitSource("java/lang/Class", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(92, byteArray0.length);
      
      int int0 = classWriter0.newConst(type0);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      int int0 = classWriter0.newField("char", "char", "char");
      assertEquals(4, int0);
      
      classWriter0.visitAnnotation("char", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(86, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.newNameType(",f", ",f");
      classWriter0.visitOuterClass(",f", ",f", ",f");
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("zJj6k9nA=p:*#o&DH", true);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.newNameType(",f", ",f");
      classWriter0.visitOuterClass(",f", ",f", ",f");
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("zJj6k9nA=p:*#o&DH", false);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1456));
      classWriter0.newMethodItem("Signature", "Signature", "Signature", true);
      int int0 = classWriter0.newNameType("Signature", "Signature");
      assertEquals(3, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(49, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3212));
      classWriter0.visitOuterClass("", "", (String) null);
      Item item0 = classWriter0.newLong(1);
      // Undeclared exception!
      try { 
        classWriter0.newConstItem(item0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.Item@1e9dd275
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.newFloat(1);
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
  public void test50()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3212));
      Type type0 = Type.DOUBLE_TYPE;
      classWriter0.visitField(67, "xFIBW ==pp$", "xFIBW ==pp$", "Deprecate\"", "Deprecate\"");
      classWriter0.newConstItem(type0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(113, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1456));
      ByteVector byteVector0 = new ByteVector(358);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, true, byteVector0, byteVector0, 2);
      classWriter0.addType("");
      // Undeclared exception!
      try { 
        annotationWriter0.visit("l", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ClassWriter@115f148
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1456));
      classWriter0.newFloat((-1456));
      classWriter0.visitAnnotation("value ", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(78, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      int int0 = classWriter0.addType(";Q5%G");
      assertEquals(1, int0);
      
      classWriter0.visitAnnotation(";Q5%G", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(72, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3895));
      Short short0 = new Short((short)11);
      classWriter0.newConstItem(short0);
      classWriter0.visitSource("Qp7\"hY-o", "Qp7\"hY-o");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(98, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      Short short0 = new Short((short)176);
      classWriter0.visitField((-2178), "EYR|NYiL&=bw-'l-}", "short", (String) null, short0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(126, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      classWriter0.visitOuterClass(",f", ",f", ",f");
      Type type0 = Type.VOID_TYPE;
      FieldVisitor fieldVisitor0 = classWriter0.visitField(2, "}(zX", "}(zX", "$8x!;EelAq~ 8?s", type0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1456));
      Item item0 = classWriter0.newMethodItem("Signature", "Signature", "Signature", true);
      ByteVector byteVector0 = new ByteVector(0);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 3);
      classWriter0.visitSource("", "");
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        annotationWriter0.visit("xFBW ==pp$", item0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.Item@44a5f5d8
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.visitSource("Qp7\"hY-o", ",f");
      int int0 = classWriter0.addType("Qp7\"hY-o");
      assertEquals(1, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(87, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3895));
      classWriter0.visitAnnotation("5", false);
      int int0 = classWriter0.addUninitializedType("5", 2);
      assertEquals(1, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(70, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1456));
      classWriter0.visitAnnotation("", true);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter0.getMergedType((-1456), 1770);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1456));
      classWriter0.visitAnnotation("", true);
      classWriter0.toByteArray();
      Item item0 = classWriter0.newMethodItem("%Nx[5%|DS1s:xBv%HG", "", ")Tt# Yf( x8iCmv1", true);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1456));
      classWriter0.visitField((-1456), "8OB7ao(QJ)b!9\"#w3g", "", "value ", "value ");
      classWriter0.visitAnnotation("value ", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(189, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1456));
      Item item0 = classWriter0.newMethodItem("Signature", "Signature", "Signature", true);
      classWriter0.visitInnerClass("Ob+95]Z%y", "Ob+95]Z%y", (String) null, (-3042));
      ByteVector byteVector0 = new ByteVector(0);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 3);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        annotationWriter0.visit("xFBW ==pp$", item0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.Item@5e8d947c
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3895));
      classWriter0.toByteArray();
      Character character0 = new Character('?');
      Item item0 = classWriter0.newConstItem(character0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-408));
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("5", false);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        annotationVisitor0.visit("org.mockito.asm.Type", annotationVisitor0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.AnnotationWriter@37c2a30
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3895));
      Class<Character> class0 = Character.class;
      Type type0 = Type.getType(class0);
      classWriter0.visitField((-3895), "", "", "oK<y44zz*i_E", type0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(156, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-408));
      classWriter0.visitSource("Synthetic", "Synthetic");
      classWriter0.toByteArray();
      Item item0 = classWriter0.newFieldItem("Synthetic", "Synthetic", "|%F9=qQWC1");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3895));
      Type type0 = Type.DOUBLE_TYPE;
      classWriter0.newConstItem(type0);
      AnnotationVisitor annotationVisitor0 = classWriter0.visitAnnotation("D", true);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3212));
      Type type0 = Type.DOUBLE_TYPE;
      classWriter0.newConstItem(type0);
      classWriter0.visitAnnotation("xFIBW ==pp$", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(87, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1456));
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(67, byteArray0.length);
      
      int int0 = classWriter0.addUninitializedType("", 1794);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3212));
      ByteVector byteVector0 = new ByteVector(2);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 5);
      classWriter0.visitOuterClass("", (String) null, (String) null);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        annotationWriter0.visit("(MJXDR*@7prPsGM<", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@3548ee6f
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-408));
      classWriter0.visitSource("Synthti", "Synthti");
      classWriter0.addUninitializedType("|%F9=qQWC", 1);
      int int0 = classWriter0.addUninitializedType("Synthti", 1);
      assertEquals(2, int0);
      
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(91, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3192));
      classWriter0.visitInnerClass("", (String) null, (String) null, 10);
      ByteVector byteVector0 = new ByteVector(2);
      AnnotationWriter annotationWriter0 = new AnnotationWriter(classWriter0, false, byteVector0, byteVector0, 5);
      classWriter0.visitInnerClass((String) null, "<", "Z", 5);
      // Undeclared exception!
      try { 
        annotationWriter0.visit("", annotationWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.AnnotationWriter@8f7ef27
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }
}
