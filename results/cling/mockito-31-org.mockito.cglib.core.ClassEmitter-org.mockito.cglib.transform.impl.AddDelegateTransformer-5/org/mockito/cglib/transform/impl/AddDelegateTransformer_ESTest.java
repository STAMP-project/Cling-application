/*

 * Tue Mar 03 14:08:12 GMT 2020
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
      Type[] typeArray0 = new Type[5];
      Type[] typeArray1 = new Type[0];
      ClassWriter classWriter0 = new ClassWriter(2317);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      classEmitter0.begin_class((-6), 2, "o:FXIr\"", typeArray0[0], typeArray1, "<(X/2FPe6czBVsmHY");
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      CodeEmitter codeEmitter1 = classEmitter0.getStaticHook();
      assertFalse(codeEmitter1.equals((Object)codeEmitter0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(140);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[2];
      classEmitter0.visit(1, 1, "", "", "", stringArray0);
      assertEquals(2, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2317);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      classEmitter0.end_class();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Type[] typeArray0 = new Type[17];
      Type[] typeArray1 = new Type[0];
      ClassWriter classWriter0 = new ClassWriter(130);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      classEmitter0.begin_class(183, 2, "o:FXIr\"", typeArray0[0], typeArray1, "d)F");
      classEmitter0.getStaticHook();
      classEmitter0.end_class();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Type[] typeArray0 = new Type[5];
      Type[] typeArray1 = new Type[0];
      ClassWriter classWriter0 = new ClassWriter(2317);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      classEmitter0.begin_class((-6), 2, "o:FXIr\"", typeArray0[0], typeArray1, "<(X/2FPe6czBVsmHY");
      classEmitter0.begin_static();
      classEmitter0.visitEnd();
  }
}
