class ErpManager {

    void updateStock() {

        System.out.println("Stock updated");

    }

    void calculateMaterialNeeds() {

        System.out.println("Material needs calculated");

    }

    void createInvoice() {

        System.out.println("Invoice created");

    }

}
class InventoryService {



    void updateStock() {

        System.out.println("Stock updated");

    }

}

class MaterialPlanner {

    void calculateMaterialNeeds() {

        System.out.println("Material requirements calculated");

    }

}
class InvoiceService {

    void createInvoice() {

        System.out.println("Invoice created");

    }

}
public class Exercise6 {

    public static void main(String[] args) {

        InventoryService inventory =

                new InventoryService();

        MaterialPlanner planner =

                new MaterialPlanner();

        InvoiceService invoice =

                new InvoiceService();

        inventory.updateStock();

        planner.calculateMaterialNeeds();

        invoice.createInvoice();

    }

}
