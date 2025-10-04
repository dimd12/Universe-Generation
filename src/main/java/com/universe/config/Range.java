package com.universe.config;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a simple numeric range with minimum and maximum values.
 * <p>
 * This class is used throughout configuration files to express continuous or
 * bounded intervals, typically defined as:
 * <pre>
 * {
 *   "min": 100,
 *   "max": 500
 * }
 * </pre>
 * It is compatible with Jackson JSON parsing.
 * </p>
 *
 * <p><strong>JSON mapping:</strong></p>
 * <ul>
 *   <li>{@code "min"} → {@link #min}</li>
 *   <li>{@code "max"} → {@link #max}</li>
 * </ul>
 *
 * <p>Unknown fields are ignored during deserialization due to
 * {@link JsonIgnoreProperties @JsonIgnoreProperties(ignoreUnknown = true)}.</p>
 *
 * @author Adrian
 * @since 1.0
 * @version 1.0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Range {

    /** Lower bound of the range. */
    @JsonProperty("min")
    private double min;

    /** Upper bound of the range. */
    @JsonProperty("max")
    private double max;

    /** @return the minimum value of the range */
    public double getMin() {
        return min;
    }

    /** @param min the minimum value to set */
    public void setMin(double min) {
        this.min = min;
    }

    /** @return the maximum value of the range */
    public double getMax() {
        return max;
    }

    /** @param max the maximum value to set */
    public void setMax(double max) {
        this.max = max;
    }

    /**
     * Returns a string representation of this range in the form
     * {@code [min, max]}.
     *
     * @return a string with the range boundaries
     */
    @Override
    public String toString() {
        return "[" + min + ", " + max + "]";
    }
}
