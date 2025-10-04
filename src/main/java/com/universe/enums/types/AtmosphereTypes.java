package com.universe.enums.types;

import com.universe.enums.elements.PlanetComposition;

/**
 * Classifies planetary (and large-moon) atmospheres by bulk density and composition,
 * and links them to likely {@link PlanetTypes} categories and, when relevant,
 * to {@link PlanetComposition} variants.
 *
 * <p><strong>General mapping</strong> (common, not exclusive):</p>
 * <ul>
 *   <li>{@link #H2_HE} → {@link PlanetTypes#GAS_GIANT}, {@link PlanetTypes#ICE_GIANT}</li>
 *   <li>{@link #EARTHLIKE} → {@link PlanetTypes#ROCKY} (often {@link PlanetComposition#ROCKY_SILICATE})</li>
 *   <li>{@link #THIN} / {@link #CO2} → {@link PlanetTypes#ROCKY}, {@link PlanetTypes#DESERT}</li>
 *   <li>{@link #DENSE} / {@link #TOXIC} → {@link PlanetTypes#DESERT}, {@link PlanetTypes#LAVA}</li>
 *   <li>{@link #METHANE} → cold {@link PlanetTypes#ICE_GIANT} envelopes (trace) and large icy moons/planets</li>
 *   <li>{@link #NONE} → small {@link PlanetTypes#ROCKY} bodies and many {@link PlanetTypes#DWARF} objects</li>
 * </ul>
 *
 * <p>Notes:</p>
 * <ul>
 *   <li>Atmospheres evolve with stellar flux, gravity, and volcanism; these mappings are heuristics.</li>
 *   <li>Large moons (e.g., Titan) can host substantial atmospheres.</li>
 * </ul>
 *
 * @author Adrian
 * @since 1.0
 * @version 1.0
 */
public enum AtmosphereTypes {

    /**
     * No substantial atmosphere (airless/exosphere only).
     * <p>Common on: {@link PlanetTypes#ROCKY}, {@link PlanetTypes#DWARF}.</p>
     * <p>Typical compositions: volatile-poor bodies such as
     * {@link PlanetComposition#ROCKY_IRON_RICH} (e.g., Mercury) or small
     * {@link PlanetComposition#DWARF_ICE_ROCK} with transient gases.</p>
     */
    NONE,

    /**
     * Very tenuous atmosphere (surface pressure far below Earth).
     * <p>Common on: {@link PlanetTypes#ROCKY}, {@link PlanetTypes#DESERT}, {@link PlanetTypes#DWARF} (seasonal).</p>
     * <p>Often CO₂-dominant or sputtered traces; see {@link #CO2}.</p>
     */
    THIN,

    /**
     * Nitrogen–oxygen, surface-breathable (Earth-analog).
     * <p>Common on: {@link PlanetTypes#ROCKY} with
     * {@link PlanetComposition#ROCKY_SILICATE}.</p>
     * <p>Example: Earth.</p>
     */
    EARTHLIKE,

    /**
     * Extremely high surface pressure (runaway greenhouse or deep volatile column).
     * <p>Common on: {@link PlanetTypes#DESERT}, {@link PlanetTypes#LAVA}.</p>
     * <p>Often co-occurs with {@link #CO2} and/or {@link #TOXIC} aerosols (e.g., sulfuric acid clouds).</p>
     */
    DENSE,

    /**
     * Chemically hazardous (e.g., sulfuric acid, ammonia, H₂S).
     * <p>Common on: hot {@link PlanetTypes#DESERT}/{@link PlanetTypes#LAVA} worlds; also possible in cold, reducing environments.</p>
     */
    TOXIC,

    /**
     * Carbon-dioxide–dominated atmosphere.
     * <p>Common on: {@link PlanetTypes#ROCKY}, {@link PlanetTypes#DESERT}.</p>
     * <p>Examples: Venus (dense CO₂), Mars (thin CO₂).</p>
     */
    CO2,

    /**
     * Methane-rich (CH₄) atmosphere.
     * <p>Common on: cold bodies—large icy moons, distant dwarf/rocky planets; trace component in {@link PlanetTypes#ICE_GIANT} envelopes.</p>
     * <p>Often linked with icy compositions rather than rocky (cf. Titan).</p>
     */
    METHANE,

    /**
     * Hydrogen–helium dominated envelope.
     * <p>Characteristic of: {@link PlanetTypes#GAS_GIANT}, {@link PlanetTypes#ICE_GIANT}.</p>
     * <p>Ties to compositions: {@link PlanetComposition#GAS_GIANT_H2_HE}, {@link PlanetComposition#ICE_GIANT_H2_HE_CH4}.</p>
     */
    H2_HE
}
