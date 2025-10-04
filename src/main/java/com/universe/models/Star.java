package com.universe.models;

import com.universe.enums.elements.StarComposition;
import com.universe.enums.stages.StarStages;
import com.universe.enums.types.StarTypes;
import java.util.Objects;

/**
 * Represents a star in the universe model.
 * <p>
 * A {@code Star} is a concrete {@link CelestialObject} that extends the base properties
 * (id, name, age, mass, radius, coordinates, color) with astrophysical descriptors:
 * spectral type, evolutionary stage, chemical population (metallicity), brightness, and activity.
 * </p>
 *
 * <p><strong>Links:</strong></p>
 * <ul>
 *   <li>{@link StarTypes} – spectral classification (e.g., {@link StarTypes#G}, {@link StarTypes#M})</li>
 *   <li>{@link StarStages} – evolutionary stage (e.g., {@link StarStages#MAIN_SEQUENCE}, {@link StarStages#GIANT})</li>
 *   <li>{@link StarComposition} – stellar population class (e.g., {@link StarComposition#POP_I}, {@link StarComposition#POP_II})</li>
 * </ul>
 *
 * <p><strong>Examples:</strong></p>
 * <ul>
 *   <li>The Sun → {@link StarTypes#G}, {@link StarStages#MAIN_SEQUENCE}, {@link StarComposition#POP_I}, brightness = 1.0 L☉, flareActive = false</li>
 *   <li>Betelgeuse → {@link StarTypes#M}, {@link StarStages#GIANT}, {@link StarComposition#POP_I}, very high brightness, flareActive = false</li>
 *   <li>Proxima Centauri → {@link StarTypes#M}, {@link StarStages#MAIN_SEQUENCE}, {@link StarComposition#POP_I}, low brightness, flareActive = true (flare star)</li>
 * </ul>
 *
 * @author Adrian
 * @since 1.0
 * @version 1.0
 */
public final class Star extends CelestialObject {

    /** Spectral classification of the star (O–M). */
    private StarTypes starType;

    /** Evolutionary stage of the star (protostar, main sequence, giant, etc.). */
    private StarStages starStage;

    /** Stellar population classification (metallicity group: Pop I, II, or III). */
    private StarComposition starComposition;

    /** Brightness of the star (relative to the Sun if normalized, or in absolute units). */
    private String brightness;

    /** Indicates whether the star is currently flare-active (important for red dwarfs). */
    private boolean flareActive;

    /**
     * Default constructor.
     * <p>Creates a star with uninitialized fields. Intended for serialization or frameworks.</p>
     */
    public Star() {
    }

    /**
     * Constructor initializing only star-specific fields.
     *
     * @param starType        the spectral type of the star
     * @param starStage       the evolutionary stage of the star
     * @param starComposition the stellar population (metallicity group)
     * @param brightness      the brightness of the star
     * @param flareActive     true if the star is flare-active
     */
    public Star(StarTypes starType, StarStages starStage, StarComposition starComposition,
                String brightness, boolean flareActive) {
        this.starType = starType;
        this.starStage = starStage;
        this.starComposition = starComposition;
        this.brightness = brightness;
        this.flareActive = flareActive;
    }

    /**
     * Full constructor initializing both {@link CelestialObject} fields and star-specific fields.
     *
     * @param starType        the spectral type of the star
     * @param starStage       the evolutionary stage of the star
     * @param starComposition the stellar population (metallicity group)
     * @param brightness      the brightness of the star
     * @param flareActive     true if the star is flare-active
     * @param id              unique id
     * @param name            name of the star
     * @param age             age in billions of years
     * @param mass            mass of the star
     * @param radius          radius of the star
     * @param xCoord          X coordinate
     * @param yCoord          Y coordinate
     * @param color           display color
     */
    public Star(StarTypes starType, StarStages starStage, StarComposition starComposition,
                String brightness, boolean flareActive,
                int id, String name, double age, double mass, double radius,
                int xCoord, int yCoord, String color) {
        super(id, name, age, mass, radius, xCoord, yCoord, color);
        this.starType = starType;
        this.starStage = starStage;
        this.starComposition = starComposition;
        this.brightness = brightness;
        this.flareActive = flareActive;
    }

    // --- Getters and setters with Javadoc ---

    /** @return the star type (spectral class) */
    public StarTypes getStarType() {
        return starType;
    }

    /** @param starType the star type to set */
    public void setStarType(StarTypes starType) {
        this.starType = starType;
    }

    /** @return the star stage (evolutionary phase) */
    public StarStages getStarStage() {
        return starStage;
    }

    /** @param starStage the star stage to set */
    public void setStarStage(StarStages starStage) {
        this.starStage = starStage;
    }

    /** @return the star composition (population/metallicity class) */
    public StarComposition getStarComposition() {
        return starComposition;
    }

    /** @param starComposition the star composition to set */
    public void setStarComposition(StarComposition starComposition) {
        this.starComposition = starComposition;
    }

    /** @return the brightness of the star */
    public String getBrightness() {
        return brightness;
    }

    /** @param brightness the brightness value to set */
    public void setBrightness(String brightness) {
        this.brightness = brightness;
    }

    /** @return true if the star is flare-active */
    public boolean isFlareActive() {
        return flareActive;
    }

    /** @param flareActive true if the star should be marked as flare-active */
    public void setFlareActive(boolean flareActive) {
        this.flareActive = flareActive;
    }

    // --- Object overrides ---

    /** @return hash code based on star-specific fields */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.starType);
        hash = 79 * hash + Objects.hashCode(this.starStage);
        hash = 79 * hash + Objects.hashCode(this.starComposition);
        hash = 79 * hash + Objects.hashCode(this.brightness);
        hash = 79 * hash + (this.flareActive ? 1 : 0);
        return hash;
    }

    /**
     * Compares this star with another for equality.
     * Two stars are equal if their type, stage, composition, brightness,
     * and flare activity status match.
     *
     * @param obj the object to compare with
     * @return {@code true} if equal, {@code false} otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        final Star other = (Star) obj;
        if (!Objects.equals(this.brightness, other.brightness)) return false;
        if (this.flareActive != other.flareActive) return false;
        if (this.starType != other.starType) return false;
        if (this.starStage != other.starStage) return false;
        if (this.starComposition != other.starComposition) return false;
        return true;
    }

    /**
     * Returns a string representation of this star,
     * including both inherited and star-specific fields.
     *
     * @return a string with all star details
     */
    @Override
    public String toString() {
        return "Star{" +
                "id=" + id +
                ", name=" + name +
                ", age=" + age +
                ", mass=" + mass +
                ", radius=" + radius +
                ", xCoord=" + xCoord +
                ", yCoord=" + yCoord +
                ", color=" + color +
                ", starType=" + starType +
                ", starStage=" + starStage +
                ", starComposition=" + starComposition +
                ", brightness=" + brightness +
                ", flareActive=" + flareActive +
                '}';
    }
}
