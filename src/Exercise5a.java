import java.util.Map;
class MaterialPlanner5a {

    void showWoodStock(InventorySnapshot stock) {

        System.out.println(

                "Planner sees WOOD-A: "

                        + stock.available("WOOD-A")

        );

    }

}

public class Exercise5a {

    public static void main(String[] args) {

        InventorySnapshot stock =

                new InventorySnapshot(

                        Map.of("WOOD-A", 3000L)

                );

        MaterialPlanner5a planner =

                new MaterialPlanner5a();

        planner.showWoodStock(stock);

    }

}
class StockViewer {

    private final InventorySnapshot stock;

    StockViewer(InventorySnapshot stock) {

        this.stock = stock;

    }

    void showWood() {

        System.out.println(

                "Viewer remembers WOOD-A: "

                        + stock.available("WOOD-A")

        );

    }

}