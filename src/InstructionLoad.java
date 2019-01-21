public class InstructionLoad implements Instruction {
    private int reg;

    public InstructionLoad(int i) {
        reg = i;
    }

    public void eval(Configuration config) {
        config.setRegister(0, config.getRegister(reg));
        config.incIC();
    }

    @Override
    public String toString() {
        return "LOAD " + reg;
    }
}
