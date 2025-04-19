public class Bitwise {
    public static void main(String[] args){
        //bitwise AND
        int a = 5; // 0101
        int b = 3; // 0011
        int c = a&b; //0001
        System.out.println("Bitwise AND:"+c); //1
        //bitwise OR
        int d = a|b; //0111
        System.out.println("Bitwise OR:"+d);
        //bitwise XOR
        int e = a^b;
        System.out.println("Bitwise XOR:"+e);
        //bitwise NOT
        int f = ~a;
        System.out.println("Bitwise NOT:"+f);
        //left shift
        int g = a<<1;
        System.out.println("Bitwise LeftShift:"+g);
        //right shift
        int h = a>>1;
        System.out.println("Bitwise RightShift:"+h);

    }
    
}
