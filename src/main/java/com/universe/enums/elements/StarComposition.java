package com.universe.enums.elements;

/**
 * Represents the stellar population categories used in astrophysics.
 * These categories indicate the chemical composition ("metallicity")
 * and evolutionary history of stars.
 *
 * <p>Connection with {@link com.universe.enums.types.StarTypes StarTypes}:</p>
 * <ul>
 *   <li>{@link #POP_I} → typically younger spectral types
 *       {@link com.universe.enums.types.StarTypes#A A}, {@link com.universe.enums.types.StarTypes#F F},
 *       {@link com.universe.enums.types.StarTypes#G G}, {@link com.universe.enums.types.StarTypes#K K},
 *       {@link com.universe.enums.types.StarTypes#M M} (e.g., the Sun is G-type, Pop I).</li>
 *   <li>{@link #POP_II} → older, metal-poor stars, commonly
 *       {@link com.universe.enums.types.StarTypes#F F}, {@link com.universe.enums.types.StarTypes#G G},
 *       {@link com.universe.enums.types.StarTypes#K K}, {@link com.universe.enums.types.StarTypes#M M},
 *       found in galactic halos and clusters.</li>
 *   <li>{@link #POP_III} → theoretical first-generation stars,
 *       likely massive {@link com.universe.enums.types.StarTypes#O O} or {@link com.universe.enums.types.StarTypes#B B},
 *       short-lived and composed almost entirely of H/He.</li>
 * </ul>
 *
 * @author Adrian
 * @since 1.0
 * @version 1.0
 */
public enum StarComposition {

    /** Population I: Metal-rich, younger stars like the Sun (G-type). */
    POP_I,

    /** Population II: Metal-poor, older stars in halos/globular clusters (often F–M types). */
    POP_II,

    /** Population III: Hypothetical first stars, almost pure hydrogen/helium, likely O/B-type. */
    POP_III
}
