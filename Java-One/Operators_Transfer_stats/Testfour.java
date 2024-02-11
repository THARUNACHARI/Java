 class Test{

    public static void main(String[] args){
            
                int[] prices={9,99,199,299,399,499,599,699,799,899};
                //print all product prices except 499
                for(int i=0;i<=prices.length-1;i++){
                    if(prices[i] == 499){
                        continue;
                    }
                    System.out.println(prices[i]);
                }
               
        
     }
}
