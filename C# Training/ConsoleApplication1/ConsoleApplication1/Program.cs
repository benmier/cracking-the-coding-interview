using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication1
{
    class Program
    {
        static void Main(string[] args)
        {
            //Console.WriteLine("What's yo name?");
            //string name = Console.ReadLine();
            //Console.WriteLine("Hello " + name);

            bool canVote = true;
            char grade = 'A';
            int maxInt = int.MaxValue;
            long maxLong = long.MaxValue;
            decimal maxDec = decimal.MaxValue;
            float maxFloat = float.MaxValue;
            double maxDouble = double.MaxValue;
            //Console.WriteLine(canVote);
            //Console.WriteLine(grade);
            //Console.WriteLine(maxInt);
            //Console.WriteLine(maxLong);
            //Console.WriteLine(maxDec);
            //Console.WriteLine(maxFloat);
            //Console.WriteLine(maxDouble);

            var newVAr = "This is newVar, a string declared using var.";
            //Console.WriteLine(newVAr);
            //Console.WriteLine("newVar is a {0}", newVAr.GetTypeCode());

            //Console.WriteLine("5 + 3 = " + (5 + 3));
            //Console.WriteLine("5 - 3 = " + (5 - 3));
            //Console.WriteLine("5 * 3 = " + (5 * 3));
            //Console.WriteLine("5 / 3 = " + (5 / 3));
            //Console.WriteLine("5.2 % 3 = " + (5.2 % 3));
            int i = 0;
            //Console.WriteLine("i++ = " + (i++));
            //Console.WriteLine("++i = " + (++i));
            //Console.WriteLine("i-- = " + (i--));
            //Console.WriteLine("--i = " + (--i));
            //Console.WriteLine("i += 3 " + (i += 3));
            //Console.WriteLine("i -= 2 " + (i -= 2));
            //Console.WriteLine("i *= 2 " + (i *= 2));
            //Console.WriteLine("i /= 2 " + (i /= 2));
            //Console.WriteLine("i %= 2 " + (i %= 2));

            double pi = 3.14;
            int intPi = (int)pi;
            //Console.WriteLine(pi + " "+intPi);

            double number1 = 10.5;
            double number2 = 15;

            //Console.WriteLine("Math.Abs(number1) =" + (Math.Abs(number1)));
            //Console.WriteLine("Math.Ceiling(number1) =" + (Math.Ceiling(number1)));
            //Console.WriteLine("Math.Floor(number1) =" + (Math.Floor(number1)));
            //Console.WriteLine("Math.Max(number1, number2) =" + (Math.Max(number1, number2)));
            //Console.WriteLine("Math.Min(number1, number2) =" + (Math.Min(number1, number2)));
            //Console.WriteLine("Math.Pow(number1, 2) =" + (Math.Pow(number1, 2)));
            //Console.WriteLine("Math.Round(number1) =" + (Math.Round(number1)));
            //Console.WriteLine("Math.Sqrt(number1) =" + (Math.Sqrt(number1)));

            Random rand = new Random();
            //Console.WriteLine("Random Number between 1 and 10 is " + rand.Next(1,11));

            int age = 17;
            if (age >= 5 && age <= 7)
            {
                Console.WriteLine("Elementary");
            }
            else if ((age > 7) && (age < 13))
            {
                Console.WriteLine("Middle");
            }
            else
            {
                Console.WriteLine("High");
            }
        }
    }
}
