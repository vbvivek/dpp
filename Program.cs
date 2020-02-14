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
            int value;
            int sum = 0;
            foreach(var item in digit.ToString().ToCharArray())
            {
                int.TryParse(item.ToString(), out value);
                sum = sum + value;
            }

            int numToAppend = 10 - sum;

            string result = Convert.ToString(digit) + Convert.ToString(numToAppend);

            return Convert.ToInt32(result);
        }
    }
}
