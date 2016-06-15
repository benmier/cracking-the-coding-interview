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
            Console.WriteLine("What's yo name?");
            string name = Console.ReadLine();
            Console.WriteLine("Hello " + name);

            bool canVote = true;
            Console.WriteLine(canVote);
            char grade = 'A';
            Console.WriteLine(grade);
            int maxInt = int.MaxValue;
            Console.WriteLine(maxInt);
            long maxLong = long.MaxValue;
            Console.WriteLine(maxLong);
            decimal maxDec = decimal.MaxValue;
            Console.WriteLine(maxDec);
            float maxFloat = float.MaxValue;
            Console.WriteLine(maxFloat);
            double maxDouble = double.MaxValue;
            Console.WriteLine(maxDouble);

        }
    }
}
