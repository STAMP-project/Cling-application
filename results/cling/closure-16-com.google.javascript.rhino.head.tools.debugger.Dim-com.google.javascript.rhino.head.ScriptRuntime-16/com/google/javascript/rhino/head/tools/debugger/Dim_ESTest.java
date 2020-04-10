/*

 * Tue Mar 03 20:42:16 GMT 2020
 */

package com.google.javascript.rhino.head.tools.debugger;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.tools.debugger.Dim;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Dim_ESTest extends Dim_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      dim0.attachTo(contextFactory0);
      dim0.stringIsCompilableUnit("^2Vr.rYw8@SPxfz");
      Context context0 = contextFactory0.enter();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      context0.initStandardObjects((ScriptableObject) nativeArray0, true);
  }
}
