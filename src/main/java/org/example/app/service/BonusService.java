package org.example.app.service;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class BonusService {
    public String getRes(double sales) {
        if (sales < 0) {
            throw new IllegalArgumentException("Sales cannot be negative");
        }
        double bonus = sales * 0.1; // 10% bonus

        // Set the decimal separator to a dot
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#0.00", symbols);

        return decimalFormat.format(bonus);
    }
}
