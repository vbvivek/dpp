using System;

namespace DemoApp
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Please enter a number");
            
            int number = Convert.ToInt32(Console.ReadLine());

            if(number > 0)
            {
                Console.WriteLine($"The perfect digit is= {GetPerfectDigit(number)}");
            }
            else
            {
                Console.WriteLine($"Please enter a positive number");
            }
            Console.ReadKey();
        }

        public static int GetPerfectDigit(int digit)
        {
            int numToAppend = 10 - digit;

            string result = Convert.ToString(digit) + Convert.ToString(numToAppend);

            return Convert.ToInt32(result);
        }
    }
}
