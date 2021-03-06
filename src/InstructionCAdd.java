public class InstructionCAdd implements Instruction {
    private int con;

    public InstructionCAdd(int i) {
        con = i;
    }

    public void eval(Configuration config) {
        config.setRegister(0, config.getRegister(0) + con);
        config.incIC();
    }

    @Override
    public String toString() {
        return "CADD " + con;
    }
}
