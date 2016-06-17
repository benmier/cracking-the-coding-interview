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

            //bool canVote = true;
            //char grade = 'A';
            //int maxInt = int.MaxValue;
            //long maxLong = long.MaxValue;
            //decimal maxDec = decimal.MaxValue;
            //float maxFloat = float.MaxValue;
            //double maxDouble = double.MaxValue;
            //Console.WriteLine(canVote);
            //Console.WriteLine(grade);
            //Console.WriteLine(maxInt);
            //Console.WriteLine(maxLong);
            //Console.WriteLine(maxDec);
            //Console.WriteLine(maxFloat);
            //Console.WriteLine(maxDouble);

            //var newVAr = "This is newVar, a string declared using var.";
            //Console.WriteLine(newVAr);
            //Console.WriteLine("newVar is a {0}", newVAr.GetTypeCode());

            //Console.WriteLine("5 + 3 = " + (5 + 3));
            //Console.WriteLine("5 - 3 = " + (5 - 3));
            //Console.WriteLine("5 * 3 = " + (5 * 3));
            //Console.WriteLine("5 / 3 = " + (5 / 3));
            //Console.WriteLine("5.2 % 3 = " + (5.2 % 3));
            //int i = 0;
            //Console.WriteLine("i++ = " + (i++));
            //Console.WriteLine("++i = " + (++i));
            //Console.WriteLine("i-- = " + (i--));
            //Console.WriteLine("--i = " + (--i));
            //Console.WriteLine("i += 3 " + (i += 3));
            //Console.WriteLine("i -= 2 " + (i -= 2));
            //Console.WriteLine("i *= 2 " + (i *= 2));
            //Console.WriteLine("i /= 2 " + (i /= 2));
            //Console.WriteLine("i %= 2 " + (i %= 2));

            //double pi = 3.14;
            //int intPi = (int)pi;
            //Console.WriteLine(pi + " " + intPi);

            //double number1 = 10.5;
            //double number2 = 15;

            //Console.WriteLine("Math.Abs(number1) =" + (Math.Abs(number1)));
            //Console.WriteLine("Math.Ceiling(number1) =" + (Math.Ceiling(number1)));
            //Console.WriteLine("Math.Floor(number1) =" + (Math.Floor(number1)));
            //Console.WriteLine("Math.Max(number1, number2) =" + (Math.Max(number1, number2)));
            //Console.WriteLine("Math.Min(number1, number2) =" + (Math.Min(number1, number2)));
            //Console.WriteLine("Math.Pow(number1, 2) =" + (Math.Pow(number1, 2)));
            //Console.WriteLine("Math.Round(number1) =" + (Math.Round(number1)));
            //Console.WriteLine("Math.Sqrt(number1) =" + (Math.Sqrt(number1)));

            //Random rand = new Random();
            //Console.WriteLine("Random Number between 1 and 10 is " + rand.Next(1, 11));

            //int age = 6;
            //if (age >= 7 && age <= 12)
            //    Console.WriteLine("Elementary");
            //else if (age > 12 && age < 15)
            //    Console.WriteLine("Middle");
            //else
            //    Console.WriteLine("High");

            //if (age < 14 || age > 67)
            //    Console.WriteLine("You shouldn't work");
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

            //int j = 0;
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

            //string guess;
            //do
            //{
            //    Console.WriteLine("Guess a number");
            //    guess = Console.ReadLine();
            //} while (!guess.Equals("15"));

            //for (int k = 0; k < 10; k++)
            //{
            //    if (k % 2 == 0)
            //        Console.WriteLine(k);
            //}

            //string randStr = "Here are some random characters";
            //foreach (char c in randStr)
            //{
            //    Console.Write(c);
            //}

            //string sampString = "A bunch of random words";
            //Console.WriteLine("is empty " + String.IsNullOrEmpty(sampString));
            //Console.WriteLine("is empty " + String.IsNullOrWhiteSpace(sampString));
            //Console.WriteLine("String length " + sampString.Length);

            //sampString = "A bunch of random words";
            //Console.WriteLine("Index of random: " + sampString.IndexOf("random"));
            //Console.WriteLine("2nd Word: " + sampString.Substring(2, 6));

            //string sampString2 = "More random words";

            //Console.WriteLine("String Equal: " + sampString.Equals(sampString2));
            //Console.WriteLine("Starts with \"A bunch\": " + sampString.StartsWith("A bunch"));
            //Console.WriteLine("Is empty: " + String.IsNullOrEmpty(sampString));
            //Console.WriteLine("Ends with words: " + sampString.EndsWith("words"));

            //sampString = sampString.Trim();
            //sampString = sampString.TrimStart();
            //sampString = sampString.TrimEnd();
            //sampString = sampString.Replace("words", "characters");
            //Console.WriteLine(sampString);
            //sampString = sampString.Remove(4, 8);
            //Console.WriteLine(sampString);
            //string[] names = new string[3] { "Matt", "Joe", "Paul" };
            //Console.WriteLine("Name list: " + String.Join(", ", names));
            //string fmtStr = String.Format("{0:c} {1:00.00} {2:#.00} {3:0,0}", 1.56, 15.567, .56, 1000);
            //Console.WriteLine(fmtStr);

            //StringBuilder sb = new StringBuilder();
            //sb.Append("This is the first sentence. ");
            //sb.AppendFormat("My name is {0} and I live in {1}. ", "Derek", "Denmark");
            //sb.Clear();
            //sb.Replace("a", "o");
            //sb.Remove(5, 7);
            //Console.WriteLine(sb);

            //int[] randArray = new int[5];
            //int[] randArray2 = { 1, 2, 3, 4, 5 };
            //Console.WriteLine("Array length: " + randArray2.Length);
            //Console.WriteLine("Item 0: " + randArray2[0]);
            //foreach (int q in randArray2)
            //{
            //    Console.WriteLine(q);
            //}
            //for (int w = 0; w < randArray2.Length; w++)
            //{
            //    Console.WriteLine("{0}:{1}", w, randArray2[w]);
            //}
            //Console.WriteLine("Where is 3: "+Array.IndexOf(randArray2,3));
            //string[] names = { "Tom", "Paul", "Sally" };
            //string nameStr = string.Join(", ", names);
            //string[] nameArray = nameStr.Split(",");
            //int[,] multArray = new int[5, 3];
            //int[,] multArray2 = { { 0, 1 }, { 2, 3 }, { 4, 5 } };
            //foreach (int num in multArray2)
            //{
            //    Console.WriteLine(num);
            //}
            //for (int i = 0; i < multArray2.GetLength(0); i++)
            //{
            //    for (int j = 0; j < multArray2.GetLength(1); j++)
            //    {
            //        Console.WriteLine("{0}|{1}:{2} ", i, j, multArray2[i, j]);
            //    }
            //}

            //List<int> numList = new List<int>();
            //numList.Add(5);
            //numList.Add(15);
            //numList.Add(25);
            //int[] randArray = { 1, 2, 3, 4, 5 };
            //numList.AddRange(randArray);
            ////numList.Clear();
            //foreach(int x in numList)
            //{
            //    Console.WriteLine(x);
            //}
            //List<int> numList2 = new List<int>(randArray);
            //List<int> numList3 = new List<int>(new int[] { 1, 2, 3, 4, 5 });
            //numList.Insert(1, 10);
            //numList.Remove(5);
            //numList.RemoveAt(2);
            //for(int i=0; i<numList.Count; i++)
            //{
            //    Console.WriteLine(numList[i]);
            //}
            //Console.WriteLine("4 is in index: "+numList3.IndexOf(4));
            //Console.WriteLine("5 in list? " +numList3.Contains(5));
            //List<string> strList = new List<string>(new string[] { "Tom", "Paul" });
            //Console.WriteLine("Tom in list? "+strList.Contains("tom",StringComparer.OrdinalIgnoreCase));
            //strList.Sort();

            //try
            //{
            //    Console.Write("Divide 10 by ");
            //    int num = int.Parse(Console.ReadLine());
            //    Console.WriteLine("10/{0} = {1}",num,10/num);
            //}
            //catch(DivideByZeroException ex)
            //{
            //    Console.WriteLine("Can't divide by zero");
            //}
            //catch(Exception ex)
            //{
            //    Console.Write("{0}! {1}\n",ex.GetType().Name,ex.Message);
            //}

            //Animal spot = new Animal(15, 10, "Joe", "Moo");
            //Console.WriteLine(spot.toString());
            //Console.WriteLine("{0} says {1}!",spot.name,spot.sound);
            //Console.WriteLine("There are {0} animal(s)!",Animal.getNumOfAnimals());
            //Console.WriteLine("IntSum: {0} doublsSum: {1}", spot.getSum(1, 2), spot.getSum(1.2, 3.2));
            //Animal grover = new Animal
            //{
            //    name = "Grover",
            //    height = 15,
            //    weight = 14,
            //    sound = "Grrr"
            //};
            //Console.WriteLine(grover.toString());
            //Dog spike = new Dog();
            //Console.WriteLine(spike.toString());
            //spike = new Dog(20,15,"Spike","Grrr","Chicken");
            //Console.WriteLine(spike.toString());

            //Shape rect = new Rectangle(5, 5);
            //Shape tri = new Triangle(5, 5);
            //Rectangle combRect = new Rectangle(5, 5) + new Rectangle(5, 5);
            //Console.WriteLine("Rect Area: " + rect.area());
            //Console.WriteLine("Tri Area: " + tri.area());
            //Console.WriteLine("combRect Area: " + combRect.area());

            //KeyValue<string, string> superman = new KeyValue<string, string>("", "");
            //superman.key = "Superman";
            //superman.value = "Clark Kent";

            //KeyValue<int, string> samsungTV = new KeyValue<int, string>(0, "");
            //samsungTV.key = 12345;
            //samsungTV.value = "a 50 inch Samsung TV";

            //superman.showData();
            //samsungTV.showData();

            Temperature micTemp = Temperature.Low;

            switch (micTemp)
            {
                case Temperature.Freeze:
                    Console.WriteLine("Temp on Freezing");
                    break;

                case Temperature.Low:
                    Console.WriteLine("Temp on Low");
                    break;

                case Temperature.Warm:
                    Console.WriteLine("Temp on Warm");
                    break;

                case Temperature.Boil:
                    Console.WriteLine("Temp on Boil");
                    break;
            }
        }
    }

    class Animal
    {
        public double height { get; set; }
        public double weight { get; set; }
        public string sound { get; set; }

        public string name;
        public string Name
        {
            get { return name; }
            set { name = value; } //Must be called value!
        }

        public Animal()
        {
            this.height = 0;
            this.weight = 0;
            this.sound = "No sound";
            this.name = "No name";
            numOfAnimals++;
        }

        public Animal(double height, double weight, string name, string sound)
        {
            this.height = height;
            this.weight = weight;
            this.sound = sound;
            this.name = name;
            numOfAnimals++;
        }

        static int numOfAnimals = 0;
        
        public static int getNumOfAnimals()
        {
            return numOfAnimals;
        }

        public string toString()
        {
            return String.Format("{0} is {1} inches tall, weighs {2} lbs and likes to say {3}.", name, height, weight, sound);
        }

        public int getSum(int num1, int num2)
        {
            return num1 + num2;
        }

        public double getSum(double num1, double num2)
        {
            return num1 + num2;
        }
    }

    class Dog :Animal
    {
        public string favFood { get; set; }
        public Dog() : base()
        {
            this.favFood = "No favorite food";
        }

        public Dog(double height, double weight, string name, string sound, string favFood) : base(height, weight, name, sound)
        {
            this.favFood = favFood;
        }

        new public string toString()
        {
            return String.Format("{0} is {1} inches tall, weighs {2} lbs and likes to say {3} and eats {4}.", name, height, weight, sound, favFood);
        }
    }

    abstract class Shape
    {
        public abstract double area();

        public void sayHi()
        {
            Console.WriteLine("Hello");
        }
    }

    public interface ShapeItem
    {
        double area();
    }

    class Rectangle : Shape
    {
        private double length;
        private double width;

        public Rectangle(double num1, double num2)
        {
            length = num1;
            width = num2;
        }

        public override double area()
        {
            return length * width;
        }

        public static Rectangle operator+ (Rectangle rect1, Rectangle rect2)
        {
            double rectLength = rect1.length + rect2.length;
            double rectWidth = rect1.width + rect2.width;
            return new Rectangle(rectLength, rectWidth);
        }
    }

    class Triangle : Shape
    {
        private double theBase;
        private double height;

        public Triangle(double num1, double num2)
        {
            theBase = num1;
            height = num2;
        }

        public override double area()
        {
            return 0.5 * theBase * height;
        }
    }

    class KeyValue<TKey, TValue>
    {
        public TKey key { get; set; }
        public TValue value { get; set; }
        
        public KeyValue(TKey k, TValue v)
        {
            key = k;
            value = v;
        }

        public void showData()
        {
            Console.WriteLine("{0} is {1}",this.key,this.value);
        }
    }

    public enum Temperature
    {
        Freeze,
        Low,
        Warm,
        Boil
    }
}
