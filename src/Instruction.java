public interface Instruction {
    void eval(Configuration config);
    String toString();
}

/*
 *
 * ADD
 * CADD
 *
 * SUB
 * CSUb
 *
 * MULT
 * CMULT
 *
 * DIV
 * CDIV
 *
 * GOTO
 * IFGOTO
 *
 * LOAD
 * STORE
 *
 */