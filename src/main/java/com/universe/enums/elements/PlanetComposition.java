package com.universe.enums.elements;

import com.universe.enums.types.PlanetTypes;

/**
 * Represents the possible compositions of planets
 * found in different stellar systems.
 * <p>
 * This classification is more detailed than {@link PlanetTypes},
 * focusing on the specific material makeup rather than the
 * general planetary category.
 * </p>
 *
 * <p>Examples:</p>
 * <ul>
 *   <li>{@link PlanetTypes#ROCKY} planets can be {@link #ROCKY_SILICATE} or {@link #ROCKY_IRON_RICH}</li>
 *   <li>{@link PlanetTypes#GAS_GIANT} planets are typically {@link #GAS_GIANT_H2_HE}</li>
 *   <li>{@link PlanetTypes#ICE_GIANT} planets are usually {@link #ICE_GIANT_H2_HE_CH4}</li>
 *   <li>{@link PlanetTypes#OCEAN} planets correspond to {@link #OCEAN_WORLD}</li>
 *   <li>{@link PlanetTypes#DESERT} planets correspond to {@link #DESERT_WORLD}</li>
 *   <li>{@link PlanetTypes#LAVA} planets correspond to {@link #LAVA_WORLD}</li>
 *   <li>{@link PlanetTypes#DWARF} planets correspond to {@link #DWARF_ICE_ROCK}</li>
 * </ul>
 *
 * @author Adrian
 * @since 1.0
 * @version 1.0
 */
public enum PlanetComposition {

    /** Rocky planet primarily composed of silicate minerals (e.g., Earth, Mars).
     * <p>Associated type: {@link PlanetTypes#ROCKY}</p>
     */
    ROCKY_SILICATE,

    /** Rocky planet with a high iron content, leading to greater density (e.g., Mercury).
     * <p>Associated type: {@link PlanetTypes#ROCKY}</p>
     */
    ROCKY_IRON_RICH,

    /** Planet rich in carbon compounds, possibly with diamond-rich interiors.
     * <p>Can exist as a variant of {@link PlanetTypes#ROCKY}.</p>
     */
    CARBON_WORLD,

    /** Planet dominated by water or global oceans beneath/above the surface.
     * <p>Associated type: {@link PlanetTypes#OCEAN}</p>
     */
    OCEAN_WORLD,

    /** Gas giant composed mainly of hydrogen and helium (e.g., Jupiter, Saturn).
     * <p>Associated type: {@link PlanetTypes#GAS_GIANT}</p>
     */
    GAS_GIANT_H2_HE,

    /** Ice giant composed of hydrogen, helium, and methane (e.g., Uranus, Neptune).
     * <p>Associated type: {@link PlanetTypes#ICE_GIANT}</p>
     */
    ICE_GIANT_H2_HE_CH4,

    /** Volcanically active planet with surface dominated by molten rock (lava worlds).
     * <p>Associated type: {@link PlanetTypes#LAVA}</p>
     */
    LAVA_WORLD,

    /** Planet with arid conditions, little water, and extreme temperatures.
     * <p>Associated type: {@link PlanetTypes#DESERT}</p>
     */
    DESERT_WORLD,

    /** Small icy or rocky body, often considered dwarf planets (e.g., Pluto, Eris).
     * <p>Associated type: {@link PlanetTypes#DWARF}</p>
     */
    DWARF_ICE_ROCK
}
