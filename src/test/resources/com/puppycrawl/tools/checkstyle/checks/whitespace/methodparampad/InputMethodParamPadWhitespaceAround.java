package com.puppycrawl.tools.checkstyle.checks.whitespace.methodparampad;

@SuppressWarnings({"this", "that"})
public class InputMethodParamPadWhitespaceAround
{
    protected InputMethodParamPadWhitespaceAround ( int i )
    {
        this (); //whitespace
        toString ();
    }
    protected InputMethodParamPadWhitespaceAround ()
    {
        super ();
    }
    
    public void enhancedFor ()
    {
        int[] i = new int[2];
        for ( int j: i ) {
            System.identityHashCode ( j );
        }
    }
}

@interface CronExpression {
	Class<?>[] groups() default {}; 
}

@interface CronExpression1 {
	Class<?>[] groups() default { }; // extra space
}
