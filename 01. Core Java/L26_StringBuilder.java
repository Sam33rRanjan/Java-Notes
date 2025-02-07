public class L26_StringBuilder {
    // StringBuilder is mutable
    // All methods in StringBuilder are non-synchronized
    // Methods are all same as StringBuffer
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("nuf si avaJ");
        String rev=sb.substring(0,3);
	    String cor=new StringBuffer(rev).reverse().toString();
	    sb.replace(0, 3, cor);
        System.out.println(sb);
        rev=sb.substring(4,6);
        cor=new StringBuffer(rev).reverse().toString();
        sb.replace(4, 6, cor);
        System.out.println(sb);
        rev=sb.substring(7,11);
        cor=new StringBuffer(rev).reverse().toString();
        sb.replace(7, 11, cor);
        System.out.println(sb);
    }
    
}
