package newD;
@FunctionalInterface
interface StringProcessor {
    void process(String str);
}
public class _12LambdaMethodReference {
    public static void main(String[] args) {
        StringProcessor processor = str -> System.out.println(str.toUpperCase());
        processor.process("hello");
        System.out.println("change");
    }
}
