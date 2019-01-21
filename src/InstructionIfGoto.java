public class InstructionIfGoto implements Instruction {
    private int reg;

    public InstructionIfGoto(int i) {
        reg = i;
    }

    public void eval(Configuration config) {
        if(config.getRegister(0) == 0) {
            config.setIC(reg);
        }
        else {
            config.incIC();
        }
    }
}
