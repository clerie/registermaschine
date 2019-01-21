public class InstructionGoto implements Instruction {
    private int reg;

    public InstructionGoto(int i) {
        reg = i;
    }

    public void eval(Configuration config) {
        config.setIC(reg);
    }
}
