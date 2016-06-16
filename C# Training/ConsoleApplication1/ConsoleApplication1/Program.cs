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

            Console.WriteLine("5 + 3 = " + (5 + 3));
            Console.WriteLine("5 - 3 = " + (5 - 3));
            Console.WriteLine("5 * 3 = " + (5 * 3));
            Console.WriteLine("5 / 3 = " + (5 / 3));
            Console.WriteLine("5.2 % 3 = " + (5.2 % 3));
            int i = 0;
            Console.WriteLine("i++ = " + (i++));
            Console.WriteLine("++i = " + (++i));
            Console.WriteLine("i-- = " + (i--));
            Console.WriteLine("--i = " + (--i));
            Console.WriteLine("i += 3 " + (i += 3));
            Console.WriteLine("i -= 2 " + (i -= 2));
            Console.WriteLine("i *= 2 " + (i *= 2));
            Console.WriteLine("i /= 2 " + (i /= 2));
            Console.WriteLine("i %= 2 " + (i %= 2));
        }
    }
}
