/*

 * Tue Mar 03 14:31:15 GMT 2020
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
import org.mockito.asm.ClassWriter;
import org.mockito.asm.Label;
import org.mockito.asm.MethodWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MethodWriter_ESTest extends MethodWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3995));
      ByteVector byteVector0 = new ByteVector(1);
      byteVector0.putLong((-15L));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE";
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 4, "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE", "]", "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE", stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3995));
      ByteVector byteVector0 = new ByteVector(99);
      byteVector0.putLong(0L);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE";
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 4, "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE", "]", "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE", stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(889);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-973), "MnTj%9i3", "MnTj%9i3", "MnTj%9i3", (String[]) null, false, false);
      methodWriter0.classReaderOffset = (-973);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-973), "y.X[JS.2ko_z|/", "-Qkr6=^ [", "Label offset position has not been resolved yet", (String[]) null, false, false);
      // Undeclared exception!
      try { 
        classWriter0.toByteArray();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-5053), 578).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (byte)88, "LineNumberTable", "LineNumberTable", "LineNumberTable", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector((byte)25);
      ByteVector byteVector1 = byteVector0.putLong((byte)88);
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((int)(byte)0).when(classWriter0).newClass(anyString());
      doReturn((int)(byte)25, 578).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[1];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 0, "LineNumberTable", "LineNumberTable", "LineNumberTable", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector((byte)0);
      ByteVector byteVector1 = byteVector0.putLong((byte)0);
      assertSame(byteVector1, byteVector0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-5053), 578).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 0, "LineNumberTable", "LineNumberTable", "LineNumberTable", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector((byte)0);
      ByteVector byteVector1 = byteVector0.putLong((byte)25);
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(889);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-974), "MnTj%9i3", "MnTj%9i3", "MnTj%9i3", (String[]) null, false, false);
      methodWriter0.visitMethodInsn(1, "TlK)2Jb<;&~Dy(", "MnTj%9i3", "MnTj%9i3");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3995));
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "={", "~f/O%O00uYJ:e/", "", stringArray0, false, false);
      methodWriter0.classReaderOffset = 3;
      int int0 = methodWriter0.getSize();
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(889);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "Xr<eLv8";
      stringArray0[1] = "$,e-rcQf)\u0001C\"*}>nyU";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 63, "$,e-rcQf)\u0001C\"*}>nyU", "$,e-rcQf)\u0001C\"*}>nyU", "$,e-rcQf)\u0001C\"*}>nyU", stringArray0, true, true);
      methodWriter0.visitLdcInsn("Xr<eLv8");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(889);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-974), "MnTj%9i3", "MnTj%9i3", "MnTj%9i3", (String[]) null, false, false);
      methodWriter0.visitFieldInsn((-4882), "MnTj%9i3", "MnTj%9i3", "MnTj%9i3");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[1];
      Label label0 = new Label();
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      assertArrayEquals(new int[] {0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(889);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "MnTj%9i3", "MnTj%9i3", "MnTj%9i3", (String[]) null, false, false);
      methodWriter0.visitFrame(2, 196, (Object[]) null, (byte) (-87), (Object[]) null);
      methodWriter0.visitFrame((byte) (-87), 16, (Object[]) null, (byte) (-87), (Object[]) null);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(889);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "MnTj%9i3";
      stringArray0[1] = "$,e-rcQf)\u0001C\"*}>nyU";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 63, "$,e-rcQf)\u0001C\"*}>nyU", "$,e-rcQf)\u0001C\"*}>nyU", "$,e-rcQf)\u0001C\"*}>nyU", stringArray0, true, true);
      // Undeclared exception!
      try { 
        methodWriter0.visitMaxs(1433, 889);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 18
         //
         verifyException("org.mockito.asm.Type", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(889);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-974), "MnTj%9i3", "MnTj%9i3", "MnTj%9i3", (String[]) null, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 28, "Code", "])D=.}Ifj", "LocalVariableTable", (String[]) null, true, false);
      methodWriter1.visitInsn(115);
      assertNotSame(methodWriter1, methodWriter0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((byte)0);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (byte)0, "LineNumberTable", "LineNumberTable", "LineNumberTable", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-2121), "LineNumberTable", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "znL", stringArray0, false, false);
      methodWriter1.visitAnnotation("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", false);
      ByteVector byteVector0 = new ByteVector((byte)0);
      methodWriter1.put(byteVector0);
      assertNotSame(methodWriter1, methodWriter0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(6, 6, 6, 6, 185).when(classWriter0).newClass(anyString());
      doReturn(185, 6).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[5];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 196, "Signature", "Signature", "Signature", stringArray0, false, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitMethodInsn(185, "Signature", (String) null, "Signature");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3995));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-3995), "eZSaP3{1*Q", "eZSaP3{1*Q", "eZSaP3{1*Q", stringArray0, false, false);
      methodWriter0.visitLdcInsn("");
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-393));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "LineNumberTable", "bB_U+H=rp)wD", "{~8Gl2DgC*}<i)[y-L", (String[]) null, true, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitMethodInsn((-393), "{~8Gl2DgC*}<i)[y-L", "ConstantValue", "");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(889);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "{~8Gl2DgC*}<i)[y-L", "{~8Gl2DgC*}<i)[y-L", (String) null, (String[]) null, false, true);
      methodWriter0.visitMethodInsn(1, "", "\"s[Xu?Uw;", "\"s[Xu?Uw;");
      String[] stringArray0 = new String[5];
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 312, "Exceptions", "{~8Gl2DgC*}<i)[y-L", "Exceptions", stringArray0, false, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777221);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "LineNumberTable";
      stringArray0[1] = "LineNumberTable";
      stringArray0[2] = "LineNumberTable";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-350), "LineNumberTable", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", stringArray0, false, false);
      methodWriter0.visitVarInsn(918, (byte)0);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, (-350), "LineNumberTable", "V", "sd&s~", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(889);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-974), "MnTj%9i3", "MnTj%9i3", "MnTj%9i3", (String[]) null, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 2, "Code", "])D=.}Ifj", "LocalVariableTable", (String[]) null, true, false);
      // Undeclared exception!
      try { 
        methodWriter1.visitVarInsn((-3371), (-974));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3371
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777221);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII";
      stringArray0[1] = "LineNumberTable";
      stringArray0[2] = "LineNumberTable";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-350), "LineNumberTable", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", stringArray0, false, false);
      int[] intArray0 = new int[3];
      intArray0[1] = 16777221;
      MethodWriter.getNewOffset(intArray0, intArray0, 2, (-1080));
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 1, "LineNumberTable", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "',E4", stringArray0, true, false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(268435456);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "kBHZBJzR*";
      stringArray0[1] = "',E4";
      stringArray0[2] = "Signature";
      stringArray0[3] = "',E4";
      stringArray0[4] = "Signature";
      stringArray0[5] = "',E4";
      stringArray0[6] = "8";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 0, "8", "])D=.}Ifj", "Signature", stringArray0, true, true);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3995));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-3995), "eZSaP3{1*Q", "eZSaP3{1*Q", "eZSaP3{1*Q", stringArray0, false, false);
      methodWriter0.visitVarInsn((-32768), 1048575);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(889);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-974), "MnTj%9i3", "MnTj%9i3", "MnTj%9i3", (String[]) null, false, false);
      Attribute attribute0 = new Attribute("]f/-Z0Bl|b%");
      methodWriter0.visitAttribute(attribute0);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 956, "/8yH7a.D]P?2V]", "MnTj%9i3", "/8yH7a.D]P?2V]", (String[]) null, false, false);
      ByteVector byteVector0 = new ByteVector(1199);
      // Undeclared exception!
      try { 
        methodWriter0.put(byteVector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.Attribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-5053), 578, 69, (int)(byte)25).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 0, "LineNumberTable", "LineNumberTable", "LineNumberTable", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector((byte)0);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3995));
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "bB_U+H=rp)wD";
      stringArray0[2] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "", "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDC4CDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE", "bB_U+H=rp)wD", stringArray0, false, false);
      Label[] labelArray0 = new Label[3];
      methodWriter0.visitVarInsn(20, 0);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
      methodWriter0.visitFrame((-1), 0, stringArray0, 0, labelArray0);
      assertEquals(3, labelArray0.length);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(889);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "MnTj%9i3";
      stringArray0[1] = "$,e-rcQf)\u0001C\"*}>nyU";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 63, "$,e-rcQf)\u0001C\"*}>nyU", "$,e-rcQf)\u0001C\"*}>nyU", "$,e-rcQf)\u0001C\"*}>nyU", stringArray0, true, true);
      ByteVector byteVector0 = classWriter0.pool;
      ByteVector byteVector1 = byteVector0.putShort(410);
      byte[] byteArray0 = new byte[2];
      byteVector1.data = byteArray0;
      // Undeclared exception!
      try { 
        byteVector0.put11(85, 889);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3996));
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "", "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDC4CDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE", "HK", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(2);
      ByteVector byteVector1 = byteVector0.put12(4, 1139);
      ByteVector byteVector2 = byteVector1.put11(1500, (-3996));
      assertSame(byteVector2, byteVector1);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(889);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 889, "MnTj%9i3", "MnTj%9i3", "MnTj%9i3", (String[]) null, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 2, "char", "MnTj%9i3", "MnTj%9i3", (String[]) null, false, false);
      Object[] objectArray0 = new Object[2];
      // Undeclared exception!
      try { 
        methodWriter1.visitFrame(1, 24, objectArray0, 24, (Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Label label0 = new Label();
      ClassWriter classWriter0 = new ClassWriter((-3995));
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE";
      stringArray0[2] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "", "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE", "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE", stringArray0, false, false);
      methodWriter0.visitTryCatchBlock(label0, label0, label0, "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE");
      methodWriter0.visitMethodInsn(2, "RuntimeVisibleAnnotations", "", "[<LNk1iJa<UL=/Qwz+n");
      classWriter0.toByteArray();
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 2, "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE", "',E4", "RuntimeVisibleAnnotations", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "MnTj%9i3";
      stringArray0[1] = "MnTj%9i3";
      stringArray0[2] = "MnTj%9i3";
      stringArray0[3] = "W8hpB{";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 0, "MnTj%9i3", "MnTj%9i3", "W8hpB{", stringArray0, false, false);
      methodWriter0.visitFrame(1, 1, stringArray0, 2499, stringArray0);
      assertEquals(4, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(889);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-974), "MnTj%9i3", "MnTj%9i3", "MnTj%9i3", (String[]) null, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 956, "/8yH7a.D]P?2V]", "MnTj%9i3", "/8yH7a.D]P?2V]", (String[]) null, false, false);
      ByteVector byteVector0 = new ByteVector(1199);
      classWriter0.version = 4787;
      methodWriter0.put(byteVector0);
      assertNotSame(methodWriter0, methodWriter1);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3995));
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "", "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDC4CDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE", "HK", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 2, "={", "~f/O%O00uYJ:e/", "", stringArray0, false, false);
      methodWriter0.visitVarInsn(1436, 1436);
      assertNotSame(methodWriter0, methodWriter1);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Label label0 = new Label();
      ClassWriter classWriter0 = new ClassWriter((-3995));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-3995), "eZSaP3{1*Q", "eZSaP3{1*Q", "eZSaP3{1*Q", stringArray0, false, false);
      methodWriter0.visitAnnotation("char", true);
      methodWriter0.visitTryCatchBlock(label0, label0, label0, "");
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 2, "", "", "eZSaP3{1*Q", stringArray0, false, false);
      methodWriter0.visitFieldInsn(2, "&+", "_,8gv}i=\"`YY", "StackMap");
      assertNotSame(methodWriter0, methodWriter1);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(47);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 4, "\"upb$&3Ga_s)l7$x ", "S7G`j5/VTY[L!?i", ".et!45}q\"saGKH*Hw=", stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3995));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-3995), "eZSaP3{1*Q", "eZSaP3{1*Q", "eZSaP3{1*Q", stringArray0, false, false);
      int[] intArray0 = new int[1];
      int int0 = MethodWriter.getNewOffset(intArray0, intArray0, (-854), 248);
      assertEquals(1102, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 88);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "java/lang/Object";
      stringArray0[1] = "java/lang/Object";
      stringArray0[2] = "`,<~Hot=WiwLO,W}";
      stringArray0[3] = "java/lang/Class";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 4, "java/lang/Class", "`,<~Hot=WiwLO,W}", ">,", stringArray0, false, false);
      methodWriter0.visitAnnotationDefault();
      ByteVector byteVector0 = new ByteVector(91);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(0, 1006, 1417, 1417).when(classWriter0).newClass(anyString());
      doReturn(0, 1006).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[4];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-436), "H/BgvK$(Mf", "LineNumberTable", "LineNumberTable", stringArray0, false, false);
      methodWriter0.visitFrame(0, 0, stringArray0, 0, stringArray0);
      assertEquals(4, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3995));
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "bB_U+H=rp)wD";
      stringArray0[2] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "", "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDC4CDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE", "bB_U+H=rp)wD", stringArray0, false, false);
      Attribute attribute0 = new Attribute("");
      methodWriter0.visitAttribute(attribute0);
      // Undeclared exception!
      try { 
        methodWriter0.getSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.Attribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1360));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1360), "!tr9v=", "!tr9v=", "!tr9v=", stringArray0, false, false);
      methodWriter0.visitAnnotationDefault();
      classWriter0.toByteArray();
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 2, "ezsYDk", "ezsYDk", "", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(889);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "Xr<eLv8";
      stringArray0[1] = "$,e-rcQf)\u0001C\"*}>nyU";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 63, "$,e-rcQf)\u0001C\"*}>nyU", "$,e-rcQf)\u0001C\"*}>nyU", "$,e-rcQf)\u0001C\"*}>nyU", stringArray0, true, true);
      // Undeclared exception!
      try { 
        methodWriter0.visitInsn(30);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.Frame", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3995));
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "bB_U+H=rp)wD";
      stringArray0[2] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "", "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDC4CDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE", "bB_U+H=rp)wD", stringArray0, false, false);
      methodWriter0.visitInsn(1);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3995));
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "bB_U+H=rp)wD";
      stringArray0[2] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "", "", "bB_U+H=rp)wD", stringArray0, false, false);
      Label[] labelArray0 = new Label[3];
      classWriter0.newLong(2);
      // Undeclared exception!
      try { 
        methodWriter0.visitFrame((-1), 2, stringArray0, 2, labelArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Label label0 = new Label();
      ClassWriter classWriter0 = new ClassWriter((-3995));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-3995), "eZSaP3{1*Q", "eZSaP3{1*Q", "eZSaP3{1*Q", stringArray0, false, false);
      methodWriter0.visitInsn(2);
      methodWriter0.visitTryCatchBlock(label0, label0, label0, "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(142, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(889);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "MnTj%9i3";
      stringArray0[1] = "$,e-rcQf)\u0001C\"*}>nyU";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 63, "$,e-rcQf)\u0001C\"*}>nyU", "$,e-rcQf)\u0001C\"*}>nyU", "$,e-rcQf)\u0001C\"*}>nyU", stringArray0, true, true);
      methodWriter0.visitVarInsn(46, 46);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3995));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-3995), "eZSaP3{1*Q", "eZSaP3{1*Q", "eZSaP3{1*Q", stringArray0, false, false);
      methodWriter0.visitMaxs(23, 1);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3995));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-3995), "eZSaP3{1*Q", "eZSaP3{1*Q", "eZSaP3{1*Q", stringArray0, false, false);
      Attribute attribute0 = new Attribute("");
      methodWriter0.visitAttribute(attribute0);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 2, "", "", "eZSaP3{1*Q", stringArray0, false, false);
      // Undeclared exception!
      try { 
        methodWriter0.getSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.Attribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(889);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "MnTj%9i3";
      stringArray0[1] = "$,e-rcQf)\u0001C\"*}>nyU";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 63, "$,e-rcQf)\u0001C\"*}>nyU", "$,e-rcQf)\u0001C\"*}>nyU", "$,e-rcQf)\u0001C\"*}>nyU", stringArray0, true, true);
      methodWriter0.visitVarInsn(2, 2);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3995));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-3995), "eZSaP3{1*Q", "eZSaP3{1*Q", "eZSaP3{1*Q", stringArray0, false, false);
      methodWriter0.visitFieldInsn(900, "", "eZSaP3{1*Q", "StackMap");
      methodWriter0.visitMethodInsn(2145, "AnnotationDefault", "Ljava/lang/Synthetic;", "&+");
      methodWriter0.visitFieldInsn((-268435456), "eZSaP3{1*Q", "", "org.mockito.asm.Edge");
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(889);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-974), "MnTj%9i3", "MnTj%9i3", "MnTj%9i3", (String[]) null, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 956, "/8yH7a.D]P2V]", "MnTj%9i3", "/8yH7a.D]P2V]", (String[]) null, false, false);
      ByteVector byteVector0 = new ByteVector(1199);
      ByteVector byteVector1 = byteVector0.putLong(0L);
      assertSame(byteVector1, byteVector0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(889);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-974), "MnTj%9i3", "MnTj%9i3", "MnTj%9i3", (String[]) null, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 0, "TlK)2Jb<;&~Dy(", "TlK)2Jb<;&~Dy(", "TlK)2Jb<;&~Dy(", (String[]) null, false, false);
      ByteVector byteVector0 = new ByteVector(2);
      ByteVector byteVector1 = byteVector0.putLong(0);
      ByteVector byteVector2 = byteVector1.put11(28, (-1504));
      assertSame(byteVector1, byteVector2);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(889);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-974), "MnTj%9i3", "MnTj%9i3", "MnTj%9i3", (String[]) null, false, false);
      Label label0 = new Label();
      methodWriter0.visitLineNumber(1, label0);
      methodWriter0.visitIincInsn(889, 39);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 956, "/8yH7a.D]P2V]", "MnTj%9i3", "/8yH7a.D]P2V]", (String[]) null, false, false);
      ByteVector byteVector0 = new ByteVector(1199);
      methodWriter0.put(byteVector0);
      assertNotSame(methodWriter0, methodWriter1);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3995));
      String[] stringArray0 = new String[2];
      stringArray0[0] = "int";
      stringArray0[1] = "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 3189, "bB_U+H=rp)wD", "1T+)d4tB ", "MnTj%9i3", stringArray0, false, false);
      methodWriter0.visitFrame(4, 2, stringArray0, 255, stringArray0);
      assertEquals(2, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777221);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "LineNumberTable";
      stringArray0[1] = "LineNumberTable";
      stringArray0[2] = "LineNumberTable";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-350), "LineNumberTable", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", stringArray0, false, false);
      methodWriter0.visitAnnotation("LineNumberTable", true);
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, (-350), "LineNumberTable", "V", "sd&s~", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(889);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-711), "MnTj%9i3", "MnTj%9i3", "MnTj%9i3", (String[]) null, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 0, "MnTj%9i3", "(zh0\"r .M)l;", "", (String[]) null, true, true);
      methodWriter1.visitVarInsn(48, 0);
      assertNotSame(methodWriter1, methodWriter0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1400));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1400), "eZSaP3{1*Q", "eZSaP3{1*Q", "eZSaP3{1*Q", stringArray0, false, false);
      Attribute attribute0 = new Attribute("");
      methodWriter0.visitAttribute(attribute0);
      ByteVector byteVector0 = new ByteVector(1);
      // Undeclared exception!
      try { 
        methodWriter0.put(byteVector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.Attribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3995));
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "", "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDC4CDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE", "", stringArray0, false, false);
      methodWriter0.visitAnnotation("EnclosingMethod", false);
      classWriter0.toByteArray();
      Label[] labelArray0 = new Label[3];
      methodWriter0.visitFrame((-1), 0, stringArray0, 0, labelArray0);
      assertEquals(3, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      int[] intArray0 = new int[4];
      Label label0 = new Label();
      ClassWriter classWriter0 = new ClassWriter((-3995));
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "", "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDC4CDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE", "bB_U+H=rp)wD", stringArray0, false, false);
      Label[] labelArray0 = new Label[3];
      labelArray0[0] = label0;
      labelArray0[1] = label0;
      labelArray0[2] = label0;
      methodWriter0.visitLookupSwitchInsn(label0, intArray0, labelArray0);
      methodWriter0.visitLookupSwitchInsn(label0, intArray0, labelArray0);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 247, "", "AnnotationDefault", "Ljava/lang/Synthetic;", stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((byte) (-9));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (byte)0, "LineNumberTable", "LineNumberTable", "LineNumberTable", stringArray0, false, false);
      methodWriter0.visitIincInsn((byte)39, 365);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(889);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-974), "MnTj%9i3", "MnTj%9i3", "MnTj%9i3", (String[]) null, false, false);
      Label label0 = new Label();
      methodWriter0.visitJumpInsn(3248, label0);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 2441, "eZSaP3{1*Q", "", "eZSaP3{1*Q", (String[]) null, false, false);
      methodWriter0.visitLocalVariable("AnnotationDefault", "Code", "", label0, label0, 2441);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(262, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((int)(byte)0).when(classWriter0).newClass(anyString());
      doReturn((int)(byte)3, 578, (int)(byte)3, 578, 768).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[1];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 0, "LineNumberTable", "LineNumberTable", "LineNumberTable", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector((byte)0);
      methodWriter0.visitIincInsn(33, 2);
      Label label0 = new Label();
      methodWriter0.visitLocalVariable("org.mockito.asm.Type", "long", "org.mockito.asm.Type", label0, label0, (-607));
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3995));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-3995), "eZSaP3{1*Q", "eZSaP3{1*Q", "eZSaP3{1*Q", stringArray0, false, false);
      methodWriter0.visitInsn(2);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(128, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3996));
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "", "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDC4CDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE", "HK", stringArray0, false, false);
      methodWriter0.visitIincInsn(964, 1139);
      methodWriter0.visitFrame(964, 16, stringArray0, 1139, stringArray0);
      ByteVector byteVector0 = new ByteVector(2);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(889);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "MnTj%9i3";
      stringArray0[1] = "$,e-rcQf)\u0001C\"*}>nyU";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 63, "$,e-rcQf)\u0001C\"*}>nyU", "$,e-rcQf)\u0001C\"*}>nyU", "$,e-rcQf)\u0001C\"*}>nyU", stringArray0, true, true);
      methodWriter0.visitIincInsn(889, 889);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      MethodWriter.getArgumentsAndReturnSizes("YP)6jc|^ ef");
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 9, "YP)6jc|^ ef", "YP)6jc|^ ef", (String) null, stringArray0, false, false);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3995));
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "bB_U+H=rp)wD";
      stringArray0[2] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "", "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDC4CDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE", "bB_U+H=rp)wD", stringArray0, false, false);
      methodWriter0.visitMaxs((-3995), (-3995));
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(889);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 16, "Code", "])D=.}Ifj", "LocalVariableTable", (String[]) null, true, false);
      methodWriter0.visitMaxs(2280, 18);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(889);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-974), "MnTj%9i3", "MnTj%9i3", "MnTj%9i3", (String[]) null, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 16, "Code", "])D=.}Ifj", "LocalVariableTable", (String[]) null, true, false);
      methodWriter1.visitMaxs(2280, 18);
      assertNotSame(methodWriter1, methodWriter0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(889);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-974), "MnTj%9i3", "MnTj%9i3", "MnTj%9i3", (String[]) null, false, false);
      methodWriter0.visitIntInsn(17, 952);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3995));
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "", "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDC4CDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE", "", stringArray0, false, false);
      methodWriter0.visitAnnotation("EnclosingMethod", true);
      classWriter0.toByteArray();
      Label[] labelArray0 = new Label[3];
      methodWriter0.visitFrame((-1), 0, stringArray0, 0, labelArray0);
      assertEquals(3, labelArray0.length);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3995));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-3995), "eZSaP3{1*Q", "eZSaP3{1*Q", "eZSaP3{1*Q", stringArray0, false, false);
      methodWriter0.visitAnnotation("char", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(149, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Label label0 = new Label();
      ClassWriter classWriter0 = new ClassWriter((-3995));
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "bB_U+H=rp)wD";
      stringArray0[2] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "", "", "bB_U+H=rp)wD", stringArray0, false, false);
      methodWriter0.visitTryCatchBlock(label0, label0, label0, "");
      methodWriter0.visitIincInsn(9, 10);
      classWriter0.toByteArray();
      Label[] labelArray0 = new Label[3];
      // Undeclared exception!
      try { 
        methodWriter0.visitFrame((-1), 59, stringArray0, 59, labelArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Label label0 = new Label();
      ClassWriter classWriter0 = new ClassWriter((-3995));
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "bB_U+H=rp)wD";
      stringArray0[2] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "", "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDC4CDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE", "bB_U+H=rp)wD", stringArray0, false, false);
      methodWriter0.visitTryCatchBlock(label0, label0, label0, "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDC4CDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE");
      Label[] labelArray0 = new Label[1];
      labelArray0[0] = label0;
      methodWriter0.visitTableSwitchInsn(2, 2, label0, labelArray0);
      classWriter0.toByteArray();
      methodWriter0.visitFrame((-1), 0, stringArray0, 0, labelArray0);
      assertEquals(1, labelArray0.length);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(889);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-711), "MnTj%9i3", "MnTj%9i3", "MnTj%9i3", (String[]) null, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 0, "MnTj%9i3", "(zh0\"r .M)l;", "", (String[]) null, true, true);
      methodWriter1.visitIincInsn(57, 1982);
      assertNotSame(methodWriter1, methodWriter0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(889);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 889, "MnTj%9i3", "MnTj%9i3", "MnTj%9i3", (String[]) null, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 57, "hmaoZ&{f_gj", "kX<Gj)\"f'NDWk", "5R3ne:$?8|", (String[]) null, true, false);
      methodWriter1.visitIincInsn((-134), 99);
      assertNotSame(methodWriter1, methodWriter0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(889);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-711), "MnTj%9i3", "MnTj%9i3", "MnTj%9i3", (String[]) null, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 0, "MnTj%9i3", "(zh0\"r .M)l;", "", (String[]) null, true, true);
      methodWriter0.visitVarInsn(0, 198);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(161, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3995));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-3995), "eZSaP3{1*Q", "eZSaP3{1*Q", "eZSaP3{1*Q", stringArray0, false, false);
      Object[] objectArray0 = new Object[2];
      methodWriter0.visitFrame(1, (-3492), objectArray0, 127, stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((byte) (-9));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (byte)0, "LineNumberTable", "LineNumberTable", "LineNumberTable", stringArray0, false, false);
      Object[] objectArray0 = new Object[4];
      // Undeclared exception!
      try { 
        methodWriter0.visitFrame((byte)0, 1078, objectArray0, 16, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      int[] intArray0 = new int[4];
      ClassWriter classWriter0 = new ClassWriter((-3995));
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE";
      stringArray0[2] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "", "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE", "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE", stringArray0, false, false);
      MethodWriter.getNewOffset(intArray0, intArray0, 2, (-2556));
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 2, "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE", "',E4", "RuntimeVisibleAnnotations", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3995));
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "bB_U+H=rp)wD";
      stringArray0[2] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "", "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDC4CDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE", "bB_U+H=rp)wD", stringArray0, false, false);
      classWriter0.toByteArray();
      Label[] labelArray0 = new Label[3];
      // Undeclared exception!
      try { 
        methodWriter0.visitFrame((-1), 30, stringArray0, 30, labelArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }
}
