/*

 * Tue Mar 03 20:32:23 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.Interpreter;
import com.google.javascript.rhino.head.MemberBox;
import com.google.javascript.rhino.head.NativeJavaMethod;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.Scriptable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Interpreter_ESTest extends Interpreter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Interpreter interpreter0 = new Interpreter();
      Context context0 = Context.enter();
      ClassLoader classLoader0 = context0.getApplicationClassLoader();
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("Unknown icode : ", classLoader0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      // Undeclared exception!
      try { 
        interpreter0.createScriptObject(nativeJavaPackage0, importerTopLevel0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      Context.getContext();
      Interpreter interpreter0 = new Interpreter();
      NativeJavaMethod nativeJavaMethod0 = new NativeJavaMethod((MemberBox[]) null, "LX`Vs;k'Qz,-");
  }
}
