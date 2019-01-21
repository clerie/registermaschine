public class InstructionStore implements Instruction {
    private int reg;

    public InstructionStore(int i) {
        reg = i;
    }

    public void eval(Configuration config) {
        config.setRegister(reg, config.getRegister(0));
        config.incIC();
    }

    @Override
    public String toString() {
        return "STORE " + reg;
    }
}
