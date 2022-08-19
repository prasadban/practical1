package DataStrurcture;

import java.util.Scanner;

public class FirstStack {
		private int arr[];
		private int top;
		public FirstStack()
		{
		arr=new int[10];
		top=-1;
		}

		public FirstStack(int s)
		{
		arr=new int[s];
		top=-1;
		}

		public boolean isFull()
		{
		if(top==arr.length-1)
		return true;
		else
		return false;
		}
		public boolean isEmpty()
		{
		if(top==-1)
		return true;
		else
		return false;
		}
		public void push(int data)
		{
		if(!isFull())
		{
		top=top+1;
		arr[top]=data;
		}
		else 
			System.out.println("stack overflow.. can't push..");
		return;
		}



		public int pop()
		{
		int data=-999;
		if(!isEmpty())
		{
		data=arr[top];
		top=top-1;
		}
		else 
			System.out.println("stack underflow.. can't pop..");
		return data;
		}

		public int peek()
		{
		int data=-999;
		if(top==-1)
			System.out.println("stack underflow.. can not perform peek..");
		else
		data=arr[top];
		return data;
		}



		public String toString()
		{
		int i;
		String str=new String();
		if(isEmpty())
		{
			System.out.println("stack is empty..\n");
		return " ";
		}
		str=str + "Stack elements are: ";
		for(i=top;i>=0;i--)
		str=str+" "+arr[i];
		str=str + "\n";
		return str;
		}//end of tostring
		}//end of class

		class intStackMain{
		public static void main(String []str)
		{
		int choice, data;
		FirstStack st=new FirstStack();
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("l. Push \n");
			System.out.println("2. Pop \n");
			System.out.println("3. Peek \n");
			System.out.println("4. Display \n");
			System.out.println("5. Exit \n");
			System.out.println("Enter your choice : ");
		choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter data to be pushed : ");
		data=sc.nextInt();
		st.push(data);
		break;

		case 2:
		data=st.pop();
		System.out.println("Popped data : " + data + "\n");
		break;

		case 3:
		data=st.peek();
		System.out.println("Data at top : " + data + "\n");
		break;

		case 4:
			System.out.println(st);
		break;

		case 5: break;

		default: System.out.println("Invalid choice..\n");

		}//end of switch
		}while(choice!=5);
		}//end of main
		}//end of class


