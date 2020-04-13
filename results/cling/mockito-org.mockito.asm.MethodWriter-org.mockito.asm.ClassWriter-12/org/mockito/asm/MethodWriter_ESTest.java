/*

 * Tue Mar 03 14:32:50 GMT 2020
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
import org.mockito.asm.ClassWriter;
import org.mockito.asm.Item;
import org.mockito.asm.Label;
import org.mockito.asm.MethodWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MethodWriter_ESTest extends MethodWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(101, 101).when(classWriter0).newClass(anyString());
      doReturn(101, 3866).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[2];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "2p8-mf8JP)FD!=", "2p8-mf8JP)FD!=", "2p8-mf8JP)FD!=", stringArray0, false, true);
      methodWriter0.visitIntInsn(1, 1186);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(12);
      Label label0 = mock(Label.class, new ViolatedAssumptionAnswer());
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 35, ",)z", ",)z", "N(<z`l", (String[]) null, true, true);
      methodWriter0.visitVarInsn(152, 72);
      methodWriter0.visitLineNumber(Integer.MAX_VALUE, label0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(12);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "%9fdt1J9bA'+r#";
      stringArray0[1] = "%9fdt1J9bA'+r#";
      stringArray0[2] = "(<z  0l";
      stringArray0[3] = "BzgXMMhg";
      stringArray0[4] = "java/lang/Object";
      stringArray0[5] = "java/lang/Object";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-3959), "BzgXMMhg", "k8+!Bl[.2u$y~i,)[Y", "Synthetic", stringArray0, true, false);
      methodWriter0.visitFieldInsn(12, "RuntimeInvisibleAnnotations", "Synthetic", "k8+!Bl[.2u$y~i,)[Y");
      methodWriter0.visitMaxs(17, 76);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(122);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "d6.X=wQye)T,", "d6.X=wQye)T,", "java/lang/Throwable", (String[]) null, true, true);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1561, "959,r=C<+aHYH{", "boolean", "java/lang/Throwable", (String[]) null, false, false);
      methodWriter1.visitFieldInsn(1, ";4!)DsFyAy", "tV aj+tZkL`_.`Q}kNG", "");
      assertNotSame(methodWriter1, methodWriter0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(78, 168).when(classWriter0).newUTF8(anyString());
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-411), (String) null, (String) null, (String) null, (String[]) null, false, false);
      methodWriter0.visitVarInsn(420, 1);
      methodWriter0.visitMaxs(2, 78);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(12);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "30", "-!&DC", "l[Me`kZMgJ4.?i)", (String[]) null, false, false);
      methodWriter0.visitMaxs((-459), (-459));
      methodWriter0.visitVarInsn((-459), 73);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-744));
      String[] stringArray0 = new String[6];
      stringArray0[0] = ",)";
      stringArray0[1] = ",)";
      stringArray0[2] = ",)";
      stringArray0[3] = "Synthetic";
      stringArray0[4] = "(<z  0l";
      stringArray0[5] = "(<z  0l";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "(<z  0l", ",)", ",)", stringArray0, true, true);
      methodWriter0.visitTypeInsn(666, "Synthetic");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1025));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "java/lang/Throwable", "T4.xT~yM&'RP42~'>_i", "@E[^\"b*`H~hx^", (String[]) null, false, false);
      methodWriter0.visitTypeInsn(463, "java/lang/Throwable");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(58, 12).when(classWriter0).newUTF8(anyString());
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 6, ",)z", ",)z", "(<z  0l", (String[]) null, true, true);
      methodWriter0.visitVarInsn(102, 72);
      ClassWriter classWriter1 = new ClassWriter((-2164));
      Item item0 = classWriter1.newLong(2337L);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(12);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "30", "-!&DC", "l[Me`kZMgJ4.?i)", (String[]) null, false, false);
      Label label0 = new Label();
      methodWriter0.visitJumpInsn(2, label0);
      methodWriter0.visitFieldInsn(67, ".I%X", "2mT]bwoflPVOvg4", "Kb<oDz");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-744));
      String[] stringArray0 = new String[6];
      stringArray0[0] = ",)z";
      stringArray0[1] = ",)z";
      stringArray0[2] = ",)z";
      stringArray0[3] = "Synthetic";
      stringArray0[4] = "(<z  0l";
      stringArray0[5] = "(<z  0l";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "(<z  0l", ",)z", ",)z", stringArray0, true, false);
      methodWriter0.visitIntInsn(1, 2);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-744));
      String[] stringArray0 = new String[6];
      stringArray0[0] = ",)z";
      stringArray0[1] = ",)z";
      stringArray0[2] = "(<z  0l";
      stringArray0[3] = ",)z";
      stringArray0[4] = "(<z  0l";
      stringArray0[5] = "(<z  0l";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "(<z  0l", ",)z", ",)z", stringArray0, true, false);
      methodWriter0.visitVarInsn(2, (-744));
      // Undeclared exception!
      try { 
        methodWriter0.visitMethodInsn((-744), "(<z  0l", "LocalVariableTypeTable", "6QU8UXT` H");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(122);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "d6.X=wQye)T,";
      stringArray0[1] = ",<UwQLN+$Zf?@I`5";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "d6.X=wQye)T,", "d6.X=wQye)T,", ",<UwQLN+$Zf?@I`5", stringArray0, false, true);
      methodWriter0.visitVarInsn(2, 648);
      // Undeclared exception!
      try { 
        methodWriter0.visitJumpInsn(273, (Label) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.Frame", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(122);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "d6.X=wQye)T,", "d6.X=wQye)T,", "java/lang/Throwable", (String[]) null, true, true);
      methodWriter0.visitFieldInsn(251, "java/lang/Throwable", "lM2$W9]9'$eJ>|2/p", "P,3(F@s54,9z4");
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(122);
      classWriter0.addUninitializedType("d6.X=wQye)T,", 122);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "d6.X=wQye)T,", "d6.X=wQye)T,", "java/lang/Throwable", (String[]) null, true, true);
      methodWriter0.visitVarInsn(1, 168);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((short) (-29440));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1540), "d6.X=wQye)T,", "d6.X=wQye)T,", "Ljava/lang/Synthetic;", (String[]) null, true, false);
      classWriter0.newInteger((byte)0);
      methodWriter0.visitVarInsn(54, (-818));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(58, 12).when(classWriter0).newUTF8(anyString());
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 5, ",)c", ",)c", "(z  0l", (String[]) null, true, true);
      methodWriter0.visitVarInsn(102, 72);
      Label label0 = new Label();
      int[] intArray0 = new int[4];
      intArray0[0] = 1;
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      assertEquals(4, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-744));
      String[] stringArray0 = new String[6];
      stringArray0[0] = ",)z";
      stringArray0[1] = ",)z";
      stringArray0[2] = ",)z";
      stringArray0[3] = "Synthetic";
      stringArray0[4] = "(<z  0l";
      stringArray0[5] = "(<z  0l";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "(<z  0l", ",)z", ",)z", stringArray0, true, false);
      methodWriter0.visitVarInsn(2, (-744));
      int int0 = classWriter0.addUninitializedType("z4tjd.\"SCS3J^~;5R;=", 1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(12);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 35, ",)z", ",)z", "N(<z`l", (String[]) null, true, true);
      methodWriter0.visitVarInsn(152, 72);
      // Undeclared exception!
      try { 
        methodWriter0.visitMaxs(4280, 72);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-744));
      String[] stringArray0 = new String[6];
      stringArray0[0] = ",)z";
      stringArray0[1] = ",)z";
      stringArray0[2] = ",)z";
      stringArray0[3] = "Synthetic";
      stringArray0[4] = "(<z  0l";
      stringArray0[5] = "(<z  0l";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "(<z  0l", ",)z", ",)z", stringArray0, true, true);
      methodWriter0.visitVarInsn(2, (-744));
      methodWriter0.visitMethodInsn((-744), "(<z  0l", "LocalVariableTypeTable", "6QU8UXT` H");
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-744));
      String[] stringArray0 = new String[6];
      stringArray0[0] = ",)z";
      stringArray0[1] = ",)z";
      stringArray0[2] = ",)z";
      stringArray0[3] = "Synthetic";
      classWriter0.newDouble(1160.58352715093);
      stringArray0[4] = "(<z  0l";
      stringArray0[5] = "(<z  0l";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "(<z  0l", ",)z", ",)z", stringArray0, true, true);
      methodWriter0.visitVarInsn(2, (-744));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(12);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "%9fdt1J9bA'+r#";
      stringArray0[1] = "%9fdt1J9bA'+r#";
      stringArray0[2] = "(<z  0l";
      stringArray0[3] = "BzgXMMhg";
      stringArray0[4] = "java/lang/Object";
      stringArray0[5] = "java/lang/Object";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-3959), "BzgXMMhg", "k8+!Bl[.2u$y~i,)[Y", "Synthetic", stringArray0, true, false);
      methodWriter0.visitFieldInsn(12, "RuntimeInvisibleAnnotations", "Synthetic", "k8+!Bl[.2u$y~i,)[Y");
      ByteVector byteVector0 = new ByteVector(1);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(58, 12).when(classWriter0).newUTF8(anyString());
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 6, ",)c", ",)c", "(<z  0l", (String[]) null, true, true);
      ClassWriter classWriter1 = new ClassWriter(248);
      MethodWriter methodWriter1 = new MethodWriter(classWriter1, (-744), "B.rCO-R@5kAGG3X7F&", ",)c", "(<z  0l", (String[]) null, true, false);
      methodWriter0.visitVarInsn(6, 2);
      // Undeclared exception!
      try { 
        methodWriter1.visitMethodInsn(187, "LocalVariableTypeTable", "AtB$s/ep=9CKgx5q", "6QU8UXT` H");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(12);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 35, ",)z", ",)z", "N(<z`l", (String[]) null, true, true);
      methodWriter0.visitVarInsn(152, 72);
      methodWriter0.visitLdcInsn("N(<z`l");
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(58, 12, 12, 0, 0).when(classWriter0).newUTF8(anyString());
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 6, ",)c", ",)c", "(<z  0l", (String[]) null, true, true);
      methodWriter0.visitVarInsn(12, 72);
      ByteVector byteVector0 = new ByteVector(2);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(122);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "d6.X=wQye)T,", "d6.X=wQye)T,", "java/lang/Throwable", (String[]) null, true, true);
      methodWriter0.visitVarInsn(1, 168);
      methodWriter0.visitMethodInsn(122, "RuntimeInvisibleAnnotations", "aT4LBtaC|nx", "RuntimeInvisibleAnnotations");
  }
}
