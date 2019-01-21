public class Configuration {
    public final static int NUM_REGISTERS = 10;
    int ic; // Instruction Counter
    int[] registers = new int[NUM_REGISTERS];

    public Configuration() {
        init();
    }

    public void init() {
        ic = 0;

        for(int i = 0; i < registers.length; i++) {
            registers[i] = 0;
        }
    }

    public int getIC() {
        return ic;
    }

    public void setIC(int nic) {
        ic = nic;
    }

    public void incIC() {
        ic++;
    }

    public void setRegister(int i, int val) {
        registers[i] = val;
    }

    public int getRegister(int i) {
        return registers[i];
    }

    @Override
    public String toString() {
        String out = "";

        for(int r : registers) {
            out += r + ",";
        }

        return "[" + out + "...";
    }
}
