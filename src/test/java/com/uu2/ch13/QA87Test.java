package com.uu2.ch13;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QA87Test {

    private QA87 qa87;

    @BeforeEach
    public void setUp() {
        qa87 = new QA87();
    }

    @Test
    public void restoreIpAddresses_ValidInput_ReturnsValidIPs() {
        String input = "25525511135";
        List<String> expected = List.of("255.255.11.135", "255.255.111.35");
        List<String> actual = qa87.restoreIpAddresses(input);
        assertEquals(expected, actual);
    }

    @Test
    public void restoreIpAddresses_InvalidInput_ReturnsEmptyList() {
        String input = "11111111111111111111111111111111";
        List<String> expected = List.of();
        List<String> actual = qa87.restoreIpAddresses(input);
        assertEquals(expected, actual);
    }

    @Test
    public void restoreIpAddresses_SingleSegment_ReturnsEmptyList() {
        String input = "0";
        List<String> expected = new ArrayList<>();
        List<String> actual = qa87.restoreIpAddresses(input);
        assertEquals(expected, actual);
    }

    @Test
    public void restoreIpAddresses_LeadingZero_ReturnsValidIPs() {
        String input = "010010";
        List<String> expected = List.of("0.10.0.10", "0.100.1.0");
        List<String> actual = qa87.restoreIpAddresses(input);
        assertEquals(expected, actual);
    }

    @Test
    public void restoreIpAddresses_ExactLength_ReturnsValidIPs() {
        String input = "19216811";
        List<String> expected = List.of(
                "1.92.168.11",
                "19.2.168.11",
                "19.21.68.11",
                "19.216.8.11",
                "19.216.81.1",
                "192.1.68.11",
                "192.16.8.11",
                "192.16.81.1",
                "192.168.1.1"
        );
        List<String> actual = qa87.restoreIpAddresses(input);
        assertEquals(expected, actual);
    }
}
