package com.anji.nn.activationfunction;

/**
 * Logic AND activation function.
 *
 * @author Oliver Coleman
 */
public class LogicAndActivationFunction extends LogicActivationFunction {

    /**
     * identifying string
     */
    public final static String NAME = "and";

    /**
     * @return 
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return NAME;
    }

    /**
     * This class should only be accessed via ActivationFunctionFactory.
     */
    LogicAndActivationFunction() {
    }

    /**
     * Returns the result of a logical AND over all inputs, where an input value
     * greater than or equal to 0.5 is considered logical true, and less than
     * 0.5 false.
     *
     * @param input
     * @param bias
     * @return 1 or 0 depending on result of logic operation.
     */
    @Override
    public double apply(double[] input, double bias) {
        boolean result = false;
        for (int i = 0; i < input.length; i++) {
            result &= input[i] >= 0.5;
        }
        return result ? 1 : 0;
    }
}
