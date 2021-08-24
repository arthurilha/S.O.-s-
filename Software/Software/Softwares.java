package Software;

import Hardware.CPU.Opcode;
import Hardware.Memory.Word;

public class Softwares {

    public static Word[] progMinimo = new Word[] {
        new Word(Opcode.LDI, 0, -1, 999),
        new Word(Opcode.STD, 0, -1, 10),
        new Word(Opcode.STD, 0, -1, 11),
        new Word(Opcode.STD, 0, -1, 12),
        new Word(Opcode.STD, 0, -1, 13),
        new Word(Opcode.STD, 0, -1, 14),
        new Word(Opcode.STOP, -1, -1, -1) 
    };
   
    //PA
	public static Word[] PA = new Word[] { // mesmo que prog exemplo, so que usa r0 no lugar de r8
           
           
        new Word(Opcode.LDI, 3, -1, 22),    //r3 <- -10
        new Word(Opcode.STD, 3, -1, 36),     //A <- r0 (Definir EndereÃ§o)

        new Word(Opcode.LDI, 3, -1, 22),    //r3 <- 22
        new Word(Opcode.STD, 3, -1, 37),     //Stop <- r0 (Definir EndereÃ§o)
     
        new Word(Opcode.LDD, 3, -1, 36), //r3 = -10
     
        new Word(Opcode.JMPILM, -1, 3 ,37),
     
        new Word(Opcode.LDI, 1, -1, 0), 
        new Word(Opcode.STD, 1, -1, 20),    // 20 posicao de memoria onde inicia a serie de fibonacci gerada  
        new Word(Opcode.LDI, 2, -1, 1),
        new Word(Opcode.STD, 2, -1, 21),      
        new Word(Opcode.LDI, 0, -1, 22),       
        new Word(Opcode.LDI, 6, -1, 6),
        new Word(Opcode.LDI, 7, -1, 30),       
        new Word(Opcode.LDI, 3, -1, 0), 
        new Word(Opcode.ADD, 3, 1, -1),
        new Word(Opcode.LDI, 1, -1, 0), 
        new Word(Opcode.ADD, 1, 2, -1), 
        new Word(Opcode.ADD, 2, 3, -1),
        new Word(Opcode.STX, 0, 2, -1), 
        new Word(Opcode.ADDI, 0, -1, 1), 
        new Word(Opcode.SUB, 7, 0, -1),
        new Word(Opcode.JMPIG, 6, 7, -1), 
        new Word(Opcode.STOP, -1, -1, -1),   // POS 22
        new Word(Opcode.DATA, -1, -1, -1),   // -1
        new Word(Opcode.DATA, -1, -1, -1),
        new Word(Opcode.DATA, -1, -1, -1),
        new Word(Opcode.DATA, -1, -1, -1),   // POS 26
        new Word(Opcode.DATA, -1, -1, -1),
        new Word(Opcode.DATA, -1, -1, -1),
        new Word(Opcode.DATA, -1, -1, -1),
        new Word(Opcode.DATA, -1, -1, -1),
        new Word(Opcode.DATA, -1, -1, -1),
        new Word(Opcode.DATA, -1, -1, -1),
        new Word(Opcode.DATA, -1, -1, -1),
        new Word(Opcode.DATA, -1, -1, -1),
        new Word(Opcode.DATA, -1, -1, -1),  // ate aqui - serie de fibonacci ficara armazenada
                 
        new Word(Opcode.DATA, -1, -1, -10), //A 10
        new Word(Opcode.DATA, -1, -1, 22)  //Stop
             
             };

    public static Word[] PB = new Word[] { 	 // este fatorial so aceita valores positivos.   nao pode ser zero
        // linha   comen
        new Word(Opcode.LDI, 0, -1, 5), 	 //r0 <- 5
        new Word(Opcode.STD, 0, -1, 19),     //A <- r0 (Definir Endereço)


        new Word(Opcode.LDI, 0, -1, -1),     //r0 <- 20
        new Word(Opcode.STD, 0, -1, 20),     //Stop <- r0 (Definir EndereÃ§o)

        new Word(Opcode.LDD, 0, -1, 19), //r0 = 5

        new Word(Opcode.JMPILM, -1, 0, 20), // se for menor que 0 então
        
        new Word(Opcode.LDI, 0, -1, -1),// R0 <- -1
        new Word(Opcode.STD, 0, -1, 18), // armazena -1 na saida
        // senão  responde o fatorial do número na saída

        new Word(Opcode.LDI, 0, -1, 5),      // 0   	r0 é valor a calcular fatorial
        new Word(Opcode.LDI, 1, -1, 1),      // 1   	r1 é 1 para multiplicar (por r0)
        new Word(Opcode.LDI, 6, -1, 1),      // 2   	r6 é 1 para ser o decremento
        new Word(Opcode.LDI, 7, -1, 8),      // 3   	r7 tem posicao de stop do programa = 8
        new Word(Opcode.JMPIE, 7, 0, 0),     // 4   	se r0=0 pula para r7(=8)
        new Word(Opcode.MULT, 1, 0, -1),     // 5   	r1 = r1 * r0
        new Word(Opcode.SUB, 0, 6, -1),      // 6   	decrementa r0 1 
        new Word(Opcode.JMP, -1, -1, 4),     // 7   	vai p posicao 4
        new Word(Opcode.STD, 1, -1, 10),     // 8   	coloca valor de r1 na posição 10
        new Word(Opcode.STOP, -1, -1, -1),    // 9   	stop
        new Word(Opcode.DATA, -1, -1, -1),  // 10   ao final o valor do fatorial estará na posição 10 da memória  
        new Word(Opcode.DATA, -1, -1, 5), //A           19
        new Word(Opcode.DATA, -1, -1, 17)
        //Stop       20
    };

    public static Word[] TrapExampleIn = new Word[] {		
        new Word(Opcode.LDI, 8, -1, 1),   
        new Word(Opcode.LDI, 9, -1, 4),   
        new Word(Opcode.TRAP, -1, -1, -1),
        new Word(Opcode.STOP, -1, -1, -1)
    };

    public static Word[] TrapExampleOut = new Word[] {		
        new Word(Opcode.LDI, 8, -1, 1),   
        new Word(Opcode.LDI, 9, -1, 4),   
        new Word(Opcode.TRAP, 9, -1, 4),
        new Word(Opcode.STOP, -1, -1, -1)
    };

    public  static  Word [] contador =  new  Word [] {
        new Word(Opcode.LDI, 0, -1, 0),       // r0 <- 0
        new Word(Opcode.STD, 0, -1, 14),      // A <- r0

        new Word(Opcode.LDI, 0, -1, 50),      // r0 <- 50
        new Word(Opcode.STD, 0, -1, 15),      // B <- r0

        new Word(Opcode.LDI, 0, -1 , 6),      // r0 <- 6
        new Word(Opcode.STD, 0, -1, 16),      // Loop <- r0

        new Word(Opcode. LDD, 0, -1, 14),     // r0 <- A
        new Word(Opcode. LDD, 1, -1 , 15),    // r1 <- B
        new Word(Opcode. SUB, 0, 1, -1),      // r0 <- r0 - r1

        new Word(Opcode.LDD, 2, - 1, 14),     // r2 <- A
        new Word(Opcode.ADDI, 2, -1, 1),      // r2 <- r2 + 1
        new Word(Opcode.STD, 2, -1, 14),      // A <- r2

        new Word(Opcode.JMPILM, -1, 0, 16),

        new Word( Opcode.STOP, -1, -1, -1),

        new Word( Opcode.DATA, -1, -1, -1),   // A 0 14
        new Word( Opcode.DATA, -1, -1, -1),   // B 50 15
        new Word( Opcode.DATA, -1, -1, -1)    // Loop 16
    };

    public  static  Word [] contadorInOut =  new  Word [] {
        new Word(Opcode.LDI, 0, -1, 0),       // r0 <- 0      
        new Word(Opcode.STD, 0, -1, 18),      // A <- r0

        new Word(Opcode.LDI, 8, -1, 1),      //Input
        new Word(Opcode.TRAP, -1, -1, -1),   //Input
        new Word(Opcode.STD, 9, -1, 19),      // B <- r0

        new Word(Opcode.LDI, 0, -1 , 7),      // r0 <- 6
        new Word(Opcode.STD, 0, -1, 20),      // Loop <- r0

        new Word(Opcode. LDD, 0, -1, 18),     // r0 <- A
        new Word(Opcode. LDD, 1, -1 , 19),    // r1 <- B
        new Word(Opcode. SUB, 0, 1, -1),      // r0 <- r0 - r1

        new Word(Opcode.LDD, 2, - 1, 18),     // r2 <- A
        new Word(Opcode.ADDI, 2, -1, 1),      // r2 <- r2 + 1
        new Word(Opcode.STD, 2, -1, 18),      // A <- r2
        new Word(Opcode.LDD, 9, -1, 18),
        new Word(Opcode.LDI, 8, -1, 2),      //Output
        new Word(Opcode.TRAP, -1, -1, -1),   //Output

        new Word(Opcode.JMPILM, -1, 0, 20),

        new Word(Opcode.STOP, -1, -1, -1),

        new Word(Opcode.DATA, -1, -1, -1),   // A 0 18
        new Word(Opcode.DATA, -1, -1, -1),   // B 50 19
        new Word(Opcode.DATA, -1, -1, -1)    // Loop 20
    };


    public static Word[] E1 = new Word[]{
        new Word(Opcode.LDI, 2, -1, 10),      //r2 <- 10
        new Word(Opcode.STD, 2, -1, 7),     //A <- r0 (Definir Endereço)

        new Word(Opcode.LDI, 3, -1, 15),    //r3 <- 15
        new Word(Opcode.STD, 3, -1, 8),     //Stop 

        new Word(Opcode.LDD, 2, -1, 7),    // chama valor armazenado em 

        new Word(Opcode.JMPILM, -1, 0, 8), // se for menor que 0 então

        new Word(Opcode.STOP, -1, -1, -1),   // posiçao 6

        new Word(Opcode.DATA, -1, -1, 10), //A
        new Word(Opcode.DATA, -1, -1, 6)  //Stop
    };
 
    public static Word[] E2 = new Word[]{
        new Word(Opcode.LDI, 1, -1, 50),       // r1 <- 50
        new Word(Opcode.STD, 1, -1, 8 ),      // A <- r0

        new Word(Opcode.LDI, 1, -1, 100),      // r1 <- 50
        new Word(Opcode.STD, 1, -1, 9),       // B <- r0

        new Word(Opcode. LDD, 1, -1, 8),     // r1 <- A
        new Word(Opcode. LDD, 2, -1, 9),     // r2 <- B
        new Word(Opcode. ADD, 1, 2, -1),      // r1 <- r1 + r2

        new Word( Opcode.STOP, -1, -1, -1),

        new Word( Opcode.DATA, -1, -1, 50),   // A  50
        new Word( Opcode.DATA, -1, -1, 100),   // B 100
    };

    public static Word[] E3 = new Word[]{
        new Word(Opcode.LDI, 5, -1, 5),       // r1 <- 50
        new Word(Opcode.STD, 5, -1, 8),      // A <- r0

        new Word(Opcode.LDI, 5, -1, 10),      // r1 <- 50
        new Word(Opcode.STD, 5, -1, 9),       // B <- r0

        new Word(Opcode. LDD, 1, -1, 8),     // r1 <- A
        new Word(Opcode. LDD, 2, -1, 9),     // r2 <- B
        new Word(Opcode. MULT, 1, 2, -1),      // r1 <- r1 * r2

        new Word( Opcode.STOP, -1, -1, -1),

        new Word( Opcode.DATA, -1, -1, 5),   // A  5
        new Word( Opcode.DATA, -1, -1, 10),   // B 10
    };
}

