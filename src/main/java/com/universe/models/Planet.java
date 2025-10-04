package com.universe.models;

import com.universe.enums.elements.PlanetComposition;
import com.universe.enums.types.AtmosphereTypes;
import com.universe.enums.types.PlanetTypes;
import java.util.Objects;

/**
 * Represents a planet in the universe model.
 * <p>
 * A {@code Planet} is a concrete {@link CelestialObject} that extends the base properties
 * (id, name, age, mass, radius, coordinates, color) with planet-specific attributes:
 * type, composition, atmosphere, orbital distance, habitability, and presence of rings.
 * </p>
 *
 * <p><strong>Links:</strong></p>
 * <ul>
 *   <li>{@link PlanetTypes} – overall planetary category (e.g., {@link PlanetTypes#ROCKY}, {@link PlanetTypes#GAS_GIANT})</li>
 *   <li>{@link PlanetComposition} – material makeup (e.g., {@link PlanetComposition#ROCKY_SILICATE}, {@link PlanetComposition#ICE_GIANT_H2_HE_CH4})</li>
 *   <li>{@link AtmosphereTypes} – atmospheric characteristics (e.g., {@link AtmosphereTypes#EARTHLIKE}, {@link AtmosphereTypes#H2_HE})</li>
 * </ul>
 *
 * <p><strong>Examples:</strong></p>
 * <ul>
 *   <li>Earth → {@link PlanetTypes#ROCKY}, {@link PlanetComposition#ROCKY_SILICATE}, {@link AtmosphereTypes#EARTHLIKE}, habitable, no rings</li>
 *   <li>Jupiter → {@link PlanetTypes#GAS_GIANT}, {@link PlanetComposition#GAS_GIANT_H2_HE}, {@link AtmosphereTypes#H2_HE}, not habitable, has rings</li>
 *   <li>Mars → {@link PlanetTypes#ROCKY}, {@link PlanetComposition#ROCKY_SILICATE}, {@link AtmosphereTypes#THIN}, not habitable, no rings</li>
 * </ul>
 *
 * @author Adrian
 * @since 1.0
 * @version 1.0
 */
public final class Planet extends CelestialObject {

    /** The general category of the planet (rocky, gas giant, ice giant, etc.). */
    private PlanetTypes planetType;

    /** The material composition of the planet (rocky, icy, gaseous). */
    private PlanetComposition planetComp;

    /** The atmosphere type associated with this planet. */
    private AtmosphereTypes atmType;

    /** Orbital distance from its parent star (units depend on context, e.g., AU). */
    private double distanceFromStar;

    /** Whether the planet is considered habitable (Earth-like conditions). */
    private boolean isHabitable;

    /** Whether the planet has planetary rings. */
    private boolean hasRings;

    /**
     * Default constructor.
     * <p>Creates a planet with uninitialized fields. Intended for serialization or frameworks.</p>
     */
    public Planet() {
    }

    /**
     * Constructor initializing only planet-specific fields.
     *
     * @param planetType      the type of the planet
     * @param planetComp      the composition of the planet
     * @param atmType         the atmosphere type
     * @param distanceFromStar distance from the parent star
     * @param isHabitable     true if the planet is habitable
     * @param hasRings        true if the planet has rings
     */
    public Planet(PlanetTypes planetType, PlanetComposition planetComp, AtmosphereTypes atmType,
                  double distanceFromStar, boolean isHabitable, boolean hasRings) {
        this.planetType = planetType;
        this.planetComp = planetComp;
        this.atmType = atmType;
        this.distanceFromStar = distanceFromStar;
        this.isHabitable = isHabitable;
        this.hasRings = hasRings;
    }

    /**
     * Full constructor initializing both {@link CelestialObject} fields and planet-specific fields.
     *
     * @param planetType      the type of the planet
     * @param planetComp      the composition of the planet
     * @param atmType         the atmosphere type
     * @param distanceFromStar distance from the parent star
     * @param isHabitable     true if the planet is habitable
     * @param hasRings        true if the planet has rings
     * @param id              unique id
     * @param name            name of the planet
     * @param age             age in billions of years
     * @param mass            mass of the planet
     * @param radius          radius of the planet
     * @param xCoord          X coordinate
     * @param yCoord          Y coordinate
     * @param color           display color
     */
    public Planet(PlanetTypes planetType, PlanetComposition planetComp, AtmosphereTypes atmType,
                  double distanceFromStar, boolean isHabitable, boolean hasRings,
                  int id, String name, double age, double mass, double radius,
                  int xCoord, int yCoord, String color) {
        super(id, name, age, mass, radius, xCoord, yCoord, color);
        this.planetType = planetType;
        this.planetComp = planetComp;
        this.atmType = atmType;
        this.distanceFromStar = distanceFromStar;
        this.isHabitable = isHabitable;
        this.hasRings = hasRings;
    }

    // --- Getters and setters with Javadoc ---

    /** @return the planet type */
    public PlanetTypes getPlanetType() {
        return planetType;
    }

    /** @param planetType the planet type to set */
    public void setPlanetType(PlanetTypes planetType) {
        this.planetType = planetType;
    }

    /** @return the planet composition */
    public PlanetComposition getPlanetComp() {
        return planetComp;
    }

    /** @param planetComp the planet composition to set */
    public void setPlanetComp(PlanetComposition planetComp) {
        this.planetComp = planetComp;
    }

    /** @return the atmosphere type */
    public AtmosphereTypes getAtmType() {
        return atmType;
    }

    /** @param atmType the atmosphere type to set */
    public void setAtmType(AtmosphereTypes atmType) {
        this.atmType = atmType;
    }

    /** @return the orbital distance from the parent star */
    public double getDistanceFromStar() {
        return distanceFromStar;
    }

    /** @param distanceFromStar the orbital distance to set */
    public void setDistanceFromStar(double distanceFromStar) {
        this.distanceFromStar = distanceFromStar;
    }

    /** @return true if the planet is habitable */
    public boolean isHabitable() {
        return isHabitable;
    }

    /** @param isHabitable true if the planet should be marked as habitable */
    public void setHabitable(boolean isHabitable) {
        this.isHabitable = isHabitable;
    }

    /** @return true if the planet has rings */
    public boolean hasRings() {
        return hasRings;
    }

    /** @param hasRings true if the planet should be marked as having rings */
    public void setHasRings(boolean hasRings) {
        this.hasRings = hasRings;
    }

    // --- Object overrides ---

    /** @return hash code based on planet-specific fields */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.planetType);
        hash = 23 * hash + Objects.hashCode(this.planetComp);
        hash = 23 * hash + Objects.hashCode(this.atmType);
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.distanceFromStar) ^ (Double.doubleToLongBits(this.distanceFromStar) >>> 32));
        hash = 23 * hash + (this.isHabitable ? 1 : 0);
        hash = 23 * hash + (this.hasRings ? 1 : 0);
        return hash;
    }

    /**
     * Compares this planet with another for equality.
     * Two planets are equal if their type, composition, atmosphere,
     * orbital distance, habitability, and rings match.
     *
     * @param obj the object to compare with
     * @return {@code true} if equal, {@code false} otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        final Planet other = (Planet) obj;
        if (Double.doubleToLongBits(this.distanceFromStar) != Double.doubleToLongBits(other.distanceFromStar)) return false;
        if (this.isHabitable != other.isHabitable) return false;
        if (this.hasRings != other.hasRings) return false;
        if (this.planetType != other.planetType) return false;
        if (this.planetComp != other.planetComp) return false;
        if (this.atmType != other.atmType) return false;
        return true;
    }

    /**
     * Returns a string representation of this planet,
     * including both inherited and planet-specific fields.
     *
     * @return a string with all planet details
     */
    @Override
    public String toString() {
        return "Planet{" +
                "id=" + id +
                ", name=" + name +
                ", age=" + age +
                ", mass=" + mass +
                ", radius=" + radius +
                ", xCoord=" + xCoord +
                ", yCoord=" + yCoord +
                ", color=" + color +
                ", planetType=" + planetType +
                ", planetComp=" + planetComp +
                ", atmType=" + atmType +
                ", distanceFromStar=" + distanceFromStar +
                ", isHabitable=" + isHabitable +
                ", hasRings=" + hasRings +
                '}';
    }
}
