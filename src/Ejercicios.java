
//Implementar las funciones
//Sugerencia: pueden usar la funcion main para probar sus funciones pero no es necesario
//Recuerden que pueden:
//"devolver" valores con el "return"
//"Imprimir" valores con el "System.out.print"
//"Pedir" valores con el "Scanner"

public class Ejercicios
{
	static //devuelve x multiplicado por 2 (1pt)
	int multiplicarPorDos(int x)
	{
		return x * 2;
	}
	
	static //devuelve el numero mayor entre a, b, c y d (2pts)
	int getMayor(int a, int b, int c, int d)
	{
		if (a > b & a > c & a > d)
		{
			return a;
		}
		if (b > a & b > c & b > d)
		{
			return b;	
		}
		if (c > a & c > b & c > d)
		{
			return c;	
		}
		else
		{
			return d;
		}
	}
	
	//Pide 2 nombres de personas.
	//Si los nombres son iguales imprime "Tocayos" de lo contrario imprime "No son tocayos". (2pts)
	String sonTocayos()
	{
		String nom01 = null;
		String nom02 = null;
		if (nom01 == nom02)
		{
			return "Tocayos";
		}
		else
		{
			return "no son Tocayos";
		}
	}
	
	//Imprime 100 numeros que sean multiplos de 5(3pts)
	void imprimirMultiplosDe5()
	{
		//for (int i = 0 ; i < 100; i++)
		//return i % 5 == 0;
		
	}
	
	//Devuelve true si edad es menor o igual a 25 y promedio mayor o igual a 85 (3pts)
	boolean aplicaBeca(int edad, int promedio)
	{
		return false;
	}
	
	//Pide 4 numeros, si todos son pares devuelve true, de lo contrario devuelve false (4puntos)
	boolean sonPares()
	{
		int n1 = 0,n2,n3,n4;
		return n1 % 2 == 0;
	}
	
	//Pueden probar sus funciones en el main pero no es necesario ni será evaluado
	public static void main(String args[])
	{
		//int x = multiplicarPorDos(4);
		//System.out.println(x);
		
		//int x = getMayor (11 , 10 , 15 , 9);
		//System.out.println(x);
		
	}
	
}
