/*

 * Tue Mar 03 14:31:45 GMT 2020
 */

package org.mockito.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.asm.ClassWriter;
import org.mockito.asm.Label;
import org.mockito.asm.MethodWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MethodWriter_ESTest extends MethodWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(74);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "'\"$:aM";
      stringArray0[1] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 256, "2^iVX3')#aGg/G", "2^iVX3')#aGg/G", "2^iVX3')#aGg/G", stringArray0, true, true);
      // Undeclared exception!
      try { 
        methodWriter0.visitIntInsn(16777226, (-3193));
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
      ClassWriter classWriter0 = new ClassWriter(1920);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "U3=U?~|";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 939, "Xx{uafpE<m`E", "d)>DJEm.\t9O_U", "U3=U?~|", stringArray0, false, true);
      methodWriter0.visitVarInsn(2, 939);
      Label label0 = new Label();
      methodWriter0.visitLineNumber((-1898), label0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1489));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "float", "float", "float", (String[]) null, false, false);
      methodWriter0.visitFieldInsn(185, "2^iVX3')#aGg/G", "2^iVX3')#aGg/G", "2^iVX3')#aGg/G");
      Label label0 = new Label();
      methodWriter0.visitLabel(label0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1395);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "java/lang/Object";
      stringArray0[2] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 939, "java/lang/Object", "java/lang/Object", "", stringArray0, false, false);
      methodWriter0.visitTypeInsn(341, "java/lang/Object");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4606);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 66, "-;qs~ b", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "d)>DJEm.\t9O_U", (String[]) null, false, false);
      methodWriter0.visitFieldInsn((-825), "RuntimeInvisibleParameterAnnotations", "U3=U?~|", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII");
      Label label0 = new Label();
      methodWriter0.visitJumpInsn(262144, label0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1489));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "float", "float", "float", (String[]) null, false, false);
      methodWriter0.visitIntInsn(2, 3101);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1920);
      classWriter0.newInteger(939);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "U3=U?~|";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 939, "Xx{uafpE<m`E", "d)>DJEm.\t9O_U", "U3=U?~|", stringArray0, false, true);
      methodWriter0.visitVarInsn(2, 939);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1920);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "{3=U?~J";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 939, "Xx{uafpE<m`E", "d)>DJEm.\t9O_U", "{3=U?~J", stringArray0, false, true);
      methodWriter0.visitFieldInsn(939, "qlE", "oH5^L>", "oH5^L>");
      methodWriter0.visitMaxs(100, 146);
      methodWriter0.visitTypeInsn(939, "W^n5s~{");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1920);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "{3=U?~J";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 939, "Xx{uafpE<m`E", "d)>DJEm.\t9O_U", "{3=U?~J", stringArray0, false, true);
      methodWriter0.visitMaxs(2, 2);
      methodWriter0.visitTypeInsn(939, "W^n5s~{");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1920);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "U3=U?~|";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 939, "Xx{uafpE<m`E", "d)>DJEm.\t9O_U", "U3=U?~|", stringArray0, false, true);
      methodWriter0.visitVarInsn(2, 939);
      Label label0 = new Label();
      label0.next = label0;
      methodWriter0.visitLocalVariable("U3=U?~|", "U3=U?~|", "wZq3NBJ/kPp+wR", label0.next, label0, (-3606));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1920);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "{3=U?~J";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 939, "Xx{uafpE<m`E", "d)>DJEm.\t9O_U", "{3=U?~J", stringArray0, false, true);
      methodWriter0.visitMaxs(2, 2);
      methodWriter0.visitFieldInsn(939, "qlE", "oH5^L>", "oH5^L>");
      methodWriter0.visitMaxs(100, 146);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1920);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "U3=U?~|";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 939, "Xx{uafpE<m`E", "d)>DJEm.\t9O_U", "U3=U?~|", stringArray0, false, true);
      methodWriter0.visitMaxs(107, 2);
      methodWriter0.visitVarInsn(2, 939);
  }
}
