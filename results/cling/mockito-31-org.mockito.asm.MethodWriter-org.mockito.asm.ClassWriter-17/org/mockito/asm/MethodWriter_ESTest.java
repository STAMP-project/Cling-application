/*

 * Tue Mar 03 14:33:17 GMT 2020
 */

package org.mockito.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mockito.asm.ClassWriter;
import org.mockito.asm.Item;
import org.mockito.asm.MethodWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MethodWriter_ESTest extends MethodWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "={)@6qwX2jnF16u";
      ClassWriter classWriter0 = new ClassWriter((-1637));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "={)@6qwX2jnF16u", "={)@6qwX2jnF16u", "={)@6qwX2jnF16u", stringArray0, true, false);
      methodWriter0.visitFieldInsn((-1182), "={)@6qwX2jnF16u", "5MDX", "5MDX");
      Item item0 = classWriter0.newFloat(2);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(101);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1355, "^|0.08v", "^|0.08v", "^|0.08v", (String[]) null, false, false);
      methodWriter0.visitFieldInsn((-3966), "^|0.08v", "^|0.08v", "^|0.08v");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-1684)).when(classWriter0).newClass(anyString());
      doReturn(1182, (-1684)).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[1];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-3074), "={)@6qwX2jnF16u", "={)@6qwX2jnF16u", "={)@6qwX2jnF16u", stringArray0, false, true);
      ClassWriter classWriter1 = new ClassWriter((-1637));
      classWriter1.newFloat(2);
      methodWriter0.visitVarInsn(117, 1953);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-2799), (-2799), (-2799)).when(classWriter0).newClass(anyString());
      doReturn((-2220), (-2220)).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[3];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, (String) null, "$CV*pl", "Ljava/lang/SyEKhetic;", stringArray0, false, false);
      methodWriter0.visitMaxs((-2799), (-2799));
      methodWriter0.visitVarInsn((-1780), 2);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(101);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 83, "Rhj", "Rhj", "^|0.08v", (String[]) null, false, false);
      methodWriter0.visitTypeInsn(168, "^|0.08v");
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(41);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "4MiFdmFzh['L}mWR:I";
      stringArray0[1] = "4MiFdmFzh['L}mWR:I";
      stringArray0[2] = "4MiFdmFzh['L}mWR:I";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "4MiFdmFzh['L}mWR:I", "4MiFdmFzh['L}mWR:I", "4MiFdmFzh['L}mWR:I", stringArray0, false, false);
      methodWriter0.visitVarInsn((-1947), 15);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3739));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-3739), ";Xd4-(mS3O&:&iQ=sz", ";Xd4-(mS3O&:&iQ=sz", ";Xd4-(mS3O&:&iQ=sz", (String[]) null, false, false);
      methodWriter0.visitIntInsn(1775, 172);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "={)@6qwX2jnF16u";
      ClassWriter classWriter0 = new ClassWriter((-1637));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "={)@6qwX2jnF16u", "={)@6qwX2jnF16u", "={)@6qwX2jnF16u", stringArray0, true, true);
      methodWriter0.visitFieldInsn((-1182), "={)@6qwX2jnF16u", "5MDX", "5MDX");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-1684)).when(classWriter0).newClass(anyString());
      doReturn(1182, (-1684)).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[1];
      stringArray0[0] = "={)@6qwX2jnF16u";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-3074), "={)@6qwX2jnF16u", "={)@6qwX2jnF16u", "={)@6qwX2jnF16u", stringArray0, false, true);
      ClassWriter classWriter1 = new ClassWriter((-1637));
      MethodWriter methodWriter1 = new MethodWriter(classWriter1, 2, "={)@6qwX2jnF16u", "={)@6qwX2jnF16u", "={)@6qwX2jnF16u", stringArray0, true, false);
      methodWriter1.visitFieldInsn((-1182), "={)@6qwX2jnF16u", "5MDX", "5MDX");
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(101);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 83, "Rhj", "Rhj", "^|0.08v", (String[]) null, false, false);
      methodWriter0.visitVarInsn(101, 1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "={)@6qwX2jnF16u";
      ClassWriter classWriter0 = new ClassWriter((-1637));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "={)@6qwX2jnF16u", "={)@6qwX2jnF16u", "={)@6qwX2jnF16u", stringArray0, true, false);
      methodWriter0.visitFieldInsn((-1182), "={)@6qwX2jnF16u", "5MDX", "5MDX");
      methodWriter0.visitVarInsn(117, 1953);
  }
}
