using System;

class Program
{
    static void Main()
    {
        decimal alojamiento, alimentacion, entretenimiento, costeTotal;

        Console.WriteLine("Calculadora de gastos de viaje");
        
        Console.Write("Ingrese los gastos de alojamiento: $");
        alojamiento = Convert.ToDecimal(Console.ReadLine());

        Console.Write("Ingrese los gastos de alimentación: $");
        alimentacion = Convert.ToDecimal(Console.ReadLine());

        Console.Write("Ingrese los gastos de entretenimiento: $");
        entretenimiento = Convert.ToDecimal(Console.ReadLine());

        costetotal = alojamiento + alimentacion + entretenimiento;

        Console.WriteLine($"El coste total del viaje es: ${costeTotal}");
        
        Console.WriteLine("Presione cualquier tecla para salir...");
        Console.ReadKey();
    }
     