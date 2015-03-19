package com.twu.refactoring.state;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DirectionTest {

    private Direction north;
    private Direction east;

    @Before
    public void setUp() throws Exception {
        north = new Direction('N');
        east = new Direction('E');
    }

    @Test
    public void should_turn_east_when_turn_right_from_north() {
        Direction east = north.turnRight();
        assertThat(east, is(new Direction('E')));
    }

    @Test
    public void should_turn_west_when_turn_left_from_north() {
        Direction west = north.turnLeft();
        assertThat(west, is(new Direction('W')));
    }

    @Test
    public void should_turn_north_when_turn_left_from_east() {
        Direction north = east.turnLeft();
        assertThat(north, is(new Direction('N')));
    }
}
