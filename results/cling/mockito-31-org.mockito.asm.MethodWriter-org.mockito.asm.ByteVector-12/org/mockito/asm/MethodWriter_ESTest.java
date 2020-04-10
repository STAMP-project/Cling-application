/*

 * Tue Mar 03 14:30:40 GMT 2020
 */

package org.mockito.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mockito.asm.ByteVector;
import org.mockito.asm.ClassReader;
import org.mockito.asm.ClassVisitor;
import org.mockito.asm.ClassWriter;
import org.mockito.asm.Item;
import org.mockito.asm.Label;
import org.mockito.asm.MethodWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MethodWriter_ESTest extends MethodWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1128), "|HU", "Nr*viU><')VqXEcW", "Nr*viU><')VqXEcW", stringArray0, false, true);
      ByteVector byteVector0 = classWriter0.pool;
      ByteVector byteVector1 = byteVector0.putLong((-1L));
      assertSame(byteVector1, byteVector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[6];
      int int0 = MethodWriter.getNewOffset(intArray0, intArray0, (-1841), 3526);
      assertEquals(5367, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(89, 89, 2622, 89).when(classWriter0).newClass(anyString());
      doReturn(2622, 89).when(classWriter0).newUTF8(anyString());
      Label label0 = new Label();
      String[] stringArray0 = new String[4];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "x@=\"gbw\"E3%sf(4+{1", "*g_?)Yv1wqXq", "F[.M6fdp", stringArray0, false, true);
      methodWriter0.visitJumpInsn(1, label0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassReader classReader0 = new ClassReader("org.mockito.asm.Edge");
      ClassWriter classWriter0 = new ClassWriter(289);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 4096, "|WAA", "|WAA", "org.mockito.asm.Edge", stringArray0, false, false);
      classReader0.accept((ClassVisitor) classWriter0, 1);
      ByteVector byteVector0 = new ByteVector(2);
      ByteVector byteVector1 = byteVector0.putShort(4096);
      ByteVector byteVector2 = byteVector0.put11(18, 289);
      assertSame(byteVector2, byteVector1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassReader classReader0 = new ClassReader("org.mockito.asm.Edge");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 289);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 7, "|WAA", "|WAA", "org.mockito.asm.Edge", stringArray0, false, false);
      classReader0.accept((ClassVisitor) classWriter0, 1);
      ByteVector byteVector0 = classWriter0.pool;
      MethodWriter methodWriter1 = classWriter0.lastMethod;
      methodWriter1.put(byteVector0);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(17);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "4TV*y#T7rW";
      stringArray0[1] = "4TV*y#T7rW";
      stringArray0[2] = "4TV*y#T7rW";
      stringArray0[3] = "<init>";
      stringArray0[4] = "4TV*y#T7rW";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "4TV*y#T7rW", "4TV*y#T7rW", "<init>", stringArray0, false, false);
      Item item0 = classWriter0.newDouble(0.0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(8);
      ByteVector byteVector0 = new ByteVector(1);
      byteVector0.putLong(2);
      String[] stringArray0 = new String[9];
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, (byte)26, "Deprecated", "4TV*y#T7rW", "Deprecated", stringArray0, false, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1128), "Nr*viU><')VqXEcW", "Nr*viU><')VqXEcW", "Nr*viU><')VqXEcW", stringArray0, false, true);
      methodWriter0.visitVarInsn(1, 2);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[2];
      Label label0 = new Label();
      label0.status = (-730);
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      assertArrayEquals(new int[] {0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(534);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1240, "long", "?-rT#pBymLpdJQ>", (String) null, stringArray0, false, false);
      methodWriter0.visitLdcInsn(classWriter0.COMPUTE_FRAMES);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(51);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "double";
      stringArray0[1] = "/U$3(.:fJF@b4/2z";
      stringArray0[2] = "double";
      stringArray0[3] = "double";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "double";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "double", "", "", stringArray0, false, false);
      methodWriter0.visitFieldInsn(842, "double", "L", "");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(29);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 29, "ja2~.j2)<=U", "ja2~.j2)<=U", "ja2~.j2)<=U", (String[]) null, false, false);
      methodWriter0.visitFieldInsn(385, "/zVx!", "E'", "P$}/fj/_C|r");
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(29);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 29, "ja2~.j2)<=U", "ja2~.j2)<=U", "ja2~.j2)<=U", (String[]) null, false, false);
      Label[] labelArray0 = new Label[9];
      methodWriter0.visitFrame(103, 188, labelArray0, 103, labelArray0);
      methodWriter0.visitFrame(43, (-2663), (Object[]) null, 103, labelArray0);
      assertEquals(9, labelArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(8);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "Signature";
      stringArray0[1] = "Signature";
      stringArray0[2] = "4TV*y#T7rW";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 8, "I!U&ep{gH$H:2", "I!U&ep{gH$H:2", "Code", stringArray0, false, false);
      methodWriter0.visitMethodInsn(2, "Signature", "A/ig:WmVwD16Qa", "Signature");
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(29);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 29, "ja2~.j2)<=U", "ja2~.j2)<=U", "ja2~.j2)<=U", (String[]) null, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 29, "Stackap", "Stackap", "ja2~.j2)<=U", (String[]) null, false, false);
      methodWriter1.visitMethodInsn(2, "ja2~.j2)<=U", "Q!EN:r((4G(!}G&b0", "#Eq$6Jn7`mn_}`%");
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int[] intArray0 = new int[2];
      MethodWriter.getNewOffset(intArray0, intArray0, 90, (-1841));
      String[] stringArray0 = new String[0];
      ClassReader classReader0 = new ClassReader("org.mockito.asm.Edge");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 65);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 7, "|WAA", "|WAA", "org.mockito.asm.Edge", stringArray0, false, false);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1128), "Nr*viU><')VqXEcW", "Nr*viU><')VqXEcW", "Nr*viU><')VqXEcW", stringArray0, false, true);
      // Undeclared exception!
      try { 
        methodWriter0.visitMaxs(512, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 16
         //
         verifyException("org.mockito.asm.Type", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(29).when(classWriter0).newClass(anyString());
      doReturn(29, 3884).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[1];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 29, "", "ja2~.j2)<=U", "ja2~.j2)<=U", stringArray0, true, true);
      // Undeclared exception!
      try { 
        methodWriter0.visitMaxs(1, 29);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 11
         //
         verifyException("org.mockito.asm.Type", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassReader classReader0 = new ClassReader("org.mockito.asm.Edge");
      ClassWriter classWriter0 = new ClassWriter(289);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 4096, "|WAA", "|WAA", "org.mockito.asm.Edge", stringArray0, false, false);
      classReader0.accept((ClassVisitor) classWriter0, 1);
      methodWriter0.visitAnnotation("PRA3UVcXrk:T", false);
      ByteVector byteVector0 = new ByteVector(2);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(5);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "4TV*y#T7rW";
      stringArray0[1] = "4TV*y#T7rW";
      stringArray0[2] = "4TV*y#T7rW";
      stringArray0[3] = "<init>";
      stringArray0[4] = "4TV*y#T7rW";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "4TV*y#T7rW", "4TV*y#T7rW", "<init>", stringArray0, false, false);
      methodWriter0.visitFrame(2, 16777219, stringArray0, 2, stringArray0);
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(172);
      String[] stringArray0 = new String[6];
      classWriter0.newFieldItem(" @`VtEGC|", " @`VtEGC|", "RuntimeInvisibleParameterAnnotations");
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.put11(1, 172);
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 1482, " @`VtEGC|", "RuntimeInvisibleParameterAnnotations", "RuntimeInvisibleParameterAnnotations", stringArray0, true, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassReader classReader0 = new ClassReader("org.mockito.asm.Edge");
      ClassWriter classWriter0 = new ClassWriter(289);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 8, "|WAA", "|WAA", "org.mockito.asm.Edge", stringArray0, false, false);
      classReader0.accept((ClassVisitor) classWriter0, 1);
      MethodWriter methodWriter1 = methodWriter0.next;
      // Undeclared exception!
      try { 
        methodWriter1.visitMethodInsn((-1165), ":UtiPi8>", "|WAA", "org.mockito.asm.Edge");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(classWriter0).newClass(anyString());
      doReturn((-1575), (-1575)).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[3];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, ",>AdrUfM^]", "/>eH?!s-Vc", "", stringArray0, false, false);
      methodWriter0.visitFrame(1, (-36), stringArray0, 1, stringArray0);
      assertEquals(3, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(29);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 29, "ja2~.j2)<=U", "ja2~.j2)<=U", "ja2~.j2)<=U", (String[]) null, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 29, "Stackap", "Stackap", "ja2~.j2)<=U", (String[]) null, false, false);
      methodWriter1.visitVarInsn(200, 1);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(29);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 29, "ja2~.j2)<=U", "ja2~.j2)<=U", "ja2~.j2)<=U", (String[]) null, false, false);
      Label label0 = new Label();
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 64, "N", "Signature", ")8>u(dvc41+W^@", (String[]) null, false, false);
      int[] intArray0 = new int[6];
      intArray0[2] = 29;
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      assertArrayEquals(new int[] {0, 0, 29, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(104);
      String[] stringArray0 = new String[5];
      stringArray0[0] = " @`VtEGC|";
      stringArray0[1] = "AnnotationDefault";
      stringArray0[2] = "AnnotationDefault";
      stringArray0[3] = " @`VtEGC|";
      stringArray0[4] = "Ljava/lang/Synthetic;";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 248, "AnnotationDefault", "AnnotationDefault", " @`VtEGC|", stringArray0, false, false);
      methodWriter0.visitVarInsn(1, 218);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      ByteVector byteVector0 = new ByteVector(1);
      byteVector0.put11(51, 51);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "Nr*viU><')VqXEcW", "Nr*viU><')VqXEcW", "Deprecated", (String[]) null, true, true);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "Nr*viU><')VqXEcW", "Nr*viU><')VqXEcW", "Nr*viU><')VqXEcW", stringArray0, true, false);
      ByteVector byteVector0 = new ByteVector(2);
      ByteVector byteVector1 = byteVector0.putLong(1);
      ByteVector byteVector2 = byteVector1.put11(99, 99);
      assertSame(byteVector2, byteVector0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(29);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 29, "ja2~.j2)<=U", "ja2~.j2)<=U", "ja2~.j2)<=U", (String[]) null, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 29, "Stackap", "Stackap", "ja2~.j2)<=U", (String[]) null, false, false);
      methodWriter1.visitVarInsn((-669), (-669));
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(2);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-270), "4TV*y#T7rW", "v4YWq?", "t5CiNY%!pciY", stringArray0, false, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitFrame(1, 37, stringArray0, 37, stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(534);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1240, "long", "?-rT#pBymLpdJQ>", (String) null, stringArray0, false, false);
      Object[] objectArray0 = new Object[0];
      methodWriter0.visitFrame(1, (-889275714), objectArray0, 10, stringArray0);
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassReader classReader0 = new ClassReader("org.mockito.asm.Edge");
      ClassWriter classWriter0 = new ClassWriter(289);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 4096, "|WAA", "|WAA", "org.mockito.asm.Edge", stringArray0, false, false);
      classReader0.accept((ClassVisitor) classWriter0, 1);
      methodWriter0.visitVarInsn(8, 256);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "|HU", "Nr*viU><')VqXEcW", (String) null, stringArray0, false, true);
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(70);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "Nx", ";YXGp564=VWh-", (String) null, (String[]) null, false, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitFrame(4, 1695, (Object[]) null, 1, (Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(classWriter0).newClass(anyString());
      doReturn(0, 0).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[6];
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 1, (String) null, "TdL4CAAF4k%3$", "%G\"$RN4x.j", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(185).when(classWriter0).newClass(anyString());
      doReturn(185, (-1459)).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[1];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, ".F:97kR(0MTkeEVIpB", ")V", "'r7YPd1#:", stringArray0, false, false);
      int[] intArray0 = new int[3];
      intArray0[0] = 185;
      Label label0 = new Label();
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      assertEquals(3, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassReader classReader0 = new ClassReader("org.mockito.asm.Edge");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 289);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 7, "|WAA", "|WAA", "org.mockito.asm.Edge", stringArray0, false, false);
      Label label0 = new Label();
      int[] intArray0 = new int[2];
      intArray0[0] = 16777215;
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      assertEquals(2, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(104);
      String[] stringArray0 = new String[5];
      stringArray0[0] = " @`VtEGC|";
      stringArray0[1] = "AnnotationDefault";
      stringArray0[2] = "AnnotationDefault";
      stringArray0[3] = " @`VtEGC|";
      stringArray0[4] = "Ljava/lang/Synthetic;";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 248, "AnnotationDefault", "AnnotationDefault", " @`VtEGC|", stringArray0, false, false);
      methodWriter0.getSize();
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, (-563), "AnnotationDefault", " @`VtEGC|", "java/lang/Object", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(172);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "short";
      stringArray0[1] = " @`VtEGC|";
      stringArray0[2] = "short";
      stringArray0[3] = "short";
      stringArray0[4] = "RuntimeInvisibleParameterAnnotations";
      stringArray0[5] = "RuntimeInvisibleParameterAnnotations";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "short", " @`VtEGC|", "RuntimeInvisibleParameterAnnotations", stringArray0, false, false);
      methodWriter0.visitInsn(172);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      int[] intArray0 = new int[2];
      MethodWriter.getNewOffset(intArray0, intArray0, 90, (-1841));
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter((-1841));
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 1, "org.mockito.asm.Edge", "1y", "HU", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "|HU", "Nr-viU><')qXEcx", (String) null, stringArray0, true, false);
      methodWriter0.visitMethodInsn(131072, "#mD2gkr\"SJ>", "#mD2gkr\"SJ>", "Nr*iU><')qXEcW");
      methodWriter0.visitVarInsn(1, 1);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 16777218, "Nr*viU><')VqXEcW", "Nr*viU><')VqXEcW", "Nr*viU><')VqXEcW", stringArray0, true, false);
      methodWriter0.visitVarInsn(2, 72);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(534);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1240, "long", "F[.M6fdp", (String) null, stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "_j", "long", "RuntimeVisibleAnnotations", stringArray0, false, false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(111, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(104);
      String[] stringArray0 = new String[5];
      stringArray0[0] = " @`VtEGC|";
      stringArray0[1] = "AnnotationDefault";
      stringArray0[2] = "AnnotationDefault";
      stringArray0[3] = " @`VtEGC|";
      stringArray0[4] = "Ljava/lang/Synthetic;";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 189, "AnnotationDefault", "AnnotationDefault", " @`VtEGC|", stringArray0, false, false);
      methodWriter0.visitMaxs((-3979), 104);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassReader classReader0 = new ClassReader("org.mockito.asm.Edge");
      ClassWriter classWriter0 = new ClassWriter(289);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 4096, "|WAA", "|WAA", "org.mockito.asm.Edge", stringArray0, false, false);
      methodWriter0.getSize();
      classReader0.accept((ClassVisitor) classWriter0, 1);
      assertEquals(289, classReader0.header);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1841));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "b?|HU";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2502, "b?|HU", "b?|HU", "b?|HU", stringArray0, false, false);
      methodWriter0.visitAnnotation("re;E%z/4x#", false);
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassReader classReader0 = new ClassReader("org.mockito.asm.Edge");
      ClassWriter classWriter0 = new ClassWriter(289);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 8, "|WAA", "|WAA", "org.mockito.asm.Edge", stringArray0, false, false);
      classReader0.accept((ClassVisitor) classWriter0, 1);
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.putLong(289);
      assertSame(byteVector1, byteVector0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "|HU", "Nr-viU><')qXEcx", "Nr-viU><')qXEcx", stringArray0, true, false);
      ByteVector byteVector0 = new ByteVector(2);
      byteVector0.putLong(1);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, (-381), "~V1nV\"2<\")", "<[g7uGS!D(", "<[g7uGS!D(", stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1128), "|HU", "Nr*viU><')VqXEcW", "Nr*viU><')VqXEcW", stringArray0, false, true);
      Label label0 = new Label();
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.visitLineNumber((-1128), label0);
      methodWriter0.visitIincInsn(2, 1);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "org.mockito.asm.Label", "Ljava/lang/Synthetic;", "p71>>k?~5.AFe^g&1q", stringArray0, false, false);
      methodWriter0.put(byteVector0);
      assertFalse(methodWriter0.equals((Object)methodWriter1));
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "Nr*viU><')VqXEcW", "Nr*viU><')VqXEcW", "Ag|I3D'(3+1H_ELLV", stringArray0, false, false);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 104, "Nr*viU><')VqXEcW", "Ag|I3D'(3+1H_ELLV", "Nr*viU><')VqXEcW", stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassReader classReader0 = new ClassReader("org.mockito.asm.Edge");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 289);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 7, "|WAA", "|WAA", "org.mockito.asm.Edge", stringArray0, false, false);
      Label label0 = new Label();
      classReader0.accept((ClassVisitor) classWriter0, 1);
      methodWriter0.visitLocalVariable("LineNumberTable", "|WAA", "LineNumberTable", label0, label0, (-920));
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-820));
      String[] stringArray0 = new String[5];
      stringArray0[0] = "uO'qJex^}CHA6g9";
      stringArray0[1] = "uO'qJex^}CHA6g9";
      stringArray0[2] = "uO'qJex^}CHA6g9";
      stringArray0[3] = "uO'qJex^}CHA6g9";
      stringArray0[4] = "uO'qJex^}CHA6g9";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (byte) (-67), "uO'qJex^}CHA6g9", "uO'qJex^}CHA6g9", "uO'qJex^}CHA6g9", stringArray0, false, false);
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "H", "Nr*viU><')VqXEcW", "Nr*viU><')VqXEcW", stringArray0, true, false);
      Label label0 = new Label();
      methodWriter0.visitVarInsn(2, 1);
      methodWriter0.visitLabel(label0);
      methodWriter0.visitMaxs((-303), (-1512));
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(104);
      String[] stringArray0 = new String[5];
      stringArray0[0] = " @`VtEGC|";
      stringArray0[1] = "AnnotationDefault";
      stringArray0[2] = "AnnotationDefault";
      stringArray0[3] = " @`VtEGC|";
      stringArray0[4] = "Ljava/lang/Synthetic;";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 248, "AnnotationDefault", "AnnotationDefault", " @`VtEGC|", stringArray0, false, false);
      methodWriter0.visitIincInsn(1, (-979));
      methodWriter0.getSize();
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, (-563), "AnnotationDefault", " @`VtEGC|", "java/lang/Object", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "", "Nr*viU><')VBXEcV", "LocalVariableTypeTable", stringArray0, false, false);
      methodWriter0.visitInsn(1);
      int int0 = methodWriter0.getSize();
      assertEquals(35, int0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(104);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 14, "h}", "HR", "h}", (String[]) null, false, false);
      ByteVector byteVector0 = new ByteVector(0);
      methodWriter0.put(byteVector0);
      String[] stringArray0 = new String[5];
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 14, "h}", "(R.K*T%s{xsNS@Y0%", "@a!x7+406PLAet&", stringArray0, false, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(289);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 4096, "|WAA", "|WAA", "org.mockito.asm.Edge", stringArray0, false, false);
      methodWriter0.visitIincInsn(493, (-128));
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1128), "|HU", "Nr*viU><')VqXEcW", "Nr*viU><')VqXEcW", stringArray0, false, true);
      Label label0 = new Label();
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.visitLineNumber((-1128), label0);
      methodWriter0.visitIincInsn(2, 1);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1865, "Nr*viU><')VqXEcW", "dR'mCPva()_-M", "Nr*viU><')VqXEcW", stringArray0, false, true);
      methodWriter0.visitAnnotation("Deprecated", false);
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(89, 89, 2622, 89).when(classWriter0).newClass(anyString());
      doReturn(2622, 89).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[4];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "x@=\"gbw\"E3%sf(4+{1", "*g_?)Yv1wqXq", "F[.M6fdp", stringArray0, false, true);
      methodWriter0.visitIincInsn(2622, 116);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-1748)).when(classWriter0).newClass(anyString());
      doReturn((-1748), 67).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[1];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 29, "", "ja2~.j2)<=U", "ja2~.j2)<=U", stringArray0, true, true);
      methodWriter0.visitIincInsn(2, 29);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "|HU", "Nr*viU><')VqXEcW", (String) null, stringArray0, false, true);
      methodWriter0.visitIincInsn(128, 1048575);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(8);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "O};_3%SCA>D0jt/88<";
      stringArray0[1] = "O};_3%SCA>D0jt/88<";
      stringArray0[2] = "4TV*y#T7rW";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 8, "4TV*y#T7rW", "4TV*y#T7rW", "4TV*y#T7rW", stringArray0, false, false);
      methodWriter0.visitLdcInsn("O};_3%SCA>D0jt/88<");
      Label label0 = new Label();
      methodWriter0.visitLocalVariable("O};_3%SCA>D0jt/88<", "org.mockito.asm.Edge", "Synthetic", label0, label0, 247);
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1128), "|HU", "Nr*viU><')VqXEcW", "Nr*viU><')VqXEcW", stringArray0, false, true);
      Label label0 = new Label();
      methodWriter0.visitMethodInsn((-2070), "#mD2gkr\"SJ>", "N=4eteJ=)z", "Nr*viU><')VqXEcW");
      methodWriter0.visitLocalVariable("|HU", "V_v`yH+Cs)", "JWx", label0, label0, 46);
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(8);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "Nr*viU><')VqXEW";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 865, "4TV*y#T7rW", "Nr*viU><')VqXEW", "BXW>]4[Hgq:}v\"", stringArray0, false, true);
      methodWriter0.visitInsn(11);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassReader classReader0 = new ClassReader("org.mockito.asm.Edge");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 289);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 7, "|WAA", "|WAA", "org.mockito.asm.Edge", stringArray0, false, false);
      methodWriter0.visitMaxs(285212681, 1072);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(17);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "4TV*y#T7rW";
      stringArray0[1] = "4TV*y#T7rW";
      stringArray0[2] = "4TV*y#T7rW";
      stringArray0[3] = "<init>";
      stringArray0[4] = "4TV*y#T7rW";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "4TV*y#T7rW", "4TV*y#T7rW", "<init>", stringArray0, false, false);
      methodWriter0.visitIntInsn(17, 1);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassReader classReader0 = new ClassReader("org.mockito.asm.Edge");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 289);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 7, "|WAA", "|WAA", "org.mockito.asm.Edge", stringArray0, false, false);
      methodWriter0.visitAnnotation("H", true);
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1668, "|WAA", "|WAA", "H", stringArray0, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "H", "Nr*viU><')VqXEcW", "Nr*viU><')VqXEcW", stringArray0, true, false);
      methodWriter0.visitInsn(116);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(8);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "O};_3%SCA>D0jt/88<";
      stringArray0[1] = "O};_3%SCA>D0jt/88<";
      stringArray0[2] = "4TV*y#T7rW";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 8, "4TV*y#T7rW", "4TV*y#T7rW", "4TV*y#T7rW", stringArray0, false, false);
      methodWriter0.visitLdcInsn("O};_3%SCA>D0jt/88<");
      ByteVector byteVector0 = classWriter0.pool;
      ByteVector byteVector1 = byteVector0.put11(105, (-1429));
      methodWriter0.put(byteVector1);
      assertSame(byteVector1, byteVector0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassReader classReader0 = new ClassReader("org.mockito.asm.Edge");
      ClassWriter classWriter0 = new ClassWriter(289);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 8, "|WAA", "|WAA", "org.mockito.asm.Edge", stringArray0, false, false);
      classReader0.accept((ClassVisitor) classWriter0, 1);
      MethodWriter methodWriter1 = methodWriter0.next;
      methodWriter1.visitIincInsn((-1827), (-2734));
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassReader classReader0 = new ClassReader("org.mockito.asm.Edge");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 289);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 7, "|WAA", "|WAA", "org.mockito.asm.Edge", stringArray0, false, false);
      classReader0.accept((ClassVisitor) classWriter0, 1);
      methodWriter0.visitVarInsn(0, 16);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(172);
      String[] stringArray0 = new String[6];
      classWriter0.newMethodItem("RuntimeInvisibleParameterAnnotations", " @`VtEGC|", " @`VtEGC|", false);
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 2, "short", " @`VtEGC|", "RuntimeInvisibleParameterAnnotations", stringArray0, false, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(104);
      String[] stringArray0 = new String[5];
      stringArray0[0] = " @`VtEGC|";
      stringArray0[1] = "AnnotationDefault";
      stringArray0[2] = "AnnotationDefault";
      stringArray0[3] = " @`VtEGC|";
      stringArray0[4] = "Ljava/lang/Synthetic;";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 248, "AnnotationDefault", "AnnotationDefault", " @`VtEGC|", stringArray0, false, false);
      methodWriter0.visitIincInsn(1, (-979));
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, (-563), "AnnotationDefault", " @`VtEGC|", "java/lang/Object", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }
}
