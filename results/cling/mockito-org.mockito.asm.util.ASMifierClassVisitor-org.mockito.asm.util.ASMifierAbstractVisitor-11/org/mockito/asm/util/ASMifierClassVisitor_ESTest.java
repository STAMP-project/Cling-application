/*

 * Tue Mar 03 14:15:20 GMT 2020
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
      String[] stringArray0 = new String[3];
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitInnerClass("(U6y{d_q'CR^}", "7/aiF5C+:o3 w9D", "7/aiF5C+:o3 w9D", 1046);
      aSMifierClassVisitor0.visit(1046, 46, "7/aiF5C+:o3 w9D", "7/aiF5C+:o3 w9D", "LocalVariableTable", stringArray0);
      assertEquals(3, stringArray0.length);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "new Character((char).class";
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // new Character((char).class (No such file or directory)
         //
         verifyException("java.io.FileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(47, (String) null, "", "", (String[]) null);
      aSMifierClassVisitor0.visitInnerClass("cw.class", "cw.class", "L", (-209));
      aSMifierClassVisitor0.visit(47, (-1270), "cw.class", (String) null, "L", ((AbstractVisitor) methodVisitor0).TYPES);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[3];
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-527), "LocalVariableTable", "8O]zd]fb+z", "el[] {", stringArray0);
      MethodVisitor methodVisitor1 = aSMifierClassVisitor0.visitMethod(8192, "mv.visitTryCatchBlock(", "ZEv]O", "e", stringArray0);
      assertNotSame(methodVisitor1, methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(49, (-1567), "t:-W#y", "", "mv.visitTableSwitchInsn(", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(189, "*i|hXI)v$ yB/2]=_>", "", "", stringArray0);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(106, 1724, "{\n", ")<BLN", ")<BLN", stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit((-1536), (-1536), "mv.visitLocalVariable(", "mv.visitMaxs(", "", aSMifierClassVisitor0.TYPES);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(32, "PnNPPf:L/S7U%0XfH@", "-debug", "?X;]E~Z2r", "U8ya<_/%VeK>;AVg2m.class");
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "#2./)+L.Gaeh-iajR&E";
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // #2./)+L.Gaeh-iajR&E (No such file or directory)
         //
         verifyException("java.io.FileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.appendAccess(1455);
      aSMifierClassVisitor0.visit((-2083), (-1961), "mv", "mv", "2t:-W#y", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[3];
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(632, "LocalVariableTable", "el[] {", "el[] {", stringArray0);
      MethodVisitor methodVisitor1 = aSMifierClassVisitor0.visitMethod(3818, "mv.visitFieldInsn(", "el[] {", "", ((AbstractVisitor) methodVisitor0).OPCODES);
      assertNotSame(methodVisitor1, methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[3];
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visit(1046, 16384, "LocalVariableTable", aSMifierClassVisitor0.name, "l6Q=!X1k", stringArray0);
      assertEquals(3, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[3];
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit((-527), 8192, "LocalVariableTable", "LocalVariableTable", "5Du8<&Ccp[P", stringArray0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(194, "LocalVariableTable", "el[] {", "8O]zd]fb+z", stringArray0);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-1536), "", "mv.visitMaxs(", "Code.clas5s", aSMifierClassVisitor0.OPCODES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField((-23), "PnNPPf:L/S7U%0XfH@", "U8ya<_/%VeK>;AVg2m.class", "mv.visitLocalVariable(", aSMifierClassVisitor0);
      FieldVisitor fieldVisitor1 = aSMifierClassVisitor0.visitField(32, "PnNPPf:L/S7U%0XfH@", "-debug", "?X;]E~Z2r", "U8ya<_/%VeK>;AVg2m.class");
      assertNotSame(fieldVisitor1, fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      aSMifierClassVisitor0.visit(428, 428, ".visitArray(", "XV\"STs%y%e-A~!F*", "7Xn[M\"T", stringArray0);
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
  public void test16()  throws Throwable  {
      String[] stringArray0 = new String[3];
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(1046, 46, "7/aiF5C+:o3 w9D", "7/aiF5C+:o3 w9D", "LocalVariableTable", stringArray0);
      aSMifierClassVisitor0.visit(1046, 16384, "LocalVariableTable", aSMifierClassVisitor0.name, "l6Q=!X1k", stringArray0);
      assertEquals(3, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[0];
      aSMifierClassVisitor0.visit((-2410), (-2410), "", "0_54R#B", "eEK", stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass(", new Label[] {", "g3h", "r!l!.Zq4aF6:)w7/;$;", 990);
      aSMifierClassVisitor0.visitInnerClass("org.mockito.asm.util.ASMifierClassVisitor", "org.mockito.asm.util.ASMifierClassVisitor", "XeCk!", (-1536));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.appendAccess(16384);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(8, "V1_3", "Opcodes.DOUBLE", "9+!fa} ,G:bvv8NW", (String[]) null);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String[] stringArray0 = new String[3];
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-1704), "#2./)+L.Gaeh-iajR&E.class", "#2./)+L.Gaeh-iajR&E.class", "new boolean[] {", stringArray0);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(47, (String) null, "", "", (String[]) null);
      aSMifierClassVisitor0.visitInnerClass("DNMD~JvV)o9Y", "DNMD~JvV)o9Y", "", 176);
      aSMifierClassVisitor0.visit(2069, 8192, "3%v^d9V01BL)_k70", "DNMD~JvV)o9Y", "el[] {", ((AbstractVisitor) methodVisitor0).OPCODES);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String[] stringArray0 = new String[3];
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(65535, "5GsFjYEpis1.~J", "G//n%{r", "G//n%{r", stringArray0);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String[] stringArray0 = new String[3];
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      ASMifierClassVisitor.main(stringArray0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(8192, "mv.visitTryCatchBlock(", "ZEv]O", "e", stringArray0);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String[] stringArray0 = new String[3];
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit((-82), (-913), "cw", "T#", ":", stringArray0);
      aSMifierClassVisitor0.visit(46, 46, "V1_4", "GW#O.class", "mv.visitTableSwitchInsn(.class", stringArray0);
      assertEquals(3, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String[] stringArray0 = new String[3];
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit((-527), 8192, "LocalVariableTable", "LocalVariableTable", "5Du8<&Ccp[P", stringArray0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(8192, "mv.visitTryCatchBlock(", "ZEv]O", "e", stringArray0);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(47, (String) null, "", "", (String[]) null);
      aSMifierClassVisitor0.visit(2069, 8192, "3%v^d9V01BL)_k70", "DNMD~JvV)o9Y", "el[] {", ((AbstractVisitor) methodVisitor0).OPCODES);
      aSMifierClassVisitor0.appendAccess(32);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(168, "Deprecated", "Deprecated", "GW#O.class", aSMifierMethodVisitor0.OPCODES);
      aSMifierClassVisitor0.visit((-2410), (-2410), "[nQ", ".class", "7;n_Xt`\u0007t:m", aSMifierMethodVisitor0.OPCODES);
      assertNotSame(aSMifierMethodVisitor0, methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(244, (-1285), "O%SIILHpW|v&Nar\"/", (String) null, "Uk b@Z?-U|R%z\"9h", stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitField((-23), "PnNPPf:L/S7U%0XfH@", "U8ya<_/%VeK>;AVg2m.class", "mv.visitLocalVariable(", aSMifierClassVisitor0);
      aSMifierClassVisitor0.visit((-1536), (-1536), "mv.visitLocalVariable(", "mv.visitMaxs(", "", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String[] stringArray0 = new String[3];
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-527), "LocalVariableTable", "8O]zd]fb+z", "el[] {", stringArray0);
      ASMifierClassVisitor.main(((AbstractVisitor) methodVisitor0).TYPES);
      MethodVisitor methodVisitor1 = aSMifierClassVisitor0.visitMethod(194, "LocalVariableTable", "el[] {", "8O]zd]fb+z", stringArray0);
      assertNotSame(methodVisitor1, methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-2245), ", new Label[] {", ", new Label[] {", "2t:-W#y", stringArray0);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "2t:-W#y";
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit((-1245), (-1245), "2t:-W#y", "2t:-W#y", "%AC", stringArray0);
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
  public void test33()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(47, (String) null, "", "", (String[]) null);
      aSMifierClassVisitor0.appendAccess(16384);
      aSMifierClassVisitor0.visit((-1961), 7, ".visitEnd();\n", "GW#O", "S@g=H", ((AbstractVisitor) methodVisitor0).OPCODES);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(49, (-1536), "t:-W#y", "yB~*2;", "o,+ %,", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String[] stringArray0 = new String[3];
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-527), "LocalVariableTable", "8O]zd]fb+z", "el[] {", stringArray0);
      aSMifierClassVisitor0.visit((-527), 8192, "LocalVariableTable", "LocalVariableTable", "5Du8<&Ccp[P", stringArray0);
      ASMifierClassVisitor.main(((AbstractVisitor) methodVisitor0).TYPES);
  }
}
