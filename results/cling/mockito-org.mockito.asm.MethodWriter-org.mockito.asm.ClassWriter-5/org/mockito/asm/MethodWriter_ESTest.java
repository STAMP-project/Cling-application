/*

 * Tue Mar 03 14:29:47 GMT 2020
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
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2770));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "G";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-2770), "G", "V}Ew(JSr<!}E)h", "G", stringArray0, false, true);
      // Undeclared exception!
      try { 
        methodWriter0.visitIntInsn((-1544), (-2770));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.Frame", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(9);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "Ow)", "s,)L!)KX]y", "(4G/XkG,ow kRPSfT*f", (String[]) null, false, false);
      methodWriter0.visitVarInsn(59, (-2));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(9);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "Ow)", "s,)L!)KX]y", "(4G/XkG,ow kRPSfT*f", (String[]) null, false, false);
      methodWriter0.visitFieldInsn(1, "@n7HS!v^:`", "jDI*l", "Code");
      Label label0 = new Label();
      methodWriter0.visitLabel(label0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1555));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "Ow)", "s,)L!)KX]y", "s,)L!)KX]y", (String[]) null, false, false);
      methodWriter0.visitMaxs(9, (-1555));
      methodWriter0.visitVarInsn(21, 2);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2308));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 0, "LocalVariableable", "", "LocalVariableable", stringArray0, false, false);
      methodWriter0.visitVarInsn(0, 809);
      methodWriter0.visitMaxs(0, (-2308));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2308));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "java/lang/Object", "A`F*Ka)`JF(j6", "java/lang/Object", (String[]) null, true, true);
      methodWriter0.visitTypeInsn((-1792), "java/lang/Object");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2770));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "}2_:kr&+_tC\"b", "q_:", (String) null, (String[]) null, false, false);
      methodWriter0.visitTypeInsn((-2770), "}2_:kr&+_tC\"b");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2308));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "java/lang/Object";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "Deprecated", "2|lpM{5bz}>t!>n{)#A", ".", stringArray0, true, false);
      methodWriter0.visitIntInsn(2, 2);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2308));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-267), "java/lang/Object", "A`F*Ka)`JF(j6", "Lo%alVaribleTyCeTabke", (String[]) null, true, true);
      methodWriter0.visitFieldInsn((-267), "A`F*Ka)`JF(j6", "Lo%alVaribleTyCeTabke", "java/lang/Object");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2770));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 987, "V}Ew(JSv<!}E)h", "V}Ew(JSv<!}E)h", "GK{>[Q8a  -d", (String[]) null, true, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitVarInsn(987, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 987
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(4, 4).when(classWriter0).newClass(anyString());
      doReturn(4, 4).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[2];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "4MJ4*)y", "4MJ4*)y", "4MJ4*)y", stringArray0, true, true);
      methodWriter0.visitVarInsn(2, 4);
      // Undeclared exception!
      try { 
        methodWriter0.visitMaxs((-3), 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.mockito.asm.Type", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(8);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "3 0bK)}Ek#l%^-A";
      stringArray0[1] = "3 0bK)}Ek#l%^-A";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 4257, "3 0bK)}Ek#l%^-A", "3 0bK)}Ek#l%^-A", "3 0bK)}Ek#l%^-A", stringArray0, true, true);
      methodWriter0.visitVarInsn(58, 66);
  }
}
