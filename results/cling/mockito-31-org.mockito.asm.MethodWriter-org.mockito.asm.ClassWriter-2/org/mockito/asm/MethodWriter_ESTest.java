/*

 * Tue Mar 03 14:29:17 GMT 2020
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
import org.mockito.asm.Label;
import org.mockito.asm.MethodWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MethodWriter_ESTest extends MethodWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-735));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "fdQlLI~Ln8";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 47, "^.l?O}[M.", "h8?Br=cE)E]dVk8Hvd", "Deprecated", stringArray0, true, true);
      methodWriter0.visitIntInsn(47, 2);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(66);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "fdQlLI~Ln8", "fdQlLI~Ln8", "", (String[]) null, false, false);
      methodWriter0.visitVarInsn(16, 1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-735));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 94, "|CY/2l4SMM_", "|CY/2l4SMM_", "JUj0k$YE1vN{xO", (String[]) null, false, false);
      methodWriter0.visitFieldInsn(14, "JUj0k$YE1vN{xO", "JUj0k$YE1vN{xO", "JUj0k$YE1vN{xO");
      Label label0 = new Label();
      methodWriter0.visitLabel(label0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(50331648, 50331648).when(classWriter0).newUTF8(anyString());
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-2090), "JUj0k$Yb1vN{xO", "", "", (String[]) null, false, false);
      methodWriter0.visitVarInsn((-2189), 596);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-202)).when(classWriter0).newClass(anyString());
      doReturn(38, (-984)).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[1];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "k{", "0GC-m`oi6z^B%*VP|A/", "0GC-m`oi6z^B%*VP|A/", stringArray0, false, false);
      methodWriter0.visitMaxs(Integer.MAX_VALUE, 2);
      methodWriter0.visitVarInsn(884, (-984));
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(951).when(classWriter0).newClass(anyString());
      doReturn(38, (-984)).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[1];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "org.mockito.asm.Type", "$GCm`oiLz^B%*VP|At", "Za)", stringArray0, false, false);
      methodWriter0.visitMaxs(5306, 46);
      methodWriter0.visitVarInsn(68, 68);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-735));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "_*ElW?DqfE XQ";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "Synthetic", "_*ElW?DqfE XQ", "pROd", stringArray0, false, false);
      methodWriter0.visitTypeInsn(2, "_3)a Knwoy");
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-735));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 94, "!^^o[", "!^^o[", "JUj0k$YE1vN{xO", (String[]) null, false, false);
      Label label0 = new Label();
      methodWriter0.visitJumpInsn(2, label0);
      methodWriter0.visitFieldInsn(14, "JUj0k$YE1vN{xO", "JUj0k$YE1vN{xO", "JUj0k$YE1vN{xO");
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-735));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "fdQlLI~Ln8";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 47, "^.l?O}[M.", "h8?Br=cE)E]dVk8Hvd", "Deprecated", stringArray0, true, false);
      methodWriter0.visitIntInsn(47, 2);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-3391), (-3391), (-3391)).when(classWriter0).newClass(anyString());
      doReturn((-3391), (-3391)).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[3];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-3391), "pROd", "h8?Br=cE)E]dVk8Hvd", "pROd", stringArray0, true, true);
      // Undeclared exception!
      try { 
        methodWriter0.visitVarInsn(2047, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.Frame", e);
      }
  }
}
