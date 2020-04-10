/*

 * Tue Mar 03 20:48:15 GMT 2020
 */

package com.google.javascript.rhino.head.tools.shell;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BoundFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.Delegator;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.Function;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeJavaClass;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.Synchronizer;
import com.google.javascript.rhino.head.tools.shell.Global;
import com.google.javascript.rhino.head.tools.shell.ShellContextFactory;
import java.io.FileNotFoundException;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.net.MalformedURLException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Global_ESTest extends Global_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Global global0 = new Global();
      Delegator delegator0 = new Delegator();
      Object[] objectArray0 = new Object[2];
      // Undeclared exception!
      try { 
        Global.sync((Context) null, global0, objectArray0, delegator0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.sync.args
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      Global global0 = new Global();
      Delegator delegator0 = new Delegator();
      Context context0 = Context.getCurrentContext();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(global0, delegator0, 318, "error reporter", 4, global0);
      // Undeclared exception!
      try { 
        Global.toint32(context0, delegator0, context0.emptyArgs, idFunctionObject0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.tools.shell.Global", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-3886L));
      Object[] objectArray0 = new Object[3];
      Global global0 = new Global();
      IdFunctionObject idFunctionObject0 = global0.exportAsJSClass(1, nativeArray0, true);
      // Undeclared exception!
      try { 
        Global.doctest((Context) null, nativeArray0, objectArray0, idFunctionObject0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.bad.shell.function.scope
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Global global0 = new Global();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Object[] objectArray0 = new Object[1];
      // Undeclared exception!
      try { 
        Global.runCommand((Context) null, global0, objectArray0, nativeContinuation0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.bad.shell.function.scope
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      // Undeclared exception!
      try { 
        Global.spawn(context0, (Scriptable) null, context0.emptyArgs, nativeContinuation0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.tools.shell.Global", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Global global0 = new Global();
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) global0;
      Synchronizer synchronizer0 = new Synchronizer(global0);
      // Undeclared exception!
      try { 
        Global.seal((Context) null, global0, objectArray0, synchronizer0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // seal function can only be applied to objects
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Global global0 = new Global();
      InputStream inputStream0 = global0.getIn();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      try { 
        Global.pipe(false, inputStream0, pipedOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      Global global0 = new Global(context0);
      InputStream inputStream0 = global0.getIn();
      InputStream inputStream1 = global0.getIn();
      assertSame(inputStream1, inputStream0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Object[] objectArray0 = new Object[5];
      // Undeclared exception!
      try { 
        Global.spawn((Context) null, nativeContinuation0, objectArray0, nativeContinuation0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Argument to spawn() must be a function or script.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) nativeJavaClass0;
      // Undeclared exception!
      try { 
        Global.seal((Context) null, nativeContinuation0, objectArray0, (Function) null);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // seal function supports only sealing of ScriptableObject instances
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Global global0 = new Global();
      Delegator delegator0 = new Delegator();
      Context context0 = Context.getCurrentContext();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(global0, delegator0, 318, "error reporter", 4, global0);
      context0.getElements(idFunctionObject0);
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      assertEquals(13, ScriptableObject.CONST);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Global global0 = new Global();
      Delegator delegator0 = new Delegator();
      Context context0 = Context.getCurrentContext();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(global0, delegator0, 318, "error reporter", 4, global0);
      Global global1 = new Global(context0);
      Object[] objectArray0 = context0.getElements(idFunctionObject0);
      assertEquals(4, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("");
      Global global0 = new Global(context0);
      // Undeclared exception!
      try { 
        global0.runDoctest(context0, nativeJavaPackage0, "js>_m$o", "Dalvik", 3249);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Global global0 = new Global();
      Delegator delegator0 = new Delegator();
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        Global.seal((Context) null, global0, context0.emptyArgs, delegator0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.tools.shell.Global", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Global global0 = new Global();
      Object[] objectArray0 = new Object[3];
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      // Undeclared exception!
      try { 
        Global.sync((Context) null, global0, objectArray0, nativeJavaClass0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.sync.args
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      FilterOutputStream filterOutputStream0 = new FilterOutputStream((OutputStream) null);
      Global.pipe(true, pipedInputStream0, filterOutputStream0);
      assertEquals(0, pipedInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      // Undeclared exception!
      try { 
        Global.sync(context0, nativeJavaClass0, context0.emptyArgs, nativeJavaClass0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.tools.shell.Global", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) "(/-D-5vT)";
      Object object0 = Global.toint32((Context) null, nativeContinuation0, objectArray0, nativeContinuation0);
      assertEquals(0, object0);
      
      ShellContextFactory shellContextFactory0 = new ShellContextFactory();
      Context context0 = shellContextFactory0.enter();
      Object[] objectArray1 = context0.getElements(nativeContinuation0);
      assertEquals(0, objectArray1.length);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(59).when(inputStream0).read(any(byte[].class) , anyInt() , anyInt());
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      Global.pipe(false, inputStream0, pipedOutputStream0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Global global0 = new Global();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Object[] objectArray0 = new Object[1];
      try { 
        Global.readFile((Context) null, global0, objectArray0, nativeContinuation0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // File not found: null
         //
         verifyException("com.google.javascript.rhino.head.tools.shell.Global", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      Global global0 = new Global(context0);
      context0.getElements(global0);
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      assertTrue(scriptableObject0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Global global0 = new Global();
      Context context0 = Context.getCurrentContext();
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("language version");
      int int0 = global0.runDoctest(context0, nativeJavaPackage0, "language version", "error reporter", 130);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Object[] objectArray0 = new Object[2];
      objectArray0[1] = (Object) nativeContinuation0;
      // Undeclared exception!
      try { 
        Global.runCommand((Context) null, nativeContinuation0, objectArray0, nativeContinuation0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.bad.shell.function.scope
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Context context0 = Context.enter();
      Global global0 = new Global(context0);
      Class<Delegator> class0 = Delegator.class;
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass(global0, class0);
      // Undeclared exception!
      try { 
        Global.runCommand(context0, global0, context0.emptyArgs, nativeJavaClass0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.tools.shell.Global", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Delegator delegator0 = new Delegator();
      Object[] objectArray0 = new Object[1];
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      try { 
        Global.readUrl((Context) null, nativeJavaClass0, objectArray0, delegator0);
        fail("Expecting exception: MalformedURLException");
      
      } catch(MalformedURLException e) {
         //
         // no protocol: null
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          Object[] objectArray0 = new Object[3];
          NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
          Global global0 = new Global();
          BoundFunction boundFunction0 = new BoundFunction((Context) null, global0, nativeJavaClass0, global0, objectArray0);
          // Undeclared exception!
          try { 
            Global.runCommand((Context) null, boundFunction0, objectArray0, boundFunction0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"<<ALL FILES>>\" \"execute\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // java.lang.SecurityManager.checkExec(SecurityManager.java:799)
             // java.lang.ProcessBuilder.start(ProcessBuilder.java:1018)
             // java.lang.Runtime.exec(Runtime.java:621)
             // java.lang.Runtime.exec(Runtime.java:486)
             // com.google.javascript.rhino.head.tools.shell.Global.runProcess(Global.java:930)
             // com.google.javascript.rhino.head.tools.shell.Global.runCommand(Global.java:760)
             // sun.reflect.GeneratedMethodAccessor176.invoke(Unknown Source)
             // sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.lang.reflect.Method.invoke(Method.java:498)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:257)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:220)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:307)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:213)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:748)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }
}
