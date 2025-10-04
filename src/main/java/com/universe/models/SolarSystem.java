package com.universe.models;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Represents a solar system (star + planets) within a {@link Galaxy}.
 * <p>
 * A {@code SolarSystem} contains exactly one central {@link Star}
 * and zero or more {@link Planet} instances (which may themselves host
 * {@link Satellite} objects). The class also stores spatial coordinates,
 * procedural generation {@link #getSeed() seed}, and age metadata.
 * </p>
 *
 * <p><strong>Hierarchy:</strong> {@link Galaxy} → {@code SolarSystem} → {@link Star} → {@link Planet} → {@link Satellite}</p>
 *
 * <p><strong>Notes:</strong></p>
 * <ul>
 *   <li>{@link #getxCoord()} and {@link #getyCoord()} represent this system’s position
 *       in your simulation space (e.g., a 2D galactic map).</li>
 *   <li>{@link #getSeed()} can be used to deterministically generate the system’s contents.</li>
 * </ul>
 *
 * @author Adrian
 * @since 1.0
 * @version 1.0
 */
public final class SolarSystem {

    // --- Fields ---

    /** Unique identifier for the solar system. */
    private int id;

    /** Name of the solar system (e.g., "Solar System", "Kepler-452"). */
    private String name;

    /** Central star hosted by this solar system. */
    private Star star;

    /** Planets orbiting the {@link #star}. */
    private ArrayList<Planet> planets;

    /** X coordinate of this solar system in the simulation space. */
    private double xCoord;

    /** Y coordinate of this solar system in the simulation space. */
    private double yCoord;

    /** RNG seed used for deterministic generation of this system’s contents. */
    private long seed;

    /** Age of the solar system in billions of years. */
    private double age;

    // --- Constructors ---

    /** Default constructor (for serialization/frameworks). */
    public SolarSystem() {
    }

    /**
     * Full constructor initializing all fields.
     *
     * @param id       unique id of the solar system
     * @param name     display name
     * @param star     central {@link Star}
     * @param planets  list of {@link Planet} objects orbiting the star
     * @param xCoord   X coordinate in the simulation space
     * @param yCoord   Y coordinate in the simulation space
     * @param seed     RNG seed for deterministic generation
     * @param age      age in billions of years
     */
    public SolarSystem(int id, String name, Star star, ArrayList<Planet> planets,
                       double xCoord, double yCoord, long seed, double age) {
        this.id = id;
        this.name = name;
        this.star = star;
        this.planets = planets;
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.seed = seed;
        this.age = age;
    }

    // --- Getters and setters ---

    /** @return the solar system id */
    public int getId() {
        return id;
    }

    /** @param id the solar system id to set */
    public void setId(int id) {
        this.id = id;
    }

    /** @return the display name of the solar system */
    public String getName() {
        return name;
    }

    /** @param name the display name to set */
    public void setName(String name) {
        this.name = name;
    }

    /** @return the central {@link Star} of this system */
    public Star getStar() {
        return star;
    }

    /** @param star the central {@link Star} to set */
    public void setStar(Star star) {
        this.star = star;
    }

    /** @return the list of {@link Planet} objects orbiting the star */
    public ArrayList<Planet> getPlanets() {
        return planets;
    }

    /** @param planets the list of {@link Planet} objects to set */
    public void setPlanets(ArrayList<Planet> planets) {
        this.planets = planets;
    }

    /** @return the X coordinate in the simulation space */
    public double getxCoord() {
        return xCoord;
    }

    /** @param xCoord the X coordinate to set */
    public void setxCoord(double xCoord) {
        this.xCoord = xCoord;
    }

    /** @return the Y coordinate in the simulation space */
    public double getyCoord() {
        return yCoord;
    }

    /** @param yCoord the Y coordinate to set */
    public void setyCoord(double yCoord) {
        this.yCoord = yCoord;
    }

    /** @return the RNG seed for deterministic generation */
    public long getSeed() {
        return seed;
    }

    /** @param seed the RNG seed to set */
    public void setSeed(long seed) {
        this.seed = seed;
    }

    /** @return the age of the solar system (billions of years) */
    public double getAge() {
        return age;
    }

    /** @param age the age value to set (billions of years) */
    public void setAge(double age) {
        this.age = age;
    }

    // --- Object overrides ---

    /**
     * Computes a hash code based on all fields.
     * @return hash code value for this solar system
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.id;
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + Objects.hashCode(this.star);
        hash = 37 * hash + Objects.hashCode(this.planets);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.xCoord) ^ (Double.doubleToLongBits(this.xCoord) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.yCoord) ^ (Double.doubleToLongBits(this.yCoord) >>> 32));
        hash = 37 * hash + (int) (this.seed ^ (this.seed >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.age) ^ (Double.doubleToLongBits(this.age) >>> 32));
        return hash;
    }

    /**
     * Compares this solar system with another for equality.
     * Two systems are equal if all fields (id, name, star, planets, coordinates, seed, age) match.
     *
     * @param obj the object to compare with
     * @return {@code true} if equal, {@code false} otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        final SolarSystem other = (SolarSystem) obj;
        if (this.id != other.id) return false;
        if (Double.doubleToLongBits(this.xCoord) != Double.doubleToLongBits(other.xCoord)) return false;
        if (Double.doubleToLongBits(this.yCoord) != Double.doubleToLongBits(other.yCoord)) return false;
        if (this.seed != other.seed) return false;
        if (Double.doubleToLongBits(this.age) != Double.doubleToLongBits(other.age)) return false;
        if (!Objects.equals(this.name, other.name)) return false;
        if (!Objects.equals(this.star, other.star)) return false;
        if (!Objects.equals(this.planets, other.planets)) return false;
        return true;
    }

    /**
     * Returns a string representation of this solar system,
     * including star, planets, coordinates, seed, and age.
     *
     * @return string with solar system details
     */
    @Override
    public String toString() {
        return "SolarSystem{" +
                "id=" + id +
                ", name=" + name +
                ", star=" + star +
                ", planets=" + planets +
                ", xCoord=" + xCoord +
                ", yCoord=" + yCoord +
                ", seed=" + seed +
                ", age=" + age +
                '}';
    }
}
