/*

 * Tue Mar 03 14:15:05 GMT 2020
 */

package org.mockito.asm.util;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mockito.asm.FieldVisitor;
import org.mockito.asm.MethodVisitor;
import org.mockito.asm.util.ASMifierClassVisitor;
import org.mockito.asm.util.ASMifierMethodVisitor;
import org.mockito.asm.util.AbstractVisitor;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ASMifierClassVisitor_ESTest extends ASMifierClassVisitor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      PrintWriter printWriter0 = new PrintWriter(stringWriter0);
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(49, 183, "&", "NYA-Yg[cG.class", "mv.visitVarInsn(", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "mv.visitCode();\n.class";
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // mv.visitCode();
         // .class (No such file or directory)
         //
         verifyException("java.io.FileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit((-550), (-550), ":p/f-~cFlkg7x|", "\\", "cw.visitEnd();\n\n", aSMifierClassVisitor0.OPCODES);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-1952), ":p/f-~cFlkg7x|", "-Yg[cG", "new byte[] {", aSMifierClassVisitor0.OPCODES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "+DN/QlZ#,+H-~7>~G";
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // +DN/QlZ#,+H-~7>~G (No such file or directory)
         //
         verifyException("java.io.FileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitMethod(16384, " });\n", "TATION", "\\", aSMifierClassVisitor0.TYPES);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass("mv.visitCode();\n.class.class", (String) null, "mv.visitCode();\n", 16384);
      String[] stringArray0 = new String[0];
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16384, (String) null, "bgTYp(8.class", (String) null, stringArray0);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      PrintWriter printWriter0 = new PrintWriter(stringWriter0);
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(32767, "&", "nK0Dh%SVje7W", ".class", "nK0Dh%SVje7W");
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(32767, "\\", ".class", "-debug", ((AbstractVisitor) fieldVisitor0).TYPES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass(",Q3|,%D", "mv.visitIntInsn(", "mv.visitIntInsn(", 16384);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(92, "mv.visitIntInsn(", "mv.visitIntInsn(", " });\n", aSMifierClassVisitor0.OPCODES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      PrintWriter printWriter0 = new PrintWriter(stringWriter0);
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitField(32767, "&", "nK0Dh%SVje7W", ".class", "nK0Dh%SVje7W");
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(128, "&", "NYA-Yg[cG", ".class", aSMifierClassVisitor0.TYPES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "mv.visitTypeInsn(";
      aSMifierClassVisitor0.visitMethod(16, "-debug", "mv.visitTypeInsn(", "<>A-", stringArray0);
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Class not found
         //
         verifyException("org.mockito.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(28, 16384, "a@yjo", "mv.visitVarInsn(", "mv.visitVarInsn(", aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.appendAccess(102);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(46, (-2533), "av0 = cw.visitAnnotation(", "av0 = cw.visitAnnotation(", (String) null, aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(50, (-1166), "", "2;`CaXrpn\"gef O", "_", aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.visit(2, 1173, "", "null", "_", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(0, "h%P[+j`9_j7KJ[", (String) null, "", aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visit(46, 1265, "P`G2X;M2HG7,JS}", ">Xyk/6| r", "h%Q[+j`9_j7KJ[", aSMifierClassVisitor0.TYPES);
      String string0 = "\\u";
      MethodVisitor methodVisitor1 = aSMifierClassVisitor0.visitMethod(32767, string0, (String) null, "!KI=", ((AbstractVisitor) methodVisitor0).OPCODES);
      assertNotSame(methodVisitor0, methodVisitor1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass(",Q3|,%D", "mv.visitIntInsn(", "mv.visitIntInsn(", 16384);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(2208, 2208, "NYA-Yg[cG", "UX6 b/|", "UX6 b/|", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.appendAccess((-701));
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(328, "AzO", "*lQTg;GJZQD~", "*lQTg;GJZQD~", aSMifierMethodVisitor0.TYPES);
      assertNotSame(aSMifierMethodVisitor0, methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-debug";
      aSMifierClassVisitor0.visitMethod((-2533), "\\", "\\", "-debug", stringArray0);
      ASMifierClassVisitor.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[0];
      aSMifierClassVisitor0.visit((-531), 8192, "$lZ&,7c,[&TUx!l", "$lZ&,7c,[&TUx!l", "$lZ&,7c,[&TUx!l", stringArray0);
      aSMifierClassVisitor0.visit(49, (-919), "-debug", "\\", ".visit(", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[0];
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(0, "h%P[+j`9_j7KJ[", (String) null, "", stringArray0);
      aSMifierClassVisitor0.visit(0, 16, "h%Q[+j`9_j7KJ[", "h%P[+j`9_j7KJ[", (String) null, stringArray0);
      String string0 = "\\u";
      MethodVisitor methodVisitor1 = aSMifierClassVisitor0.visitMethod(32767, string0, (String) null, "!KI=", ((AbstractVisitor) methodVisitor0).OPCODES);
      assertNotSame(methodVisitor0, methodVisitor1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit((-2533), 16384, "P`G2X;M2HG7,JS}.class", "_j7KJ[", "P`G2X;M2HG7,JS}.class", (String[]) null);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-2533), "P`G2X;M2HG7,JS}.class", "w83DcwLX", "ipj,e hYC:5v", (String[]) null);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.appendAccess((-701));
      ASMifierClassVisitor.main(aSMifierMethodVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[0];
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-1456), "-debug", (String) null, "?ddUiBk|MUvQ5-Ww*N;", stringArray0);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      PrintWriter printWriter0 = new PrintWriter(stringWriter0);
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(32767, "W", "ywP]\"]`jlpm!]FWk/w", "j~s0Te}4L", stringWriter0);
      FieldVisitor fieldVisitor1 = aSMifierClassVisitor0.visitField(528, "}\n", "}\n", "W", (Object) null);
      assertFalse(fieldVisitor1.equals((Object)fieldVisitor0));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visitInnerClass("mv.visitIntInsn(", "=3WH", "mv.visitIntInsn(", 16384);
      aSMifierClassVisitor0.visit(48, Integer.MAX_VALUE, "+v$:[{o/G(AYvI", "", "", aSMifierMethodVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      aSMifierClassVisitor0.visitMethod((-2533), "", "", "", stringArray0);
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Class not found
         //
         verifyException("org.mockito.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test26()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "\\";
      aSMifierClassVisitor0.visitMethod((-2533), "\\", "\\", "-debug", stringArray0);
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // \\ (No such file or directory)
         //
         verifyException("java.io.FileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      PrintWriter printWriter0 = new PrintWriter(stringWriter0);
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitField(32767, "&", "nK0Dh%SVje7W", ".class", "nK0Dh%SVje7W");
      ASMifierClassVisitor.main(aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass("mv.visitIntInsn(", "=3WH", "mv.visitIntInsn(", 16384);
      aSMifierClassVisitor0.appendAccess(48);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visitInnerClass("mv.visitIntInsn(", "=3WH", "mv.visitIntInsn(", 16384);
      aSMifierClassVisitor0.visit(0, (-3266), "+v$:[{o/G(AYvI", "Prints the ASM code to generate the given class.", "mv.visitMaxs(.class", aSMifierMethodVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.appendAccess((-701));
      aSMifierClassVisitor0.visit(196653, 12, "new Long(", "new Long(", "*lQTg;GJZQD~", aSMifierMethodVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visit(0, (-3266), "+v$:[{o/G(AYvI", "Prints the ASM code to generate the given class.", "mv.visitMaxs(.class", aSMifierMethodVisitor0.TYPES);
      aSMifierClassVisitor0.appendAccess(48);
  }
}
