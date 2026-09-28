
public class GamingConsoleReport
{

    public static void main(String[] args) {

        // City names
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};

        // Sales data
        // [PS5, XBOX, Nintendo Switch]
        int[][] sales = {
            {1000, 2000, 3000},   // Cape Town
            {2000, 3000, 4000},     // Port Elizabeth
            {1500, 1100, 1200}    // Pretoria
        };

        // Variables to find the city with the most sales
        int highestSales = 0;
        String cityWithMostSales = "";

        // Display report heading
        System.out.println("==============================================");
        System.out.println("       GAMING CONSOLE REPORT");
        System.out.println("==============================================");

        System.out.printf("%-20s %-10s %-10s %-15s %-10s%n",
                "City", "PS5", "XBOX", "NINTENDO", "TOTAL");

        System.out.println("---------------------------------------------------------------");

        // Display sales and calculate totals
        for (int i = 0; i < cities.length; i++) {

            int totalSales = sales[i][0] + sales[i][1] + sales[i][2];

            System.out.printf("%-20s %-10d %-10d %-15d %-10d%n",
                    cities[i],
                    sales[i][0],
                    sales[i][1],
                    sales[i][2],
                    totalSales);

            // Check if this city has the highest sales
            if (totalSales > highestSales) {
                highestSales = totalSales;
                cityWithMostSales = cities[i];
            }
        }

        System.out.println("---------------------------------------------------------------");

        // Display city with the most gaming console sales
        System.out.println("CITY WITH THE MOST SALES: "
                + cityWithMostSales);

        System.out.println("==============================================");
    }
}

