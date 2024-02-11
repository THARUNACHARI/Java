class Test {
    public static void main(String[] args) {
        
        String[] enames={"rahul","sonia","tharun","priya"};
        System.out.println(enames);     //[java.lang.String@hexa
        System.out.println(enames[0]);  //Rahul
        System.out.println(enames[1]);   
        System.out.println(enames[2]); 
        System.out.println(enames[3]);
         
        System.out.println(enames[45]); //Index 45 out of bounds for length 4
    }
    
}
