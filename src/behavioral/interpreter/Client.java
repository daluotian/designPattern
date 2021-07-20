package behavioral.interpreter;

public class Client {
    public static void main(String[] args) {
        String instruction = "down run 10 and left move 20";
        InstructionHandle handle = new InstructionHandle();
        handle.handle(instruction);

        String outString;
        outString = handle.output();
        System.out.println(outString);
    }
}
