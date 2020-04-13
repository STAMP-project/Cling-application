/*

 * Tue Mar 03 14:33:51 GMT 2020
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
import org.mockito.asm.Label;
import org.mockito.asm.MethodWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MethodWriter_ESTest extends MethodWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(classWriter0).newClass(anyString());
      doReturn(1615, 1615, 67, 1615, 0).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[1];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1615, (String) null, (String) null, ".s.IFJDCS", stringArray0, false, false);
      Label label0 = new Label();
      methodWriter0.visitLocalVariable("[HOygAO'/9,/`l", ">Zrlluzi_t]\"", ".s.IFJDCS", label0, label0, (-1022));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(65).when(classWriter0).newClass(anyString());
      doReturn(65, 65).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[1];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "cJM'fl\"!+t", "Dq(UnTy/=odo", "Dq(UnTy/=odo", stringArray0, false, false);
      methodWriter0.classReaderOffset = 21;
      ByteVector byteVector0 = new ByteVector();
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
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(13);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "StackMt@Iap";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "<init>", "ep():jeNf", "StackMt@Iap", stringArray0, true, true);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 13, "jWd", "ep():jeNf", (String) null, stringArray0, true, true);
      methodWriter0.visitIincInsn(26, 1);
      assertNotSame(methodWriter0, methodWriter1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(25);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "ep():jeNf", "<init>", "sYW )9rd.;YJ&U_", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.putLong(1);
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(436, (-86)).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-391), "TNFf&/|b", "s``};0m`or", "LineNumberTable", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(1);
      ByteVector byteVector1 = byteVector0.putLong((-2853L));
      assertSame(byteVector1, byteVector0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(25);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "DPKHU]??<";
      stringArray0[1] = "KFBu<!]";
      stringArray0[2] = "RNo-~XlV*?^z0`";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "r", "DPKHU]??<", "StackMap", stringArray0, false, false);
      methodWriter0.visitMethodInsn(1, "t{K5", "RNo-~XlV*?^z0`", "*!H^dv.mQ#rc%,a'>");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(25);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "?]@(=C)f8", "?]@(=C)f8", "?]@(=C)f8", stringArray0, false, false);
      methodWriter0.visitLdcInsn("<init>");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(25);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "sYW )9rd.;YJ&U_", "?]@(=C)f8", "sYW )9rd.;YJ&U_", stringArray0, false, false);
      methodWriter0.visitFieldInsn(1929, "%j", "?]@(=C)f8", "[01eiy_uVXU;");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "y<vQju@3C#BJ", "Exceptions", "5T1)j", (String[]) null, false, false);
      methodWriter0.visitFieldInsn(175, "'5$c{Qej*d5#f\"", "writeObject", "AnnotationDefault");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(13);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "StackMap";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "<init>", "ep():jeNf", "StackMap", stringArray0, true, true);
      methodWriter0.classReaderOffset = (-2716);
      int int0 = methodWriter0.getSize();
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(262144);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "doue", "=[:l8e_bu*Q}Ft*E", "iit>", (String[]) null, false, false);
      methodWriter0.visitFrame(262144, 1, (Object[]) null, 16777220, (Object[]) null);
      methodWriter0.visitFrame(16777220, 8, (Object[]) null, 687, (Object[]) null);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3773);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "P/M`H7";
      stringArray0[1] = "ep():jeNf";
      stringArray0[2] = "P/M`H7";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "P/M`H7", "ep():jeNf", "Ro{9W", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 0, "JSR/RET are not supported with computeFrames option", "double", "JSR/RET are not supported with computeFrames option", stringArray0, false, false);
      methodWriter1.visitInsn(128);
      int int0 = methodWriter1.getSize();
      assertEquals(49, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(25);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "<init>", "<init>", "5T1)j", (String[]) null, false, false);
      int[] intArray0 = new int[8];
      intArray0[0] = 25;
      int int0 = MethodWriter.getNewOffset(intArray0, intArray0, 128, 2);
      assertEquals((-151), int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3773);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "ep(sjeNf";
      stringArray0[1] = "ep(sjeNf";
      stringArray0[2] = "Ro{9W";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "ep(sjeNf", "ep(sjeNf", "Ro{9W", stringArray0, false, false);
      methodWriter0.visitAnnotation("vN+q<?X`G$f'v*", false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 2, "ep(sjeNf", "vN+q<?X`G$f'v*", "6(9PJ:*_&G:NNu-", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
      assertNotSame(methodWriter0, methodWriter1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(436, (-86)).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-391), "TNFf&/|b", "s``};0m`or", "s``};0m`or", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(1);
      ByteVector byteVector1 = byteVector0.put11(166, 110);
      assertSame(byteVector1, byteVector0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(25);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 62, "double", "=[:l8e_bu*Q}Ft*E", "?]@(=C)f8", (String[]) null, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "?]@(=C)f8", "?]@(=C)f8", "double", (String[]) null, false, false);
      Label label0 = new Label();
      int[] intArray0 = new int[6];
      intArray0[0] = 104;
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      assertEquals(6, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(25);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "ep():jeNf", "<init>", "sYW )9rd.;YJ&U_", stringArray0, false, false);
      methodWriter0.visitVarInsn((-670), 46);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(25);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "doue", "=[:l8e_bu*Q}Ft*E", "iit>", (String[]) null, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 73, "iit>", "doue", "=[:l8e_bu*Q}Ft*E", (String[]) null, false, false);
      ByteVector byteVector0 = new ByteVector(127);
      Attribute attribute0 = new Attribute("7jTZh4>J");
      methodWriter1.visitAttribute(attribute0);
      // Undeclared exception!
      try { 
        methodWriter1.put(byteVector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.Attribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3773);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "ep():jeNf";
      stringArray0[1] = "ep():jeNf";
      stringArray0[2] = "ep():jeNf";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "ep():jeNf", "ep():jeNf", "Ro{9W", stringArray0, true, false);
      Object[] objectArray0 = new Object[8];
      // Undeclared exception!
      try { 
        methodWriter0.visitFrame(1, 1225, objectArray0, 3773, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(13);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "ep():jeNf";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "<init>", "ep():jeNf", "ep():jeNf", stringArray0, true, true);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 13, "jWd", "ep():jeNf", (String) null, stringArray0, true, true);
      methodWriter0.visitVarInsn(21, 549);
      assertNotSame(methodWriter0, methodWriter1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "y<vQju@3C#BJ", "Exceptions", "5T1)j", (String[]) null, false, false);
      methodWriter0.visitAnnotation("5T1)j", true);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 53, "6(9PJ:*_&G:NNu-", "9gKiG;", "KjX7^00t<h'\"$z3hA", (String[]) null, false, false);
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
      assertNotSame(methodWriter0, methodWriter1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3773);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "ep():jeNf";
      stringArray0[1] = "ep():jeNf";
      stringArray0[2] = "ep():jeNf";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "ep():jeNf", "ep():jeNf", "Ro{9W", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-3102), "y`_(v(]nDwSI^", "<init>", "double", stringArray0, false, false);
      methodWriter0.visitAnnotationDefault();
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
      assertNotSame(methodWriter0, methodWriter1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3773);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "ep():jeNf";
      stringArray0[1] = "ep():jeNf";
      stringArray0[2] = "ep():jeNf";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "Ro{9W", "ep():jeNf", "ep():jeNf", stringArray0, true, true);
      Attribute attribute0 = new Attribute("ep():jeNf");
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
  public void test23()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(84);
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 1, "Wf}'MpAW.2Nm", ";f/qHKYSSx/nX?L'}p", "yraL;r", stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = 13;
      Label label0 = new Label();
      ClassWriter classWriter0 = new ClassWriter(13);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "StackMap";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "<init>", "ep():jeNf", "StackMap", stringArray0, true, false);
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      assertArrayEquals(new int[] {13}, intArray0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(1615, 4).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1615, (String) null, (String) null, ".s.IFJDCS", stringArray0, false, false);
      int[] intArray0 = new int[3];
      intArray0[2] = 855;
      int int0 = MethodWriter.getNewOffset(intArray0, intArray0, 51, 1073);
      assertEquals(1877, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(1615, 1615, 1).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1615, (String) null, (String) null, (String) null, stringArray0, false, false);
      methodWriter0.visitAnnotationDefault();
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-86));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-86), "TNFf&/|b", "``};0m`or", "``};0m`or", stringArray0, false, false);
      int int0 = methodWriter0.getSize();
      assertEquals(28, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3773);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "ep(jeNf";
      stringArray0[1] = "ep(jeNf";
      stringArray0[2] = "Ro{9W";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "ep(jeNf", "ep(jeNf", "Ro{9W", stringArray0, false, false);
      Attribute attribute0 = new Attribute("Ro{9W");
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
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(436, (-86)).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-391), "TNFf&/|b", "s``};0m`or", "LineNumberTable", stringArray0, false, false);
      methodWriter0.visitInsn((-86));
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(1615, 1615).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1615, (String) null, (String) null, (String) null, stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int[] intArray0 = new int[1];
      ClassWriter classWriter0 = new ClassWriter(0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "StackMap";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "<init>", "ep():jeNf", "StackMap", stringArray0, true, true);
      int int0 = MethodWriter.getNewOffset(intArray0, intArray0, 32769, (-158));
      assertEquals((-32927), int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "cJM'fl\"!+t", "Dq(UnTy/=odo", "Dq(UnTy/=odo", stringArray0, false, false);
      methodWriter0.classReaderOffset = 21;
      ByteVector byteVector0 = new ByteVector();
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
  public void test33()  throws Throwable  {
      Label label0 = new Label();
      ClassWriter classWriter0 = new ClassWriter(13);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "ep():jeNf";
      stringArray0[1] = "'5$c{Qej*d5#f\"";
      stringArray0[2] = "dl3 V$QRjBI";
      stringArray0[3] = "ep():jeNf";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "'5$c{Qej*d5#f\"", "'5$c{Qej*d5#f\"", "ep():jeNf", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.visitTryCatchBlock(label0, label0, label0, "@e2");
      methodWriter0.visitIincInsn(13, 940);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4017);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1468), "4W4", "4W4", "Deprecated", stringArray0, false, false);
      methodWriter0.visitMaxs((-2548), 1);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(25);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 76, "FVf$AtQHJc;3pR)OB", "FVf$AtQHJc;3pR)OB", "?]@(=C)f8", (String[]) null, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 83, "?]@(=C)f8", "FVf$AtQHJc;3pR)OB", "?]@(=C)f8", (String[]) null, true, false);
      Attribute attribute0 = new Attribute("?]@(=C)f8");
      methodWriter1.visitAttribute(attribute0);
      // Undeclared exception!
      try { 
        methodWriter1.getSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.Attribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(13);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "StackMt@Iap";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "<init>", "ep():jeNf", "StackMt@Iap", stringArray0, true, true);
      methodWriter0.getSize();
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 13, "jWd", "ep():jeNf", (String) null, stringArray0, true, true);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(25);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 91, "?]@(=C)f8", "?]@(=C)f8", "org.mockito.asm.MethodWriter", stringArray0, true, true);
      methodWriter0.visitVarInsn(91, 2);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(25);
      classWriter0.visitInnerClass("<init>", "<init>", "?]@(=C)f8", 25);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "sYW )9rd.;YJ&U_", "?]@(=C)f8", "sYW )9rd.;YJ&U_", stringArray0, false, false);
      methodWriter0.visitMethodInsn(486, "?]@(=C)f8", "sYW )9rd.;YJ&U_", "Hv!3Y>9m3XUNCYi");
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3773);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "ep():jeNf";
      stringArray0[1] = "ep():jeNf";
      stringArray0[2] = "ep():jeNf";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "ep():jeNf", "ep():jeNf", "Ro{9W", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-2904), "45f$WiUzH/D*5", "ep():jeNf", "StackMapTablI", stringArray0, false, true);
      classWriter0.newClassItem("StackMapTablI");
      classWriter0.newFieldItem("45f$WiUzH/D*5", "45f$WiUzH/D*5", "45f$WiUzH/D*5");
      ByteVector byteVector0 = classWriter0.pool;
      ByteVector byteVector1 = byteVector0.putLong(1083L);
      assertSame(byteVector1, byteVector0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(25);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "double", "=[:l8e_bu*Q}Ft*E", "<init>", (String[]) null, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "<init>", "<init>", "double", (String[]) null, false, false);
      Label label0 = new Label();
      ByteVector byteVector0 = new ByteVector();
      methodWriter1.visitTryCatchBlock(label0, label0, label0, "&");
      methodWriter1.visitIincInsn((-251), (-251));
      methodWriter1.put(byteVector0);
      assertNotSame(methodWriter1, methodWriter0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(25);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 25, "", "?]@(=C)f8", "P+vB5Y.Zq[,F", stringArray0, false, false);
      methodWriter0.visitFrame(3, 1, stringArray0, 798, stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(1615).when(classWriter0).newClass(anyString());
      doReturn(1615, 4, 4, 4, 4).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[1];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, (String) null, (String) null, (String) null, stringArray0, false, false);
      methodWriter0.visitFrame(2354, 2, stringArray0, (-859), stringArray0);
      methodWriter0.visitVarInsn(4, 1526);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "y<vQju@3C#BJ", "Exceptions", "5T1)j", (String[]) null, false, false);
      methodWriter0.visitAnnotation("5T1)j", true);
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(25);
      Label label0 = new Label();
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "<init>", "<init>", "5T1)j", (String[]) null, false, false);
      methodWriter0.visitLocalVariable("E~t,Y2\"U@(oT!D9Dl", "+>z;5B4_t", "", label0, label0, 1995);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(25);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "ep():jeNf", "<init>", "sYW )9rd.;YJ&U_", stringArray0, false, false);
      methodWriter0.visitIincInsn(1, 1170);
      int int0 = methodWriter0.getSize();
      assertEquals(40, int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(252);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "StackMap";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "<init>", "ep():jeNf", "StackMap", stringArray0, false, true);
      methodWriter0.visitAnnotation("GcL?pH$Xt*um-4y%c", false);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-86));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-86), "TNFf&/|b", "``};0m`or", "``};0m`or", stringArray0, false, false);
      methodWriter0.visitAnnotation("K!zQP", false);
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(25);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 62, "double", "=[:l8e_bu*Q}Ft*E", "<init>", (String[]) null, false, false);
      methodWriter0.visitFrame(25, 62, (Object[]) null, 16777220, (Object[]) null);
      methodWriter0.visitMethodInsn(1, "AnnotationDefault", "!E&C%7$0mfaF%nS2m", "v9s:1My8cefoF");
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 99, "<init>", "^s*mS+)pWUa,2", "double", (String[]) null, false, true);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
      assertNotSame(methodWriter0, methodWriter1);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(25);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "ep():jeNf", "<init>", "sYW )9rd.;YJ&U_", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.visitIincInsn(1, 1170);
      Object[] objectArray0 = new Object[3];
      methodWriter0.visitFrame(74, 25, objectArray0, 1, objectArray0);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3773);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "P/M`H7";
      stringArray0[1] = "ep():jeNf";
      stringArray0[2] = "P/M`H7";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "P/M`H7", "ep():jeNf", "Ro<{9W", stringArray0, false, false);
      methodWriter0.visitMaxs(2147483630, 3773);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(13);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "ep():jeNf";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 13, "ep():jeNf", "ep():jeNf", (String) null, stringArray0, true, true);
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.visitAnnotation("ep():jeNf", true);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(25);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 91, "?]@(=C)f8", "?]@(=C)f8", "org.mockito.asm.MethodWriter", stringArray0, true, true);
      ByteVector byteVector0 = new ByteVector(512);
      methodWriter0.visitAnnotation("org.mockito.asm.MethodWriter", true);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(25);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "ep():jeNf", "<init>", "sYW )9rd.;YJ&U_", stringArray0, false, false);
      Label label0 = new Label();
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.visitIincInsn(1, 1170);
      methodWriter0.visitTryCatchBlock(label0, label0, label0, "?]@(=C)f8");
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3773);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "P/M`H7";
      stringArray0[1] = "ep():jeNf";
      stringArray0[2] = "P/M`H7";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "P/M`H7", "ep():jeNf", "Ro<{9W", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-366), "P/M`H7", "J)qOX>jC)r;l{zo%", "ep():jeNf", stringArray0, true, true);
      ByteVector byteVector0 = new ByteVector();
      methodWriter1.put(byteVector0);
      assertNotSame(methodWriter1, methodWriter0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Label label0 = new Label();
      ClassWriter classWriter0 = new ClassWriter(252);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "StackMap";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "<init>", "ep():jeNf", "StackMap", stringArray0, false, true);
      methodWriter0.visitLocalVariable("CRv)B K#7^!8kf{dv.%", "Wf}'MpAW.2Nm", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", label0, label0, 252);
      methodWriter0.visitJumpInsn(2, label0);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Throwable");
      ClassWriter classWriter0 = new ClassWriter(39);
      classReader0.accept((ClassVisitor) classWriter0, 112);
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.put12(2, 1);
      byteVector1.put11(262144, 202);
      MethodWriter methodWriter0 = classWriter0.firstMethod;
      methodWriter0.put(byteVector1);
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(436, (-86), (-86), (-86), 436).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-391), "TNFf&/|b", "s``};0m`or", "s``};0m`or", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(1);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4017);
      ClassReader classReader0 = new ClassReader("java/lang/Throwable");
      classReader0.accept((ClassVisitor) classWriter0, 46);
      assertEquals(2, ClassReader.SKIP_DEBUG);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(25);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "double", "=[:l8e_bu*Q}Ft*E", "<init>", (String[]) null, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "<init>", "<init>", "double", (String[]) null, false, false);
      methodWriter0.visitVarInsn(25, (byte)3);
      assertNotSame(methodWriter0, methodWriter1);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassReader classReader0 = new ClassReader("java/lang/Throwable");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 8);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 4, "Label offset position has not been resolved yet", ".s.IFJDCS", "Label offset position has not been resolved yet", stringArray0, false, false);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(39);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1618, "~dvpm$r?A|(2u{HM", "java/lang/Throwable", "q;y9Y", (String[]) null, false, false);
      methodWriter0.visitFrame(2, 177, (Object[]) null, 2, (Object[]) null);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-86));
      String[] stringArray0 = new String[2];
      stringArray0[0] = "7\"~06%80$K?+hN\"";
      stringArray0[1] = "D%Vg";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "7\"~06%80$K?+hN\"", "7\"~06%80$K?+hN\"", "7\"~06%80$K?+hN\"", stringArray0, false, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitFrame(0, 168, stringArray0, 7, stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Throwable");
      ClassWriter classWriter0 = new ClassWriter(39);
      classReader0.accept((ClassVisitor) classWriter0, 112);
      ByteVector byteVector0 = new ByteVector();
      MethodWriter methodWriter0 = classWriter0.firstMethod;
      methodWriter0.put(byteVector0);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1618, "~dvpm$r?A|(2u{HM", "java/lang/Throwable", "q;y9Y", (String[]) null, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }
}
