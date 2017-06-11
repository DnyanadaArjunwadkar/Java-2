

public class myHashTable<k,v>{

	static int tabSize=3;
	HashEntry<k,v>[] tab;
	
	@SuppressWarnings("unchecked")
	public myHashTable()
	{
		tab=new HashEntry[tabSize];
	}
	class HashEntry<k,v>
	{
		k key;
		v value;
		HashEntry<k,v> next;
		HashEntry(k key, v value)
		{
			this.key=key;
			this.value=value;
			this.next=null;
		}
	}
	
	public synchronized void put(k key, v value)
	{
		int hash=key.hashCode()%tabSize;
		HashEntry<k,v> nn=new HashEntry<k,v>(key,value);
		if(key==null || value==null)
			throw new NullPointerException();
		
		if(tab[hash]==null)
		{
			tab[hash]=nn;
		}
		else
		{
			HashEntry<k,v> temp=tab[hash];
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=nn;
		}	
	}
	
	public v  get(k key)
	{
		int hash=key.hashCode()%tabSize;
		if(tab[hash]==null)
			return null;
		if(tab[hash].next==null)
		{
		if(tab[hash].key==key)
			return tab[hash].value;
		}
		else
		{
			HashEntry<k,v> temp=tab[hash];
			while(temp.next!=null)
			{
				temp=temp.next;
				if(temp.key==key)
					return temp.value;
			}
		}		
		return null;	
	}
	
	
	
	
	public void print_tab(myHashTable<k,v> tab2)
	{
		System.out.println("Your table is as followS:");
		for(int i=0;i<tab2.tab.length;i++)
		{
			if(tab[i]==null)
			{
				System.out.println("i:"+i+"Key :no element here");
			}
			else
			{
				HashEntry<k,v> temp= tab[i];
				
				System.out.print("Entry "+i+" |"+temp.key.toString()+":"+temp.value.toString());
				while(temp.next!=null)
				{
					temp=temp.next;
					System.out.print("-->:"+temp.key.toString()+":"+temp.value.toString());
				}				
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) 
	{
		myHashTable<Integer,Integer> ht= new myHashTable<Integer,Integer> ();
		ht.put(1,11);
		ht.put(2, 22);
		ht.put(3, 33);
		ht.put(4, 44);
		ht.put(5,888);
		ht.put(6, 2244);
		System.out.println("We have found your Key :"+ht.get(5).toString());
		
		
		/*
		ht.put("dny", "aw");
		ht.put("Ket", "sh");
		ht.put("Sur", "bh");
		*/
		ht.print_tab(ht);
	

	}

}
