/*

 * Tue Mar 03 14:17:56 GMT 2020
 */

package org.mockito.asm.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.OPCODES);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(8192, "L-,0nwWC;'&mqc", "FO,yHrMK!CgFP]I>", "Z!/}7\"rDc]mPV", stringArray0);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitMethod(16384, "", "8|S'g2>-&cbBaI\"", "SourceDebugExtension", stringArray0);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(16384, "8|S'g2>-&cbBaI\"", "", "9;Fodm>Gt;:tci/5]*", aSMifierClassVisitor0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16338, (String) null, "+^dQef;17['UDwp3.class", "|qMI]XyX$8i-fbh.class", (String[]) null);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visit(192, 8192, "L-,0nwWC;'&mqc", "", "wD5*8O!vy;>", aSMifierMethodVisitor0.OPCODES);
      aSMifierClassVisitor0.visit(32, 10, "ef1GcEnes|';Y31", "L-,0nwWC;'&mqc", "qAYMZ>", stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitMethod(0, (String) null, (String) null, "l5qE~$G", (String[]) null);
      aSMifierClassVisitor0.visitInnerClass("ACC_SYNCHRONIZED", "y.D#I*", "ACC_PRIVATE", 16384);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16384, "j2va/lang/Object", "/W4eSFr", "j2va/lang/Object", aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.visitInnerClass("j2va/lang/Object", "/W4eSFr", "!J_ut0", 16384);
      aSMifierClassVisitor0.visit(188, 188, "t)U-=}QkMn", "!J_ut0", "o<R1s|5", ((AbstractVisitor) methodVisitor0).OPCODES);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visit(16384, 32, "-J9f+/HRi2M", "L-,0nwWC;'&mqc", "wD5*8O!vy;>", aSMifierMethodVisitor0.TYPES);
      aSMifierClassVisitor0.visitInnerClass("GCQ", "Voe<!aj@_)>j7yMwEw", "l?>O", 8192);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.OPCODES);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16384, "", "8|S'g2>-&cbBaI\"", "SourceDebugExtension", stringArray0);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitMethod(16384, "mv.visit#ocalVariable(", "mv.visit#ocalVariable(", "mv.visit#ocalVariable(", (String[]) null);
      aSMifierClassVisitor0.visit(16384, 16384, "mv.visit#ocalVariable(", "ConstantValue", "Qd_3c;LOPe!", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visit(192, 8192, "L-,0nwWC;'&mqc", "", "wD5*8O!vy;>", aSMifierMethodVisitor0.OPCODES);
      Object object0 = new Object();
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(192, "", "AB~`E4uOa0C3)0", "", object0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ASMifierClassVisitor.main(stringArray0);
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16390, "Boolean.FALSE", "3S'/SV}6", "+ynm?^C_2pRZ$6g}6", stringArray0);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(128, (String) null, (String) null, "y.D#I*", aSMifierClassVisitor0.OPCODES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(16390, 16390, "+ynm?^C_2pRZ$6g}6", "-debug", "wD5*8O!vy;>", stringArray0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16390, "Boolean.FALSE", "3S'/SV}6", "+ynm?^C_2pRZ$6g}6", stringArray0);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visit(192, 8192, "L-,0nwWC;'&mqc", "", "wD5*8O!vy;>", aSMifierMethodVisitor0.OPCODES);
      aSMifierClassVisitor0.visit(48, 13, "", "on {\n\n", "9oF$WrL1*,d6y.D#I*.class", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[1];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16367, "SourceDebugExtension", "SourceDebugExtension", "LocalVariableTypeTable", stringArray0);
      MethodVisitor methodVisitor1 = aSMifierClassVisitor0.visitMethod(512, "LocalVariableTypeTable", "SourceDebugExtension", "av0 = mv.visitAnnotationDefault();\n", ((AbstractVisitor) methodVisitor0).TYPES);
      assertFalse(methodVisitor1.equals((Object)methodVisitor0));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[0];
      aSMifierClassVisitor0.visitMethod(16384, "j2va/lang/Object", "/W4eSFr", "j2va/lang/Object", stringArray0);
      aSMifierClassVisitor0.visitInnerClass("j2va/lang/Object", "/W4eSFr", "!J_ut0", 16384);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.appendAccess(32);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-2137), "}Q%Q_GX!>aO]{m`", "j2va/lang/Object", "L-,0nwWC;'&mqc", aSMifierClassVisitor0.OPCODES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitMethod(2792, "", "", "", aSMifierClassVisitor0.OPCODES);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
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
  public void test18()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[1];
      aSMifierClassVisitor0.visitInnerClass("+^dQef;17['UDwp3", "'J%I&/jR", "V1_6", (-1285));
      stringArray0[0] = "+^dQef;17['UDwp3";
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
  public void test19()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit((-1421), 16384, "", "", "", aSMifierClassVisitor0.OPCODES);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(3288, "", (String) null, "+ynm?^C_2pRZ$6g}6", aSMifierMethodVisitor0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.OPCODES);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visit(192, 8192, "L-,0nwWC;'&mqc", "", "wD5*8O!vy;>", aSMifierMethodVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16384, "SourceDebugExtension", "SourceDebugExtension", "LocalVariableTypeTable", stringArray0);
      MethodVisitor methodVisitor1 = aSMifierClassVisitor0.visitMethod(1893, "LocalVariableTypeTable", "B8%ch=JQbNs", "LocalVariableTypeTable", stringArray0);
      assertFalse(methodVisitor1.equals((Object)methodVisitor0));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visit(192, 8192, "L-,0nwWC;'&mqc", "", "wD5*8O!vy;>", aSMifierMethodVisitor0.OPCODES);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-2137), "}Q%Q_GX!>aO]{m`", "j2va/lang/Object", "L-,0nwWC;'&mqc", aSMifierClassVisitor0.OPCODES);
      assertFalse(methodVisitor0.equals((Object)aSMifierMethodVisitor0));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.OPCODES);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-2137), "}Q%Q_GX!>aO]{m`", "j2va/lang/Object", "L-,0nwWC;'&mqc", aSMifierClassVisitor0.OPCODES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16384, "SourceDebugExtension", "SourceDebugExtension", "LocalVariableTypeTable", stringArray0);
      aSMifierClassVisitor0.visit(16384, 16384, "l~RQHx,(/Wf^D1", "^N", "SourceDebugExtension", ((AbstractVisitor) methodVisitor0).OPCODES);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.appendAccess((-137));
      aSMifierClassVisitor0.visit(46, 46, "j]4!-", "1CC_P@BLIC", "wD5*8O!vy;>", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.appendAccess((-2219));
      aSMifierClassVisitor0.visit(47, 47, "wD5*8O!vy;>", "wD5*8O!vy;>", "wD5*8O!vy;>", stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(50, 50, "pqZ\"d4}?!ck", "t]?", "8i-fbh", aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visit((-3293), (-523), "t]?", "FieldVisitor fv;\n", "cLx;&b", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visit(192, 8192, "L-,0nwWC;'&mqc", "", "wD5*8O!vy;>", aSMifierMethodVisitor0.OPCODES);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(1243, "", ">Zo.]_H]O)d-", ":w#mB@a5m7lB", aSMifierClassVisitor0.OPCODES);
      assertFalse(methodVisitor0.equals((Object)aSMifierMethodVisitor0));
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visit(192, 8192, "L-,0nwWC;'&mqc", "", "wD5*8O!vy;>", aSMifierMethodVisitor0.OPCODES);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(8192, "L-,0nwWC;'&mqc", "FO,yHrMK!CgFP]I>", "Z!/}7\"rDc]mPV", stringArray0);
      assertFalse(methodVisitor0.equals((Object)aSMifierMethodVisitor0));
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(1346, 1346, "+^dQef;17['UDwp3.class", "+^dQef;17['UDwp3.class", "+^dQef;17['UDwp3.class", (String[]) null);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16364, (String) null, "+^dQef;17['UDwp3.class", "|qMI]XyX$8i-fbh.class", (String[]) null);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.OPCODES);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(16384, "8|S'g2>-&cbBaI\"", "", "9;Fodm>Gt;:tci/5]*", aSMifierClassVisitor0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visitInnerClass("-J9f+/HRi2M", "hw!b", "l?>O", 16384);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.appendAccess(32);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visit(192, 8192, "L-,0nwWC;'&mqc", "", "wD5*8O!vy;>", aSMifierMethodVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[0];
      aSMifierClassVisitor0.visit((-2381), 47, "/W4eSFr", "java/lang/Object", "java/lang/Object", stringArray0);
      aSMifierClassVisitor0.visitInnerClass(".class", (String) null, ".class", (-2381));
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitInnerClass("ension", ";!.Q@YcZIn:f,iOH", "attr", 16384);
      String[] stringArray0 = new String[0];
      aSMifierClassVisitor0.visit((-2381), 47, "/W4eSFr", "java/lang/Object", "java/lang/Object", stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(16383, 2258, "|qMI]XyX$8i-fbh", "|qMI]XyX$8i-fbh", (String) null, (String[]) null);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-2480), "public static byte[] dump () throws Exception {\n\n", "public static byte[] dump () throws Exception {\n\n.class", "public static byte[] dump () throws Exception {\n\n.class", (String[]) null);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitField(16384, "8|S'g2>-&cbBaI\"", "", "9;Fodm>Gt;:tci/5]*", aSMifierClassVisitor0);
      aSMifierClassVisitor0.visitInnerClass("8|S'g2>-&cbBaI\"", "0Gl_`uPE)xi", "L~8xtqAYMZ>.class", 100);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(2862, (-126), "ACC_BRIDGE", "ACC_BRIDGE", "ACC_BRIDGE", aSMifierClassVisitor0.OPCODES);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "ACC_BRIDGE";
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
  public void test39()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(16384, "8|S'g2>-&cbBaI\"", "", "9;Fodm>Gt;:tci/5]*", aSMifierClassVisitor0);
      Object object0 = new Object();
      FieldVisitor fieldVisitor1 = aSMifierClassVisitor0.visitField(2108, "", "", "8|S'g2>-&cbBaI\"", object0);
      assertFalse(fieldVisitor1.equals((Object)fieldVisitor0));
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitMethod((-2381), "x}t[Qa2ysjzu", "x}t[Qa2ysjzu", "x}t[Qa2ysjzu", aSMifierClassVisitor0.TYPES);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(16384, "(S!2ww8Z:HGfaG", "lX+taq7(", "|qMI]XyX$8i-fbh.class", (Object) null);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitMethod(16384, "", "8|S'g2>-&cbBaI\"", "SourceDebugExtension", stringArray0);
      aSMifierClassVisitor0.visit(16384, (-396), "SourceDebugExtension", "/z @ST}]*[U\".kh", "9oF$WrL1*,d6y.D#I*", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(196653, (-247), "|qMI]XyX$8i-fbh.class", "", "|qMI]XyX$8i-fbh.class", aSMifierClassVisitor0.OPCODES);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(16384, "(S!2ww8Z:HGfaG", "lX+taq7(", "|qMI]XyX$8i-fbh.class", (Object) null);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      Object object0 = new Object();
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(8, "[ Ha(H^Yhv", "8i-fbh", "pqZ\"d4}?!ck", object0);
      aSMifierClassVisitor0.visit((-3293), (-523), "t]?", "FieldVisitor fv;\n", "cLx;&b", ((AbstractVisitor) fieldVisitor0).TYPES);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.appendAccess(49);
      ASMifierMethodVisitor aSMifierMethodVisitor0 = aSMifierClassVisitor0.createASMifierMethodVisitor();
      aSMifierClassVisitor0.visit(49, (-2325), "public static byte[] dump () throws Exception {\n\n", "fv", "", aSMifierMethodVisitor0.TYPES);
  }
}
