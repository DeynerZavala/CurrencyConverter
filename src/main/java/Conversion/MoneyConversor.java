package Conversion;

import Api.CurrencyConverter;
import MultiplyDouble.MultiplyWithBigDecimal;

import java.math.BigDecimal;

public class MoneyConversor {
    public static double Coversor (String fromCurrency, String toCurrency, double amount) {
        double convertedAmount= CurrencyConverter.currencyConverter(fromCurrency, toCurrency, amount);
        if (convertedAmount >0){
            return MultiplyWithBigDecimal.multiply(BigDecimal.valueOf(amount),
                    BigDecimal.valueOf(convertedAmount)).doubleValue();
        }
        return -1;
    }
}
