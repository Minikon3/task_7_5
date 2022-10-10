public interface StringInterface {
    static public void counter(String str){
        System.out.println(str.length());
    }
    static public String oddstring(char[] arr){
        int i=1;
        String str="";
        while (i<arr.length){
            str=str+arr[i];
            i=i+2;
        }
        return str;
    }
    static public String reversestring(String str){
        return new StringBuilder(str).reverse().toString();
    }
}
