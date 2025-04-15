using System;

namespace TrainingSolution1
{
    class Sample1
    {
        public static int recursion(int num)
        {
            if (num == 1)
                return 1;
            return num + recursion(num - 1);
        }

        public static string word(string str)
        {
            if (string.IsNullOrEmpty(str))
                return "";

            string tempi = str[0].ToString();
            return word(str.Substring(1)) + tempi;
        }

        static void Main(string[] args)
        {
            //Console.WriteLine("The Total sum of 5: {0}",recursion(5));
            Console.WriteLine("Enter the Word: ");
            string? temp = Console.ReadLine();
            Console.WriteLine("The Reverse of the word is {0}: {1}",temp,word(temp));
        }
    }
}