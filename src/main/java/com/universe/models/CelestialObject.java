package com.universe.models;

import java.util.Objects;

/**
 * Abstract base class representing a generic celestial object in the universe model.
 * <p>
 * This class provides common attributes such as identity, name, age, mass,
 * radius, position (2D coordinates), and a display color. It is intended to be
 * extended by specific celestial bodies such as stars, planets, satellites, or asteroids.
 * </p>
 *
 * <p><strong>Usage:</strong></p>
 * <pre>
 *     public class Planet extends CelestialObject {
 *         private PlanetType type;
 *         // additional fields and methods
 *     }
 * </pre>
 *
 * <p>Equality and hashing are based on all physical and descriptive fields.</p>
 *
 * @author Adrian
 * @since 1.0
 * @version 1.0
 */
public abstract class CelestialObject {

    /** Unique identifier for the celestial object. */
    protected int id;

    /** Name of the celestial object (e.g., "Earth", "Andromeda"). */
    protected String name;

    /** Age of the object in billions of years. */
    protected double age;

    /** Mass of the object (units defined by the simulation context). */
    protected double mass;

    /** Radius of the object (units defined by the simulation context). */
    protected double radius;

    /** X coordinate of the object in the simulation space. */
    protected int xCoord;

    /** Y coordinate of the object in the simulation space. */
    protected int yCoord;

    /** Display color of the object (for visualization purposes). */
    protected String color;

    /**
     * Default protected constructor.
     * <p>
     * Intended for subclass use (e.g., when frameworks or serialization
     * mechanisms need to instantiate without arguments).
     * </p>
     */
    protected CelestialObject() {
    }

    /**
     * Full constructor initializing all fields of the celestial object.
     *
     * @param id     unique identifier
     * @param name   name of the object
     * @param age    age in billions of years
     * @param mass   mass value
     * @param radius radius value
     * @param xCoord X coordinate in the simulation
     * @param yCoord Y coordinate in the simulation
     * @param color  display color string (e.g., hex or color name)
     */
    protected CelestialObject(int id, String name, double age, double mass,
                              double radius, int xCoord, int yCoord, String color) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mass = mass;
        this.radius = radius;
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.color = color;
    }

    /** @return the unique identifier of this object */
    public int getId() {
        return id;
    }

    /** @param id the unique identifier to set */
    public void setId(int id) {
        this.id = id;
    }

    /** @return the name of this celestial object */
    public String getName() {
        return name;
    }

    /** @param name the name to assign */
    public void setName(String name) {
        this.name = name;
    }

    /** @return the age in billions of years */
    public double getAge() {
        return age;
    }

    /** @param age the age value to set */
    public void setAge(double age) {
        this.age = age;
    }

    /** @return the mass of the object */
    public double getMass() {
        return mass;
    }

    /** @param mass the mass value to set */
    public void setMass(double mass) {
        this.mass = mass;
    }

    /** @return the radius of the object */
    public double getRadius() {
        return radius;
    }

    /** @param radius the radius value to set */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** @return the X coordinate in the simulation space */
    public int getxCoord() {
        return xCoord;
    }

    /** @param xCoord the X coordinate to set */
    public void setxCoord(int xCoord) {
        this.xCoord = xCoord;
    }

    /** @return the Y coordinate in the simulation space */
    public int getyCoord() {
        return yCoord;
    }

    /** @param yCoord the Y coordinate to set */
    public void setyCoord(int yCoord) {
        this.yCoord = yCoord;
    }

    /** @return the display color string */
    public String getColor() {
        return color;
    }

    /** @param color the display color string to set */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Computes a hash code including all key fields.
     * Ensures that two equal objects have the same hash code.
     *
     * @return hash code value for this object
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.id;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.age) ^ (Double.doubleToLongBits(this.age) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.mass) ^ (Double.doubleToLongBits(this.mass) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.radius) ^ (Double.doubleToLongBits(this.radius) >>> 32));
        hash = 89 * hash + this.xCoord;
        hash = 89 * hash + this.yCoord;
        hash = 89 * hash + Objects.hashCode(this.color);
        return hash;
    }

    /**
     * Compares this object to another for equality.
     * <p>
     * Two celestial objects are equal if all fields (id, name, age, mass, radius,
     * coordinates, and color) match.
     * </p>
     *
     * @param obj the object to compare with
     * @return {@code true} if equal, {@code false} otherwise
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
        final CelestialObject other = (CelestialObject) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.age) != Double.doubleToLongBits(other.age)) {
            return false;
        }
        if (Double.doubleToLongBits(this.mass) != Double.doubleToLongBits(other.mass)) {
            return false;
        }
        if (Double.doubleToLongBits(this.radius) != Double.doubleToLongBits(other.radius)) {
            return false;
        }
        if (this.xCoord != other.xCoord) {
            return false;
        }
        if (this.yCoord != other.yCoord) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        return true;
    }

    /**
     * Returns a string representation of this object.
     * <p>
     * Useful for logging and debugging.
     * </p>
     *
     * @return a string containing all fields of the object
     */
    @Override
    public String toString() {
        return "CelestialObject{" +
                "id=" + id +
                ", name=" + name +
                ", age=" + age +
                ", mass=" + mass +
                ", radius=" + radius +
                ", xCoord=" + xCoord +
                ", yCoord=" + yCoord +
                ", color=" + color +
                '}';
    }
}
