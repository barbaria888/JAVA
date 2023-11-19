 class main1 {

    static float var_1 ;  // static variable
    double var_2 ;// non static variable

   public static void main(String[] args) {
       main1 m = new main1();

       System.out.println(m.var_1); // 23.90
       System.out.println(m.var_2);  // 555.0
   }
}