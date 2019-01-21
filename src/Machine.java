public class Machine {
    private Configuration config = null;
    private Instruction[] program = null;

    public Machine() {
        config = new Configuration();
    }

    public void setProgram(Instruction[] prog) {
        program = prog;
    }

    public void setProgram(String prog) {
        String[] lines = prog.split("\\n");

        Instruction[] instructions = new Instruction[lines.length];

        for(int i = 0; i < lines.length; i++) {
            String[] words = lines[i].split(" ");

            switch (words[0]) {
                case "ADD":
                    instructions[i] = new InstructionAdd(Integer.parseInt(words[1]));
                    break;
                case "CADD":
                    instructions[i] = new InstructionCAdd(Integer.parseInt(words[1]));
                    break;
                case "SUB":
                    instructions[i] = new InstructionSub(Integer.parseInt(words[1]));
                    break;
                case "CSUB":
                    instructions[i] = new InstructionCSub(Integer.parseInt(words[1]));
                    break;
                case "MULT":
                    instructions[i] = new InstructionMult(Integer.parseInt(words[1]));
                    break;
                case "CMULT":
                    instructions[i] = new InstructionCMult(Integer.parseInt(words[1]));
                    break;
                case "DIV":
                    instructions[i] = new InstructionDiv(Integer.parseInt(words[1]));
                    break;
                case "CDIV":
                    instructions[i] = new InstructionCDiv(Integer.parseInt(words[1]));
                    break;
                case "LOAD":
                    instructions[i] = new InstructionLoad(Integer.parseInt(words[1]));
                    break;
                case "STORE":
                    instructions[i] = new InstructionStore(Integer.parseInt(words[1]));
                    break;
                case "GOTO":
                    instructions[i] = new InstructionGoto(Integer.parseInt(words[1]));
                    break;
                case "IFGOTO":
                    instructions[i] = new InstructionIfGoto(Integer.parseInt(words[1]));
                    break;
                case "END":
                    instructions[i] = new InstructionEnd();
                    break;
            }
        }

        program = instructions;
    }

    public void run() {
        int ic;
        while(!program[config.getIC()].toString().equals("END")) {
            ic = config.getIC();
            program[ic].eval(config);

            System.out.println(program[ic].toString() + " " + config.toString());
        }
    }

    public Configuration getConfiguration() {
        return config;
    }

    public static void main(String[] args) {
        Instruction[] prog = {
                new InstructionLoad(1),
                new InstructionCAdd(32),
                new InstructionStore(1),
                new InstructionEnd()
        };

        String str = "LOAD 1\nCADD 32\nEND";
        System.out.println(str);

        Machine machine = new Machine();
        machine.setProgram(str);
        machine.getConfiguration().setRegister(1, 32);
        machine.run();

        System.out.println(machine.getConfiguration().toString());
    }
}
