/*

 * Tue Mar 03 14:31:48 GMT 2020
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
import org.mockito.asm.ClassWriter;
import org.mockito.asm.Item;
import org.mockito.asm.Label;
import org.mockito.asm.MethodWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MethodWriter_ESTest extends MethodWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1135);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "a{^U|:}w", "')(kJ]+U3ZBpL;", "a{^U|:}w", (String[]) null, true, true);
      methodWriter0.visitTypeInsn(247, "eb`,>09e!((o=Li");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1135);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "2?e^biz70nO", "')(kJ]+U3ZBpL;", "2?e^biz70nO", (String[]) null, true, true);
      methodWriter0.visitIntInsn(1, 1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(28, 28, 28, 72, 28).when(classWriter0).newClass(anyString());
      doReturn(91, 91).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[19];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 28, "&^>BC$D640", "n`+)% ", "e2:n:", stringArray0, true, false);
      methodWriter0.visitVarInsn(72, 91);
      // Undeclared exception!
      try { 
        methodWriter0.visitLineNumber(1219, (Label) null);
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
      ClassWriter classWriter0 = new ClassWriter(65535);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "|eD3";
      stringArray0[1] = "|eD3";
      stringArray0[2] = "|eD3";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "|eD3", "|eD3", "&yI", stringArray0, false, false);
      Label label0 = mock(Label.class, new ViolatedAssumptionAnswer());
      methodWriter0.visitLabel(label0);
      methodWriter0.visitFieldInsn(1387, "9|@iUTr\":H]p]&6c", "|eD3", "|ogR4a*Iw2&*;0,RL3j");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(507);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 507, "Ljava/lang/Synthetic;", "u1T&XW\"G", "Ljava/lang/Synthetic;", (String[]) null, false, false);
      methodWriter0.visitVarInsn(131072, 2808);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(72);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "n`+)% ";
      stringArray0[1] = "* o%h~8~ntH$y";
      stringArray0[2] = "* o%h~8~ntH$y";
      stringArray0[3] = "&^>BC$D640";
      stringArray0[4] = "* o%h~8~ntH$y";
      stringArray0[5] = "* o%h~8~ntH$y";
      stringArray0[6] = "&^>BC$D640";
      stringArray0[7] = "&^>BC$D640";
      stringArray0[8] = "&^>BC$D640";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 500, "&^>BC$D640", "n`+)% ", "* o%h~8~ntH$y", stringArray0, true, false);
      methodWriter0.visitVarInsn(72, (-2651));
      Item item0 = classWriter0.newFloat(72);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(68, 68, 68).when(classWriter0).newClass(anyString());
      doReturn(19, 19).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[3];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "|eD3", "|eD3", "&I", stringArray0, false, false);
      methodWriter0.visitMaxs(0, 1262);
      methodWriter0.visitVarInsn(247, (byte)8);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65535);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "|eD3";
      stringArray0[1] = "|eD3";
      stringArray0[2] = "|eD3";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "|eD3", "|eD3", "&yI", stringArray0, false, false);
      methodWriter0.visitTypeInsn(2, "StackMap");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(507);
      Label label0 = new Label();
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 507, "Ljava/lang/Synthetic;", "u1T&XW\"G", "Ljava/lang/Synthetic;", (String[]) null, false, false);
      methodWriter0.visitFieldInsn(2223, "Ljava/lang/Synthetic;", "u1T&XW\"G", "Ljava/lang/Synthetic;");
      methodWriter0.visitJumpInsn((-2414), label0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "n`+)% ";
      stringArray0[1] = "* o%h~8~ntH$y";
      stringArray0[2] = "* o%h~8~ntH$y";
      stringArray0[3] = "&^>BC$D640";
      stringArray0[4] = "* o%h~8~ntH$y";
      stringArray0[5] = "* o%h~8~ntH$y";
      stringArray0[6] = "&^>BC$D640";
      stringArray0[7] = "&^>BC$D640";
      stringArray0[8] = "&^>BC$D640";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "&^>BC$D640", "n`+)% ", "* o%h~8~ntH$y", stringArray0, true, false);
      methodWriter0.visitVarInsn(16, (-2651));
      // Undeclared exception!
      try { 
        methodWriter0.visitJumpInsn((-82), (Label) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -82
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 16777221, "E@2ex/YUV;>d", "E@2ex/YUV;>d", "E@2ex/YUV;>d", (String[]) null, false, false);
      methodWriter0.visitVarInsn((-2443), 2);
      methodWriter0.visitMaxs((-3924), (-2695));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(1135, 1000).when(classWriter0).newUTF8(anyString());
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "}g+HuAf<J;b!@xYe", "')(kJ]+U3ZBpL;", "}g+HuAf<J;b!@xYe", (String[]) null, true, true);
      ClassWriter classWriter1 = new ClassWriter(3);
      classWriter1.newDouble(226.5242);
      methodWriter0.visitVarInsn((byte)120, (-82));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1135);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "2?e^biz70nO", "')(kJ]+U3ZBpL;", "2?e^biz70nO", (String[]) null, true, true);
      methodWriter0.visitVarInsn((byte)120, 4);
      methodWriter0.visitFieldInsn(1, "')(kJ]+U3ZBpL;", "2?e^biz70nO", "Ljava/lang/Synthetic;");
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(72);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "n`+)% ";
      stringArray0[1] = "* o%h~8~ntH$y";
      stringArray0[2] = "* o%h~8~ntH$y";
      stringArray0[3] = "&^>BC$D640";
      stringArray0[4] = "* o%h~8~ntH$y";
      stringArray0[5] = "* o%h~8~ntH$y";
      stringArray0[6] = "&^>BC$D640";
      stringArray0[7] = "&^>BC$D640";
      stringArray0[8] = "&^>BC$D640";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 500, "&^>BC$D640", "n`+)% ", "* o%h~8~ntH$y", stringArray0, true, false);
      methodWriter0.visitTypeInsn(500, "* o%h~8~ntH$y");
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(3, 3, 3, 3, 3).when(classWriter0).newClass(anyString());
      doReturn(91, 91).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[9];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 500, "&^>BC$D640", "n`+)% ", "* o%h~8~ntH$y", stringArray0, true, false);
      methodWriter0.visitVarInsn(3, (-2651));
      // Undeclared exception!
      try { 
        methodWriter0.visitMethodInsn(65, "org.mockito.asm.Type", "* o%h~8~ntH$y", "!@w/G=");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }
}
