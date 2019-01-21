public class InstructionCMult implements Instruction {
    private int con;

    public InstructionCMult(int i) {
        con = i;
    }

    public void eval(Configuration config) {
        config.setRegister(0, config.getRegister(0) * con);
        config.incIC();
    }

    @Override
    public String toString() {
        return "CMULT " + con;
    }
}
