/*

 * Tue Mar 03 14:31:57 GMT 2020
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
      ClassWriter classWriter0 = new ClassWriter(4256);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "%^@Tnbqku.CaGY_";
      stringArray0[1] = "%^@Tnbqku.CaGY_";
      stringArray0[2] = "Nlc.)}]~FO69c;";
      stringArray0[3] = "Nlc.)}]~FO69c;";
      stringArray0[4] = "%^@Tnbqku.CaGY_";
      stringArray0[5] = "%^@Tnbqku.CaGY_";
      stringArray0[6] = "Nlc.)}]~FO69c;";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "%^@Tnbqku.CaGY_", "Nlc.)}]~FO69c;", "Nlc.)}]~FO69c;", stringArray0, true, true);
      methodWriter0.visitIntInsn(0, 993);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-960), 114).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-960), "Dl~*MykIloy$;KUU", "Nlc.)}]~FO69c;", "=)u6gU4,a(:I", stringArray0, true, false);
      methodWriter0.visitVarInsn(46, 201);
      methodWriter0.visitIntInsn(48, (-1425));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(111, 111).when(classWriter0).newClass(anyString());
      doReturn(111, 9).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[2];
      stringArray0[0] = "pY~{i[CB<[t$";
      stringArray0[1] = "pY~{i[CB<[t$";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "pY~{i[CB<[t$", "", "pY~{i[CB<[t$", stringArray0, false, false);
      Label label0 = new Label();
      methodWriter0.visitLabel(label0);
      ClassWriter classWriter1 = new ClassWriter(111);
      MethodWriter methodWriter1 = new MethodWriter(classWriter1, 9, "pY~{i[CB<[t$", "uq}4);=cJfkF=W", "#.O7~%.D3", stringArray0, true, false);
      methodWriter1.visitVarInsn(1, 28);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(59);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "", "bH5[8j.hPa<rO5+(", "", stringArray0, false, false);
      Label label0 = new Label();
      methodWriter0.visitLabel(label0);
      methodWriter0.visitFieldInsn(124, "byte", "Q&D", "{:9Cd/L+@3}F;%");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1196));
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "X,{>X]2-,z";
      stringArray0[2] = "Signature";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-960), "", "Signature", "X,{>X]2-,z", stringArray0, false, false);
      methodWriter0.visitVarInsn(1, 2);
      methodWriter0.visitMaxs((-960), (-9191));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(114);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-960), "Dl~*MykIloy$;KUU", "Nlc.)}]~FO69c;", "=)u6gU4,a(:I", stringArray0, false, true);
      methodWriter0.visitTypeInsn(46, "");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(59);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "", "bH5[8j.hPa<rO5+(", "", stringArray0, false, false);
      methodWriter0.visitTypeInsn(2, "");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4256);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "%^@Tnbqku.CaGY_";
      stringArray0[1] = "%^@Tnbqku.CaGY_";
      stringArray0[2] = "Nlc.)}]~FO69c;";
      stringArray0[3] = "Nlc.)}]~FO69c;";
      stringArray0[4] = "%^@Tnbqku.CaGY_";
      stringArray0[5] = "%^@Tnbqku.CaGY_";
      stringArray0[6] = "Nlc.)}]~FO69c;";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "%^@Tnbqku.CaGY_", "Nlc.)}]~FO69c;", "Nlc.)}]~FO69c;", stringArray0, true, true);
      classWriter0.addType("org.mockito.asm.MethodWriter");
      methodWriter0.visitVarInsn(47, (byte) (-120));
      methodWriter0.visitMethodInsn(3206, "%^@Tnbqku.CaGY_", "%^@Tnbqku.CaGY_", "");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-960), 114).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-960), "Dl~*MykIloy$;KUU", "Nlc.)}]~FO69c;", "=)u6gU4,a(:I", stringArray0, true, false);
      methodWriter0.visitIntInsn(48, (-1425));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-960), 114).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-960), "Dl~*MykIloy$;KUU", "Nlc.)}]~FO69c;", "=)u6gU4,a(:I", stringArray0, true, false);
      methodWriter0.visitVarInsn(46, (-960));
      methodWriter0.visitMaxs(16777225, 1544);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-960), 113).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-960), "Dl~*MykIloy$;KUU", "Nlc.)}]~FO69c;", "=)u6gU4,a(:I", stringArray0, true, true);
      methodWriter0.visitVarInsn(46, 201);
      Label label0 = new Label();
      methodWriter0.visitLabel(label0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-960), 114).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-960), "Dl~*MykIloy$;KUU", "Nlc.)}]~FO69c;", "=)u6gU4,a(:I", stringArray0, true, false);
      methodWriter0.visitVarInsn(46, 201);
      Label label0 = new Label();
      methodWriter0.visitLabel(label0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-960), 114).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-960), "Dl~*MykIloy$;KUU", "Nlc.)}]~FO69c;", "=)u6gU4,a(:I", stringArray0, true, false);
      methodWriter0.visitVarInsn(46, 201);
      int[] intArray0 = new int[6];
      intArray0[3] = 16777225;
      int int0 = MethodWriter.getNewOffset(intArray0, intArray0, 201, 90);
      assertEquals((-111), int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(111, 111).when(classWriter0).newClass(anyString());
      doReturn(111, 9).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[2];
      stringArray0[0] = "pY~{i[CB<[t$";
      stringArray0[1] = "pY~{i[CB<[t$";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "pY~{i[CB<[t$", "", "pY~{i[CB<[t$", stringArray0, false, false);
      Label label0 = new Label();
      methodWriter0.visitLabel(label0);
      ClassWriter classWriter1 = new ClassWriter(111);
      MethodWriter methodWriter1 = new MethodWriter(classWriter1, 9, "pY~{i[CB<[t$", "uq}4);=cJfkF=W", "#.O7~%.D3", stringArray0, true, false);
      methodWriter1.visitVarInsn(1, 1);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-960), 114).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-960), "Dl~*MykIloy$;KUU", "Nlc.)}]~FO69c;", "=)u6gU4,a(:I", stringArray0, true, false);
      methodWriter0.visitVarInsn(169, 46);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-960), 114).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-960), "Dl~*MykIloy$;KUU", "Nlc.)}]~FO69c;", "=)u6gU4,a(:I", stringArray0, true, false);
      methodWriter0.visitVarInsn(46, 201);
      ClassWriter classWriter1 = new ClassWriter((-3220));
      int int0 = classWriter1.newMethod("Dl~*MykIloy$;KUU", "StackMap", "Dl~*MykIloy$;KUU", false);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(59);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "", "", "", stringArray0, false, false);
      methodWriter0.visitVarInsn(2, 2383);
      methodWriter0.visitMaxs(2, (-1180));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-960), 114).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-960), "Dl~*MykIloy$;KUU", "Nlc.)}]~FO69c;", "=)u6gU4,a(:I", stringArray0, true, true);
      methodWriter0.visitVarInsn(46, 201);
      // Undeclared exception!
      try { 
        methodWriter0.visitMaxs(16777225, 1544);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 14
         //
         verifyException("org.mockito.asm.Type", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-960), 114).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-960), "Dl~*MykIloy$;KUU", "Nlc.)}]~FO69c;", "=)u6gU4,a(:I", stringArray0, true, false);
      methodWriter0.visitVarInsn(46, 201);
      methodWriter0.visitMaxs(16777225, 1544);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-960), 114).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-960), "Dl~*MykIloy$;KUU", "Nlc.)}]~FO69c;", "=)u6gU4,a(:I", stringArray0, true, true);
      methodWriter0.visitVarInsn(46, (-960));
      // Undeclared exception!
      try { 
        methodWriter0.visitMaxs(16777225, 1544);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 14
         //
         verifyException("org.mockito.asm.Type", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-960), 114).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-960), "Dl~*MykIloy$;KUU", "Nlc.)}]~FO69c;", "=)u6gU4,a(:I", stringArray0, true, false);
      methodWriter0.visitMaxs(16777225, 1544);
      methodWriter0.visitVarInsn(111, 1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-960), 113).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-960), "Dl~*MykIloy$;KUU", "Nlc.)}]~FO69c;", "=)u6gU4,a(:I", stringArray0, true, true);
      methodWriter0.visitVarInsn(46, 201);
      ClassWriter classWriter1 = new ClassWriter(2);
      Item item0 = classWriter1.newDouble(2014);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(4235, 1135, 4235, 2755, 4235).when(classWriter0).newClass(anyString());
      doReturn(89, 89, 0, 0, 0).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[7];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "%^@Tnbqku.CaCY_", "Nlc.)}]~FO69c;", "B[I^7>vTL", stringArray0, true, true);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
      methodWriter0.visitVarInsn(0, 817);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(4235, 4235, 4235, 4235, 4235).when(classWriter0).newClass(anyString());
      doReturn(4235, 4235, 0, 0, 0).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[7];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "%^@Tnbqku.CaCY_", "Nlc.)}]~FO69c;", "Nlc.)}]~FO69c;", stringArray0, true, true);
      methodWriter0.visitVarInsn((byte)0, (-1075));
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(4235, 1135, 4235, 1135, 4235).when(classWriter0).newClass(anyString());
      doReturn(1135, 1135).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[7];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "%^@Tnbqku.CaCY_", "Nlc.)}]~FO69c;", "Nlc.)}]~FO69c;", stringArray0, true, true);
      methodWriter0.visitVarInsn(175, 90);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-960), 114, (-1224), (-3683), (-960)).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-960), "Dl~*MykIloy$;KUU", "Nlc.)}]~FO69c;", "=)u6gU4,a(:I", stringArray0, true, false);
      methodWriter0.visitVarInsn(46, 201);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-960), 114, (-1224), (-3683), (-960)).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-960), "Dl~*MykIloy$;KUU", "Nlc.)}]~FO69c;", "=)u6gU4,a(:I", stringArray0, true, false);
      methodWriter0.visitVarInsn(111, 1);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
  }
}
