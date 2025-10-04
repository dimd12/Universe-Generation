package com.universe.enums.types;

import com.universe.enums.elements.PlanetComposition;

/**
 * Represents the primary categories of planets
 * based on their physical characteristics and bulk composition.
 *
 * <p>This classification is more general than
 * {@link PlanetComposition}, focusing on the overall type
 * rather than detailed material makeup.</p>
 *
 * <p><strong>Connections:</strong></p>
 * <ul>
 *   <li>Each {@code PlanetTypes} corresponds to one or more
 *       {@link PlanetComposition compositions}.</li>
 *   <li>Planets also tend to host characteristic
 *       {@link AtmosphereTypes atmospheres} depending on gravity, temperature, and evolution.</li>
 * </ul>
 *
 * <p>Examples:</p>
 * <ul>
 *   <li>Earth → {@link #ROCKY} with {@link PlanetComposition#ROCKY_SILICATE},
 *       {@link AtmosphereTypes#EARTHLIKE}</li>
 *   <li>Mercury → {@link #ROCKY} with {@link PlanetComposition#ROCKY_IRON_RICH},
 *       {@link AtmosphereTypes#NONE}</li>
 *   <li>Jupiter → {@link #GAS_GIANT} with {@link PlanetComposition#GAS_GIANT_H2_HE},
 *       {@link AtmosphereTypes#H2_HE}</li>
 *   <li>Neptune → {@link #ICE_GIANT} with {@link PlanetComposition#ICE_GIANT_H2_HE_CH4},
 *       {@link AtmosphereTypes#H2_HE}</li>
 *   <li>Venus → {@link #DESERT} with {@link PlanetComposition#DESERT_WORLD},
 *       {@link AtmosphereTypes#DENSE}/{@link AtmosphereTypes#CO2}</li>
 *   <li>Pluto → {@link #DWARF} with {@link PlanetComposition#DWARF_ICE_ROCK},
 *       {@link AtmosphereTypes#THIN}</li>
 * </ul>
 *
 * @author Adrian
 * @since 1.0
 * @version 1.0
 */
public enum PlanetTypes {

    /**
     * Rocky terrestrial planet, small and dense.
     * <p>Possible compositions:
     * {@link PlanetComposition#ROCKY_SILICATE},
     * {@link PlanetComposition#ROCKY_IRON_RICH}.</p>
     * <p>Typical atmospheres:
     * {@link AtmosphereTypes#NONE},
     * {@link AtmosphereTypes#THIN},
     * {@link AtmosphereTypes#EARTHLIKE},
     * {@link AtmosphereTypes#CO2}.</p>
     */
    ROCKY,

    /**
     * Gas giant, massive planet composed mostly of hydrogen and helium.
     * <p>Typical composition: {@link PlanetComposition#GAS_GIANT_H2_HE}.</p>
     * <p>Typical atmosphere: {@link AtmosphereTypes#H2_HE}.</p>
     */
    GAS_GIANT,

    /**
     * Ice giant, dominated by volatile substances like water, ammonia, and methane.
     * <p>Typical composition: {@link PlanetComposition#ICE_GIANT_H2_HE_CH4}.</p>
     * <p>Typical atmosphere: {@link AtmosphereTypes#H2_HE} with methane traces.</p>
     */
    ICE_GIANT,

    /**
     * Ocean world, with global or near-global water coverage.
     * <p>Possible composition: {@link PlanetComposition#OCEAN_WORLD}.</p>
     * <p>Possible atmospheres: {@link AtmosphereTypes#EARTHLIKE},
     * {@link AtmosphereTypes#CO2}, {@link AtmosphereTypes#TOXIC}.</p>
     */
    OCEAN,

    /**
     * Desert world, characterized by arid, dry conditions and limited water.
     * <p>Possible composition: {@link PlanetComposition#DESERT_WORLD}.</p>
     * <p>Typical atmospheres: {@link AtmosphereTypes#THIN},
     * {@link AtmosphereTypes#CO2}, {@link AtmosphereTypes#DENSE},
     * {@link AtmosphereTypes#TOXIC}.</p>
     */
    DESERT,

    /**
     * Volcanically active planet with significant surface lava activity.
     * <p>Possible composition: {@link PlanetComposition#LAVA_WORLD}.</p>
     * <p>Possible atmospheres: {@link AtmosphereTypes#TOXIC},
     * {@link AtmosphereTypes#DENSE}, volcanic gases.</p>
     */
    LAVA,

    /**
     * Dwarf planet, small body orbiting the Sun, not clearing its orbit.
     * <p>Typical composition: {@link PlanetComposition#DWARF_ICE_ROCK}.</p>
     * <p>Typical atmospheres: {@link AtmosphereTypes#NONE},
     * {@link AtmosphereTypes#THIN} (seasonal, transient).</p>
     */
    DWARF
}
