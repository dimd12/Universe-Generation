package com.universe.enums.types;

/**
 * Represents the spectral classification of stars (Harvard system).
 * Each type corresponds to a temperature, color, and mass range,
 * and can belong to different stellar populations
 * ({@link com.universe.enums.elements.StarComposition StarComposition}).
 *
 * <p>Order from hottest to coolest: O → B → A → F → G → K → M.</p>
 *
 * <p>Population links:</p>
 * <ul>
 *   <li>{@link #O} / {@link #B} → possible {@link com.universe.enums.elements.StarComposition#POP_III}
 *       in the early universe; Pop I & II exist today.</li>
 *   <li>{@link #A}, {@link #F}, {@link #G}, {@link #K}, {@link #M} → mostly
 *       {@link com.universe.enums.elements.StarComposition#POP_I} (young, disk stars)
 *       and {@link com.universe.enums.elements.StarComposition#POP_II} (old, halo stars).</li>
 * </ul>
 *
 * <p>Examples:</p>
 * <ul>
 *   <li>The Sun → {@link #G}, {@link com.universe.enums.elements.StarComposition#POP_I}</li>
 *   <li>Proxima Centauri → {@link #M}, {@link com.universe.enums.elements.StarComposition#POP_I}</li>
 *   <li>Halo giants → often {@link #K}/{@link #M}, {@link com.universe.enums.elements.StarComposition#POP_II}</li>
 * </ul>
 *
 * @author Adrian
 * @since 1.0
 * @version 1.0
 */
public enum StarTypes {

    /** O-type: Blue, very hot (>30,000 K), massive, rare.
     * Can include early {@link com.universe.enums.elements.StarComposition#POP_III} stars. */
    O,

    /** B-type: Blue-white, hot (10,000–30,000 K).
     * Some early universe {@link com.universe.enums.elements.StarComposition#POP_III} stars were likely B-type. */
    B,

    /** A-type: White stars (7,500–10,000 K).
     * Commonly {@link com.universe.enums.elements.StarComposition#POP_I} in the galactic disk. */
    A,

    /** F-type: Yellow-white stars (6,000–7,500 K).
     * Found in both {@link com.universe.enums.elements.StarComposition#POP_I} and {@link com.universe.enums.elements.StarComposition#POP_II}. */
    F,

    /** G-type: Yellow stars (5,200–6,000 K).
     * The Sun is G-type, {@link com.universe.enums.elements.StarComposition#POP_I}. */
    G,

    /** K-type: Orange stars (3,700–5,200 K).
     * Can be {@link com.universe.enums.elements.StarComposition#POP_I} (disk) or {@link com.universe.enums.elements.StarComposition#POP_II} (halo). */
    K,

    /** M-type: Red stars (<3,700 K), very common.
     * Includes disk {@link com.universe.enums.elements.StarComposition#POP_I} and old halo {@link com.universe.enums.elements.StarComposition#POP_II}. */
    M
}
