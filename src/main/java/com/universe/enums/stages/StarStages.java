package com.universe.enums.stages;

/**
 * Represents the different evolutionary stages of a star throughout its lifecycle.
 * <p>
 * A star’s initial mass (and therefore its spectral {@link com.universe.enums.types.StarTypes StarTypes})
 * largely determines which stages it will pass through and its final remnant.
 * </p>
 *
 * <p>Typical paths (simplified):</p>
 * <ul>
 *   <li>{@link com.universe.enums.types.StarTypes#O O} / {@link com.universe.enums.types.StarTypes#B B} (very massive) →
 *       {@link #MAIN_SEQUENCE} → {@link #GIANT} → {@link #SUPERNOVA} →
 *       {@link #NEUTRON_STAR} or {@link #BLACK_HOLE}</li>
 *   <li>{@link com.universe.enums.types.StarTypes#A A} / {@link com.universe.enums.types.StarTypes#F F} /
 *       {@link com.universe.enums.types.StarTypes#G G} (Sun-like) →
 *       {@link #MAIN_SEQUENCE} → {@link #SUBGIANT} → {@link #GIANT} → {@link #WHITE_DWARF}</li>
 *   <li>{@link com.universe.enums.types.StarTypes#K K} / {@link com.universe.enums.types.StarTypes#M M} (low mass) →
 *       very long {@link #MAIN_SEQUENCE}, eventually → {@link #WHITE_DWARF}</li>
 * </ul>
 *
 * <p>Usage example:</p>
 * <pre>
 *     StarStage stage = StarStage.MAIN_SEQUENCE;
 *     System.out.println("Stage: " + stage);
 * </pre>
 *
 * @author Adrian
 * @since 1.0
 * @version 1.0
 */
public enum StarStages {

    /** Protostar: Collapsing cloud of gas and dust, not yet in hydrostatic equilibrium. */
    PROTOSTAR,

    /** Main sequence: Core hydrogen fusion; spans most of a star’s life
     *  (e.g., {@link com.universe.enums.types.StarTypes#G G}-type Sun is here). */
    MAIN_SEQUENCE,

    /** Subgiant: Post core-hydrogen exhaustion transition (common for
     *  {@link com.universe.enums.types.StarTypes#F F}–{@link com.universe.enums.types.StarTypes#G G} stars). */
    SUBGIANT,

    /** Giant: Envelope expansion and cooling; includes red giants/supergiants.
     *  Seen across many types from {@link com.universe.enums.types.StarTypes#A A} to {@link com.universe.enums.types.StarTypes#M M}. */
    GIANT,

    /** Supernova: Catastrophic core-collapse or thermonuclear disruption;
     *  typical fate of massive {@link com.universe.enums.types.StarTypes#O O}/{@link com.universe.enums.types.StarTypes#B B} stars. */
    SUPERNOVA,

    /** White dwarf: Degenerate remnant of low- to intermediate-mass stars
     *  (e.g., {@link com.universe.enums.types.StarTypes#A A}–{@link com.universe.enums.types.StarTypes#G G}). */
    WHITE_DWARF,

    /** Neutron star: Ultra-dense remnant formed after some core-collapse supernovae
     *  (massive {@link com.universe.enums.types.StarTypes#B B} / lower-end {@link com.universe.enums.types.StarTypes#O O}). */
    NEUTRON_STAR,

    /** Black hole: Collapse endpoint for the most massive stars
     *  (upper-mass {@link com.universe.enums.types.StarTypes#O O}). */
    BLACK_HOLE
}
