import java.util.Map;
class StockViewer5b {

    private final InventorySnapshot stock;

    StockViewer5b(InventorySnapshot stock) {

        this.stock = stock;

    }

    void showWood() {

        System.out.println(

                "Viewer remembers WOOD-A: "

                        + stock.available("WOOD-A")

        );

    }

}

public class Exercise5b {

    public static void main(String[] args) {

        InventorySnapshot stock =

                new InventorySnapshot(

                        Map.of("WOOD-A", 3000L)

                );

        StockViewer5b viewer =

                new StockViewer5b(stock);

        viewer.showWood();

        viewer.showWood();

    }

}