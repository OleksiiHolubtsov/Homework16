package org.example.app.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {

    private final BonusService bonusService = new BonusService();

    @Test
    public void testGetRes_CorrectCalculation() {
        double sales = 1000.0;
        String expectedBonus = "100.00"; // 10% of 1000 is 100
        String actualBonus = bonusService.getRes(sales);
        assertEquals(expectedBonus, actualBonus, "Bonus calculation is incorrect");
    }

    @Test
    public void testGetRes_NegativeSales_ThrowsException() {
        double sales = -500.0;
        assertThrows(IllegalArgumentException.class, () -> {
            bonusService.getRes(sales);
        }, "Expected getRes() to throw IllegalArgumentException for negative sales");
    }
}