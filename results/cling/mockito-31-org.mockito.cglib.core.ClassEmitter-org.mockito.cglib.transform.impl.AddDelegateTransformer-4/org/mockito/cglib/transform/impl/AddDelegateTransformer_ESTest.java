/*

 * Tue Mar 03 14:08:06 GMT 2020
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
      ClassWriter classWriter0 = new ClassWriter(2147483645);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[6];
      classEmitter0.visit(1, 2, "[]", "", "^55t", stringArray0);
      classEmitter0.getStaticHook();
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Type[] typeArray0 = new Type[0];
      ClassWriter classWriter0 = new ClassWriter(0);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      classEmitter0.begin_class(109, (-1966), "s", (Type) null, typeArray0, "classInfo is null! ");
      assertEquals(0, typeArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2147483615);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      classEmitter0.end_class();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2147483615);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[6];
      classEmitter0.visit(1, 2, "[]", "[]", "^55t", stringArray0);
      classEmitter0.getStaticHook();
      classEmitter0.end_class();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(134);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[6];
      classEmitter0.visit(1, 2, "[]", "", "", stringArray0);
      classEmitter0.begin_static();
      classEmitter0.end_class();
  }
}
