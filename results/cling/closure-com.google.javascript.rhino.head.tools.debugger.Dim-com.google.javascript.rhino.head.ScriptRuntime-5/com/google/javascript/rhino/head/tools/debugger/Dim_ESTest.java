/*

 * Tue Mar 03 20:40:10 GMT 2020
 */

package com.google.javascript.rhino.head.tools.debugger;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import java.time.LocalDate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Dim_ESTest extends Dim_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Context context0 = Context.enter();
      context0.getImplementationVersion();
      NativeObject nativeObject0 = new NativeObject();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      LocalDate localDate0 = LocalDate.ofEpochDay(2);
      nativeObject0.put(" of class ", (Scriptable) nativeArray0, (Object) localDate0);
      assertTrue(nativeArray0.isExtensible());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      BaseFunction baseFunction0 = new BaseFunction();
      IdFunctionObject idFunctionObject0 = baseFunction0.exportAsJSClass(12, nativeArray0, true);
      baseFunction0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      context0.getImplementationVersion();
      scriptableObject0.put("", (Scriptable) nativeArray0, (Object) "Rhino 1.7 release 4 PRERELEASE 2019 07 12");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test3()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      scriptableObject0.put("07y7_nv>", (Scriptable) nativeArray0, (Object) "07y7_nv>");
      context0.getImplementationVersion();
  }

  @Test(timeout = 4000)
  @Ignore
  public void test4()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      scriptableObject0.put("0", (Scriptable) nativeArray0, (Object) "0");
      context0.getImplementationVersion();
  }
}
