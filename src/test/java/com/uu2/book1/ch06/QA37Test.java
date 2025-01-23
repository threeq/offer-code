package com.uu2.book1.ch06;


import com.uu2.book1.ch06.QA37;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QA37Test {

    private QA37 qa37;

    @BeforeEach
    public void setUp() {
        qa37 = new QA37();
    }

    @Test
    public void asteroidCollision_EmptyInput_EmptyOutput() {
        int[] asteroids = {};
        int[] expected = {};
        assertArrayEquals(expected, qa37.asteroidCollision(asteroids));
    }

    @Test
    public void asteroidCollision_SingleRightMovingAsteroid_SameOutput() {
        int[] asteroids = {5};
        int[] expected = {5};
        assertArrayEquals(expected, qa37.asteroidCollision(asteroids));
    }

    @Test
    public void asteroidCollision_SingleLeftMovingAsteroid_SameOutput() {
        int[] asteroids = {-5};
        int[] expected = {-5};
        assertArrayEquals(expected, qa37.asteroidCollision(asteroids));
    }

    @Test
    public void asteroidCollision_AllRightMovingAsteroids_SameOutput() {
        int[] asteroids = {1, 2, 3};
        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, qa37.asteroidCollision(asteroids));
    }

    @Test
    public void asteroidCollision_AllLeftMovingAsteroids_SameOutput() {
        int[] asteroids = {-1, -2, -3};
        int[] expected = {-1, -2, -3};
        assertArrayEquals(expected, qa37.asteroidCollision(asteroids));
    }

    @Test
    public void asteroidCollision_CollisionSameSize_DestroyBoth() {
        int[] asteroids = {5, -5};
        int[] expected = {};
        assertArrayEquals(expected, qa37.asteroidCollision(asteroids));
    }

    @Test
    public void asteroidCollision_CollisionDifferentSizes_DestroySmaller() {
        int[] asteroids = {10, -5};
        int[] expected = {10};
        assertArrayEquals(expected, qa37.asteroidCollision(asteroids));
    }

    @Test
    public void asteroidCollision_MultipleCollisions_DestroyMultiple() {
        int[] asteroids = {8, -8};
        int[] expected = {};
        assertArrayEquals(expected, qa37.asteroidCollision(asteroids));
    }

    @Test
    public void asteroidCollision_MixedDirections_CorrectOutput() {
        int[] asteroids = {10, 2, -5};
        int[] expected = {10};
        assertArrayEquals(expected, qa37.asteroidCollision(asteroids));
    }

    @Test
    public void asteroidCollision_MixedDirectionsMultipleCollisions_CorrectOutput() {
        int[] asteroids = {-2, -1, 1, 2};
        int[] expected = {-2, -1, 1, 2};
        assertArrayEquals(expected, qa37.asteroidCollision(asteroids));
    }

    @Test
    public void asteroidCollision_ComplexScenario_CorrectOutput() {
        int[] asteroids = {5, 10, -5};
        int[] expected = {5, 10};
        assertArrayEquals(expected, qa37.asteroidCollision(asteroids));
    }
}
