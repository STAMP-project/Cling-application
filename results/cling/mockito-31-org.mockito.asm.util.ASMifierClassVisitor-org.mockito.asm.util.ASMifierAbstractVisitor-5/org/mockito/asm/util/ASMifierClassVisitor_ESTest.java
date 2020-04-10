/*

 * Tue Mar 03 14:15:57 GMT 2020
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
import org.mockito.asm.AnnotationVisitor;
import org.mockito.asm.FieldVisitor;
import org.mockito.asm.MethodVisitor;
import org.mockito.asm.util.ASMifierClassVisitor;
import org.mockito.asm.util.ASMifierMethodVisitor;
import org.mockito.asm.util.AbstractVisitor;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ASMifierClassVisitor_ESTest extends ASMifierClassVisitor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      ASMifierClassVisitor.main(aSMifierMethodVisitor0.TYPES);
      aSMifierClassVisitor0.visitInnerClass("g", "@9-M)[HFlu.!yS]#\"`", "ACC_VOLATILE", 8192);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = ")AW'HqF508<;(p__~.class";
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // )AW'HqF508<;(p__~.class (No such file or directory)
         //
         verifyException("java.io.FileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitMethod(1401, "MethodVisitor mv;\n", "Qx)'dw-", "a", stringArray0);
      aSMifierClassVisitor0.visit(47, 5, "g.\"ZR", "", ")AW'HqF508<;(p__~.class", stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      AnnotationVisitor annotationVisitor0 = aSMifierClassVisitor0.visitAnnotation("_%t*>YuJ{<;c'\"=~/bp", false);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(8192, "_%t*>YuJ{<;c'\"=~/bp", ")AW'HqF508<;(p__~.class", "_%t*>YuJ{<;c'\"=~/bp", ((AbstractVisitor) annotationVisitor0).OPCODES);
      MethodVisitor methodVisitor1 = aSMifierClassVisitor0.visitMethod((-32768), "}\n", "}\n", "-debug", stringArray0);
      assertNotSame(methodVisitor1, methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visit(196653, 1879, "", "", "q", aSMifierMethodVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(8, "+%T.sWERn", "+%T.sWERn", "+%T.sWERn", aSMifierMethodVisitor0.OPCODES);
      aSMifierClassVisitor0.visit(8, 16384, "Dump implements Opcodes {\n\n", "%'*", "pJ|Oj@n", aSMifierMethodVisitor0.TYPES);
      assertNotSame(aSMifierMethodVisitor0, methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass("", "@9-M)[HFlu.!yS]#\"`", "ACC_VOLATILE", 8192);
      aSMifierClassVisitor0.visitInnerClass(".visitArray(", ".visit(", "T5O@`7{Xx)C$1iH*", 2312);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visitInnerClass("g", "@9-M)[HFlu.!yS]#\"`", "ACC_VOLATILE", 8192);
      aSMifierClassVisitor0.visit(190, 4096, "-debug", (String) null, "mv.visitMultiANewArrayInsn(", aSMifierMethodVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visitInnerClass("}\n", "AnnotationVisitor av0;\n\n", ".visitArray(", 16384);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(128, "", "Y<7G", "ACC_VOLATILE.class", aSMifierMethodVisitor0.OPCODES);
      assertNotSame(aSMifierMethodVisitor0, methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visit(48, 1588, "o>v'cxre)", ");\n\n.class", "[]", aSMifierMethodVisitor0.OPCODES);
      Object object0 = new Object();
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField((-5744), "public class ", "rY=9 4Y|`IY", "zmA0u5", object0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "6sL0,I7`LY`Jc\">L %g";
      aSMifierClassVisitor0.visit(3742, 3742, "6sL0,I7`LY`Jc\">L %g", "6sL0,I7`LY`Jc\">L %g", ">EhNw3&o4AzmIw", stringArray0);
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
  public void test12()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(49, 49, ".class", ".class", "6sL0,I7`LY`Jc\">L %g", aSMifierClassVisitor0.TYPES);
      String[] stringArray0 = new String[2];
      stringArray0[0] = ");\n";
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
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visit(47, (-1665), "}\n", "-debug", "}\n", stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.visit(3742, 3742, "6sL0,I7`LY`Jc\">L %g", "6sL0,I7`LY`Jc\">L %g", ">EhNw3&o4AzmIw", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visitMethod(65535, "-debug", "E~)$7", "E~)$7", aSMifierMethodVisitor0.TYPES);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-1287), "", "Dump implements Opcodes {\n\n", "", aSMifierMethodVisitor0.OPCODES);
      assertNotSame(aSMifierMethodVisitor0, methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitMethod((-27), "_%t*>YuJ{<;c'\"=~/bp", "HGo!u(", "OiK*kpim:#]O", stringArray0);
      aSMifierClassVisitor0.visitInnerClass("v@;)`<vP],|\"", "<xJzmA0u5.class", "OiK*kpim:#]O", 183);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16384, "+%T.sWERn", "+%T.sWERn", "%'*", aSMifierMethodVisitor0.TYPES);
      aSMifierClassVisitor0.visit(8, 16384, "Dump implements Opcodes {\n\n", "%'*", "pJ|Oj@n", aSMifierMethodVisitor0.TYPES);
      assertNotSame(aSMifierMethodVisitor0, methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visit(46, 68, "tN5lJ~", "tN5lJ~", "6{}BNLRA>I|dM>", aSMifierMethodVisitor0.TYPES);
      aSMifierClassVisitor0.visit((-433), (-433), ",", (String) null, "g4@3kP7FCk^+@S)!!4", aSMifierMethodVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visit(50, 32, "RuntimeInvisibleParameterAnnotations", ");\n\n.class", "mv.visitMaxs(", aSMifierMethodVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(71, 64, "_%t*>YuJ{<;c'\"=~/bp", "_%t*>YuJ{<;c'\"=~/bp", "OiK*kim:#]", stringArray0);
      AnnotationVisitor annotationVisitor0 = aSMifierClassVisitor0.visitAnnotation("_%t*>YuJ{<;c'\"=~/bp", false);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(8192, "_%t*>YuJ{<;c'\"=~/bp", ")AW'HqF508<;(p__~.class", "_%t*>YuJ{<;c'\"=~/bp", ((AbstractVisitor) annotationVisitor0).OPCODES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      ASMifierClassVisitor.main(aSMifierMethodVisitor0.TYPES);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16384, "+%T.sWERn", "+%T.sWERn", "%'*", aSMifierMethodVisitor0.TYPES);
      assertNotSame(methodVisitor0, aSMifierMethodVisitor0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit((-1184), (-1184), ");\n", "(short)", ");\n", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visit(274, 2016, ":m5)n0", ");\n\n.class", ".x L(", aSMifierMethodVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visitMethod((-2881), "f&v:d+I-wf:}Ez-s+r/", "@9-M)[HFlu.!yS]#\"`", "-K|", aSMifierMethodVisitor0.OPCODES);
      aSMifierClassVisitor0.visitInnerClass(".visitArray(", ".visit(", "T5O@`7{Xx)C$1iH*", 2312);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visitMethod(8, "+%T.sWERn", "+%T.sWERn", "+%T.sWERn", aSMifierMethodVisitor0.OPCODES);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16384, "+%T.sWERn", "+%T.sWERn", "%'*", aSMifierMethodVisitor0.TYPES);
      assertNotSame(aSMifierMethodVisitor0, methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitMethod((-687), ";.!A*E9O>NI>xN2", "<z\"F^\"v", "~", (String[]) null);
      aSMifierClassVisitor0.visit(2838, 6, "RuntimeInvisibleAnnotations", "~", "Zk7fZ_", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visitMethod(184, "T_BOOLEAN,T_CHAR,T_FLOAT,T_DOUBLE,T_BYTE,T_SHORT,T_INT,T_LONG,", "", "cw.visitEnd();\n\n", aSMifierMethodVisitor0.TYPES);
      aSMifierClassVisitor0.visitInnerClass((String) null, "Boolean.FALSE", " ?Sn|J", 16384);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitMethod((-32768), "}\n", "}\n", "-debug", stringArray0);
      aSMifierClassVisitor0.visitInnerClass(");\n\n", "}\n", "OiK*kim:#]", 16384);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(71, 64, "_%t*>YuJ{<;c'\"=~/bp", "_%t*>YuJ{<;c'\"=~/bp", "OiK*kim:#]", stringArray0);
      aSMifierClassVisitor0.visitInnerClass(");\n\n", "}\n", "OiK*kim:#]", 16384);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visit(196653, 196653, "T_BOOLEAN,T_CHAR,T_FLOAT,T_DOUBLE,T_BYTE,T_SHORT,T_INT,T_LONG,", "ACC_PUBLIC", ", null, 0, null", aSMifierMethodVisitor0.OPCODES);
      aSMifierClassVisitor0.visitInnerClass((String) null, "Boolean.FALSE", " ?Sn|J", 16384);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visit(49, (-2692), "Boolean.TRUE", "4O?\"", "mv.visitInsn(", aSMifierMethodVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(65, 64, "_%t*>YuJ{<;c'\"=~/bp", "v@;)`<vP],|\"", "_%t*>YuJ{<;c'\"=~/bp", stringArray0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-27), "_%t*>YuJ{<;c'\"=~/bp", "HGo!u(", "OiK*kpim:#]O", stringArray0);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visit(196653, 196653, "T_BOOLEAN,T_CHAR,T_FLOAT,T_DOUBLE,T_BYTE,T_SHORT,T_INT,T_LONG,", "ACC_PUBLIC", ", null, 0, null", aSMifierMethodVisitor0.OPCODES);
      aSMifierClassVisitor0.appendAccess((-1551));
  }
}
