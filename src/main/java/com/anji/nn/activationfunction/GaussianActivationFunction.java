/*
 * Copyright (C) 2004 Oliver Coleman
 * 
 * This file is part of ANJI (Another NEAT Java Implementation).
 * 
 * ANJI is free software; you can redistribute it and/or modify it under the terms of the GNU
 * General Public License as published by the Free Software Foundation; either version 2 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See
 * the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with this program; if
 * not, write to the Free Software Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA
 * 02111-1307 USA
 * 
 */
package com.anji.nn.activationfunction;

/**
 * Gaussian activation function.
 *
 * @author Oliver Coleman
 */
public class GaussianActivationFunction 
        implements ActivationFunction, DifferentiableFunction
{

    private final static double SLOPE = 1;

    /**
     * identifying string
     */
    public final static String NAME = "gaussian";

    /**
     * @see Object#toString()
     */
    public String toString() {
        return NAME;
    }

    /**
     * This class should only be accessd via ActivationFunctionFactory.
     */
    GaussianActivationFunction() {
        // no-op
    }

    /**
     * Return <code>input</code> with Gaussian function transformation.
     *
     * @see com.anji.nn.activationfunction.ActivationFunction#apply(double)
     */
    @Override
    public double apply(double input) {
        return Math.exp(-(input * input * SLOPE));
    }
    
    @Override
    public double applyDiff(double x) {
        return -2 * Math.exp(-SLOPE * x*x) * SLOPE * x;
    }

    /**
     * @see com.anji.nn.activationfunction.ActivationFunction#getMaxValue()
     */
    @Override
    public double getMaxValue() {
        return 1;
    }

    /**
     * @see com.anji.nn.activationfunction.ActivationFunction#getMinValue()
     */
    @Override
    public double getMinValue() {
        return 0;
    }

    /**
     * @see com.anji.nn.activationfunction.ActivationFunction#cost()
     */
    @Override
    public long cost() {
        return 42;
    }
}
