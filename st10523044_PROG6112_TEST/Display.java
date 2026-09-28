public class dispaly {
       
    /**
     * @param args
     */
    public static void main(String[] args) {
        // single dimensional array
     String[]cities ={"Cape Town","Port Elizabeth","Pretoria"};

     int[][] sales={{1000,2000,3000},
                   {2000,3000,4000},
                   {1500,1100,1200}
                   };
     
     for(int i =0;i< sales.length;i++){
        for(int j=0;j< sales[i].length;i++){
            cityTotals[i] +=sales[i][j];
        }
       }
     for(int i=1; i<citytoatls.length;i=++){
        if(cityTotals[i]>highhestSales){
            highhestSales = cityTotals[i];
            cityWithMostSales= cities[i];
        }
     }

     // display

     System.out.println("------------------------------------"); 

     System.out.printf("%-20s %-10s %-10s%-10s%n,
                     "CITY","PS5","XBOX","SWITCH");

     for(int i=0; i< cities.length;i++){
     System.out.printf("%-20s %-10s %-10s%-10s%n,
                      cities[i],
                      sales[i][0],
                      sales[i][1],
                      sales[i][2],
     System.out.println("------------------------------------"); 

     System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
     System.out.println("------------------------------------------------------------");

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s %d%n",
                    cities[i], cityTotals[i]);
        }

        System.out.println();
        System.out.println("CITY WITH THE MOST SALES: " + cityWithMostSales);
        System.out.println("------------------------------------------------------------");
         
    }             
    }



    }


