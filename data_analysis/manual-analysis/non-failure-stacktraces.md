# ST1

The called method expects this type of exception according to the comments and documentations.

# ST2

The called method expects this type of exception according to the comments and documentations.


# ST3

here, the mocked value returns null for getChronology. However this value cannot be null according to documents

# ST4

The called method expects this type of exception according to the comments and documentations.


# ST5 & 6
 The called method in caller is `parse`. The documentation of this method clearl says that the passed string cannot be null, while Cling passed null.


 # ST7
 Same as __ST3__

# ST8

[Stack trace](stacktraces.md#st8-nf1):

```
java.lang.NullPointerException
org.joda.time.format.DateTimeFormatterBuilder.appendUnknownString(DateTimeFormatterBuilder.java:1152)
org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber.printTo(DateTimeFormatterBuilder.java:1460)
```

Generated test ([test0](../../results/cling/time-org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber-org.joda.time.format.DateTimeFormatterBuilder-1/org/joda/time/format/DateTimeFormatterBuilder$PaddedNumber_ESTest.java)):

```java
  public void test0()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.centuryOfEra();
      Partial partial0 = new Partial(dateTimeFieldType0, 284);
      partial0.getFormatter();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 284, true);
      // Undeclared exception!
      try { 
        dateTimeFormatterBuilder_FixedNumber0.printTo((StringBuffer) null, (ReadablePartial) partial0, (Locale) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeFormatterBuilder", e);
      }
  }
```

This test passes null as StringBuffer of printTo. The documentation specifies that the parameter should not be null.

  # ST9
 Same as __ST5 & 6__



  # ST12
 Same as __ST1__


   # ST13
The generated test mocked a Chronology object to return `null` after calling method `get(Partial, double)`. However, this method never returns null. The only `get` method is:

```java
public int[] get(ReadablePartial partial, long instant) {
        int size = partial.size();
        int[] values = new int[size];
        for (int i = 0; i < size; i++) {
            values[i] = partial.getFieldType(i).getField(this).get(instant);
        }
        return values;
    }
```

 # ST14
 Same as __ST3__

  # ST15
 Same as __ST3__

# ST20

[Stack trace](stacktraces.md#st20-nf8):

```
java.lang.NullPointerException
org.apache.commons.math.ode.ThreeEighthesStepInterpolator.computeInterpolatedState(ThreeEighthesStepInterpolator.java:99)
org.apache.commons.math.ode.AbstractStepInterpolator.setInterpolatedTime(AbstractStepInterpolator.java:260)
org.apache.commons.math.ode.SwitchState.evaluateStep(SwitchState.java:155)
org.apache.commons.math.ode.SwitchingFunctionsHandler.evaluateStep(SwitchingFunctionsHandler.java:109)
```

Generated test ([test14](../../results/cling/math-org.apache.commons.math.ode.SwitchingFunctionsHandler-org.apache.commons.math.ode.SwitchState-5/org/apache/commons/math/ode/SwitchingFunctionsHandler_ESTest.java#L316)):

```java
@Test(timeout = 4000)
public void test14()  throws Throwable  {
    double[] doubleArray0 = new double[0];
    StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
    doReturn(0.0, 0.0).when(stepInterpolator0).getCurrentTime();
    doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
    doReturn((-8.428938276109013)).when(stepInterpolator0).getPreviousTime();
    doReturn(false).when(stepInterpolator0).isForward();
    SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
    SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
    doReturn(2673.84163940799, (-8.428938276109013), 1.0, (-8.428938276109013), 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
    SwitchingFunction switchingFunction1 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
    doReturn((-1775.37953), 815.4232, 2673.84163940799, (-1134.5752471117), (-1134.5752471117)).when(switchingFunction1).g(anyDouble() , any(double[].class));
    switchingFunctionsHandler0.add(switchingFunction1, 1.0, 342.726, 532);
    switchingFunctionsHandler0.add(switchingFunction0, 1.0, 342.726, 20);
    switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
    ThreeEighthesStepInterpolator threeEighthesStepInterpolator0 = new ThreeEighthesStepInterpolator();
    // Undeclared exception!
    try { 
      switchingFunctionsHandler0.evaluateStep(threeEighthesStepInterpolator0);
      fail("Expecting exception: NullPointerException");
    
    } catch(NullPointerException e) {
        //
        // no message in exception (getMessage() returned null)
        //
        verifyException("org.apache.commons.math.ode.ThreeEighthesStepInterpolator", e);
    }
}
```

The documentation of the default constructor of the [`ThreeEighthesStepInterpolator` class](projects/math/src/java/org/apache/commons/math/ode/ThreeEighthesStepInterpolator.java#L58) specifies that the interpolator should not be used before calling the `reinitialize` method in order to initialize the internal arrays. The generated test fails to do so. 

# ST21

[Stack trace](stacktraces.md#st21-nf9):

```
java.lang.NullPointerException
org.apache.commons.math.ode.MidpointStepInterpolator.computeInterpolatedState(MidpointStepInterpolator.java:90)
org.apache.commons.math.ode.AbstractStepInterpolator.setInterpolatedTime(AbstractStepInterpolator.java:260)
org.apache.commons.math.ode.SwitchState.evaluateStep(SwitchState.java:155)
org.apache.commons.math.ode.SwitchingFunctionsHandler.evaluateStep(SwitchingFunctionsHandler.java:109)
```

Generated test ([test12](../../results/cling/math-org.apache.commons.math.ode.SwitchingFunctionsHandler-org.apache.commons.math.ode.SwitchState-5/org/apache/commons/math/ode/SwitchingFunctionsHandler_ESTest.java#L259)):

```java
@Test(timeout = 4000)
public void test12()  throws Throwable  {
    double[] doubleArray0 = new double[0];
    StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
    doReturn(0.0, 0.0).when(stepInterpolator0).getCurrentTime();
    doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
    doReturn((-8.428938276109013)).when(stepInterpolator0).getPreviousTime();
    doReturn(true).when(stepInterpolator0).isForward();
    SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
    SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
    doReturn(2673.84163940799, (-8.428938276109013), 1.0, (-8.428938276109013), 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
    SwitchingFunction switchingFunction1 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
    doReturn((-1775.37953), 815.4232, 2673.84163940799, (-1134.57525), (-1134.57525)).when(switchingFunction1).g(anyDouble() , any(double[].class));
    switchingFunctionsHandler0.add(switchingFunction1, 1.0, 342.726, 532);
    switchingFunctionsHandler0.add(switchingFunction0, 1.0, (-506.2), 532);
    switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
    MidpointStepInterpolator midpointStepInterpolator0 = new MidpointStepInterpolator();
    // Undeclared exception!
    try { 
      switchingFunctionsHandler0.evaluateStep(midpointStepInterpolator0);
      fail("Expecting exception: NullPointerException");
    
    } catch(NullPointerException e) {
        //
        // no message in exception (getMessage() returned null)
        //
        verifyException("org.apache.commons.math.ode.MidpointStepInterpolator", e);
    }
}
```

The documentation of the default constructor of the [`MidpointStepInterpolator` class](projects/math/src/java/org/apache/commons/math/ode/MidpointStepInterpolator.java#L53) specifies that the interpolator should not be used before calling the `reinitialize` method in order to initialize the internal arrays. The generated test fails to do so. 

# ST22

[Stack trace](stacktraces.md#st22-nf10):

```
java.lang.NullPointerException
org.apache.commons.math.ode.DormandPrince54StepInterpolator.computeInterpolatedState(DormandPrince54StepInterpolator.java:129)
org.apache.commons.math.ode.AbstractStepInterpolator.setInterpolatedTime(AbstractStepInterpolator.java:260)
org.apache.commons.math.ode.SwitchState.evaluateStep(SwitchState.java:155)
org.apache.commons.math.ode.SwitchingFunctionsHandler.evaluateStep(SwitchingFunctionsHandler.java:109)
```

Generated test ([test17](../../results/cling/math-org.apache.commons.math.ode.SwitchingFunctionsHandler-org.apache.commons.math.ode.SwitchState-2/org/apache/commons/math/ode/SwitchingFunctionsHandler_ESTest.java#L386)):

```java
@Test(timeout = 4000)
public void test17()  throws Throwable  {
    SwitchingFunctionsHandler switchingFunctionsHandler0 = new SwitchingFunctionsHandler();
    double[] doubleArray0 = new double[0];
    double[] doubleArray1 = new double[10];
    StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
    doReturn((-660.6816114008509), 970.084).when(stepInterpolator0).getCurrentTime();
    doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray1, (Object) doubleArray1).when(stepInterpolator0).getInterpolatedState();
    doReturn((-3039.42)).when(stepInterpolator0).getPreviousTime();
    doReturn(false).when(stepInterpolator0).isForward();
    SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
    doReturn((-666.0), (-666.0), (double)323, Double.NaN, (double)323).when(switchingFunction0).g(anyDouble() , any(double[].class));
    SwitchingFunction switchingFunction1 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
    doReturn(970.084, (-660.6816114008509), 2371.31059479, (-27.594512739714805), (-3039.42)).when(switchingFunction1).g(anyDouble() , any(double[].class));
    switchingFunctionsHandler0.add(switchingFunction1, 947.4, (-0.322376179245283), 323);
    switchingFunctionsHandler0.add(switchingFunction0, 2371.31059479, 2371.31059479, 323);
    switchingFunctionsHandler0.evaluateStep(stepInterpolator0);
    DormandPrince54StepInterpolator dormandPrince54StepInterpolator0 = new DormandPrince54StepInterpolator();
    // Undeclared exception!
    try { 
      switchingFunctionsHandler0.evaluateStep(dormandPrince54StepInterpolator0);
      fail("Expecting exception: NullPointerException");
    
    } catch(NullPointerException e) {
        //
        // no message in exception (getMessage() returned null)
        //
        verifyException("org.apache.commons.math.ode.DormandPrince54StepInterpolator", e);
    }
}
```

The documentation of the default constructor of the [`DormandPrince54StepInterpolator` class](projects/math/src/java/org/apache/commons/math/ode/DormandPrince54StepInterpolator.java#L42) specifies that the interpolator should not be used before calling the `reinitialize` method in order to initialize the internal arrays. The generated test fails to do so. 

  # ST26
The captured exception is not about the integration of caller and callee


  # ST27
One of the objects are mocked to return a null value. It is impossible for the mocked object to return null.


  # ST28
  Same as __ST27__

  # ST31

The called method in caller class is Deprecated.




# ST40

For activating `PrototypeMap`, we ned to call `activatePrototypeMap(id)`. The passed `id` should be a value lower than 24. The generated test directly called this method with higher number and it throws the exception. However, when we check all of the invokation of this method in the project, we can see that this method is always called with a static int.


# ST43
 
The called method of caller class does not accept null value according to the comments and documentations.


# ST48

The Delegator class is instantiated by a constructor, which is indicated to be used only for portotype object.