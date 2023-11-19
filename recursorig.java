class newrecurs{
    
        static void  priint(int n)
        {
        if (n==0)
            return ; 
            System.out.println(n);
            priint(n-1);
        
        }
     
    public static void main(String[] args) {
        priint(7);
    }
    }
