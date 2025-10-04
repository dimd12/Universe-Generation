package com.universe.models;

import com.universe.enums.elements.SatelliteComposition;
import com.universe.enums.types.SatelliteTypes;
import java.util.Objects;

/**
 * Represents a natural satellite (moon) in the universe model.
 * <p>
 * A {@code Satellite} is a concrete {@link CelestialObject} that orbits a
 * {@link Planet}. It extends the base properties (id, name, age, mass, radius,
 * coordinates, color) with satellite-specific attributes:
 * type, composition, parent planet, and orbital distance.
 * </p>
 *
 * <p><strong>Links:</strong></p>
 * <ul>
 *   <li>{@link SatelliteTypes} – dynamical classification (e.g., {@link SatelliteTypes#REGULAR}, {@link SatelliteTypes#CAPTURED})</li>
 *   <li>{@link SatelliteComposition} – structural composition (e.g., {@link SatelliteComposition#ROCKY_SILICATE}, {@link SatelliteComposition#ICE_RICH})</li>
 *   <li>{@link Planet} – the host planet that the satellite orbits</li>
 * </ul>
 *
 * <p><strong>Examples:</strong></p>
 * <ul>
 *   <li>Earth’s Moon → {@link SatelliteTypes#REGULAR}, {@link SatelliteComposition#ROCKY_SILICATE}, orbits Earth</li>
 *   <li>Europa → {@link SatelliteTypes#REGULAR}, {@link SatelliteComposition#ICE_RICH}, orbits Jupiter</li>
 *   <li>Triton → {@link SatelliteTypes#CAPTURED}, {@link SatelliteComposition#ICE_RICH}, orbits Neptune</li>
 * </ul>
 *
 * @author Adrian
 * @since 1.0
 * @version 1.0
 */
public final class Satellite extends CelestialObject {

    /** The classification of the satellite based on its orbit and origin. */
    private SatelliteTypes satType;

    /** The structural composition of the satellite. */
    private SatelliteComposition satComp;

    /** The planet that this satellite orbits. */
    private Planet planet;

    /** Orbital distance from its host planet (units depend on context, e.g., km). */
    private double distanceFromPlanet;

    /**
     * Default constructor.
     * <p>Creates a satellite with uninitialized fields. Intended for serialization or frameworks.</p>
     */
    public Satellite() {
    }

    /**
     * Constructor initializing only satellite-specific fields.
     *
     * @param satType            the type of satellite (regular, irregular, captured)
     * @param satComp            the composition of the satellite
     * @param planet             the host planet this satellite orbits
     * @param distanceFromPlanet the orbital distance from the planet
     */
    public Satellite(SatelliteTypes satType, SatelliteComposition satComp,
                     Planet planet, double distanceFromPlanet) {
        this.satType = satType;
        this.satComp = satComp;
        this.planet = planet;
        this.distanceFromPlanet = distanceFromPlanet;
    }

    /**
     * Full constructor initializing both {@link CelestialObject} fields and satellite-specific fields.
     *
     * @param satType            the type of satellite
     * @param satComp            the composition of the satellite
     * @param planet             the host planet this satellite orbits
     * @param distanceFromPlanet orbital distance from the planet
     * @param id                 unique id
     * @param name               name of the satellite
     * @param age                age in billions of years
     * @param mass               mass of the satellite
     * @param radius             radius of the satellite
     * @param xCoord             X coordinate
     * @param yCoord             Y coordinate
     * @param color              display color
     */
    public Satellite(SatelliteTypes satType, SatelliteComposition satComp,
                     Planet planet, double distanceFromPlanet,
                     int id, String name, double age, double mass, double radius,
                     int xCoord, int yCoord, String color) {
        super(id, name, age, mass, radius, xCoord, yCoord, color);
        this.satType = satType;
        this.satComp = satComp;
        this.planet = planet;
        this.distanceFromPlanet = distanceFromPlanet;
    }

    // --- Getters and setters with Javadoc ---

    /** @return the satellite type */
    public SatelliteTypes getSatType() {
        return satType;
    }

    /** @param satType the satellite type to set */
    public void setSatType(SatelliteTypes satType) {
        this.satType = satType;
    }

    /** @return the satellite composition */
    public SatelliteComposition getSatComp() {
        return satComp;
    }

    /** @param satComp the satellite composition to set */
    public void setSatComp(SatelliteComposition satComp) {
        this.satComp = satComp;
    }

    /** @return the planet that this satellite orbits */
    public Planet getPlanet() {
        return planet;
    }

    /** @param planet the host planet to set */
    public void setPlanet(Planet planet) {
        this.planet = planet;
    }

    /** @return the orbital distance from the host planet */
    public double getDistanceFromPlanet() {
        return distanceFromPlanet;
    }

    /** @param distanceFromPlanet the orbital distance to set */
    public void setDistanceFromPlanet(double distanceFromPlanet) {
        this.distanceFromPlanet = distanceFromPlanet;
    }

    // --- Object overrides ---

    /** @return hash code based on satellite-specific fields */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.satType);
        hash = 59 * hash + Objects.hashCode(this.satComp);
        hash = 59 * hash + Objects.hashCode(this.planet);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.distanceFromPlanet) ^ (Double.doubleToLongBits(this.distanceFromPlanet) >>> 32));
        return hash;
    }

    /**
     * Compares this satellite with another for equality.
     * Two satellites are equal if their type, composition, host planet,
     * and orbital distance match.
     *
     * @param obj the object to compare with
     * @return {@code true} if equal, {@code false} otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        final Satellite other = (Satellite) obj;
        if (Double.doubleToLongBits(this.distanceFromPlanet) != Double.doubleToLongBits(other.distanceFromPlanet)) return false;
        if (this.satType != other.satType) return false;
        if (this.satComp != other.satComp) return false;
        if (!Objects.equals(this.planet, other.planet)) return false;
        return true;
    }

    /**
     * Returns a string representation of this satellite,
     * including both inherited and satellite-specific fields.
     *
     * @return a string with all satellite details
     */
    @Override
    public String toString() {
        return "Satellite{" +
                "id=" + id +
                ", name=" + name +
                ", age=" + age +
                ", mass=" + mass +
                ", radius=" + radius +
                ", xCoord=" + xCoord +
                ", yCoord=" + yCoord +
                ", color=" + color +
                ", satType=" + satType +
                ", satComp=" + satComp +
                ", planet=" + (planet != null ? planet.getName() : "null") +
                ", distanceFromPlanet=" + distanceFromPlanet +
                '}';
    }
}
