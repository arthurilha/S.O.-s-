package Software.SistemaOperacional;
import Hardware.CPU;
import Hardware.Memory;
import Hardware.CPU.Interrupt;
import Hardware.Memory.Word;
import Software.SistemaOperacional.Drivers.*;

public class SOs {
    
    public class InterruptHandling{
        
        //Tratando interrupcoes
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
                    switch(cpu.getRegistrator(8)){
                        case 1: 
                            input();
                            break;
                        case 2:
                            output();
                            break;
                    }
                    break;
                default:
                    System.out.println(itr);
                    break;
            }
        }        
    }

    public InterruptHandling interruptHandling;
    private CPU cpu;
    private Memory memory;
    private KeyboardDriver keyboardDriver;
    private ConsoleOutputDriver consoleOutputDriver;

    public SOs(CPU _cpu, Memory _memory){        
        interruptHandling = new InterruptHandling();
        _cpu.setInterruptHandling(interruptHandling);
        cpu = _cpu;
        memory = _memory;
    }

    public void loadProgram(int pc, Word[] program){
        for(int i=0; i < program.length; i++){
            memory.address[pc] = program[i];
            pc++;
        }
    }

    public void runProgram(int pc, int limiteInferior, int limiteSuperior){
        cpu.setContext(pc, limiteInferior, limiteSuperior);
        cpu.run();
    }

    public void input(){
        cpu.setRegistrator(9, keyboardDriver.readKeyboardInput());
    }

    public void output(){
        consoleOutputDriver.systemOutInt(cpu.getRegistrator(9));
    }

}

