public class Main implements StringInterface{
    public static void main(String[] args) {
        StringInterface.counter("Suspendisse sodales dolor eget augue ornare vulputate.");

        char arr[]={'L','o','r','e','m',' ','i','p','s','u','m'};
        System.out.println(StringInterface.oddstring(arr));

        System.out.println(StringInterface.reversestring("Nulla sollicitudin auctor nisl vitae scelerisque."));
    }
}