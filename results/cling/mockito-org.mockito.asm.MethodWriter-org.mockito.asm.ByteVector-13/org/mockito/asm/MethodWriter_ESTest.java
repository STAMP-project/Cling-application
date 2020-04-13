/*

 * Tue Mar 03 14:30:47 GMT 2020
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
import org.mockito.asm.Attribute;
import org.mockito.asm.ByteVector;
import org.mockito.asm.ClassReader;
import org.mockito.asm.ClassVisitor;
import org.mockito.asm.ClassWriter;
import org.mockito.asm.Item;
import org.mockito.asm.Label;
import org.mockito.asm.MethodVisitor;
import org.mockito.asm.MethodWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MethodWriter_ESTest extends MethodWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "", "MM[V8)+0=f>63_U^f", "RuntimeInvisibleParameterAnnotations", stringArray0, false, true);
      ByteVector byteVector0 = classWriter0.pool;
      ByteVector byteVector1 = byteVector0.putShort(7);
      ByteVector byteVector2 = byteVector1.putByteArray((byte[]) null, 1, 1);
      ByteVector byteVector3 = byteVector2.putUTF8("MM[V8)+0=f>63_U^f");
      byteVector3.putInt(1);
      ByteVector byteVector4 = byteVector3.putLong(0L);
      ByteVector byteVector5 = byteVector4.putLong(1327L);
      assertSame(byteVector5, byteVector4);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[16];
      int int0 = MethodWriter.getNewOffset(intArray0, intArray0, (-2687), Integer.MAX_VALUE);
      assertEquals((-2147480962), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.mockito.asm.Label");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 2560);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "org.mockito.asm.Label";
      stringArray0[1] = "org.mockito.asm.Label";
      stringArray0[2] = "3M)!8ia4R";
      stringArray0[3] = "org.mockito.asm.Label";
      stringArray0[4] = "org.mockito.asm.Label";
      stringArray0[5] = "<init>";
      stringArray0[6] = "3M)!8ia4R";
      stringArray0[7] = "3M)!8ia4R";
      stringArray0[8] = "org.mockito.asm.Label";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (byte)7, "3M)!8ia4R", "3M)!8ia4R", "<init>", stringArray0, true, true);
      Label label0 = new Label();
      methodWriter0.visitJumpInsn((byte)7, label0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "", "MM[V8)+0=f>63_U^f", "RuntimeInviibleParameterAnnotations", stringArray0, false, true);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "", "MM[V8)+0=f>63_U^f", "RuntimeInviibleParameterAnnotations", (String[]) null, false, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitMethodInsn((-2234), "", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "RuntimeInviibleParameterAnnotations");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodVisitor methodVisitor0 = classWriter0.visitMethod(16777202, "RuntimeInvisibleParameterAnnotations", "MM[V8)+0=f>63_U^f", "EnclosingMethod", stringArray0);
      methodVisitor0.visitFieldInsn(85, "?, mWF>", "", "' ja,hU");
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "VyF", "MM[V8)+0=f>63_U^f", "RuntimeInvisibleParameterAnnotations", stringArray0, false, true);
      classWriter0.visitMethod(16777218, "RuntimeInvisibleParameterAnnotations", "MM[V8)+0=f>63_U^f", "EnclosingMethod", stringArray0);
      // Undeclared exception!
      try { 
        methodWriter0.visitMaxs(16777218, 4031);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 17
         //
         verifyException("org.mockito.asm.Type", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "Label offset position has not been resolved yet", "Label offset position has not been resolved yet", "8SDxnGIBgCA", stringArray0, false, false);
      methodWriter0.classReaderOffset = 121;
      ByteVector byteVector0 = classWriter0.pool;
      // Undeclared exception!
      try { 
        methodWriter0.put(byteVector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1957, "", "StackMapTable", "StackMapTable", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 2, "Xvw)dE+X5l4<T", "b#=wsW[Et}I[\":<YG@", "", stringArray0, false, false);
      methodWriter1.visitIincInsn(2, (-4783));
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3216));
      String[] stringArray0 = new String[7];
      stringArray0[0] = "RuntimeVisibleAnnotations";
      stringArray0[1] = "RuntimeVisibleAnnotations";
      stringArray0[2] = "RuntimeVisibleAnnotations";
      stringArray0[3] = "RuntimeVisibleAnnotations";
      stringArray0[4] = "RuntimeVisibleAnnotations";
      stringArray0[5] = "RuntimeVisibleAnnotations";
      stringArray0[6] = "Synthetic";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 6, "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", stringArray0, false, false);
      ByteVector byteVector0 = classWriter0.pool;
      ByteVector byteVector1 = byteVector0.putUTF8("Synthetic");
      ByteVector byteVector2 = byteVector1.putLong(343L);
      assertSame(byteVector2, byteVector1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2797));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "tlss", "tlss", "tlss", (String[]) null, false, false);
      methodWriter0.visitMethodInsn(1, "StackMapTable", "tlss", "h");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "DO7)A", "DO7)A", "Axo1d]}AKg(?}6[F}", stringArray0, false, false);
      methodWriter0.visitFieldInsn((-1254), "addReference", "Hv $CRpAh#RbM$E", "Axo1d]}AKg(?}6[F}");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2797));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "tlss", "tlss", "tlss", (String[]) null, false, false);
      methodWriter0.visitFieldInsn(66, "h", "tlss", "h");
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.mockito.asm.Label");
      ClassWriter classWriter0 = new ClassWriter(classReader0, (byte)16);
      Attribute[] attributeArray0 = new Attribute[0];
      classReader0.accept((ClassVisitor) classWriter0, attributeArray0, (-1694));
      MethodWriter methodWriter0 = classWriter0.firstMethod;
      int int0 = methodWriter0.getSize();
      assertEquals(65, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      stringArray0[1] = "'jjP%1jW@j_/[e5jIo";
      stringArray0[2] = "StackMapTable";
      stringArray0[3] = "";
      stringArray0[4] = "y%fzZXh2D";
      stringArray0[5] = "StackMapTable";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "", "MM[V8)+0=f>63_U^f", "y%fzZXh2D", stringArray0, true, false);
      methodWriter0.visitFrame((-990), (-711), stringArray0, 2, stringArray0);
      methodWriter0.visitFrame(1957, 1, stringArray0, 140, stringArray0);
      assertEquals(6, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "VyF", "MM[V8)+0=f>63_U^f", "RuntimeInvisibleParameterAnnotations", stringArray0, true, false);
      String[] stringArray1 = new String[4];
      stringArray1[0] = "RuntimeInvisibleParameterAnnotations";
      stringArray1[1] = "RuntimeInvisibleParameterAnnotations";
      stringArray1[2] = "VyF";
      stringArray1[3] = "VyF";
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 2, "MM[V8)+0=f>63_U^f", "RuntimeInvisibleParameterAnnotations", "nZuzn0i#&+q.&_", stringArray1, false, false);
      methodWriter1.visitMethodInsn(90, "RuntimeInvisibleParameterAnnotations", "RuntimeInvisibleParameterAnnotations", "RuntimeInvisibleParameterAnnotations");
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int[] intArray0 = new int[1];
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(7, (-2884)).when(classWriter0).newClass(anyString());
      doReturn((-2884), (-2695)).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[2];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "Si;gvO|+ Uz[Dazd:", "Si;gvO|+ Uz[Dazd:", "qwW->JS]f", stringArray0, false, false);
      int int0 = MethodWriter.getNewOffset(intArray0, intArray0, 2964, (-2884));
      assertEquals((-5848), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "VyF", "MM[V8)+0=f>63_U^f", "RuntimeInvisibleParameterAnnotations", stringArray0, false, true);
      methodWriter0.visitIincInsn(4392, 4392);
      methodWriter0.visitVarInsn(2, 120);
      String[] stringArray1 = new String[2];
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 40, "Phk6", "VyF", "Synthetic", stringArray1, true, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "VyF", "MM[V8)+0=f>63_U^f", "RuntimeInvisibleParameterAnnotations", stringArray0, true, false);
      ByteVector byteVector0 = new ByteVector(40);
      String[] stringArray1 = new String[4];
      stringArray1[0] = "RuntimeInvisibleParameterAnnotations";
      stringArray1[1] = "RuntimeInvisibleParameterAnnotations";
      stringArray1[2] = "VyF";
      stringArray1[3] = "VyF";
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 2, "MM[V8)+0=f>63_U^f", "RuntimeInvisibleParameterAnnotations", "nZuzn0i#&+q.&_", stringArray1, false, false);
      methodWriter1.visitAnnotation("MM[V8)+0=f>63_U^f", false);
      methodWriter1.put(byteVector0);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "VyF", "MM[V8)+0=f>63_U^f", "RuntimeInvisibleParameterAnnoatins", stringArray0, true, false);
      methodWriter0.visitMethodInsn(1, "Cvr{7}AItrlW&@RM", "char", "MM[V8)+0=f>63_U^f");
      methodWriter0.visitVarInsn(5, 34);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String[] stringArray0 = new String[4];
      ByteVector byteVector0 = new ByteVector(12);
      byteVector0.putInt((-4645));
      byteVector0.putLong(2648L);
      byteVector0.put11(2, (-2695));
      ClassWriter classWriter0 = new ClassWriter((-5));
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, (-5), ".QNy?J;sNf", "8wAGG}2jf|B<E", "p1v}PvZN?", stringArray0, false, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = 166;
      Label label0 = mock(Label.class, new ViolatedAssumptionAnswer());
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      ClassWriter classWriter0 = new ClassWriter(166);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 166, "RuntimeVisibleAnnotations", "Z7+`$Rroq-V", (String) null, (String[]) null, false, false);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 1, "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", (String) null, (String[]) null, true, false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "", "MM[V8)+0=f>63_U^f", "RuntimeInvisibleParameterAnnotations", stringArray0, false, true);
      ByteVector byteVector0 = new ByteVector(1);
      ByteVector byteVector1 = byteVector0.put11(2, 733);
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "", "MM[V8)+0=f>63_U^f", "RuntimeInvisibleParameterAnnotations", stringArray0, false, false);
      Object[] objectArray0 = new Object[1];
      // Undeclared exception!
      try { 
        methodWriter0.visitFrame(1, 2, objectArray0, 16777218, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "gmdi^H;";
      stringArray0[1] = "8SDxnGIBgCA";
      stringArray0[2] = "jobXNA;_:kW.}";
      stringArray0[3] = "jobXNA;_:kW.}";
      stringArray0[4] = "";
      stringArray0[5] = "`=C^1v&xW:{";
      stringArray0[6] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "gmdi^H;", "MM[V8)+0=f>63_U^f", "jobXNA;_:kW.}", stringArray0, true, false);
      methodWriter0.visitLdcInsn("");
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "", "MM[V8)+0=f>63_U^f", "RuntimeInvisibleParameterAnnotations", stringArray0, true, false);
      methodWriter0.visitLdcInsn("RuntimeInvisibleParameterAnnotations");
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.mockito.asm.Label");
      ClassWriter classWriter0 = new ClassWriter(classReader0, (byte)7);
      Attribute[] attributeArray0 = new Attribute[0];
      classReader0.accept((ClassVisitor) classWriter0, attributeArray0, (-1694));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "org.mockito.asm.Label";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "+cN&d_Va`0Q", "+cN&d_Va`0Q", "org.mockito.asm.Label", stringArray0, false, false);
      int int0 = methodWriter0.getSize();
      assertEquals(26, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "", "MM[V8)+0=f>63_U^f", "", stringArray0, false, true);
      int int0 = methodWriter0.getSize();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 65, "", "G<CllTSGXE93TC/L)", "G<CllTSGXE93TC/L)", stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-1208), (-1208)).when(classWriter0).newClass(anyString());
      doReturn((-1208), (-1208)).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[2];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 185, "", "", "Exceptions", stringArray0, false, false);
      int[] intArray0 = new int[1];
      intArray0[0] = 1;
      Label label0 = new Label();
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      assertArrayEquals(new int[] {1}, intArray0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 54, "F[?NTw?6FZgR", "F[?NTw?6FZgR", "F[?NTw?6FZgR", stringArray0, false, false);
      methodWriter0.visitAnnotationDefault();
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(256);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "3M)!8ia4R";
      stringArray0[1] = "<init>";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "<init>", "3M)!8ia4R", "3M)!8ia4R", stringArray0, false, false);
      methodWriter0.visitAnnotationDefault();
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 2, "HOWS", (String) null, "HOWS", stringArray0, true, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((byte)7);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "Ljava/lang/Synthetic;";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "8)]jok,rzg}m3Sb63)", "8)]jok,rzg}m3Sb63)", (String) null, stringArray0, true, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitInsn((-122));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -122
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1065);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "K";
      stringArray0[1] = "[=L";
      stringArray0[2] = "K";
      stringArray0[3] = "[=L";
      stringArray0[4] = "[=L";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "K", "K", "[=L", stringArray0, false, false);
      methodWriter0.visitInsn(1);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "", "MM[V8)+0=f>63_U^f", "RuntimeInvisibleParameterAnnotations", stringArray0, false, true);
      methodWriter0.visitInsn(97);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1957, "", "StackMapTable", "StackMapTable", stringArray0, false, false);
      methodWriter0.visitInsn(1);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "", "MM[V8)+0=f>63_U^f", "RuntimeInvisibleParameterAnnotations", stringArray0, false, true);
      MethodVisitor methodVisitor0 = classWriter0.visitMethod(16777202, "RuntimeInvisibleParameterAnnotations", "MM[V8)+0=f>63_U^f", "EnclosingMethod", stringArray0);
      methodWriter0.visitVarInsn(100, 1);
      assertFalse(methodWriter0.equals((Object)methodVisitor0));
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      int[] intArray0 = new int[5];
      intArray0[0] = 8;
      MethodWriter.getNewOffset(intArray0, intArray0, 8, 1);
      ClassWriter classWriter0 = new ClassWriter(25);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "StackMapTable";
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 2, "Class not found", "StackMapTable", "StackMapTable", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(243, 243).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, (String) null, (String) null, (String) null, stringArray0, false, false);
      int[] intArray0 = new int[1];
      intArray0[0] = 1;
      Label label0 = mock(Label.class, new ViolatedAssumptionAnswer());
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      assertEquals(1, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.mockito.asm.Label");
      ClassWriter classWriter0 = new ClassWriter(classReader0, (byte)16);
      Attribute[] attributeArray0 = new Attribute[0];
      classReader0.accept((ClassVisitor) classWriter0, attributeArray0, (-1694));
      MethodWriter methodWriter0 = classWriter0.firstMethod;
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(243, 243).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, (String) null, (String) null, (String) null, stringArray0, false, false);
      ClassWriter classWriter1 = new ClassWriter(729);
      ByteVector byteVector0 = classWriter1.pool;
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.mockito.asm.Label");
      ClassWriter classWriter0 = new ClassWriter(classReader0, (byte)7);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "org.mockito.asm.Label";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "org.mockito.asm.Label", "org.mockito.asm.Label", "org.mockito.asm.Label", stringArray0, false, false);
      methodWriter0.visitMaxs(8, 132);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "", "MM[V8)+0=f>63_U^f", "RuntimeInvisibleParameterAnnotations", stringArray0, false, false);
      methodWriter0.visitMaxs(1984, (-525));
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodVisitor methodVisitor0 = classWriter0.visitMethod(16777218, "RuntimeInvisibleParameterAnnotations", "MM[V8)+0=f>63_U^f", "EnclosingMethod", stringArray0);
      methodVisitor0.visitVarInsn(2, 6);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "gmdi^H;";
      stringArray0[1] = "8SDxnGIBgCA";
      stringArray0[2] = "jobXNA;_:kW.}";
      stringArray0[3] = "jobXNA;_:kW.}";
      stringArray0[4] = "";
      stringArray0[5] = "`=C^1v&xW:{";
      stringArray0[6] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "gmdi^H;", "MM[V8)+0=f>63_U^f", "jobXNA;_:kW.}", stringArray0, true, false);
      methodWriter0.visitVarInsn(2, 24);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "", "MM[V8)+0=f>63_U^f", "RuntimeInvisibleParameterAnnotations", stringArray0, false, true);
      methodWriter0.visitLdcInsn("RuntimeInvisibleParameterAnnotations");
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "", "MM[V8)+0=f>63_U^f", "RuntimeInvisibleParameterAnnotations", stringArray0, false, false);
      classWriter0.newLong(1);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, (-29), "toString", ":]C mo!^+", "", stringArray0, true, false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1957, "", "StackMapTable", "StackMapTable", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 2, "Xvw)dE+X5l4<T", "b#=wsW[Et}I[\":<YG@", "", stringArray0, false, false);
      Item item0 = classWriter0.newLong(1);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.mockito.asm.Label");
      ClassWriter classWriter0 = new ClassWriter(classReader0, (byte)7);
      Attribute[] attributeArray0 = new Attribute[0];
      classReader0.accept((ClassVisitor) classWriter0, attributeArray0, (-1694));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "org.mockito.asm.Label";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "+cN&d_Va`0Q", "+cN&d_Va`0Q", "org.mockito.asm.Label", stringArray0, false, false);
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.mockito.asm.Label");
      ClassWriter classWriter0 = new ClassWriter(classReader0, (byte)7);
      Attribute[] attributeArray0 = new Attribute[0];
      String[] stringArray0 = new String[1];
      stringArray0[0] = "org.mockito.asm.Label";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "org.mockito.asm.Label", "org.mockito.asm.Label", "org.mockito.asm.Label", stringArray0, false, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitFrame(4, 1653, attributeArray0, 2, attributeArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1065);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "K";
      stringArray0[1] = "[=L";
      stringArray0[2] = "K";
      stringArray0[3] = "[=L";
      stringArray0[4] = "[=L";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "K", "K", "[=L", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(2);
      ByteVector byteVector1 = byteVector0.put12(26, 797);
      ByteVector byteVector2 = byteVector1.putShort(1);
      assertSame(byteVector2, byteVector0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(3044, 3044, 3044, 3044, 3044).when(classWriter0).newUTF8(anyString());
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, (String) null, "", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", (String[]) null, false, false);
      Label label0 = new Label();
      methodWriter0.visitLocalVariable("", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "", label0, label0, 1504);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "VyF", "MM[V8)+0=f>63_U^f", "RuntimeInvisibleParameterAnnotations", stringArray0, true, false);
      methodWriter0.visitIincInsn(2, 2);
      methodWriter0.getSize();
      String[] stringArray1 = new String[4];
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 2, "MM[V8)+0=f>63_U^f", "RuntimeInvisibleParameterAnnotations", "nZuzn0i#&+q.&_", stringArray1, false, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(classWriter0).newClass(anyString());
      doReturn(128, 80).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      String[] stringArray1 = new String[8];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2091, "qwW->JS]f", "P", "LocalVariableTable", stringArray1, false, false);
      ClassWriter classWriter1 = new ClassWriter(515);
      MethodWriter methodWriter1 = new MethodWriter(classWriter1, 256, "LocalVariableTable", "o,a90", "qwW->JS]f", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(321);
      methodWriter1.put(byteVector0);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "", "MM[V8)+0=f>63_U^f", "RuntimeInvisibleParameterAnnotations", stringArray0, false, true);
      classWriter0.visitMethod(16777218, "RuntimeInvisibleParameterAnnotations", "MM[V8)+0=f>63_U^f", "EnclosingMethod", stringArray0);
      Item item0 = classWriter0.newFloat(2864);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(256);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "3M)!8ia4R";
      stringArray0[1] = "LQ+A1|[lQ@>";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1640), "Axo1d]}AKg(?}6[F}", "0w3!-", "0w3!-", stringArray0, false, false);
      methodWriter0.visitIincInsn(256, (-2627));
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "Label offset position has not been resolved yet", "Label offset position has not been resolved yet", "8SDxnGIBgCA", stringArray0, false, false);
      Label label0 = new Label();
      methodWriter0.visitJumpInsn(660, label0);
      methodWriter0.visitLineNumber(660, label0);
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 1, "MM[V8)+0=f>63_U^f", "JSR/RET are not supported with computeFrames option", "JSR/RET are not supported with computeFrames option", stringArray0, true, false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "StackMapTable", "m", ".", stringArray0, false, false);
      ByteVector byteVector0 = classWriter0.pool;
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "1w63IiPgE+r<i~|=@)", "1w63IiPgE+r<i~|=@)", "e2j[l", stringArray0, false, false);
      methodWriter1.visitVarInsn(2, 321);
      methodWriter1.put(byteVector0);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "", "MM[V8)+0=f>63_U^f", "", stringArray0, false, true);
      methodWriter0.visitLdcInsn("MM[V8)+0=f>63_U^f");
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodVisitor methodVisitor0 = classWriter0.visitMethod(16777202, "RuntimeInvisibleParameterAnnotations", "MM[V8)+0=f>63_U^f", "EnclosingMethod", stringArray0);
      methodVisitor0.visitMaxs(2, 47);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.mockito.asm.Label");
      ClassWriter classWriter0 = new ClassWriter(1441);
      classReader0.accept((ClassVisitor) classWriter0, 18);
      assertEquals(2, ClassReader.SKIP_DEBUG);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Label label0 = mock(Label.class, new ViolatedAssumptionAnswer());
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(7, (-2884)).when(classWriter0).newClass(anyString());
      doReturn((-2884), (-2695), 0, 0, 0).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[2];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "Si;gvO|+ Uz[Dazd:", "Si;gvO|+ Uz[Dazd:", "Si;gvO|+ Uz[Dazd:", stringArray0, false, false);
      methodWriter0.visitLocalVariable("Si;gvO|+ Uz[Dazd:", "Si;gvO|+ Uz[Dazd:", "Si;gvO|+ Uz[Dazd:", label0, label0, (-2695));
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-3365), (-5679), (-3365), 34, (-3365)).when(classWriter0).newClass(anyString());
      doReturn((-3365), (-3365), (-3365), (-3365), (-3365)).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[6];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1056, "r-<Q%?", "JSR/RET are not supported with computeFrames option", "g", stringArray0, false, false);
      methodWriter0.visitFrame(2, 1056, stringArray0, 1056, stringArray0);
      methodWriter0.visitVarInsn(1056, (-2082));
      ClassWriter classWriter1 = new ClassWriter(2);
      ByteVector byteVector0 = classWriter1.pool;
      ByteVector byteVector1 = byteVector0.putByte(101);
      methodWriter0.put(byteVector0);
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "", "MM[V8)+0=f>63_U^f", "RuntimeInvisibleParameterAnnotations", stringArray0, false, true);
      MethodWriter methodWriter1 = (MethodWriter)classWriter0.visitMethod(16777202, "RuntimeInvisibleParameterAnnotations", "MM[V8)+0=f>63_U^f", "EnclosingMethod", stringArray0);
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter1.put(byteVector0);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "-}", "-}", "put", stringArray0, false, false);
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
      methodWriter0.visitAnnotation("5rV3vPq*", true);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "DO7)A", "DO7)A", "Axo1d]}AKg(?}6[F}", stringArray0, false, false);
      Object[] objectArray0 = new Object[3];
      methodWriter0.visitFrame((-1203), 2650, stringArray0, 3, objectArray0);
      methodWriter0.visitVarInsn(262144, 50);
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
  }
}
