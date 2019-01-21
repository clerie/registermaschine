public class InstructionCSub implements Instruction {
    private int con;

    public InstructionCSub(int i) {
        con = i;
    }

    public void eval(Configuration config) {
        config.setRegister(0, config.getRegister(0) - con);
        config.incIC();
    }

    @Override
    public String toString() {
        return "CSUB " + con;
    }
}
