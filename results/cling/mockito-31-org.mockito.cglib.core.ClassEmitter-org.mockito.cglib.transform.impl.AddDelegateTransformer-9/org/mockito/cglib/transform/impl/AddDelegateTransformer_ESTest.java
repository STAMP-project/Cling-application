/*

 * Tue Mar 03 14:08:17 GMT 2020
 */

package org.mockito.cglib.transform.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.asm.ClassWriter;
import org.mockito.asm.Type;
import org.mockito.cglib.core.ClassEmitter;
import org.mockito.cglib.core.CodeEmitter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AddDelegateTransformer_ESTest extends AddDelegateTransformer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2000));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[32];
      classEmitter0.visit(2, 2, "", "", "", stringArray0);
      classEmitter0.begin_static();
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      ClassWriter classWriter0 = new ClassWriter((-1334));
      classEmitter0.setTarget(classWriter0);
      Type type0 = Type.getObjectType("4lo");
      Type[] typeArray0 = new Type[8];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      typeArray0[6] = type0;
      typeArray0[7] = type0;
      classEmitter0.begin_class(2, 1483, "4lo", type0, typeArray0, "4lo");
      assertEquals(3, Type.BYTE);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(58);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      classEmitter0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(58);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[8];
      classEmitter0.visit(2, (-859), "", "", "", stringArray0);
      classEmitter0.getStaticHook();
      classEmitter0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(100);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[8];
      classEmitter0.visit(2, (-859), "", "", "", stringArray0);
      classEmitter0.begin_static();
      classEmitter0.visitEnd();
  }
}
