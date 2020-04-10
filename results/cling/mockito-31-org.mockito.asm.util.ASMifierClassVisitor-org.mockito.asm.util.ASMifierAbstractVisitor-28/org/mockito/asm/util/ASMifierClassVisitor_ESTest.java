/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 08:48:43 GMT 2019
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
import org.mockito.asm.util.AbstractVisitor;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ASMifierClassVisitor_ESTest extends ASMifierClassVisitor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.appendAccess(128);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(9, 8192, "a:<Lc99g~x~r)1}", "", "2g~#FW,%&Fg.class", stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit((-3475), 8192, "s92PxFb", (String) null, "-debug", (String[]) null);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(198, (String) null, "^RBc{K&y[}aPMn|", "$YiyV_oa7HYP", (String[]) null);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(50, 1307, "cw.visitSource(", "hG-&rBx((7!IZMpctiB", "]}lf", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit((-5), 8192, "\\", "r8d +fMl.4xfhjK", "]}lf.class", aSMifierClassVisitor0.OPCODES);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(8, "jBZfZm)ZcE\"{]TfK,x.class", "X'GB7.fPMuyh:@$q", ".class", aSMifierClassVisitor0.OPCODES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(561, 561, "\\", "\\", "new boolean[] {", stringArray0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(8192, "X'GB7.fPMuyh:@$q", ".class", (String) null, stringArray0);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(50, 8192, "|fl0enpP|WYISLuls4", "|fl0enpP|WYISLuls4", "|fl0enpP|WYISLuls4", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitField(8192, "LzkL~A9bP\"l<~yOr<p", "e@T@Lt", "C&rNJ}R&1ilFxDu#^&", "LzkL~A9bP\"l<~yOr<p");
      ASMifierClassVisitor.main(aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.visit(9, 8192, "|fl0enpP|WYISLuls4", "|fl0enpP|WYISLuls4", "|fl0enpP|WYISLuls4", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitField(1665, "e@T@Lt", "e@T@Lt", "]6L(w[6TFtN/|X#", (Object) null);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(16350, 16350, "bbp~YcSKyuy/%'@]Ws", "bbp~YcSKyuy/%'@]Ws", "double", aSMifierClassVisitor0.OPCODES);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16350, "^JgehXYt~EiB", "Opcodes.TOP", "^JgehXYt~EiB", aSMifierClassVisitor0.TYPES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(9, 8192, "|fl0enpP|WYISLuls4", "|fl0enpP|WYISLuls4", "|fl0enpP|WYISLuls4", aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.visit(2, 183, "/YM2}x',RMZAANV;j';", (String) null, "wfm9^tdtBR=7*gn$3\"<", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      String[] stringArray0 = new String[0];
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16350, "^JgehXYt~EiB", "Opcodes.TOP", "^JgehXYt~EiB", stringArray0);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(48, 8, "PMdg,W5`", "PMdg,W5`", "PMdg,W5`", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.appendAccess(0);
      aSMifierClassVisitor0.visit(46, (-983), "RSb&\"J", "]}lf", "]}lf", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitMethod(248, "C&rNJ}R&1ilFxDu#^&", "(&rl", "LzkL~A9bP\"l<~yOrC<p", (String[]) null);
      aSMifierClassVisitor0.visitInnerClass("LzkL~A9bP\"l<~yOrC<p", "PMdg,W5`.class", "fa#`R>rQ`rAse@T@Lt", 8192);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit((-3475), 8192, "s92PxFb", (String) null, "-debug", (String[]) null);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-3475), "Hm2", "Hm2", "", (String[]) null);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(8192, 8, "C&rNJ}R&1ilFxDu#^&", "(&rl", "LzkL~A9bP\"l<~yOrC<p", (String[]) null);
      aSMifierClassVisitor0.visitInnerClass("LzkL~A9bP\"l<~yOrC<p", "PMdg,W5`.class", "fa#`R>rQ`rAse@T@Lt", 8192);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(47, (-1713), "bT", "cRG6G}", "cRG6G}", aSMifierClassVisitor0.OPCODES);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(7, "bT", "W,%&Fg", "-MJ1I%,5", aSMifierClassVisitor0.TYPES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(1279, 8192, "ACC_ENUM", "|fl0enpP|WYISLuls4", "", aSMifierClassVisitor0.TYPES);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(191, (String) null, (String) null, "RuntimeInvisibleParameterAnnotations", aSMifierClassVisitor0.OPCODES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitField(16384, "PMdg,W5`", "YL)", "dg,W5`", "PMdg,W5`");
      aSMifierClassVisitor0.visitInnerClass("PMdg,W5`", "PMdg,W5`", "PMdg,W5`", 464);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      Object object0 = new Object();
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField((-136), ".class.class", "[_Kf_-{0/s.class", "W,%&Fg", object0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(16384, 16384, "PMdg,W5`", "PMdg,W5`", "PMdg,W5`", aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visitInnerClass("PMdg,W5`", "PMdg,W5`", "PMdg,W5`", 464);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(16384, 16384, ".class", ".class", "e@T@Lt", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(2147483607, 2147483607, "", "", "", stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitField(16384, "PMdg,W5`", "YL)", "dg,W5`", "PMdg,W5`");
      aSMifierClassVisitor0.visit(16384, 50, "s92PxFb", (String) null, "PMdg,W5`", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-221), ".6:<@9A|", "dg,W5`", "<UA%9sUZ4*s{", aSMifierClassVisitor0.TYPES);
      MethodVisitor methodVisitor1 = aSMifierClassVisitor0.visitMethod(1888, "mv.visitVarInsn(", "<UA%9sUZ4*s{", "kf=\"<CFkthku}", aSMifierClassVisitor0.OPCODES);
      assertNotSame(methodVisitor1, methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(49, 32767, "Opcodes.FLOAT", "Opcodes.FLOAT", "Opcodes.FLOAT", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(16384, "PMdg,W5`", "YL)", "PMdg,W5`", "PMdg,W5`");
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(1164, "YL)", "fa#`R>rQ`rAse@T@Lt.class", "", ((AbstractVisitor) fieldVisitor0).OPCODES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      Object object0 = new Object();
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(16384, "PMdg,W5`", "mv.visitInsn(", "5KwqJhOO2+VD", object0);
      ASMifierClassVisitor.main(((AbstractVisitor) fieldVisitor0).OPCODES);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.OPCODES);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField((-3517), "k[|IK@!,(", "k[|IK@!,(", "k[|IK@!,(", (Object) null);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(16350, 16350, "bbp~YcSKyuy/%'@]Ws", "bbp~YcSKyuy/%'@]Ws", "double", aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visitInnerClass("bbp~YcSKyuy/%'@]Ws", "Opcodes.TOP", "L+hRgCM4=|#", (-2300));
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      String[] stringArray0 = new String[0];
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-958), "HtOa5hyX?", "HtOa5hyX?", "HtOa5hyX?", stringArray0);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(162, 16384, "new String[] {", "new String[] {", "bT", aSMifierClassVisitor0.OPCODES);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(162, "", "k*5", "new String[] {", (String[]) null);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(16384, "PMdg,W5`", "YL)", "dg,W5`", "PMdg,W5`");
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-221), ".6:<@9A|", "dg,W5`", "<UA%9sUZ4*s{", ((AbstractVisitor) fieldVisitor0).TYPES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test35()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "{U$caHK~%o{o/";
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // {U$caHK~%o{o (No such file or directory)
         //
         verifyException("java.io.FileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-debug";
      ASMifierClassVisitor.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "]}lf";
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
  public void test38()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(196653, Integer.MAX_VALUE, "mv", "e@T@Lt", "4(%(Z>I>", aSMifierClassVisitor0.OPCODES);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(91, "mv", "/", "mv", aSMifierClassVisitor0.TYPES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(50, 50, "-debug", "-debug", "m$>dra9Qt{9(;&v5@", aSMifierClassVisitor0.OPCODES);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-1943), "iItS{b/l];,/", "m$>dra9Qt{9(;&v5@", "^RBc{K&y[}aPMn|", aSMifierClassVisitor0.OPCODES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test40()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = ".class";
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // .class (No such file or directory)
         //
         verifyException("java.io.FileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(48, Integer.MAX_VALUE, "ACC_SYNCHRONIZED", "4(%(Z>I>", "ACC_SYNCHRONIZED", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(47, (-1713), "bT", "cRG6G}", "cRG6G}", aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visit((-1713), (-2968), "bT", "new float[] {", "cRG6G}", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitInnerClass("ZEw3c6+2jw|>ql.M:Gd", "ZEw3c6+2jw|>ql.M:Gd", "0}W^C", 16384);
      aSMifierClassVisitor0.appendAccess((-3091));
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitInnerClass("", "bT", "", 16384);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitInnerClass("PMdg,W5`", "PMdg,W5`", "ZEw3c6+2jw|>ql.M:Gd", 16384);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(2532, "y$", "]>%w:3t-F=c.A}:Rm:", "PMdg,W5`", aSMifierClassVisitor0.TYPES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitField(16384, "PMdg,W5`", "YL)", "dg,W5`", "PMdg,W5`");
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(1888, "mv.visitVarInsn(", "<UA%9sUZ4*s{", "kf=\"<CFkthku}", aSMifierClassVisitor0.OPCODES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      Object object0 = new Object();
      aSMifierClassVisitor0.visitField(16384, "", "++M[k it2={O-M", "++M[k it2={O-M", object0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-2072), "Opcodes.UNINITIALIZED_THIS", "Opcodes.UNINITIALIZED_THIS", ".visitAnnotation(", aSMifierClassVisitor0.TYPES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      String[] stringArray0 = new String[0];
      aSMifierClassVisitor0.visit(16384, 16384, "mv.visitLocalVariable(", "PMdg,W5`", "PMdg,W5`", stringArray0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16384, "tS{b/;,/", "PMdg,W5`", "tS{b/;,/", stringArray0);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField((-2493), "LocalVariableTypeTable", "bbp~YcSKyuy/%'@]Ws", "LocalVariableTypeTable", "LocalVariableTypeTable");
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(65535, "&&cgf,M-", "bbp~YcSKyuy/%'@]Ws", "bbp~YcSKyuy/%'@]Ws", ((AbstractVisitor) fieldVisitor0).OPCODES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16384, "loat", "\"BD@^T:Si4\"6T", "\"BD@^T:Si4\"6T", aSMifierClassVisitor0.TYPES);
      MethodVisitor methodVisitor1 = aSMifierClassVisitor0.visitMethod(1208, "PMdg,W5`", "-debug", "loat", aSMifierClassVisitor0.OPCODES);
      assertNotSame(methodVisitor1, methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(49, 1024, "import org.mockito.asm.attrs.*;\n", "import org.mockito.asm.attrs.*;\n", "by>Ic_DvVD>Y{", (String[]) null);
      aSMifierClassVisitor0.appendAccess(16384);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitMethod(16384, "fAPIT\"x:`)4", "fAPIT\"x:`)4", "HtOa5hyX?", aSMifierClassVisitor0.OPCODES);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(16384, 16384, "bbp~YcSKyuy/%'@]Ws", "bbp~YcSKyuy/%'@]Ws", "double", aSMifierClassVisitor0.OPCODES);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16384, "double", "bbp~YcSKyuy/%'@]Ws", "StaVkMap", aSMifierClassVisitor0.OPCODES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitMethod(1024, "import org.mockito.asm.attrs.*;\n", (String) null, "B{'cAJO[o6", (String[]) null);
      aSMifierClassVisitor0.appendAccess(16384);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitInnerClass("fa#`R>Q`rAse@T@Ltlclass", "PMdg,W5`", "fa#`R>Q`rAse@T@Ltlclass", 16403);
      aSMifierClassVisitor0.visit((-2719), (-2719), "PMdg,W5`", "T+Y#7|@U", "PMdg,W5`", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitMethod(16384, "loat", "\"BD@^T:Si4\"6T", "\"BD@^T:Si4\"6T", aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.visit(7, 1208, "g-oQ`Dc$'J0#", "$=\u0000c}a9", ".class.class", aSMifierClassVisitor0.OPCODES);
  }
}
