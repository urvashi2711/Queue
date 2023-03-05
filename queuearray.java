import java.util.Scanner;
class Queue{
	int n=10;
	int arr[]=new int[n];
	int r=-1,f=-1;
	Scanner sc=new Scanner(System.in);
	public void enqueue(){
		if(r==(n-1)){
			System.out.println("queue is overflow");
		}
		else{
			System.out.println("enter data");
			int i=sc.nextInt();
			if(f==-1&&r==-1){
				f=0;
				r=0;
				arr[r]=i;
			}
			else{
				r=r+1;
				arr[r]=i;
			}
		}
	}
	public void dequeue(){
		if(f==-1&&r==-1){
			System.out.println("queue is underflow");
		}
		else{
			f=f+1;
		}
	}
	public void display(){
		System.out.println("items are:");
		for(int i=f;i<=r;i++){
			System.out.println(arr[i]);
		}
	}	
}
class Array{
	public static void main(String[] args){
		int d,l;
		Queue q=new Queue();
		Scanner sc=new Scanner(System.in);
		do{
		System.out.println("enter 1 to enqueue,2 to dequeue, 3 to display");
		d=sc.nextInt();
		switch(d){
			case 1:
				q.enqueue();
				break;
			case 2:
				q.dequeue();
				break;
			case 3:
				q.display();
				break;
		}
		System.out.println("enter 0 to go back to main menu or enter any key to exit");
		l=sc.nextInt();
		}
		while(l==0);
	}
}