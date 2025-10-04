package com.universe.enums.types;

/**
 * Represents the main categories of natural satellites (moons),
 * based on their origin and orbital characteristics, and links to their
 * likely {@link com.universe.enums.elements.SatelliteComposition compositions}.
 *
 * <p>Typical relationships:</p>
 * <ul>
 *   <li>{@link #REGULAR} → commonly
 *       {@link com.universe.enums.elements.SatelliteComposition#ROCKY_SILICATE ROCKY_SILICATE} or
 *       {@link com.universe.enums.elements.SatelliteComposition#MIXED_ICE_ROCK MIXED_ICE_ROCK}
 *       (formed in-situ within a circumplanetary disk).</li>
 *   <li>{@link #IRREGULAR} → often
 *       {@link com.universe.enums.elements.SatelliteComposition#ICE_RICH ICE_RICH},
 *       {@link com.universe.enums.elements.SatelliteComposition#MIXED_ICE_ROCK MIXED_ICE_ROCK}, or
 *       {@link com.universe.enums.elements.SatelliteComposition#RUBBLE_PILE RUBBLE_PILE}
 *       (distant, inclined/retrograde orbits; likely captured or disrupted).</li>
 *   <li>{@link #CAPTURED} → frequently
 *       {@link com.universe.enums.elements.SatelliteComposition#METALLIC_FRAGMENT METALLIC_FRAGMENT} or
 *       {@link com.universe.enums.elements.SatelliteComposition#RUBBLE_PILE RUBBLE_PILE}
 *       (ex-asteroids/Kuiper objects pulled in later).</li>
 * </ul>
 *
 * <p>Examples:</p>
 * <ul>
 *   <li>Earth’s Moon → {@link #REGULAR},
 *       {@link com.universe.enums.elements.SatelliteComposition#ROCKY_SILICATE ROCKY_SILICATE}</li>
 *   <li>Ganymede → {@link #REGULAR},
 *       {@link com.universe.enums.elements.SatelliteComposition#MIXED_ICE_ROCK MIXED_ICE_ROCK}</li>
 *   <li>Neptune’s Triton → {@link #CAPTURED},
 *       {@link com.universe.enums.elements.SatelliteComposition#ICE_RICH ICE_RICH}</li>
 * </ul>
 *
 * @author Adrian
 * @since 1.0
 * @version 1.0
 */
public enum SatelliteTypes {

    /** Regular moon: Formed with the planet; near-circular, low-inclination prograde orbits.
     *  Common compositions: {@link com.universe.enums.elements.SatelliteComposition#ROCKY_SILICATE},
     *  {@link com.universe.enums.elements.SatelliteComposition#MIXED_ICE_ROCK}. */
    REGULAR,

    /** Irregular moon: Typically small, distant, eccentric, inclined or retrograde orbits (often captured).
     *  Common compositions: {@link com.universe.enums.elements.SatelliteComposition#ICE_RICH},
     *  {@link com.universe.enums.elements.SatelliteComposition#MIXED_ICE_ROCK},
     *  {@link com.universe.enums.elements.SatelliteComposition#RUBBLE_PILE}. */
    IRREGULAR,

    /** Captured moon: Former asteroid/Kuiper object pulled into orbit by a planet’s gravity.
     *  Common compositions: {@link com.universe.enums.elements.SatelliteComposition#METALLIC_FRAGMENT},
     *  {@link com.universe.enums.elements.SatelliteComposition#RUBBLE_PILE}. */
    CAPTURED
}
