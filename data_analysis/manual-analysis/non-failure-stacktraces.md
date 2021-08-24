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

[Stack trace](stacktraces.md#st8-nf8):

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

# ST10

[Stack trace](stacktraces.md#st10-f1):

```
java.lang.IllegalArgumentException: Invalid min days in first week: 175
org.joda.time.chrono.JulianChronology.getInstance(JulianChronology.java:138)
org.joda.time.chrono.GJChronology.getInstance(GJChronology.java:215)
org.joda.time.chrono.GJChronology.getInstance(GJChronology.java:220)
org.joda.time.chrono.GJChronology.getInstance(GJChronology.java:252)
```

Generated test ([test2](../../results/cling/time-org.joda.time.chrono.GJChronology-org.joda.time.chrono.JulianChronology-2/org/joda/time/chrono/GJChronology_ESTest.java#L52)):

```java
@Test(timeout = 4000)
public void test2()  throws Throwable  {
    DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
    doReturn("8i?{Nb)fS#1Zq,zj+v", "ZjC Ua").when(dateTimeZone0).getID();
    JulianChronology.getInstance(dateTimeZone0);
    DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetMillis((-1839));
    // Undeclared exception!
    try {
      GJChronology.getInstance(dateTimeZone1, 10800000L, 175);
      fail("Expecting exception: IllegalArgumentException");

    } catch(IllegalArgumentException e) {
        //
        // Invalid min days in first week: 175
        //
        verifyException("org.joda.time.chrono.JulianChronology", e);
    }
}
```

The generated test passes 175 as the value of minimum number of days per week. Naturally, the maximum number of days in a week is 7! but there is no check in the code of the caller and callee. And caller is called from outside. Also, it is not mentioned in the [documentation](projects/time/src/main/java/org/joda/time/chrono/GJChronology.java#L234) that the value must be lower than 7. The caller class gets the wrong value and passes it to callee without checking it.

## Code history analysis

This is not a fault because there is a test in the project that confirm this thrown exception is expected:

```java
   public void testFactory_Zone_RI_int() {
        GJChronology chrono = GJChronology.getInstance(TOKYO, new Instant(0L), 2);
        assertEquals(TOKYO, chrono.getZone());
        assertEquals(new Instant(0L), chrono.getGregorianCutover());
        assertEquals(2, chrono.getMinimumDaysInFirstWeek());
        assertSame(GJChronology.class, GJChronology.getInstance(TOKYO, new Instant(0L), 2).getClass());

        DateTime cutover = new DateTime(1582, 10, 15, 0, 0, 0, 0, DateTimeZone.UTC);
        chrono = GJChronology.getInstance(TOKYO, null, 2);
        assertEquals(TOKYO, chrono.getZone());
        assertEquals(cutover.toInstant(), chrono.getGregorianCutover());
        assertEquals(2, chrono.getMinimumDaysInFirstWeek());

        try {
            GJChronology.getInstance(TOKYO, new Instant(0L), 0);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            GJChronology.getInstance(TOKYO, new Instant(0L), 8);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

```

# ST11

[Stack trace](stacktraces.md#st11-f2):

```
org.joda.time.IllegalFieldValueException: Value 14 for dayOfMonth is not supported
org.joda.time.chrono.GJChronology$CutoverField.set(GJChronology.java:719)
org.joda.time.chrono.ZonedChronology$ZonedDateTimeField.set(ZonedChronology.java:466)
org.joda.time.chrono.BaseChronology.set(BaseChronology.java:240)
```

Generated test ([test6](../../results/cling/time-org.joda.time.chrono.GJChronology-org.joda.time.chrono.GJChronology$CutoverField-14/org/joda/time/chrono/GJChronology_ESTest.java#L95)):

```java
@Test(timeout = 4000)
public void testSet_ifve()  throws Throwable  {
    DateTime dateTime0 = new DateTime();
    GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) dateTime0);
    LocalDateTime localDateTime0 = dateTime0.toLocalDateTime();


    gJChronology0.set(localDateTime0, (-748L));

}
```

Caller method [calls a method `set` in `ZonedChronology$ZonedDateTime`](projects/time/src/main/java/org/joda/time/chrono/BaseChronology.java#L240). This method changes one of the inputs and passes them to the set method in callee. Callee throws and exception because the returned value from one of the passed objects is not equal to the other passed value. There is no pre-checking before calling the callee.

## Code history analysis

This is not a fault because the this exception indicates that this is not a realistic scenario. And the generated test is not possible to happen in real life. In general, IllegalFieldValueException indicates that the passed values are not supported by Times projects, and it happens when you pass an unrealistic input like negative value for the number of days in a month.


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

# ST19

[Stack trace](stacktraces.md#st19-nf14):

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

# ST20

[Stack trace](stacktraces.md#st20-nf15):

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

# ST21

[Stack trace](stacktraces.md#st21-nf16):

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

  # ST25
The captured exception is not about the integration of caller and callee


  # ST26
One of the objects are mocked to return a null value. It is impossible for the mocked object to return null.


  # ST27
  Same as __ST26__

  # ST30

The called method in caller class is Deprecated.




# ST39

For activating `PrototypeMap`, we ned to call `activatePrototypeMap(id)`. The passed `id` should be a value lower than 24. The generated test directly called this method with higher number and it throws the exception. However, when we check all of the invokation of this method in the project, we can see that this method is always called with a static int.


# ST42
 
The called method of caller class does not accept null value according to the comments and documentations.


# ST47

The Delegator class is instantiated by a constructor, which is indicated to be used only for portotype object.
