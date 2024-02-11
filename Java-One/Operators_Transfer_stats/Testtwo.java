class Test {
    public static void main(String[] args) {
        int[] prices={9,99,199,299,399,499,599,699,799,899};
        int i=0;
        while(i<=prices.length-1){
            if(prices[i]>500){
                break;
            }
            else{
                System.out.println(prices[i]);
            }
            i++;
        }
         /*  for(int price:prices){
            if(price > 500){
                break;
            }else{
                System.out.println(price);
            }
        } */

    }
    
}
