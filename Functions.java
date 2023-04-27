package com.hlo;

public class Functions {
	Nodes head;
	public void insert(int ele)
	{
		if(head==null)
		{
			head=new Nodes(ele);
		}
		else
		{
			Nodes n=new Nodes(ele);
			Nodes t=head;
			while(t.next!=null)
			{
				t=t.next;
			}
			t.next=n;
		}
	}

	public void display()
	{
		if(head==null)
		{
			System.out.println("List is empty");
		}
		else
		{
			Nodes t=head;
			while(t.next!=null)
			{
				System.out.println(t.data);
				t=t.next;

			}
			System.out.println(t.data);
		}
	}
	public int size()
	{
		if(head==null)
		{
			return 0;
		}
		else
		{
			Nodes t=head;
			int count=0;
			while(t.next!=null)
			{
				count++;
				t=t.next;

			}
			return count+1;
		}
	}
	
	public Nodes insetrtFirst(int ele)
	{
		Nodes n=new Nodes(ele);
		n.next=head;
		head=n;
		System.out.println("inserted ele is "+ele);
		return n;
	}
	public Nodes get(int index)
	{
		Nodes t=head;
		for(int i=0;i<index;i++)
		{
			t=t.next;
		}
		return t;
	}
	public Nodes insertLast(int ele)
	{
		Nodes n=new Nodes(ele);
		Nodes node=get(size()-1);
		node.next=n;
		System.out.println("inserted ele is "+ele);
		return n;
	}
	public Nodes deleteFirst()
	{
		Nodes t=head;
		head=head.next;
		System.out.println("deleted ele is "+t.data);
		return head;
	}
	public Nodes deleteLast()
	{
		Nodes node=get(size()-1);
		Nodes n=get(size()-2);
		n.next=null;
		System.out.println("deleted ele is "+node.data);
		return n;
	}
	public Nodes delete(int index)
	{
		if(index==1)
		{
			return deleteFirst();
		}
		if(index==size())
		{
			return deleteLast();
		}
		Nodes n=get(index-1);
		n.next=n.next.next;
		return n;
	}
	public boolean find(int ele)
	{
		Nodes t=head;
		while(t!=null)
		{
			if(t.data==ele)
			{
				return true;
			}
			t=t.next;
		}
		return false;
	}
}
