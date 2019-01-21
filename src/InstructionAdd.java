public class InstructionAdd implements Instruction {
    private int reg;

    public InstructionAdd(int i) {
        reg = i;
    }

    public void eval(Configuration config) {
        config.setRegister(0, config.getRegister(0) + config.getRegister(reg));
        config.incIC();
    }

    @Override
    public String toString() {
        return "ADD " + reg;
    }
}
