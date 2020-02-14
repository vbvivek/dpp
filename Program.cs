using System;

namespace DemoApp
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Please enter a number");
            
            int number = Convert.ToInt32(Console.ReadLine());

            if(number >= 0)
            {
                int processedNum = GetPerfectDigit(number);
                if (processedNum != -1)
                {
                    Console.WriteLine($"The perfect digit is= {processedNum}");
                }
                else
                {
                    Console.WriteLine("Sum is already 10..So already perfect");
                }
            }
            else
            {
                Console.WriteLine($"Please enter a positive number greater than zero");
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

            if (sum != 10)
            {
                int numToAppend = 10 - sum;

                string result = Convert.ToString(digit) + Convert.ToString(numToAppend);

                return Convert.ToInt32(result);
            }
            else
            {
                return -1;
            }
        }
    }
}
