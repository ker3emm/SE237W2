class BomLine2 {

    private final String componentCode;
    private final long quantityPerUnit;
    private final int lossPercent;

    BomLine2(String componentCode, long quantityPerUnit, int lossPercent) {

        if (quantityPerUnit <= 0) {

            throw new IllegalArgumentException(

                    "quantityPerUnit must be positive"

            );

        }

        if (lossPercent < 0 || lossPercent >= 100) {

            throw new IllegalArgumentException(

                    "lossPercent must be between 0 and 99"

            );

        }

        this.componentCode = componentCode;
        this.quantityPerUnit = quantityPerUnit;
        this.lossPercent = lossPercent;

    }

    String componentCode() {

        return componentCode;

    }

}

public class Exercise2 {

    public static void main(String[] args) {

        BomLine2 line = new BomLine2("WOOD-A", 25, 10);

        System.out.println(

                "Created: " + line.componentCode()

        );
        // --- Hata  Durumları  ---

        // 1. Durum: quantityPerUnit pozitif değil
        //  BomLine2 line = new BomLine2("WOOD-A", -5, 10);
        // Exception in thread "main" java.lang.IllegalArgumentException: quantityPerUnit must be positive

        // 2. Durum: lossPercent geçersiz (0-99 aralığı dışında kaldığı için)
        // BomLine2 line = new BomLine2("WOOD-A", 25, 120);
        // Exception in thread "main" java.lang.IllegalArgumentException: lossPercent must be between 0 and 99
    }
    }

