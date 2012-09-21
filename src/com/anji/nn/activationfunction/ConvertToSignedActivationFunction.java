package com.anji.nn.activationfunction;


/**
 * @author Oliver Coleman
 */
public class ConvertToSignedActivationFunction implements ActivationFunction {

	/**
	 * unique ID string
	 */
	public final static String NAME = ActivationFunctionType.CONVERT_TO_SIGNED.toString();

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return NAME;
	}

	/**
	 * @see com.anji.nn.activationfunction.ActivationFunction#apply(float)
	 */
	public float apply( float input ) {
		if (input <= 0)
			input = 0;
		else if (input >= 1)
			input = 1;
		return (input * 2) - 1;
	}

	/**
	 * @see com.anji.nn.activationfunction.ActivationFunction#getMaxValue()
	 */
	public float getMaxValue() {
		return 1;
	}

	/**
	 * @see com.anji.nn.activationfunction.ActivationFunction#getMinValue()
	 */
	public float getMinValue() {
		return -1;
	}

	/**
	 * @see com.anji.nn.activationfunction.ActivationFunction#cost()
	 */
	public long cost() {
		return 42;
	}

}