using System;
using System.Text.RegularExpressions;
using System.Numerics;

namespace MyApplication
{
  class Program
  {
    static void Main(string[] args)
    {
      double p = 2;
      int i;
      BigInteger[] pows = new BigInteger[9];
      int idx = 0;
      for(i = 2; i < 1000; i = i+i) {
      	p = p*p;
        pows[idx] = new BigInteger(p);
        idx++;
      }
      
      BigInteger twoTo1000 = BigInteger.Multiply(BigInteger.Multiply(BigInteger.Multiply(pows[8], pows[7]), BigInteger.Multiply(pows[6], pows[5])), BigInteger.Multiply(pows[4], pows[2]));
      
      string str = twoTo1000.ToString();
      string[] arr = Regex.Split(str, @"");
      int sum = 0;
      var segment = new ArraySegment<string>(arr, 1, arr.Length-2);
      
      foreach(string s in segment){
        int num = Int32.Parse(s);
        sum += num;
      }
      
      Console.WriteLine(sum);
    }
  }
}