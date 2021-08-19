package Software;
import Hardware.CPU;
import Hardware.Memory;
import Hardware.CPU.Interrupt;
import Hardware.CPU.Opcode;
import Hardware.Memory.Word;

public class SOs {
    
    public class InterruptHandling{
        
        //Tratando interrupções
        public void handle(Interrupt itr){
            switch (itr) {
                case InvalidInstruction:
                    System.out.println(itr);
                    break;
                case InvalidAdress:
                    System.out.println(itr);
                    break;
                case Overflow:
                    System.out.println(itr);
                    break;
                case ProgramEnd:
                    System.out.println(itr);
                    break;
                case Trap:
                    int pcAtual = cpu.getPC();
                    int limiteInferiorAtual = cpu.getLimiteInferior();
                    int limiteSuperiorAtual = cpu.getLimiteSuperior();

                    cpu.setContext(900, 900, 930);
                    cpu.run();
                    cpu.setContext(pcAtual, limiteSuperiorAtual, limiteInferiorAtual);
                    cpu.run();

                default:
                    System.out.println(itr);
                    break;
            }
        }        
    }

    public InterruptHandling interruptHandling;
    private CPU cpu;
    private Memory memory;

    public SOs(CPU _cpu, Memory _memory){        
        interruptHandling = new InterruptHandling();
        _cpu.setInterruptHandling(interruptHandling);
        cpu = _cpu;
        memory = _memory;
    }

    public void loadProgram(int pc, Word[] program){
        //cpu.aux.dump(m, ini, fim);
        for(int i=0; i < program.length; i++){
            memory.address[pc] = program[i];
            pc++;
        }
    }

    public void runProgram(int pc, int limiteInferior, int limiteSuperior){
        cpu.setContext(pc, limiteInferior, limiteSuperior);
        cpu.run();
    }

    public static Word[] Trap = new Word[] {

    };

}

