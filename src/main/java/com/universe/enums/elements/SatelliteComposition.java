package com.universe.enums.elements;

/**
 * Represents the compositions of natural satellites (moons)
 * and links to their likely dynamical types
 * ({@link com.universe.enums.types.SatelliteTypes com.universe.enums.types.SatelliteTypes}).
 *
 * <p>Typical relationships:</p>
 * <ul>
 *   <li>{@link #ROCKY_SILICATE} → often
 *       {@link com.universe.enums.types.SatelliteTypes#REGULAR REGULAR}
 *       (inner, in-situ formed moons around rocky/giant planets).</li>
 *   <li>{@link #ICE_RICH} → frequently
 *       {@link com.universe.enums.types.SatelliteTypes#REGULAR REGULAR} (outer large moons)
 *       or {@link com.universe.enums.types.SatelliteTypes#CAPTURED CAPTURED} (e.g., Triton).</li>
 *   <li>{@link #MIXED_ICE_ROCK} → common among
 *       {@link com.universe.enums.types.SatelliteTypes#REGULAR REGULAR} large moons of gas/ice giants.</li>
 *   <li>{@link #METALLIC_FRAGMENT} → commonly
 *       {@link com.universe.enums.types.SatelliteTypes#CAPTURED CAPTURED}
 *       (differentiated parent body remnants).</li>
 *   <li>{@link #RUBBLE_PILE} → typical of
 *       {@link com.universe.enums.types.SatelliteTypes#IRREGULAR IRREGULAR} or
 *       {@link com.universe.enums.types.SatelliteTypes#CAPTURED CAPTURED} small moons.</li>
 * </ul>
 *
 * <p>Examples:</p>
 * <ul>
 *   <li>Earth’s Moon → {@link #ROCKY_SILICATE},
 *       {@link com.universe.enums.types.SatelliteTypes#REGULAR REGULAR}</li>
 *   <li>Europa/Enceladus → {@link #ICE_RICH},
 *       {@link com.universe.enums.types.SatelliteTypes#REGULAR REGULAR}</li>
 *   <li>Small outer Jovian moons → often {@link #RUBBLE_PILE},
 *       {@link com.universe.enums.types.SatelliteTypes#IRREGULAR IRREGULAR}</li>
 * </ul>
 *
 * @author Adrian
 * @since 1.0
 * @version 1.0
 */
public enum SatelliteComposition {

    /** Satellite primarily composed of silicate rock (e.g., Earth’s Moon). */
    ROCKY_SILICATE,

    /** Satellite rich in water ice, often with subsurface oceans (e.g., Europa, Enceladus). */
    ICE_RICH,

    /** Mixed composition of ice and rock, common for many outer Solar System moons (e.g., Ganymede). */
    MIXED_ICE_ROCK,

    /** Metallic fragment, typically a remnant of a differentiated parent body. */
    METALLIC_FRAGMENT,

    /** Loose aggregate of rocks and debris held together by gravity (rubble-pile moon/asteroid). */
    RUBBLE_PILE
}
