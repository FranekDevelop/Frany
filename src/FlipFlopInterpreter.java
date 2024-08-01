public class FlipFlopInterpreter {
    private boolean bit = false;  // Initial value is 0

    public void execute(String code) {
        for (char instruction : code.toCharArray()) {
            switch (instruction) {
                case '0':
                    bit = false;
                    break;
                case '1':
                    bit = true;
                    break;
                case 'F':
                    bit = !bit;
                    break;
                case 'P':
                    System.out.print(bit ? "1" : "0");
                    break;
                default:
                    throw new IllegalArgumentException("Invalid instruction: " + instruction);
            }
        }
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java FlipFlopInterpreter <code>");
            return;
        }
        FlipFlopInterpreter interpreter = new FlipFlopInterpreter();
        interpreter.execute(args[0]);
    }
}
