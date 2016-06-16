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

            int age = 6;
            //if (age >= 7 && age <= 12)
            //Console.WriteLine("Elementary");
            //else if (age > 12 && age < 15)
            //Console.WriteLine("Middle");
            //else
            //Console.WriteLine("High");

            //if (age < 14 || age > 67)
            //Console.WriteLine("You shouldn't work");
            //Console.WriteLine("True is " + true + " and False is " + !true);
            //bool canDrive = age >= 16 ? true : false;
            ////Console.WriteLine(canDrive);
            //switch (age)
            //{
            //    case 0:
            //        //Console.WriteLine("Infant");
            //        break;
            //    case 1:
            //    case 2:
            //        //Console.WriteLine("Toddler");
            //        goto Cute;
            //    default:
            //        //Console.WriteLine("Child");
            //        break;
            //}
            //Cute:
            //Console.WriteLine("Toddlers are cute");

            int j = 0;
            //while (j < 10)
            //{
            //    if (j == 7)
            //    {
            //        j++;
            //    }

            //    if (j == 9)
            //    {
            //        break;
            //    }
            //    if (j % 2 > 0)
            //    {
            //        Console.WriteLine(j);
            //    }
            //    j++;
            //}

            string guess;
            //do
            //{
            //    Console.WriteLine("Guess a number");
            //    guess = Console.ReadLine();
            //} while (!guess.Equals("15"));

            //for(int k=0; k<10; k++)
            //{
            //    if (k % 2 == 0)
            //        Console.WriteLine(k);
            //}

            string randStr = "Here are some random characters";
            //foreach(char c in randStr)
            //{
            //    Console.Write(c);
            //}

            string sampString = "A bunch of random words";
            //Console.WriteLine("is empty "+String.IsNullOrEmpty(sampString));
            //Console.WriteLine("is empty "+String.IsNullOrWhiteSpace(sampString));
            //Console.WriteLine("String length "+sampString.Length);

            sampString = "A bunch of random words";
            //Console.WriteLine("Index of random: "+sampString.IndexOf("random"));
            //Console.WriteLine("2nd Word: "+sampString.Substring(2,6));

            string sampString2 = "More random words";

            //Console.WriteLine("String Equal: "+sampString.Equals(sampString2));
            //Console.WriteLine("Starts with \"A bunch\": "+sampString.StartsWith("A bunch"));
            //Console.WriteLine("Is empty: "+String.IsNullOrEmpty(sampString));
            //Console.WriteLine("Ends with words: "+sampString.EndsWith("words"));

            //sampString = sampString.Trim();
            //sampString = sampString.TrimStart();
            //sampString = sampString.TrimEnd();
            sampString = sampString.Replace("words", "characters");
            Console.WriteLine(sampString);
            sampString = sampString.Remove(4, 8);
            Console.WriteLine(sampString);

        }
    }
}
