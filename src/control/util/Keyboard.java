/*
**************************************************
* SPemf - SPEM processes through EMF
* Project: Spemf
* Package: control.util
* Class: Keyboard.java
* Author: Thiago
* Date: 10/02/2006
* Class description: 
**************************************************
*/

package control.util;

//---- importação do pacote de classes de E/S de Java ----//
import java.io.*;

/**
* A classe Keyboard (adaptada do livro An Introduction to Computer Science
* Using Java, de Samuel N. Kamin , M. Dennis Mickunas e Edward M. Reingold)
* lê dados do teclado usando um pequeno truque: um BufferedReader criado a
* partir da classe System.in.
*
*/
public class Keyboard
{
/******************************************************************************************************************/

/***
*** Atributos
***/

/******************************************************************************************************************/

  //---- indica se é fim do "arquivo" de leitura ----//
  private static boolean iseof = false;

  //---- declara e inicializa um BufferedReader a partir do System.in ----//
  private static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));


/******************************************************************************************************************/
/***
*** Métodos
***/
/******************************************************************************************************************/

  public static boolean readBoolean()
  {
      return readBoolean(true); // chama o método genérico abaixo
  }


/******************************************************************************************************************/

  //---- Lê um valor do tipo boolean do teclado, retorna o valor default se nada é ----//
  //---- digitado ou sai do programa se existe erro de leitura. ----//

  public static boolean readBoolean(boolean bdefault)
  {
      String s= "";         // a string a ser lida do teclado e convertida em um boolean
      boolean b = bdefault; // o valor booleano a ser retornado, inicializado

      if (iseof)
          return b; // se estamos no fim do arquivo, retornamos o default
      System.out.flush(); // limpa o que existir no buffer do arquivo
      try
      {
          s = input.readLine(); // ... ler uma string do "arquivo" de entrada
          System.out.flush(); // limpa o que existir no buffer do arquivo
      }
      catch (IOException e) // se não der certo,
      {
          System.exit(-1); // sai do programa.
      }
      if (s == null) // se a String lida for nula, ou vazia,
      {
          iseof=true; // avisa que este é o fim do "arquivo"
          return b; // e retorna o valor default
      }
      // senão avalia o que foi digitado:
      if (s.trim().equalsIgnoreCase("true"))
          b = true; // verdadeiro se igual à true
      else if (s.trim().equalsIgnoreCase("false")) b = false; // falso se igual à false
      else if (s.trim().equalsIgnoreCase("t")) b = true; // verdadeiro se igual à t
      else if (s.trim().equalsIgnoreCase("f")) b = false; // falso se igual à f
      else if (s.trim().equalsIgnoreCase("yes")) b = true; // verdadeiro se igual à yes
      else if (s.trim().equalsIgnoreCase("no")) b = false; // falso se igual à no
      else if (s.trim().equalsIgnoreCase("y")) b = true; // verdadeiro se igual à yes
      else if (s.trim().equalsIgnoreCase("n")) b = false; // falso se igual à no
      else if (s.trim().equalsIgnoreCase("v")) b = true; // verdadeiro se igual à v
      else if (s.trim().equalsIgnoreCase("f")) b = false; // falso se igual à f
      else if (s.trim().equalsIgnoreCase("s")) b = true; // verdadeiro se igual à s
      else if (s.trim().equalsIgnoreCase("sim")) b = true; // verdadeiro se igual à sim
      else if (s.trim().equalsIgnoreCase("nao")) b = false; // falso se igual à nao
      else if (s.trim().equalsIgnoreCase("não")) b = false; // falso se igual à não
      else if (s.trim().equalsIgnoreCase("verdadeiro")) b = true; // verdadeiro se igual à verdadeiro
      else if (s.trim().equalsIgnoreCase("falso")) b = false; // falso se igual à falso

	return b; // retorna o valor de b
  } // fim do método readBoolean

/******************************************************************************************************************/

 //---- Lê um valor do tipo byte do teclado, retorna o valor default se nada é ----//
 //---- digitado ou sai do programa se existe erro de leitura. Este método considera ----//
 //---- que o default é retornar zero. ----//

  public static byte readByte()
  {
      return readByte((byte)0); // chama o método genérico abaixo
  }

/******************************************************************************************************************/

  //---- Lê um valor do tipo byte do teclado, retorna o valor default se nada é ----//
  //---- digitado ou sai do programa se existe erro de leitura. ----//
  public static byte readByte(byte bdefault)
  {
      String s=""; // a String a ser lida do teclado e convertida em um byte
      byte b; // o valor byte a ser retornado, inicializado

      if (iseof)
          return bdefault; // se estamos no fim do arquivo, retornamos o default
      System.out.flush(); // limpa o que existir no buffer do arquivo
      try
      {
          s = input.readLine(); // ... ler uma string do "arquivo" de entrada
          System.out.flush(); // limpa o que existir no buffer do arquivo
      }
      catch (IOException e) // se não der certo,
      {
          System.exit(-1); // sai do programa.
      }
      if (s==null) // se a String lida for nula, ou vazia,
      {
          iseof=true; // avisa que este é o fim do "arquivo"
          return bdefault; // e retorna o valor default
      }
      // senão avalia o que foi digitado:
      try // tenta
      {
          b=new Byte(s.trim()).byteValue(); // converter a String para byte...
      }
      catch (NumberFormatException e) // se não conseguir,
      {
          b = bdefault; // usa o valor default
      }
      return b; // retorna o valor de b
  } // fim do método readByte

/******************************************************************************************************************/

  //---- Lê um valor do tipo char do teclado, retorna o valor default se nada é ----//
  //---- digitado ou sai do programa se existe erro de leitura. Este método considera ----//
  //---- que o default é retornar um espaço. ----//

  public static char readChar()
  {
      return readChar(' '); // chama o método genérico abaixo
  }

/******************************************************************************************************************/

  //---- Lê um valor do tipo char do teclado, retorna o valor default se nada é ----//
  //---- digitado ou sai do programa se existe erro de leitura. ----//

  public static char readChar(char cdefault)
  {
      String s=""; // a String a ser lida do teclado e convertida em um único char
      char c = cdefault; // o valor char a ser retornado, inicializado

      if (iseof)
          return c; // se estamos no fim do arquivo, retornamos o default
      System.out.flush(); // limpa o que existir no buffer do arquivo
      try // tenta..
      {
          s = input.readLine(); // ... ler uma string do "arquivo" de entrada
          System.out.flush(); // limpa o que existir no buffer do arquivo
      }
      catch (IOException e) // se não der certo,
      {
          System.exit(-1); // sai do programa.
      }
      if (s==null) // se o char lido for nulo, ou vazio,
      {
          iseof=true; // avisa que este é o fim do "arquivo"
          return c; // e retorna o valor default
      }
      if (s.length() > 0) // senão verifica o tamanho do que foi entrado,
          return s.charAt(0); // retorna o primeiro caracter do que foi digitado
      else // ou então
         return cdefault; // retorna o default
  } // fim do método readChar

/******************************************************************************************************************/

  //---- Lê um valor do tipo short do teclado, retorna o valor default se nada é ----//
  //---- digitado ou sai do programa se existe erro de leitura. Este método considera ----//
  //---- que o default é retornar zero. ----//

  public static short readShort()
  {
      return readShort((short)0); // chama o método genérico abaixo
  }

/******************************************************************************************************************/

  //---- Lê um valor do tipo short do teclado, retorna o valor default se nada é ----//
  //---- digitado ou sai do programa se existe erro de leitura. ----//

  public static short readShort(short sdefault)
  {
      String s=""; // a String a ser lida do teclado e convertida em um short
      short sh = sdefault; // o valor short a ser retornado, inicializado

      if (iseof)
          return sh; // se estamos no fim do arquivo, retornamos o default
      System.out.flush(); // limpa o que existir no buffer do arquivo
      try // tenta..
      {
          s = input.readLine(); // ... ler uma string do "arquivo" de entrada
          System.out.flush(); // limpa o que existir no buffer do arquivo
      }
      catch (IOException e) // se não der certo,
      {
          System.exit(-1); // sai do programa.
      }
      if (s==null) // se a String lida for nula, ou vazia,
      {
          iseof=true; // avisa que este é o fim do "arquivo"
          return sh; // e retorna o valor default
      }
      // senão avalia o que foi digitado:
      try // tenta
      {
          sh=new Short(s.trim()).shortValue(); // converter a String para short...
      }
      catch (NumberFormatException e) // se não conseguir,
      {
          sh = sdefault; // usa o valor default
      }
      return sh; // retorna o valor de sh
  } // fim do método readShort

/******************************************************************************************************************/

  //---- Lê um valor do tipo int do teclado, retorna o valor default se nada é ----//
  //---- digitado ou sai do programa se existe erro de leitura. Este método considera ----//
  //---- que o default é retornar zero. ----//

  public static int readInt()
  {
      return readInt(0); // chama o método genérico abaixo
  }

/******************************************************************************************************************/

  //---- Lê um valor do tipo int do teclado, retorna o valor default se nada é ----//
  //---- digitado ou sai do programa se existe erro de leitura. ----//

  public static int readInt(int idefault)
  {
      String s=""; // a String a ser lida do teclado e convertida em um int
      int i = idefault; // o valor int a ser retornado, inicializado
      if (iseof)
          return i; // se estamos no fim do arquivo, retornamos o default
      System.out.flush(); // limpa o que existir no buffer do arquivo
      try // tenta..
      {
          s = input.readLine(); // ... ler uma string do "arquivo" de entrada
          System.out.flush(); // limpa o que existir no buffer do arquivo
      }
      catch (IOException e) // se não der certo,
      {
          System.exit(-1); // sai do programa.
      }
      if (s==null) // se a String lida for nula, ou vazia,
      {
          iseof=true; // avisa que este é o fim do "arquivo"
          return i; // e retorna o valor default
      }
      // senão avalia o que foi digitado:
      try // tenta
      {
          i=new Integer(s.trim()).intValue(); // converter a String para int...
      }
      catch (NumberFormatException e) // se não conseguir,
      {
          i = idefault; // usa o valor default
      }
      return i; // retorna o valor de i
  } // fim do método readInt

/******************************************************************************************************************/

  //---- Lê um valor do tipo long do teclado, retorna o valor default se nada é ----//
  //---- digitado ou sai do programa se existe erro de leitura. Este método considera ----//
  //---- que o default é retornar zero. ----//

  public static long readLong()
  {
      return readLong(0); // chama o método genérico abaixo
  }

/******************************************************************************************************************/

  //---- Lê um valor do tipo long do teclado, retorna o valor default se nada é ----//
  //---- digitado ou sai do programa se existe erro de leitura. ----//

  public static long readLong(long ldefault)
  {
      String s=""; // a String a ser lida do teclado e convertida em um long
      long l = ldefault; // o valor long a ser retornado, inicializado

      if (iseof)
          return l; // se estamos no fim do arquivo, retornamos o default
      System.out.flush(); // limpa o que existir no buffer do arquivo
      try // tenta..
      {
          s = input.readLine(); // ... ler uma string do "arquivo" de entrada
          System.out.flush(); // limpa o que existir no buffer do arquivo
      }
      catch (IOException e) // se não der certo,
      {
          System.exit(-1); // sai do programa.
      }
      if (s==null) // se a String lida for nula, ou vazia,
      {
          iseof=true; // avisa que este é o fim do "arquivo"
          return l; // e retorna o valor default
      }
      // senão avalia o que foi digitado:
      try // tenta
      {
          l=new Long(s.trim()).longValue(); // converter a String para long...
      }
      catch (NumberFormatException e) // se não conseguir,
      {
          l = ldefault; // usa o valor default
      }
      return l; // retorna o valor de l
  } // fim do método readLong

/******************************************************************************************************************/

  //---- Lê um valor do tipo float do teclado, retorna o valor default se nada é ----//
  //---- digitado ou sai do programa se existe erro de leitura. Este método considera ----//
  //---- que o default é retornar zero. ---//

  public static float readFloat()
  {
      return readFloat(0); // chama o método genérico abaixo
  }

/******************************************************************************************************************/

  //---- Lê um valor do tipo float do teclado, retorna o valor default se nada é ----//
  //---- digitado ou sai do programa se existe erro de leitura. ----//

  public static float readFloat(float fdefault)
  {
      String s=""; // a String a ser lida do teclado e convertida em um float
      float f = fdefault; // o valor float a ser retornado, inicializado

      if (iseof)
          return f; // se estamos no fim do arquivo, retornamos o default
      System.out.flush(); // limpa o que existir no buffer do arquivo
      try // tenta..
      {
          s = input.readLine(); // ... ler uma string do "arquivo" de entrada
          System.out.flush(); // limpa o que existir no buffer do arquivo
      }
      catch (IOException e) // se não der certo,
      {
          System.exit(-1); // sai do programa.
      }
      if (s==null) // se a String lida for nula, ou vazia,
      {
          iseof=true; // avisa que este é o fim do "arquivo"
          return f; // e retorna o valor default
      }
      // senão avalia o que foi digitado:
      try // tenta
      {
          f=new Float(s.trim()).floatValue(); // converter a String para float...
      }
      catch (NumberFormatException e) // se não conseguir,
      {
          f = fdefault; // usa o valor default
      }
      return f; // retorna o valor de f
  } // fim do método readFloat

/******************************************************************************************************************/

  //---- Lê um valor do tipo double do teclado, retorna o valor default se nada é ----//
  //---- digitado ou sai do programa se existe erro de leitura. Este método considera ----//
  //---- que o default é retornar zero. ----//

  public static double readDouble()
  {
      return readDouble(0); // chama o método genérico abaixo
  }

/******************************************************************************************************************/

  //---- Lê um valor do tipo double do teclado, retorna o valor default se nada é ----//
  //---- digitado ou sai do programa se existe erro de leitura. ----//

  public static double readDouble(double ddefault)
  {
      String s=""; // a String a ser lida do teclado e convertida em um double
      double d = ddefault; // o valor double a ser retornado, inicializado

      if (iseof)
          return d; // se estamos no fim do arquivo, retornamos o default
      System.out.flush(); // limpa o que existir no buffer do arquivo
      try // tenta..
      {
          s = input.readLine(); // ... ler uma string do "arquivo" de entrada
          System.out.flush(); // limpa o que existir no buffer do arquivo
      }
      catch (IOException e) // se não der certo,
      {
          System.exit(-1); // sai do programa.
      }
      if (s==null) // se a String lida for nula, ou vazia,
      {
          iseof=true; // avisa que este é o fim do "arquivo"
          return d; // e retorna o valor default
      }
      // senão avalia o que foi digitado:
      try // tenta
      {
          d=new Double(s.trim()).doubleValue(); // converter a String para float...
      }
      catch (NumberFormatException e) // se não conseguir,
      {
          d = ddefault; // usa o valor default
      }
      return d; // retorna o valor de d
  } // fim do método readDouble

/******************************************************************************************************************/

  //---- Lê um valor do tipo String do teclado, retorna o valor default se nada é ----//
  //---- digitado ou sai do programa se existe erro de leitura. Este método considera ----//
  //---- que o default é retornar uma String vazia. ----//

  public static String readString()
  {
      return readString(""); // chama o método genérico abaixo
  }

/******************************************************************************************************************/

  //---- Lê um valor do tipo String do teclado, retorna o valor default se nada é ----//
  //---- digitado ou sai do programa se existe erro de leitura. ----//

  public static String readString(String sdefault)
  {
      String s=""; // a String a ser lida do teclado e convertida em um outro String
      String sd = sdefault; // o valor String a ser retornado, inicializado

      if (iseof)
         return sd; // se estamos no fim do arquivo, retornamos o default
      System.out.flush(); // limpa o que existir no buffer do arquivo
      try // tenta..
      {
          s = input.readLine(); // ... ler uma string do "arquivo" de entrada
          System.out.flush(); // limpa o que existir no buffer do arquivo
      }
      catch (IOException e) // se não der certo,
      {
          System.exit(-1); // sai do programa.
      }
      if (s==null) // se a String lida for nula, ou vazia,
      {
          iseof=true; // avisa que este é o fim do "arquivo"
          return sd; // e retorna o valor default
      }
      if (s.length() == 0) // se a String lida for vazia
          return sd; // retorna a default
      else // senão
          return s; // senão retorna o que foi digitado
  } // fim do método readString
  
/******************************************************************************************************************/
} // fim da classe Keyboard
