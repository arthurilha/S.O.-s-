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

    /**
     * Recebe um Int16 e faz um for printando até ele
     */
    public  static  Word [] contadorInOut =  new  Word [] {
        new Word(Opcode.LDI, 0, -1, 0),       //0 r0 <- 0      
        new Word(Opcode.STD, 0, -1, 18),      //1 A <- r0
        new Word(Opcode.LDI, 8, -1, 1),       //2 Input
        new Word(Opcode.TRAP, -1, -1, -1),    //3 Input
        new Word(Opcode.STD, 9, -1, 19),      //4 B <- r0
        new Word(Opcode.LDI, 0, -1 , 7),      //5 r0 <- 6
        new Word(Opcode.STD, 0, -1, 20),      //6 Loop <- r0
        new Word(Opcode. LDD, 0, -1, 18),     //7 r0 <- A
        new Word(Opcode. LDD, 1, -1 , 19),    //8 r1 <- B
        new Word(Opcode. SUB, 0, 1, -1),      //9 r0 <- r0 - r1
        new Word(Opcode.LDD, 2, - 1, 18),     //10 r2 <- A
        new Word(Opcode.ADDI, 2, -1, 1),      //11 r2 <- r2 + 1
        new Word(Opcode.STD, 2, -1, 18),      //12 A <- r2
        new Word(Opcode.LDD, 9, -1, 18),      //13
        new Word(Opcode.LDI, 8, -1, 2),       //14 Output
        new Word(Opcode.TRAP, -1, -1, -1),    //15 Output
        new Word(Opcode.JMPILM, -1, 0, 20),   //16
        new Word(Opcode.STOP, -1, -1, -1),    //17
        new Word(Opcode.DATA, -1, -1, -1),    //18 A 0 18
        new Word(Opcode.DATA, -1, -1, -1),    //19 B 50 19
        new Word(Opcode.DATA, -1, -1, -1)     //20 Loop 20
    };

    /** 
     * Recebe um int16 
     * Se INPUT < 0 
     *  STOP 
     * else 
     *  OUTPUT Entrada
     */
    public static Word[] E1 = new Word[]{
        new Word(Opcode.LDI, 8, -1, 1),       //0  Input
        new Word(Opcode.TRAP, -1, -1, -1),    //1  Input
        new Word(Opcode.STD, 9, -1, 11),      //2  A <- r9
        new Word(Opcode.LDI, 3, -1, 10),      //3  r3   <- 15
        new Word(Opcode.STD, 3, -1, 12),      //4  Stop <- r3 
        new Word(Opcode.LDD, 2, -1, 11),      //5  r2 <- A
        new Word(Opcode.JMPILM, -1, 2, 12),   //6  se for menor que 0 então Stop
        new Word(Opcode.LDI, 8, -1, 2),       //7  Output
        new Word(Opcode.LDD, 9, -1, 11),      //8  r9 <- A
        new Word(Opcode.TRAP, -1, -1, -1),    //9  Output
        new Word(Opcode.STOP, -1, -1, -1),    //10 
        new Word(Opcode.DATA, -1, -1, 10),    //11 A
        new Word(Opcode.DATA, -1, -1, 6)      //12 STOP
    };
 
    /**
     * NAO ESTA PRONTO
     */
    public static Word[] E2 = new Word[]{
        new Word(Opcode.LDI, 8, -1, 1),      //0 Input
        new Word(Opcode.TRAP, -1, -1, -1),   //1 Input
        new Word(Opcode.STD, 9, -1, 11),     //2 A <- r9
        new Word(Opcode.LDI, 8, -1, 1),      //0 Input
        new Word(Opcode.TRAP, -1, -1, -1),   //1 Input
        new Word(Opcode.STD, 9, -1, 12),     //2 A <- r9
        new Word(Opcode.LDD, 1, -1, 11),     //3 r1 <- A
        new Word(Opcode.LDD, 2, -1, 12),     //4 r2 <- B
        new Word(Opcode.ADD, 1, 2, -1),      //5 r1 <- r1 + r2
        new Word(Opcode.STD, 1, -1, 13),     //6
        new Word(Opcode.LDI, 8, -1, 2),      //7  Output
        new Word(Opcode.LDD, 9, -1, 13),     //8  r9 <- A
        new Word(Opcode.TRAP, -1, -1, -1),   //9  Output
        new Word(Opcode.STOP, -1, -1, -1),   //10
        new Word(Opcode.DATA, -1, -1, -1),   //11 A  50
        new Word(Opcode.DATA, -1, -1, -1),   //12 B 100
        new Word(Opcode.DATA, -1, -1, -1)    //13 Result
    };

    public static Word[] E3 = new Word[]{
        new Word(Opcode.LDI, 8, -1,  1),      //0    Input
        new Word(Opcode.TRAP,-1, -1,-1),      //1    Input
        new Word(Opcode.STD, 1, -1, 11),      //2    A  
        new Word(Opcode.LDI, 8, -1, 1 ),      //0    input
        new Word(Opcode.TRAP,-1, -1,-1),      //1    input
        new Word(Opcode.STD, 1, -1, 12),      //2    B   
        new Word(Opcode.LDD, 1, -1, 11),      //3    r1 <- A
        new Word(Opcode.LDD, 2, -1, 12),      //4    r2  <- B
        new Word(Opcode.MULT, 1, 2, -1),      //5    r1  <- r1 * r2
        new Word(Opcode.STD, 1, -1, 13),      //6    result
        new Word(Opcode.LDI, 8, -1,  2),      //7   Output
        new Word(Opcode.LDD, 9, -1, 13),      //8   r9 <- A
        new Word(Opcode.TRAP,-1, -1,-1),      //9   Output
        new Word(Opcode.STOP,-1, -1,-1),      //10
        new Word(Opcode.DATA,-1, -1,-1),      //11   A  5
        new Word(Opcode.DATA,-1, -1,-1),      //12   B 10
        new Word(Opcode.DATA, -1,-1,-1)       //13 Result---------
    };

    public static Word[] E4 = new Word[]{
        new Word(Opcode.LDI, 8, -1,  1),      //0    Input
        new Word(Opcode.TRAP,-1, -1,-1),      //1    Input
        new Word(Opcode.STD, 1, -1, 11),      //2    A  
        new Word(Opcode.LDI, 8, -1, 1 ),      //0    input
        new Word(Opcode.TRAP,-1, -1,-1),      //1    input
        new Word(Opcode.STD, 1, -1, 12),      //2    B   
        new Word(Opcode.LDD, 1, -1, 11),      //3    r1 <- A
        new Word(Opcode.LDD, 2, -1, 12),      //4    r2  <- B
        new Word(Opcode.SUB, 1, 2, -1),      //5    r1  <- r1 - r2
        new Word(Opcode.STD, 1, -1, 13),      //6    result
        new Word(Opcode.LDI, 8, -1,  2),      //7   Output
        new Word(Opcode.LDD, 9, -1, 13),      //8   r9 <- A
        new Word(Opcode.TRAP,-1, -1,-1),      //9   Output
        new Word(Opcode.STOP,-1, -1,-1),      //10
        new Word(Opcode.DATA,-1, -1,-1),      //11   A  4
        new Word(Opcode.DATA,-1, -1,-1),      //12   B 2
        new Word(Opcode.DATA, -1,-1,-1)       //13 Result---------
    };

    /** 
     * Recebe um int16 
     * Se INPUT > 0 
     *  STOP 
     * else 
     *  OUTPUT Entrada
     */
    
    public static Word[] E5 = new Word[]{
        
        new Word(Opcode.LDI, 8, -1,  1),     //0 Input
        new Word(Opcode.TRAP,-1, -1,-1),     //1 Input
        new Word(Opcode.STD, 9, -1, 11),     //2 
        new Word(Opcode.LDI, 3, -1,-20),     //3  
        new Word(Opcode.STD, 3, -1, 12),     //4  
        new Word(Opcode.LDD, 2, -1, 11),     //5  
        new Word(Opcode.JMPIGM,-1,2,12),     //6 se for maior que 0 então Stop
        new Word(Opcode.LDI, 8, -1,  2),     //7 Output
        new Word(Opcode.LDD, 9, -1, 11),     //8 r2 <- A
        new Word(Opcode.TRAP,-1, -1,-1),     //9 Output
        new Word(Opcode.STOP,-1,-1, -1),     //10 
        new Word(Opcode.DATA,-1,-1,-20),     //11 A
        new Word(Opcode.DATA,-1, -1, 6)      //12 Stop
    };
    /** 
     * Recebe um int16 
     * Se INPUT = 0 
     *  STOP 
     * else 
     *  OUTPUT Entrada
     */
    public static Word[] E6 = new Word[]{
        
        new Word(Opcode.LDI, 8, -1,  1),     //0 Input
        new Word(Opcode.TRAP,-1, -1,-1),     //1 Input
        new Word(Opcode.STD, 9, -1, 11),     //2 
        new Word(Opcode.LDI, 3, -1,  1),     //3  
        new Word(Opcode.STD, 3, -1, 12),     //4  
        new Word(Opcode.LDD, 2, -1, 11),     //5  
        new Word(Opcode.JMPIEM,-1,2,12),     //6 se for = que 0 então Stop
        new Word(Opcode.LDI, 8, -1,  2),     //7 Output
        new Word(Opcode.LDD, 9, -1, 11),     //8 r2 <- A
        new Word(Opcode.TRAP,-1, -1,-1),     //9 Output
        new Word(Opcode.STOP,-1,-1, -1),     //10 
        new Word(Opcode.DATA,-1,-1,  1),     //11 A
        new Word(Opcode.DATA,-1, -1, 6)      //12 Stop
    };

}

