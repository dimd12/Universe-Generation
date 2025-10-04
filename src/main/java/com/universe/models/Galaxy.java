package com.universe.models;

import com.universe.enums.types.GalaxyTypes;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Represents a galaxy in the universe model.
 * <p>
 * A {@code Galaxy} is the top-level structure that contains multiple
 * {@link SolarSystem solar systems}, each of which can host
 * {@link Star stars}, {@link Planet planets}, and {@link Satellite satellites}.
 * </p>
 *
 * <p>
 * <strong>Links:</strong></p>
 * <ul>
 * <li>{@link GalaxyTypes} – classification of the galaxy (e.g.,
 * {@link GalaxyTypes#SPIRAL}, {@link GalaxyTypes#ELLIPTICAL})</li>
 * <li>{@link SolarSystem} – child systems contained in this galaxy</li>
 * <li>{@link Star}, {@link Planet}, {@link Satellite} – contained indirectly
 * via {@link SolarSystem}</li>
 * </ul>
 *
 * <p>
 * <strong>Examples:</strong></p>
 * <ul>
 * <li>Milky Way → {@link GalaxyTypes#SPIRAL}, hosts billions of
 * {@link SolarSystem}s (including the Solar System)</li>
 * <li>Andromeda → {@link GalaxyTypes#SPIRAL}, slightly larger than the Milky
 * Way</li>
 * <li>Messier 87 → {@link GalaxyTypes#ELLIPTICAL}, famous for its supermassive
 * black hole</li>
 * </ul>
 *
 * <p>
 * <strong>Fields:</strong></p>
 * <ul>
 * <li>{@link #id} – unique identifier</li>
 * <li>{@link #name} – galaxy name</li>
 * <li>{@link #type} – galaxy morphology/type</li>
 * <li>{@link #age} – age in billions of years</li>
 * <li>{@link #solarSystems} – list of solar systems in this galaxy</li>
 * <li>{@link #brightness} – relative brightness/luminosity</li>
 * <li>{@link #blackHolePresence} – whether the galaxy hosts a central black
 * hole</li>
 * <li>{@link #seed} – galaxy seed</li>
 * </ul>
 *
 * @author Adrian
 * @since 1.0
 * @version 1.0
 */
public final class Galaxy {

    /**
     * Unique identifier for the galaxy.
     */
    private int id;

    /**
     * Name of the galaxy (e.g., "Milky Way", "Andromeda").
     */
    private String name;

    /**
     * Morphological type of the galaxy (spiral, elliptical, irregular).
     */
    private GalaxyTypes type;

    /**
     * Age of the galaxy in billions of years.
     */
    private double age;

    /**
     * Collection of {@link SolarSystem}s contained within this galaxy.
     */
    private ArrayList<SolarSystem> solarSystems;

    /**
     * Overall brightness or luminosity of the galaxy.
     */
    private String brightness;

    /**
     * Indicates whether the galaxy hosts a central black hole.
     */
    private boolean blackHolePresence;

    /**
     * The unique seed of the generation of the Galaxy.
     */
    private long seed;

    /**
     * Default constructor.
     */
    public Galaxy() {
    }

    /**
     * Full constructor initializing all fields.
     *
     * @param id unique id
     * @param name name of the galaxy
     * @param type type of the galaxy
     * @param age age in billions of years
     * @param solarSystems list of solar systems in the galaxy
     * @param brightness overall brightness
     * @param blackHolePresence true if a central black hole is present
     * @param seed seed of the galaxy
     */
    public Galaxy(int id, String name, GalaxyTypes type, double age,
                  ArrayList<SolarSystem> solarSystems,
                  String brightness, boolean blackHolePresence, long seed) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.age = age;
        this.solarSystems = solarSystems;
        this.brightness = brightness;
        this.blackHolePresence = blackHolePresence;
    }

    // --- Getters and setters with Javadoc ---
    /**
     * @return the galaxy id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the galaxy id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name of the galaxy
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the galaxy type
     */
    public GalaxyTypes getType() {
        return type;
    }

    /**
     * @param type the galaxy type to set
     */
    public void setType(GalaxyTypes type) {
        this.type = type;
    }

    /**
     * @return the age of the galaxy
     */
    public double getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(double age) {
        this.age = age;
    }

    /**
     * @return the solar systems within the galaxy
     */
    public ArrayList<SolarSystem> getSolarSystems() {
        return solarSystems;
    }

    /**
     * @param solarSystems the solar systems to set
     */
    public void setSolarSystems(ArrayList<SolarSystem> solarSystems) {
        this.solarSystems = solarSystems;
    }

    /**
     * @return the galaxy's brightness
     */
    public String getBrightness() {
        return brightness;
    }

    /**
     * @param brightness the brightness to set
     */
    public void setBrightness(String brightness) {
        this.brightness = brightness;
    }

    /**
     * @return true if a central black hole is present
     */
    public boolean getBlackHolePresence() {
        return blackHolePresence;
    }

    /**
     * @param blackHolePresence true if the galaxy hosts a black hole
     */
    public void setBlackHolePresence(boolean blackHolePresence) {
        this.blackHolePresence = blackHolePresence;
    }

    /**
     * @return the galaxy's generation seed
     */
    public long getSeed() {
        return seed;
    }

    /**
     * @param seed the galaxy's seed to set
     */
    public void setSeed(long seed) {
        this.seed = seed;
    }

    // --- Object overrides ---
    /**
     * @return hash code including all fields
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.id;
        hash = 17 * hash + Objects.hashCode(this.name);
        hash = 17 * hash + Objects.hashCode(this.type);
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.age) ^ (Double.doubleToLongBits(this.age) >>> 32));
        hash = 17 * hash + Objects.hashCode(this.solarSystems);
        hash = 17 * hash + Objects.hashCode(this.brightness);
        hash = 17 * hash + (this.blackHolePresence ? 1 : 0);
        hash = 17 * hash + (int) (this.seed ^ (this.seed >>> 32));
        return hash;
    }

    /**
     * Compares this galaxy with another for equality.
     *
     * @param obj the object to compare
     * @return {@code true} if all fields match, otherwise {@code false}
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Galaxy other = (Galaxy) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.age) != Double.doubleToLongBits(other.age)) {
            return false;
        }
        if (!Objects.equals(this.brightness, other.brightness)) {
            return false;
        }
        if (this.blackHolePresence != other.blackHolePresence) {
            return false;
        }
        if (this.seed != other.seed) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.type != other.type) {
            return false;
        }
        if (!Objects.equals(this.solarSystems, other.solarSystems)) {
            return false;
        }
        return true;
    }

    /**
     * Returns a string representation of this galaxy, including all its fields.
     *
     * @return string with galaxy details
     */
    @Override
    public String toString() {
        return "Galaxy{"
                + "id=" + id
                + ", name=" + name
                + ", type=" + type
                + ", age=" + age
                + ", solarSystems=" + solarSystems
                + ", brightness=" + brightness
                + ", blackHolePresence=" + blackHolePresence
                + ", seed=" + seed
                + '}';
    }
}
