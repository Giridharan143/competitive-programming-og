using System;
using System.IO.Compression;

namespace HelloWorld
{

    public class Linkedlist
    {
        public int data;
        public Linkedlist next;
        public Linkedlist(int data)
        {
            this.data = data;
            this.next = null;
        }

    }
    class LinkedListCaller
    {
        Linkedlist head;
        public LinkedListCaller()
        {
            this.head = null;
        }

        public void Insertion(int value)
        {
            Linkedlist obj = new Linkedlist(value);
            Linkedlist temp = this.head;;
            if (this.head == null)
            {
                this.head = obj;
                return;
            }
            while (temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = obj;
        }

        public void Printing()
        {
            Linkedlist temp = this.head;
            while (temp != null)
            {
                Console.Write(temp.data + " -> ");
                temp = temp.next;
            }
            Console.WriteLine("End");
        }
        
         public static void Main() {
            LinkedListCaller callingObj = new LinkedListCaller();
            callingObj.Insertion(1);
            callingObj.Insertion(2);
            callingObj.Insertion(3);
            callingObj.Insertion(4);
            callingObj.Insertion(5);
            callingObj.Printing();
        }

    }
    
   
    } 
