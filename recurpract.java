class pracrecur{
    public static void main(String[]args){
dohello();
    }
static int dohello(int j){
    System.out.println("RAM RAM bhai");
    System.out.println("the number of times it got executed is "+(j+1));
    dohello1(j);
    j++;
    return j;
}
static int dohello1(int j){
    System.out.println("RAM RAM bhai");
    dohello2(j);
    j++;
    return j;
}
static int dohello2(int j){
    System.out.println("RAM RAM bhai");
    dohello3( j);
    j++;
    return j;
}
static int dohello3(int j){
    System.out.println("RAM RAM bhai");
    dohello4( j);
    j++;
    return j;
}
static int dohello4(int j){
    System.out.println("RAM RAM bhai");
    dohello5( j);
    j++;   
return j; }
static int dohello5(int j){
    System.out.println("RAM RAM bhai");
    j++;
return j;}
}