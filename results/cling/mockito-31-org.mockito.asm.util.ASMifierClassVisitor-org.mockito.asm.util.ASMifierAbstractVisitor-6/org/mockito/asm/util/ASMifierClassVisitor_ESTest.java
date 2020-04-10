/*

 * Tue Mar 03 14:15:52 GMT 2020
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
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mockito.asm.AnnotationVisitor;
import org.mockito.asm.FieldVisitor;
import org.mockito.asm.MethodVisitor;
import org.mockito.asm.util.ASMifierClassVisitor;
import org.mockito.asm.util.AbstractVisitor;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ASMifierClassVisitor_ESTest extends ASMifierClassVisitor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[6];
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(59, 16384, "Imbn|E", "", "mv.isitLbel(", stringArray0);
      aSMifierClassVisitor0.visit(2809, 32, "+lD(S$ACLApN4v(;R", "Cgv-$R] jl8nf", "mv.isitLbel(", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(0, 0, "InnerClasses", "", "", aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.visit(48, 1656, "/aYrJ#0mbqM>", "InnerClasses", "[v&0,", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      String string0 = "\\u.class";
      aSMifierClassVisitor0.visit(0, 16384, "=@?p#;s*I", string0, "Opcodes.DOUBLE", aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visit(47, 558, "new int[] {", "\"(e7+BK|:i~Z", "Opcodes.DOUBLE", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(32767, 8192, "x>;{8}^'", "x>;{8}^'", "x>;{8}^'", (String[]) null);
      String[] stringArray0 = new String[0];
      aSMifierClassVisitor0.visit(32, 32, "{<cm", "z&%2Z.7>V<g", "{<cm", stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[1];
      String string0 = "\\u.class.class";
      stringArray0[0] = string0;
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // \\u.class.class (No such file or directory)
         //
         verifyException("java.io.FileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[0];
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(131072, (String) null, "iZportsorf.mockito.!sm.*;\n", "{", stringArray0);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(47, (-3947), "JsqF", "mv.visitFieldInsn(", ".class", aSMifierClassVisitor0.OPCODES);
      Locale locale0 = Locale.JAPAN;
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField((-391), "JsqF", ".class", "BwB+L{b|0;p8'.class", locale0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(1460, "J!'}L#ZVECe", "J!'}L#ZVECe", "J!'}L#ZVECe", stringArray0);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitField(16384, "import org.mockito.asm.*;\n", "import org.mockito.asm.*;\n", "R]ZS{Vm_iSy&hanx~N", "R]ZS{Vm_iSy&hanx~N");
      aSMifierClassVisitor0.appendAccess((-385));
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      String string0 = "\\u";
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      String[] stringArray0 = new String[2];
      stringArray0[0] = string0;
      aSMifierClassVisitor0.visit(1126, 1126, "", "WIMs.~'{k)7", string0, stringArray0);
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // \\u (No such file or directory)
         //
         verifyException("java.io.FileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitMethod(16384, (String) null, (String) null, (String) null, aSMifierClassVisitor0.OPCODES);
      String string0 = "\\u.class";
      aSMifierClassVisitor0.visitInnerClass("mv.isitLbel(", string0, "ACC_SYNTHETIC", 48);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(16, 1457, "1g(~3xM", "1g(~3xM", "1g(~3xM", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitMethod(16384, "", "C", "R9p!UDPn", aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.visit(16384, 16384, "", "(|lbl}o}=6'E", "+A96:!<@u@Q.Y>NKM[p", (String[]) null);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[4];
      aSMifierClassVisitor0.visitField(16376, stringArray0[1], stringArray0[0], "R]ZS{Vm_iSy&hanx~N", "F-2MWHJQk`y9");
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(8, "Q 7#R1Q", "j$jVlH@NoxL +1,Fz", "eZ^DR5iz I40", stringArray0);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "*=dNtNl5/YrO";
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // *=dNtNl5/YrO (No such file or directory)
         //
         verifyException("java.io.FileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String[] stringArray0 = new String[6];
      ASMifierClassVisitor.main(stringArray0);
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitInnerClass("", ",", "BwB+L{b|0;p8'.class", 16384);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      aSMifierClassVisitor0.visitField(92, "YgP", "WIMs.~'{k)7", "IUKDOw([Z>G-~", "IUKDOw([Z>G-~");
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
  public void test17()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(41, 41, "j&:`zKU!?~X/L~", "import org.mockito.asm.*;\n", "V1_5", aSMifierClassVisitor0.OPCODES);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-669), "Q H_R", "Q H_R", "cYR}m*>J0m", aSMifierClassVisitor0.TYPES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[5];
      aSMifierClassVisitor0.visitField(16384, stringArray0[1], stringArray0[0], "R]ZS{Vm_iSy&hanx~N", "F-2MWHJQk`y9");
      aSMifierClassVisitor0.visit((-1740), (-1740), "F-2MWHJQk`y9", "F-2MWHJQk`y9", "av0 = ", stringArray0);
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String[] stringArray0 = new String[6];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(100, 8192, ".6pGhtg{aUhl", " }", "", stringArray0);
      aSMifierClassVisitor0.appendAccess(100);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String[] stringArray0 = new String[6];
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitInnerClass("", ",", "BwB+L{b|0;p8'.class", 16384);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16384, "", "", (String) null, stringArray0);
      MethodVisitor methodVisitor1 = aSMifierClassVisitor0.visitMethod((-1786), "", (String) null, "", ((AbstractVisitor) methodVisitor0).TYPES);
      assertNotSame(methodVisitor1, methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-711), "V", "V", "V", (String[]) null);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(14, "<init>", "<init>", (String) null, (String[]) null);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.appendAccess(32767);
      aSMifierClassVisitor0.appendAccess((-800));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[4];
      aSMifierClassVisitor0.visitField(16384, stringArray0[1], stringArray0[0], "R]ZS{Vm_iSy&hanx~N", "F-2MWHJQk`y9");
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(8, "Q 7#R1Q", "j$jVlH@NoxL +1,Fz", "eZ^DR5iz I40", stringArray0);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.visit((-2574), (-2574), " ADIc.", "", "'vUr! OdjQN<", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit((-2574), 8192, "x>;{8}^'", "", " ADIc.", aSMifierClassVisitor0.TYPES);
      aSMifierClassVisitor0.visit((-2574), (-2574), " ADIc.", "", "'vUr! OdjQN<", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(32783, 8192, "x>;{8}^'", "x>;{8}^'", (String) null, aSMifierClassVisitor0.OPCODES);
      Object object0 = new Object();
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(16, "x>;{8}^'", "ACC_DEPRECATED", "gTKXFx_", object0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String string0 = "\\u";
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      Object object0 = new Object();
      ASMifierClassVisitor.main(aSMifierClassVisitor0.OPCODES);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(8192, (String) null, "WIMs.~'{k)7", string0, object0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String[] stringArray0 = new String[6];
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitMethod(16384, "", "", (String) null, stringArray0);
      AnnotationVisitor annotationVisitor0 = aSMifierClassVisitor0.visitAnnotation("j$/Ov}~q2xt", true);
      aSMifierClassVisitor0.visit(779, 779, "j$/Ov}~q2xt", "QD^~pANYEpvCo", "", ((AbstractVisitor) annotationVisitor0).OPCODES);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String[] stringArray0 = new String[6];
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitInnerClass("ACC_SUPER", "", "", 16384);
      aSMifierClassVisitor0.visit(46, 16384, "8%O", "mv.isitLbel(", "J!'}L#ZVECe", stringArray0);
      assertEquals(6, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      Integer integer0 = new Integer(1721);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(1721, "", "WIMs.~'{k)7", "", integer0);
      aSMifierClassVisitor0.visit(46, (-1281), "cw.visit(", "mv.visitLookupSwitchInsn(", ".jJ. *", ((AbstractVisitor) fieldVisitor0).TYPES);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      String string0 = "\\u.cBKlass";
      aSMifierClassVisitor0.visit(50, (-831), string0, "3ldrt}0", "9&X+yE#+NARc?K\u0006Seg", stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      String[] stringArray0 = new String[4];
      stringArray0[0] = "74a";
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(50, 50, stringArray0[0], "74a", "74a", stringArray0);
      assertEquals(4, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit((-2574), 8192, "x>;{8}^'", "", " ADIc.", aSMifierClassVisitor0.OPCODES);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(40, "", " ADIc.", "", aSMifierClassVisitor0.OPCODES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(3456, "E.yds= l8*A_", "", "new int[] {", aSMifierClassVisitor0.OPCODES);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String string0 = "\\u";
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit((-424), (-424), string0, "E}]p)|)THrrNREu", (String) null, aSMifierClassVisitor0.TYPES);
      Object object0 = new Object();
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(8192, (String) null, "WIMs.~'{k)7", string0, object0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(32767, 8192, "x>;{8}^'", "x>;{8}^'", "x>;{8}^'", (String[]) null);
      Object object0 = new Object();
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(8192, ";TR/sa", "sLt3_&i)a7z", "x>;{8}^'", object0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String[] stringArray0 = new String[6];
      ASMifierClassVisitor.main(stringArray0);
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      Object object0 = new Object();
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(16384, (String) null, "Opcodes.DOUBLE.class.class", "3QRh|Ul:a/2", object0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String[] stringArray0 = new String[6];
      ASMifierClassVisitor.main(stringArray0);
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod(16384, "", "", (String) null, stringArray0);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit(1312, 524288, "o-@$|pa(~Y#^sDM", "R]ZS{Vm_iSy&hanx~N", "attr", stringArray0);
      Object object0 = new Object();
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(16384, "attr", "attr", "}y8,ft~7:.tQWVUEz@", object0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(32767, 8192, "x>;{8}^'", "x>;{8}^'", "x>;{8}^'", (String[]) null);
      aSMifierClassVisitor0.appendAccess((-2006));
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      MethodVisitor methodVisitor0 = aSMifierClassVisitor0.visitMethod((-2427), "dy?meriZ].]no", "", "1?Xh^lLmwwEe:", stringArray0);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitInnerClass("ACC_SUPER", "", "", 16384);
      aSMifierClassVisitor0.visit((-402), 125, "8%O", "aT@[l4q", "aT@[l4q", aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String string0 = "\\u";
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitField((-202), string0, "WIMs.~'{k)7", "H?YiGm\"", (Object) null);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "H?YiGm\"";
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
  public void test45()  throws Throwable  {
      String string0 = "\\u";
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitField((-202), string0, "WIMs.~'{k)7", "H?YiGm\"", (Object) null);
      String[] stringArray0 = new String[2];
      stringArray0[0] = string0;
      try { 
        ASMifierClassVisitor.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // \\u (No such file or directory)
         //
         verifyException("java.io.FileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      String[] stringArray0 = new String[4];
      aSMifierClassVisitor0.visitField(16384, stringArray0[1], stringArray0[0], "R]ZS{Vm_iSy&hanx~N", "F-2MWHJQk`y9");
      aSMifierClassVisitor0.appendAccess(634);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitInnerClass("ACC_SUPER", "", "", 16384);
      Locale locale0 = Locale.CANADA_FRENCH;
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(48, "ACC_TRANSIENT", "", "", locale0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      String[] stringArray0 = new String[6];
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visitMethod(16384, "", "", (String) null, stringArray0);
      aSMifierClassVisitor0.visit(49, 49, "mv.isitLbel(", "j$/Ov}~q2xt", "", aSMifierClassVisitor0.TYPES);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visit((-2574), 8192, "x>;{8}^'", "", " ADIc.", aSMifierClassVisitor0.OPCODES);
      ASMifierClassVisitor.main(aSMifierClassVisitor0.OPCODES);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      aSMifierClassVisitor0.visit(49, 49, "mv.isitLbel(", "j$/Ov}~q2xt", "", aSMifierClassVisitor0.TYPES);
      Object object0 = new Object();
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField(16384, (String) null, "Opcodes.DOUBLE.class.class", "3QRh|Ul:a/2", object0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      String string0 = "\\u";
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor((PrintWriter) null);
      FieldVisitor fieldVisitor0 = aSMifierClassVisitor0.visitField((-202), string0, "WIMs.~'{k)7", "H?YiGm\"", (Object) null);
      aSMifierClassVisitor0.visit(49, 1126, "", (String) null, "", ((AbstractVisitor) fieldVisitor0).OPCODES);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      PrintWriter printWriter0 = mock(PrintWriter.class, new ViolatedAssumptionAnswer());
      ASMifierClassVisitor aSMifierClassVisitor0 = new ASMifierClassVisitor(printWriter0);
      aSMifierClassVisitor0.visitMethod(40, "", " ADIc.", "", aSMifierClassVisitor0.OPCODES);
      aSMifierClassVisitor0.visit((-2574), (-2574), " ADIc.", "", "'vUr! OdjQN<", aSMifierClassVisitor0.OPCODES);
  }
}
