class hardik{
public static void main(String []args){


byte b  = 127; //can be assigned only from -128 till  127
short s = 3278;//dounble the value of byte --2^4
int  i = 2147483647;
long l = 2147483648L; // have to write L in all literals greater than int
float f = 90.0f;
//not case sensitive{f or l or d}
double  d = 2147483648.0d;

//char c = "\u0010";//is an unsigned
System.out.println(b);

//System.out.println(k);
System.out.println(s);
System.out.println(i);
System.out.println(d);
//System.out.println(c);

char gh = "9";
int k = (int)(gh - 48);//as the  ascii  value of 0 -- 48
System.out.println(k);
short cow = 42;
int ip = (int)cow;
System.out.println(ip);



char o = "a";
short kazo = "a";
System.out.println(kazo);






}


}