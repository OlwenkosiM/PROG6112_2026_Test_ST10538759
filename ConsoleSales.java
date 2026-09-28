import java.util.Scanner;

    private static void displayAllConsoles(Console[] consoles) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

public class ConsoleSales {

        private static class Console {

            public Console() {
            }
        }

    public interface IConsoles{
    String getConsoleType();
    String getStore();
    int gettTotalSales();
}
    
}


    // Interface
    public interface IConsoles {
        String getConsoleType();
        String getStore();
        int getTotalSales();
    }

    // Console class implementing the interface
    public static class Console implements IConsoles {

        private String consoleType;
        private String store;
        private int totalSales;

        // Constructor
        public Console(String consoleType, String store, int totalSales) {
            this.consoleType = consoleType;
            this.store = store;
            this.totalSales = totalSales;
        }

        // Get console type
        @Override
        public String getConsoleType() {
            return consoleType;
        }

        // Get store/city
        @Override
        public String getStore() {
            return store;
        }

        // Get total sales
        @Override
        public int getTotalSales() {
            return totalSales;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Console sales data
        Console[] consoles = {

            new Console("PS5", "Cape Town", 1200),
            new Console("XBOX", "Cape Town", 950),
            new Console("Nintendo Switch", "Cape Town", 1100),

            new Console("PS5", "Port Elizabeth", 900),
            new Console("XBOX", "Port Elizabeth", 750),
            new Console("Nintendo Switch", "Port Elizabeth", 850),

            new Console("PS5", "Pretoria", 1050),
            new Console("XBOX", "Pretoria", 900),
            new Console("Nintendo Switch", "Pretoria", 1000)
        };

        // Display menu
        System.out.println("Select the console type:");
        System.out.println("1. PS5");
        System.out.println("2. XBOX");
        System.out.println("3. SWITCH");
        System.out.println("==========================================");
        System.out.print("Enter your choice: ");

        int choice = input.nextInt();

        String selectedConsole = "";

        // Select console type
        switch (choice) {
            case 1:
                selectedConsole = "PS5";
                break;

            case 2:
                selectedConsole = "XBOX";
                break;

            case 3:
                selectedConsole = "NINTENDO SWITCH";
                break;

            case 4:
                displayAllConsoles(consoles);
                input.close();
        }}
           
        
    
        
        
        