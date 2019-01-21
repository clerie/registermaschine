public class InstructionMult implements Instruction {
    private int reg;

    public InstructionMult(int i) {
        reg = i;
    }

    public void eval(Configuration config) {
        config.setRegister(0, config.getRegister(0) * config.getRegister(reg));
        config.incIC();
    }

    @Override
    public String toString() {
        return "MULT " + reg;
    }
}
