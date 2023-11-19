class intfa{

    //(x << i = x*pow(2,i)) and division of the first term and second term raised to power 2  ((x>>i) = x/pow(2,i)) 
        public static void main(String[] args) {
        int a = 2147483647;
        
        for(int i= 0; i  <= 31 ; i++){
           System.out.println(Math.pow(2,i));
           a *= Math.pow(2,i); 
           System.out.println(a);}
        
        
    }
}